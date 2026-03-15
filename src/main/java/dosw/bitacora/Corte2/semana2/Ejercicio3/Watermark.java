package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class Watermark extends ReportDecorator {

    public Watermark(Report report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + "\nMarca de Agua";
    }
}
