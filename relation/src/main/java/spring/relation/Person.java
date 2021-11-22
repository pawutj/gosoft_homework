package spring.relation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import lombok.Data;
import javax.persistence.Table;
import java.util.List;

import javax.persistence.OneToMany;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fullName;
    private Integer status;
    @OneToMany(mappedBy = "person")
    private List<BankAccount> backAccount;

}
