package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class CSVReport implements Report {

    private String content;

    public CSVReport(String content){
        this.content = content;
    }

    @Override
    public String generate() {
        return "CSV: " + content;
    }
}
