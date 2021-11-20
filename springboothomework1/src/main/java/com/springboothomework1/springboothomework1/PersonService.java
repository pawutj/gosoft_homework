package com.springboothomework1.springboothomework1;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.personRepository = repository;
    }

    public List<Person> retrievePerson() {
        return (List<Person>) personRepository.findAll();
    }

    public Person createPerson(Person person) {
        person.setId(null);
        return personRepository.save(person);

    }
}
