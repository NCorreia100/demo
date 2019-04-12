package com.teaneck_squad.demo.services;

import com.teaneck_squad.demo.models.User;
import com.teaneck_squad.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;


    public boolean createUser (User user){
        if(user.getFName().length()) !=0{
            final User save = UserRepository.save(user);
            return true;

        }else return false;
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
