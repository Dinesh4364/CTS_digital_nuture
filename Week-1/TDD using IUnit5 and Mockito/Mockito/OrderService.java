public class OrderService {
    private EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(String email) {
        //logic
        System.out.println("Order Placed");

        //send email
        emailService.sendEmail(email,"Order placed Successfully");
    }
}
