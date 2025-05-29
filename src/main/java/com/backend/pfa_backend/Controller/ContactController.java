package com.backend.pfa_backend.Controller;
import com.backend.pfa_backend.model.ContactRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // adapte l'origine selon ton front
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/contact")
    public String sendContactEmail(@RequestBody ContactRequest contactRequest) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(contactRequest.getEmail());
            message.setTo("najlaeechbab.nasaspaceapps@gmail.com");
            message.setSubject("Nouveau message de " + contactRequest.getName());
            message.setText("Nom: " + contactRequest.getName() + "\n"
                    + "Email: " + contactRequest.getEmail() + "\n"
                    + "Message:\n" + contactRequest.getMessage());

            mailSender.send(message);

            return "Message envoyé avec succès";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erreur lors de l'envoi du message";
        }
    }
}
