package dosw.bitacora.Corte2.semana2.Ejercicio3;

public abstract class ReportDecorator implements Report {

    protected Report report;

    public ReportDecorator(Report report){
        this.report = report;
    }

}
