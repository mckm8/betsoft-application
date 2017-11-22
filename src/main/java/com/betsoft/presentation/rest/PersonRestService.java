package com.betsoft.presentation.rest;

import com.betsoft.business.rest.Person;
import com.betsoft.business.security.User;
import com.betsoft.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MCKM on 12.10.2017.
 */
@RestController
public class PersonRestService {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/users/{username}", method = RequestMethod.GET)
    public Person getUsers(@PathVariable("username") String username) {
        User byUsername = userRepository.findByUsername(username);
        Person person = new Person(
                byUsername.getUsername(),
                byUsername.getFirstname(),
                byUsername.getLastname(),
                byUsername.getEmail()
        );
        return person;
    }
}