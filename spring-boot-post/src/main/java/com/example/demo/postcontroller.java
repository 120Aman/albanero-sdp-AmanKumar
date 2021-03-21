package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class postcontroller {

 
@Autowired
  private UserRepository userRepository;

@Autowired
 private UpdateFullName Obj;


  @GetMapping("/users")
  public List<User> getAllUsers() {
	    return userRepository.findAll();
	  }
 
  @PostMapping("/users/post")
  public User createUser(@Validated @RequestBody User user) {
    return userRepository.save(user);
  }
  @GetMapping("/users/{id}")
  public ResponseEntity<User> getUsersById(@PathVariable(value = "id") Long userId)
      throws Exception {
    User user =userRepository.findById(userId).orElseThrow(() -> new Exception("User not found on :: " + userId));
    return ResponseEntity.ok().body(user);
  }
  @GetMapping("/users/username/{userName}")
  public ResponseEntity<User> getUsersByusername(@PathVariable(value = "userName") String Username)
      throws Exception {
    User user =userRepository.findByUserName(Username);
    return ResponseEntity.ok().body(user);
  }

  @PutMapping("/users/{userName}")
  public List<User> updateByusername(@PathVariable(value = "userName") String Username)
      throws Exception {
    User user =userRepository.findByUserName(Username);
    String G=user.getFullName();
    String V=Obj.updatedname(G);
    user.setFullName(V);
    userRepository.save(user);
    return userRepository.findAll();
  }
  @PutMapping("/users/username/{userName}")
  public List<User> updateByusername1(@PathVariable(value = "userName") String Username, @Validated @RequestBody User userDetails)
      throws Exception {
    User user =userRepository.findByUserName(Username);
    user.setFullName(userDetails.getFullName());
    userRepository.save(user);
    return userRepository.findAll();
  }
 
  @DeleteMapping("/users/{userName}")
  public List<User> deleteUser(@PathVariable(value = "userName") String Username) 
		  throws Exception {
    User user =userRepository.findByUserName(Username);

    userRepository.delete(user);
    return userRepository.findAll();
  }


}
