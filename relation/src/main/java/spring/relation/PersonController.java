package spring.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.ipc.http.HttpSender.Response;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping()
    public List<Person> getPersons() {
        return personService.retrievePerson();
    }

    @PostMapping()
    public ResponseEntity<?> postPerson(@RequestBody Person body) {
        Person person = personService.createPerson(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

}
