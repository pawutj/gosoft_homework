package spring.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> retrievePerson() {
        return (List<Person>) personRepository.findAll();
    }

    public Optional<Person> retrievePerson(Long Id) {
        return personRepository.findById(Id);

    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

}
