package week_5;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {    // оплата кредитной картой
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " руб. кредитной картой " + cardNumber);
    }
}


class PayPalPayment implements PaymentStrategy {    // оплата через PayPal
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " руб. через PayPal аккаунт " + email);
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        System.out.println("Сумма к оплате: " + amount + " руб.");
        paymentStrategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1111-1111-1111-1111", "05/27", "111");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(50);

        PaymentStrategy paypalPayment = new PayPalPayment("pay@pay.com");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(100);
    }
}

