package sending.email;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubscriptionService {
    private EmailService emailService;

    public SubscriptionService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void doSubscript(String name, String email, List<String> hobbies) {
        emailService.sent(name, email, hobbies);
    }
}
