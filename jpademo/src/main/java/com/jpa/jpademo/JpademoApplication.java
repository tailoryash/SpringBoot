package com.jpa.jpademo;

import com.jpa.jpademo.dao.UserRepository;
import com.jpa.jpademo.entities.User;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class JpademoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpademoApplication.class, args);
        UserRepository userRepo = context.getBean(UserRepository.class);
//		Inserting Data using JPA
//		User user = new User();
//		user.setName("Arpit");
//		user.setCity("Dubai");
//		user.setStatus("Java developer");
//		User user1 = userRepo.save(user);
//		System.out.println(user1);
//        User user1 = new User();
//        user1.setName("Partth");
//        user1.setCity("Ahmedabad");
//        user1.setStatus("CEO");
//        User user2 = new User();
//		user2.setName("Shailesh");
//		user2.setCity("Ahmedabad");
//		user2.setStatus("CTO");
//        User user3 = new User();
//		user3.setName("Mihir");
//		user3.setCity("Ahmedabad");
//		user3.setStatus("Tech lead");
//		List<User> users = List.of(user1, user2, user3);
//		Iterable<User> userIterable = userRepo.saveAll(users);
//		userIterable.forEach(user -> {
//			System.out.println(user);
//		});
//		System.out.println("All users inserted!!");

		//	Reading Data from DB using JPA
//		Optional<User> userbyId = userRepo.findById(102);
//		User user = userbyId.get();
		//Updating Data
//		user.setName("Kush");
//		User result = userRepo.save(user);
//		System.out.println(result);


//		Iterable<User> allUsers = userRepo.findAll();
//		allUsers.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});
//		allUsers.forEach(System.out::println);

//Deleting Data
//		userRepo.deleteById(104);
//		System.out.println("Deleted Data!!");
//        User user = new User(1111,"yashhh", "ahm", "java");
//        User save = userRepo.save(user);
//        System.out.println(save);

//        @Builder example
//        User user = User.builder().id(123).name("mohit").city("USA").status("CXO").build();
//        User save = userRepo.save(user);
//        System.out.println(save);

        //Custom Finder JPA methods
//        List<User> res = userRepo.findByName("Yash Tailor");
//        System.out.println(res);

//        List<User> res = userRepo.findByNameAndCity("Yash Tailor", "Ahmedabad");
//        System.out.println(res);

//        List<User> byNameStartingWith = userRepo.findByNameStartingWith("Y");
//        System.out.println(byNameStartingWith);

//        List<User> res = userRepo.getUsersUsingName("mohit");
//        System.out.println(res);
//
//        System.out.println("------------------------");
//        List<User> allUsers = userRepo.getAllUsers();
//        allUsers.forEach(user -> {
//            System.out.println(user);
//        });

        System.out.println("------------------------");
        userRepo.getUsers().forEach(user -> {
            System.out.println(user);
        });
    }

}
