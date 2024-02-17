package net.weg.apivendalacteos.service;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.User;
import net.weg.apivendalacteos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findOne(Long id){
        return userRepository.findById(id).get();
    }

    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User validateLogin(String email, String password){
        return userRepository.findByEmailAndPassword(email, password);
    }

}
