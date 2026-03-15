package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class DigitalSignature extends ReportDecorator {

    public DigitalSignature(Report report) {
        super(report);
    }

    @Override
    public String generate() {
        return report.generate() + "\nFirma Digital";
    }
}
