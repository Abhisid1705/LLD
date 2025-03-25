package dependencyinversionprinciple;

public class EmailService {
    EmailClient emailClient;
    EmailService(EmailClient emailClient){
      this.emailClient=emailClient;
    }
    void send(){
       emailClient.sendEmail();
    }
}
