package mvote.server.controller;

import mvote.server.database_service.DptService;
import mvote.server.model.DptModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wahyuade on 20/07/17.
 */
@RestController
public class SentEmailController {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private DptService dptService;

    @PostMapping("/sent_mail")
    public void sendMail(@RequestPart String nrp) {
        DptModel data = dptService.findByNrp(nrp);
        String body = "Nrp : "+data.getNrp()+"\n"+ "Token : "+data.getToken()+"\n"+"Kode Verifikasi : "+data.getVerifikasi();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(data.getEmail());
        message.setSubject("Email untuk Pemilihan M-Vote");
        message.setText(body);
        javaMailSender.send(message);
    }
}
