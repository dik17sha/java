interface Payment {
    void makePayment(double amount);
    void paymentDetails();
}

class CreditCard implements Payment{
    private String cardNum;
    private String cardHolder;

    public CreditCard(String cardNum, String cardHolder)
    {
        this.cardNum = cardNum;
        this.cardHolder = cardHolder;
    }

    public void makePayment(double amount)
    {
        System.out.println(amount);
    }

    public void paymentDetails(){
        System.out.println(cardNum + " , " + cardHolder);
    }
}

class Paypal implements Payment{
    private String email;

    public Paypal(String email)
    {
        this.email = email;
    }

    public void makePayment(double amount)
    {
        System.out.println(amount);
    }

    public void paymentDetails(){
        System.out.println(email);
    }
}


public class PaymentMain {
    public static void main(String[] args) {
        Payment myCrediCard = new CreditCard("1234567","abc");

        Payment myPaypal = new Paypal("abc@gmail.com");

        myCrediCard.makePayment(200);
        myCrediCard.paymentDetails();

        myPaypal.makePayment(400);
        myPaypal.paymentDetails();

    }
}
