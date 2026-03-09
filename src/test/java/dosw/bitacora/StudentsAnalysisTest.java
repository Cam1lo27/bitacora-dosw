package dosw.bitacora;

import dosw.bitacora.Corte2.Semana1.Ejercicios.Grade;
import dosw.bitacora.Corte2.Semana1.Ejercicios.Student;
import dosw.bitacora.Corte2.Semana1.Ejercicios.StudentsAnalysis;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentsAnalysisTest {

    StudentsAnalysis analysis = new StudentsAnalysis();

    private List<Student> createStudents() {

        Grade g1 = new Grade("DOSW", 4.5, LocalDate.now(), true);
        Grade g2 = new Grade("DOSW", 2.5, LocalDate.now(), false);
        Grade g3 = new Grade("BD", 3.8, LocalDate.now(), true);
        Grade g4 = new Grade("REDES", 2.0, LocalDate.now(), false);
        Grade g5 = new Grade("REDES", 4.0, LocalDate.now(), true);

        Student s1 = new Student(
                "1",
                "Andres",
                "ROSADO",
                List.of(g1, g3)
        );

        Student s2 = new Student(
                "2",
                "Camilo",
                "AZUL",
                List.of(g2, g4)
        );

        Student s3 = new Student(
                "3",
                "Natalia",
                "ROSADO",
                List.of(g5)
        );

        return List.of(s1, s2, s3);
    }

    @Test
    void testGetRosadoStudents() {

        List<Student> students = createStudents();

        List<Student> result = analysis.getRosadoStudents(students);

        assertEquals(2, result.size());
    }

    @Test
    void testGetStudentsNamesSorted() {

        List<Student> students = createStudents();

        List<String> result = analysis.getStudentsNamesSorted(students);

        assertEquals(List.of("Andres", "Camilo", "Natalia"), result);
    }

    @Test
    void testGlobalAverage() {

        List<Student> students = createStudents();

        double avg = analysis.getGlobalAverage(students);

        assertTrue(avg > 0);
    }

    @Test
    void testAverageBySubject() {

        List<Student> students = createStudents();

        Student student = students.get(0);

        Map<String, Double> result = analysis.getAverageBySubject(student);

        assertTrue(result.containsKey("DOSW"));
    }

    @Test
    void testTopStudent() {

        List<Student> students = createStudents();

        Optional<Student> top = analysis.getTopStudent(students);

        assertTrue(top.isPresent());
    }

    @Test
    void testFailedSubjectsByTeam() {

        List<Student> students = createStudents();

        Map<String, Long> result = analysis.getFailedSubjectsByTeam(students);

        assertTrue(result.size() > 0);
    }

    @Test
    void testTop3StudentsWithMostPassed() {

        List<Student> students = createStudents();

        List<Student> result = analysis.getTop3StudentsWithMostPassed(students);

        assertTrue(result.size() <= 3);
    }

    @Test
    void testGroupStudentsByPerformance() {

        List<Student> students = createStudents();

        Map<String, List<Student>> result = analysis.groupStudentsByPerformance(students);

        assertNotNull(result);
    }

    @Test
    void testSubjectWithMostFails() {

        List<Student> students = createStudents();

        String subject = analysis.subjectWithMostFails(students);

        assertNotNull(subject);
    }

    @Test
    void testRosadoApprovedAverageBySubject() {

        List<Student> students = createStudents();

        LinkedHashMap<String, Double> result = analysis.rosadoApprovedAverageBySubject(students);

        assertNotNull(result);
    }

    @Test
    void testStudentsWithFails() {

        List<Student> students = createStudents();

        List<Student> result = analysis.studentsWithFails(students);

        assertFalse(result.isEmpty());
    }

    @Test
    void testHardestSubject() {

        List<Student> students = createStudents();

        String subject = analysis.hardestSubject(students);

        assertNotNull(subject);
    }

    @Test
    void testEmptyStudents() {

        List<Student> students = new ArrayList<>();

        double avg = analysis.getGlobalAverage(students);

        assertEquals(0, avg);
    }

}