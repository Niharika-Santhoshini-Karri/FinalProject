/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import com.sun.jdi.connect.Transport;
import java.net.PasswordAuthentication;
import java.util.Properties;
import oracle.jdbc.driver.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author rishikagurram
 */
public class Email {
    public void sendMail(String to,String subject,String body){
         
    
    
String ToEmail = to;
        String FromEmail = "rishikagurram1998@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "Rishika@1998";//You email Password from you want to send email
        String Subject = subject;
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        properties.put("mail.smtp.socketFactory.fallback", "false");
//        
       Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        
        try{
            MimeMessage message = new MimeMessage(session);
            	
            message.setFrom(new InternetAddress(ToEmail, FromEmail));
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subject);
            message.setText(body);
            Transport.send(message);
            System.out.println("Sent message successfully....");
            
        }
        catch(Exception ex){
            System.out.println(""+ex);
        }
     }

    
    
}
