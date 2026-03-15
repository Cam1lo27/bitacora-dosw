package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class ReportApp {

    public static void main(String[] args) {

        ReportBuilder builder = new ReportBuilder();

        String content = builder
                .addGeneralInfo("Reporte del sistema")
                .addStatistics("1000 usuarios")
                .addTransactions("500 ventas")
                .build();

        Report report = new PDFReport(content);

        report = new Watermark(report);
        report = new DigitalSignature(report);

        System.out.println(report.generate());
    }
}