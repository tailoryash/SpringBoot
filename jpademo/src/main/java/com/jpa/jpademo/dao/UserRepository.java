package com.jpa.jpademo.dao;

import com.jpa.jpademo.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name, String city);
    public List<User> findByNameStartingWith(String start);

    //custom query method - JPQL and native query
    @Query("select u FROM User u")
    public List<User> getAllUsers();

    @Query("select u From User u WHERE u.name =:n")
    public List<User> getUsersUsingName(@Param("n") String name);

    //native query
    @Query(value="select * from user", nativeQuery = true)
    public List<User> getUsers();


}
