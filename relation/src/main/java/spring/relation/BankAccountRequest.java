package spring.relation;

import lombok.Data;

@Data
public class BankAccountRequest {
    private String personId;
    private String personFullName;
    private Integer personStatus;
    private String accountType;
    private Integer amount;
    private Integer accountAmount;
}
