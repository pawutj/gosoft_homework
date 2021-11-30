package sending.email;

import java.util.List;

import lombok.Value;

@Value
public class SubscriptionDto {
    private String name;
    private String email;
    private List<String> hobbies;

}
