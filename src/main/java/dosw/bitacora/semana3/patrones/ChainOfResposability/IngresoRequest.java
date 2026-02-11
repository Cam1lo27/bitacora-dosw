package dosw.bitacora.semana3.patrones.ChainOfResposability;

public class IngresoRequest {
    private final String nombre;
    private boolean pasaporteValido;
    private boolean visaValida;
    private boolean antecedentesOk;
    private boolean motivoValido;

    public IngresoRequest(String nombre, boolean pasaporteValido, boolean visaValida,
                          boolean antecedentesOk, boolean motivoValido) {
        this.nombre = nombre;
        this.pasaporteValido = pasaporteValido;
        this.visaValida = visaValida;
        this.antecedentesOk = antecedentesOk;
        this.motivoValido = motivoValido;
    }

    public String getNombre() { return nombre; }
    public boolean isPasaporteValido() { return pasaporteValido; }
    public boolean isVisaValida() { return visaValida; }
    public boolean isAntecedentesOk() { return antecedentesOk; }
    public boolean isMotivoValido() { return motivoValido; }

    // Setters opcionales si quieres cambiar flags en tiempo de ejecución
    public void setPasaporteValido(boolean v) { this.pasaporteValido = v; }
    public void setVisaValida(boolean v) { this.visaValida = v; }
    public void setAntecedentesOk(boolean v) { this.antecedentesOk = v; }
    public void setMotivoValido(boolean v) { this.motivoValido = v; }
}