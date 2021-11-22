package spring.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private PersonRepository personRepository;

    public BankAccount createBankAccount(Long personId, BankAccount bankAccount) {
        Optional<Person> person = personRepository.findById(personId);
        if (person.isPresent()) {
            bankAccount.setPerson(person.get());
            return bankAccountRepository.save(bankAccount);
        } else
            return new BankAccount();

    }
}
