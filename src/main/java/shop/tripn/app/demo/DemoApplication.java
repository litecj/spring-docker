package shop.tripn.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.tripn.app.demo.calculator.entity.Item;
import shop.tripn.app.demo.calculator.entity.User;
import shop.tripn.app.demo.calculator.repository.ItemRepository;
import shop.tripn.app.demo.calculator.repository.UserRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired private UserRepository userRepository;
	@Autowired private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("####### Application start #######");

		userRepository.deleteAll();
		userRepository.save(new User(1,"a", "이순신", "a@", "1",new Date()));
		userRepository.save(new User(2,"b", "bob", "b@", "1",new Date()));
		userRepository.save(new User(3,"c", "hello", "c@", "1",new Date()));
		userRepository.save(new User(4,"d", "이순신", "d@", "1",new Date()));
		userRepository.save(new User(5,"e", "Hung", "e@", "1",new Date()));
		List<User> users = userRepository.findAll();
		for (User u : users) {
			System.out.println(u.toString());}
		System.out.println("이순신만 출력하시오");
		for (User u : userRepository.findAllByName("이순신")) {
			System.out.println(u.toString());}

		itemRepository.deleteAll();
		itemRepository.save(new Item(1, "galaxy-z",2000000,"Phone",new Date()));
		itemRepository.save(new Item(2, "alice",50000,"say Hello",new Date()));
		itemRepository.save(new Item(3, "any",89000,"애니콜",new Date()));
		itemRepository.save(new Item(4, "galaxy-Tab",1500000,"2021 신제품",new Date()));
		itemRepository.save(new Item(5, "galaxy-Note",1000000,"2020 신제품",new Date()));
		List<Item> items = itemRepository.findAll();
		for (Item i : items) {
			System.out.println(i.toString());}
		System.out.println("galaxy만 출력하시오");
		for (Item i : itemRepository.findAllByItemName("galaxy")) {
			System.out.println(i.toString());}
	}
}
