package dependencyinversionprinciple;

public class GmailClient implements EmailClient{
    public void sendEmail(){
        System.out.println("Sending mail via gmail...");
    }
}
