package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class PDFReport implements Report {

    private String content;

    public PDFReport(String content){
        this.content = content;
    }

    @Override
    public String generate() {
        return "PDF: " + content;
    }
}
