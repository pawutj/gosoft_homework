package sending.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import java.util.List;
import org.thymeleaf.context.Context;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import java.time.LocalDate;

@Service
public class EmailService {
    private JavaMailSender mailSender;
    private TemplateEngine templateEngine;

    public EmailService(JavaMailSender mailSender, TemplateEngine templateEngine) {
        this.mailSender = mailSender;
        this.templateEngine = templateEngine;
    }

    public void sent(String name, String email, List<String> hobbies) {
        try {
            Context ctx = new Context();
            ctx.setVariable("greeting", greeting(name));
            ctx.setVariable("date", LocalDate.now());
            ctx.setVariable("hobbies", hobbies);

            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            message.setSubject("Subscription");
            message.setTo(email);

            String content = templateEngine.process("email-subscription.html", ctx);
            message.setText(content, true);

            mailSender.send(mimeMessage);
        } catch (Exception e) {
            System.out.println("Error: {}" + e.getMessage() + e);
        }

    }

    private Object greeting(String name) {
        return "Hi %s" + name;
    }
}
