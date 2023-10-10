package ie.atu.week3;

public class UserService {
    private EmailService emailService;

    public UserService(){
        this.emailService = new EmailService();
    }

    public void registerUser(String username, String email){
        emailService.sendEmail(email,"Welcome to our platform");
    }
}
