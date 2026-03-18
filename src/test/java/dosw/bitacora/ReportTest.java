package dosw.bitacora;

import dosw.bitacora.Corte2.semana2.Ejercicio3.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {

    @Test
    void testPDFReport(){

        Report report = new PDFReport("Contenido");

        assertTrue(report.generate().contains("PDF"));
    }

    @Test
    void testCSVReport(){

        Report report = new CSVReport("datos");

        assertTrue(report.generate().contains("CSV"));
    }

    @Test
    void testJSONReport(){

        Report report = new JSONReport("datos");

        assertTrue(report.generate().contains("JSON"));
    }

    @Test
    void testWatermarkDecorator(){

        Report report = new PDFReport("Contenido");

        report = new Watermark(report);

        assertTrue(report.generate().contains("Marca"));
    }

    @Test
    void testDigitalSignature(){

        Report report = new PDFReport("Contenido");

        report = new DigitalSignature(report);

        assertTrue(report.generate().contains("Firma"));
    }

    @Test
    void testMultipleDecorators(){

        Report report = new PDFReport("Contenido");

        report = new Watermark(report);
        report = new DigitalSignature(report);

        String result = report.generate();

        assertNotNull(result);
    }

    @Test
    void testDecoratorChain(){

        Report report = new JSONReport("data");

        report = new Watermark(report);
        report = new DigitalSignature(report);

        report.generate();
    }

    @Test
    void testBuilder(){

        ReportBuilder builder = new ReportBuilder();

        String content = builder
                .addGeneralInfo("Info")
                .addStatistics("Stats")
                .addTransactions("Trans")
                .build();

        assertTrue(content.contains("Info"));
    }

    @Test
    void testBuilderPartial(){

        ReportBuilder builder = new ReportBuilder();

        String content = builder
                .addGeneralInfo("info")
                .build();

        assertTrue(content.contains("info"));
    }

    @Test
    void testBuilderFull(){

        ReportBuilder builder = new ReportBuilder();

        String content = builder
                .addGeneralInfo("info")
                .addStatistics("stats")
                .addTransactions("data")
                .build();

        assertTrue(content.contains("info"));
        assertTrue(content.contains("stats"));
        assertTrue(content.contains("data"));
    }


    @Test
    void testDecoratorChainDifferentOrder(){

        Report report = new CSVReport("data");

        report = new DigitalSignature(report);
        report = new Watermark(report);

        String result = report.generate();

        assertNotNull(result);
    }

    @Test
    void testBuilderEmpty(){

        ReportBuilder builder = new ReportBuilder();

        String result = builder.build();

        assertNotNull(result);
    }

    @Test
    void testBuilderOnlyTransactions(){

        ReportBuilder builder = new ReportBuilder();

        String result = builder
                .addTransactions("data")
                .build();

        assertTrue(result.contains("data"));
    }

    @Test
    void testAllReportTypes(){

        new PDFReport("a").generate();
        new CSVReport("b").generate();
        new JSONReport("c").generate();
    }


    @Test
    void testWatermark() {

        Report report = new PDFReport("contenido");

        report = new Watermark(report);

        report.generate();
    }

    @Test
    void testSignature() {

        Report report = new PDFReport("contenido");

        report = new DigitalSignature(report);

        report.generate();
    }

    @Test
    void testBuilderUsage() {

        ReportBuilder builder = new ReportBuilder();

        String content = builder
                .addGeneralInfo("info")
                .addStatistics("stats")
                .addTransactions("data")
                .build();

        assertNotNull(content);
    }
}