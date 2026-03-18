package dosw.bitacora.Corte2.semana2.Ejercicio2;

public class PaymentProcessor {

    private PaymentAdapter adapter;
    private ValidationHandler chain;

    public PaymentProcessor(PaymentAdapter adapter, ValidationHandler chain) {
        this.adapter = adapter;
        this.chain = chain;
    }

    public void processPayment(double amount){

        if(chain.validate(amount)){
            adapter.pay(amount);
        }else{
            System.out.println("Pago rechazado");
        }
    }

}
