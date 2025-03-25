package dependencyinversionprinciple;

public class Main
{
    public static void main(String[] args) {
        EmailService emailService=new EmailService(new GmailClient());
        emailService.send();
        EmailService emailService1=new EmailService(new OutlookClient());
        emailService1.send();
    }
}
