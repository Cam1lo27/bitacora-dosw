package dosw.bitacora.Corte2.semana2.Ejercicio2;

public abstract class ValidationHandler {

    protected ValidationHandler next;

    public void setNext(ValidationHandler next){
        this.next = next;
    }

    public abstract boolean validate(double amount);

}
