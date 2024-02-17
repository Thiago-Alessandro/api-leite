package net.weg.apivendalacteos.controller;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.User;
import net.weg.apivendalacteos.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User findOne(@PathVariable Long id){
        return userService.findOne(id);
    }

    @GetMapping()
    public Collection<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/login/{email}/{password}")
    public User validateLogin(@PathVariable String email, @PathVariable String password){
        return userService.validateLogin(email, password);
    }

}
