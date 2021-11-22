package com.springboothomework1.springboothomework1;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    // public PersonService(PersonRepository repository) {
    // this.personRepository = repository;
    // }

    public List<Person> retrievePerson() {
        return (List<Person>) personRepository.findAll();
    }

    public Optional<Person> retrievePerson(Long id) {
        return personRepository.findById(id);

    }

    public Person createPerson(Person person) {
        // person.setId(1);
        return personRepository.save(person);

    }
}
