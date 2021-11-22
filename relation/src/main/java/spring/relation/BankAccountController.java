package spring.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/persons")
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @PostMapping("/{personId}/bank_account")
    public ResponseEntity<?> postBankAccount(@PathVariable Long personId, @RequestBody BankAccount body) {
        BankAccount bankAccount = bankAccountService.createBankAccount(personId, body);
        return ResponseEntity.status(HttpStatus.CREATED).body(bankAccount);
    }
}
