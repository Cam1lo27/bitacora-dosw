package dosw.bitacora;

import dosw.bitacora.Corte2.semana2.Ejercicio2.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    private ValidationHandler buildChain() {

        ValidationHandler balance = new BalanceValidation();
        ValidationHandler fraud = new FraudValidation();
        ValidationHandler limit = new LimitValidation();

        balance.setNext(fraud);
        fraud.setNext(limit);

        return balance;
    }

    @Test
    void testBalanceValidationFail() {

        ValidationHandler chain = buildChain();

        boolean result = chain.validate(2000);

        assertFalse(result);
    }

    @Test
    void testBalanceValidationSuccess() {

        ValidationHandler chain = buildChain();

        boolean result = chain.validate(200);

        assertTrue(result);
    }

    @Test
    void testFraudValidation() {

        FraudValidation fraud = new FraudValidation();

        assertTrue(fraud.validate(100));
    }

    @Test
    void testLimitValidation() {

        LimitValidation limit = new LimitValidation();

        assertTrue(limit.validate(300));
    }

    @Test
    void testPayPalAdapter() {

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        processor.processPayment(100);
    }

    @Test
    void testMultiplePayments() {

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        List<Double> pagos = List.of(50.0,100.0,150.0,200.0);

        pagos.forEach(processor::processPayment);
    }

    @Test
    void testDifferentAmounts() {

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        processor.processPayment(10);
        processor.processPayment(20);
        processor.processPayment(30);
        processor.processPayment(40);
    }

    @Test
    void testVerySmallPayment(){

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        processor.processPayment(1);
    }

    @Test
    void testZeroPayment(){

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        processor.processPayment(0);
    }

    @Test
    void testLargePayment(){

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), buildChain());

        processor.processPayment(500);
    }

    @Test
    void testBalanceValidationDirect(){

        BalanceValidation validation = new BalanceValidation();

        assertTrue(validation.validate(100));
        assertFalse(validation.validate(5000));
    }

    @Test
    void testFraudValidationDirect(){

        FraudValidation fraud = new FraudValidation();

        assertTrue(fraud.validate(50));
    }

    @Test
    void testLimitValidationDirect(){

        LimitValidation limit = new LimitValidation();

        assertTrue(limit.validate(100));
    }

    @Test
    void testBalanceValidation() {

        BalanceValidation balance = new BalanceValidation();

        assertTrue(balance.validate(100));
        assertFalse(balance.validate(5000));
    }

    @Test
    void testFraudValidation2() {

        FraudValidation fraud = new FraudValidation();

        assertTrue(fraud.validate(200));
    }

    @Test
    void testLimitValidation2() {

        LimitValidation limit = new LimitValidation();

        assertTrue(limit.validate(100));
    }

    @Test
    void testValidationChain() {

        ValidationHandler balance = new BalanceValidation();
        ValidationHandler fraud = new FraudValidation();
        ValidationHandler limit = new LimitValidation();

        balance.setNext(fraud);
        fraud.setNext(limit);

        assertTrue(balance.validate(100));
    }

    @Test
    void testProcessorMultiplePayments() {

        ValidationHandler chain = new BalanceValidation();
        chain.setNext(new FraudValidation());

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), chain);

        processor.processPayment(10);
        processor.processPayment(20);
        processor.processPayment(30);
    }


}