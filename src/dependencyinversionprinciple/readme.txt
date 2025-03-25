High-level modules should not depend on low-level modules;
both should depend on abstractions.

Consider a EmailService which is used to send emails

Now GmailClient which has implementation to send email
If Email service which is a high level model depends on GmailService
it is tightly coupled and inorder to change client we will have to change the Email service which
is a bad design
Instead we can create an interface EmailClient which Gmail or outlook etc can extend
and then email service can depend on Email client

This provides loose coupling



