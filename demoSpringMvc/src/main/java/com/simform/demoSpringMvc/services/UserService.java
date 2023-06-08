package com.simform.demoSpringMvc.services;

import com.simform.demoSpringMvc.dao.UserDAO;
import com.simform.demoSpringMvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public int createUser(User user){
        return this.userDAO.insert(user);
    }
}
