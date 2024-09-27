package message.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import message.rest.DTO.UserDTO;
import message.rest.Model.UserModel;
import message.rest.Repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository repository;

	@GetMapping
	public List<UserModel> listUsers() {
		List<UserModel> list = repository.findAll();
		return list;
	}

	@PostMapping
	public void SaveUser(@RequestBody UserDTO data) { // dados do usuário em "data"
		UserModel userdata = new UserModel(data); // Instaciar a classe UserModel
		repository.save(userdata);

	}
}
