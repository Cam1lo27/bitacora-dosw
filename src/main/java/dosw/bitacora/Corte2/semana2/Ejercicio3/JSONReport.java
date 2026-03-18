package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class JSONReport implements Report {

    private String content;

    public JSONReport(String content){
        this.content = content;
    }

    @Override
    public String generate() {
        return "JSON: " + content;
    }
}
