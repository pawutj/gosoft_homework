package spring.relation;

import spring.relation.PersonService;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.junit.jupiter.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(SpringExtension.class)
public class PersonServiceTest {
    private PersonService personService;
    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    public void setUp() throws Exception {
        personService = new PersonService(personRepository);
    }

    @Test
    public void createPersonSuccessfully() throws Exception {
        doAnswer(returnsFirstArg()).when(personRepository).save(any(Person.class));
        Person person = new Person();
        person.setFullName("astralair");

        Person personResponse = personService.createPerson(person);

        assertThat(personResponse.getFullName()).isEqualTo("astralair");
        verify(personRepository).save(any(Person.class));

    }

}
