package dosw.bitacora.Corte2.semana2.Ejercicio3;

public class ReportBuilder {

    private StringBuilder content = new StringBuilder();

    public ReportBuilder addGeneralInfo(String info){
        content.append("Info: ").append(info).append("\n");
        return this;
    }

    public ReportBuilder addStatistics(String stats){
        content.append("Stats: ").append(stats).append("\n");
        return this;
    }

    public ReportBuilder addTransactions(String t){
        content.append("Transactions: ").append(t).append("\n");
        return this;
    }

    public String build(){
        return content.toString();
    }
}
