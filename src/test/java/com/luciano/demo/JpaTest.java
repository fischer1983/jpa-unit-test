package com.luciano.demo;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luciano.demo.model.Person;
import com.luciano.demo.repository.PersonRepository;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class JpaTest {
	
	@Autowired
	PersonRepository repository;
	Person person;

	@Before
	public void setUp() throws Exception {
		
		person = new Person();
		person.setFirstName("Luciano");
		person.setLastName("Lumertz");
		
	}

	@Test
	public void test() {
		
		repository.save(person);
		
		person = repository.findById(1L).orElse(new Person());

		assertEquals(person.getFirstName(), "Luciano");
		assertEquals(person.getLastName(), "Lumertz");
				
	}

}
