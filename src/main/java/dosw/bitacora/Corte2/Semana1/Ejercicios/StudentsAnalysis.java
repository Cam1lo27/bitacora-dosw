package dosw.bitacora.Corte2.Semana1.Ejercicios;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class StudentsAnalysis {

    //Ejercicio 1
    public List<Student> getRosadoStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getTeam().equals("ROSADO"))
                .toList();
    }



    //Ejercicio2
    public List<String> getStudentsNamesSorted(List<Student> students) {

        return students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
    }



    //Ejercicio3
    public double getGlobalAverage(List<Student> students) {

        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0);
    }



    //Ejercicio 4
    public Map<String, Double> getAverageBySubject(Student student) {

        return student.getGrades().stream()
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));
    }



    //Ejercicio5
    public Optional<Student> getTopStudent(List<Student> students) {

        return students.stream()
                .max(Comparator.comparingDouble(this::calculateStudentAverage));
    }
    private double calculateStudentAverage(Student student) {

        return student.getGrades().stream()
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0);
    }



    //Ejercicio 6
    public Map<String, Long> getFailedSubjectsByTeam(List<Student> students) {

        return students.stream()
                .flatMap(student -> student.getGrades().stream()
                        .filter(grade -> !grade.isPassed())
                        .map(grade -> student.getTeam()))
                .collect(Collectors.groupingBy(
                        team -> team,
                        Collectors.counting()
                ));
    }



    // Ejercicio 7
    public List<Student> getTop3StudentsWithMostPassed(List<Student> students) {

        return students.stream()
                .sorted((s1, s2) -> Long.compare(
                        s2.getGrades().stream().filter(g -> g.isPassed()).count(),
                        s1.getGrades().stream().filter(g -> g.isPassed()).count()
                ))
                .limit(3)
                .toList();
    }



    //Ejericio 8
    public Map<String, List<Student>> groupStudentsByPerformance(List<Student> students) {

        return students.stream()
                .collect(Collectors.groupingBy(student -> {

                    double prom = calculateStudentAverage(student);

                    if (prom >= 4.5) return "ALTO RENDIMIENTO";
                    if (prom >= 3.5) return "REGULAR";
                    return "RIESGO";

                }));
    }




    // Ejercicio 9
    public String subjectWithMostFails(List<Student> students) {

        Map<String, Long> failsBySubject = students.stream()
                .flatMap(student -> student.getGrades().stream())
                .filter(grade -> !grade.isPassed())
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.counting()
                ));

        return failsBySubject.entrySet()
                .stream()
                .max((e1, e2) -> Long.compare(e1.getValue(), e2.getValue()))
                .get()
                .getKey();
    }



    // Ejercicio 10
    public LinkedHashMap<String, Double> rosadoApprovedAverageBySubject(List<Student> students) {

        Map<String, List<Grade>> gradesBySubject = students.stream()
                .filter(student -> student.getTeam().equals("ROSADO"))
                .flatMap(student -> student.getGrades().stream())
                .filter(grade -> grade.isPassed())
                .collect(Collectors.groupingBy(Grade::getSubject));

        LinkedHashMap<String, Double> result = new LinkedHashMap<>();

        gradesBySubject.entrySet()
                .stream()
                .sorted((e1, e2) -> Double.compare(
                        average(e2.getValue()),
                        average(e1.getValue())
                ))
                .forEach(entry ->
                        result.put(entry.getKey(), average(entry.getValue()))
                );

        return result;
    }

    private double average(List<Grade> grades) {
        return grades.stream()
                .mapToDouble(g -> g.getScore())
                .average()
                .orElse(0);
    }



    //Ejercicio 11 Obtener estudiantes que tengan al menos una materia reprobada
    public List<Student> studentsWithFails(List<Student> students) {

        return students.stream()
                .filter(s -> s.getGrades().stream()
                        .anyMatch(g -> !g.isPassed()))
                .toList();
    }



    // Ejercicio 12
    public String hardestSubject(List<Student> students) {

        Map<String, List<Grade>> gradesBySubject = students.stream()
                .flatMap(student -> student.getGrades().stream())
                .collect(Collectors.groupingBy(Grade::getSubject));

        return gradesBySubject.entrySet()
                .stream()
                .sorted((e1, e2) -> Double.compare(
                        average(e1.getValue()),
                        average(e2.getValue())
                ))
                .findFirst()
                .get()
                .getKey();
    }

}
