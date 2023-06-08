package com.simform.demoSpringMvc.dao;

import com.simform.demoSpringMvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public class UserDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(User user){
        int id  = (Integer)this.hibernateTemplate.save(user);
        return id;
    }
}
