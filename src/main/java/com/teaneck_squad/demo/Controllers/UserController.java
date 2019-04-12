package com.teaneck_squad.demo.Controllers;

import com.sun.xml.internal.xsom.impl.Ref;
import com.teaneck_squad.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.AbstractDocument;
import java.util.HashMap;

@RestController
    @RequestMapping("/users")
public class UserController {

    @Autowired
    private userService userService;

    @RequestHeader(ContentType"application/json")
    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestParam HashMap<String,String> userData){


        if(userService.createUser(user)){
            mm.put("message","User successfully created");
        }else{
            mm.put("message","Unable to create new user");
            return new ResponseEntity<>(mm, HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return new ResponseEntity<>(mm, HttpStatus.OK);
    }


}
