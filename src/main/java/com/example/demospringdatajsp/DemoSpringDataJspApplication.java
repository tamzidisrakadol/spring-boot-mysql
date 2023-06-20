package com.example.demospringdatajsp;

import com.example.demospringdatajsp.dao.UserDao;
import com.example.demospringdatajsp.modal.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoSpringDataJspApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(DemoSpringDataJspApplication.class, args);
		UserDao userDao=context.getBean(UserDao.class);
//		User user = new User();
//		user.setName("ADOL");
//		User user1 = userDao.save(user);   // save method by spring boot
//		System.out.println(user1);
//		User user1 = new User();
//		user1.setName("Israk");
//
//		User user2= new User();
//		user2.setName("Jacky");
//
//		List<User> users= List.of(user1,user2);
//		userDao.saveAll(users);

		//to retrieve the user object by id
		Optional<User> optionalUser = userDao.findById(2);
		User user = optionalUser.get();
		System.out.println(user);

		// to update the user
		Optional<User> optional = userDao.findById(3);
		User user1 = optional.get();
		user1.setName("Ankit");
		User result=userDao.save(user1);
		System.out.println(result);


		// .findAll() = to get list of all data
		//.deleteById(id)= to delete the object by selected id
		//.deleteAll()= to delete the whole list



	}

}
