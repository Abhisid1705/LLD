package dependencyinversionprinciple;

public class OutlookClient implements EmailClient{
    @Override
    public void sendEmail() {
        System.out.println("Sending email via outlook..");
    }
}
