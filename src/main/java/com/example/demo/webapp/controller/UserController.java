package com.example.demo.webapp.controller;

import com.example.demo.webapp.entity.UserData;
import com.example.demo.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @PostMapping("saveUserData")
    public String saveUserDatabase(@RequestBody UserData userData){
        userRepository.save(userData);
        return "Save UserData";
    }


//    @RequestMapping(" /")
//    public String home() {
//        return "home";
//    }
//
//    @RequestMapping("signup")
//    public String getSignup(@RequestBody UserData userData) {
//        return "signup";
//    }
//
//    @RequestMapping(" /login")
//    public String getLogin() {
//        return "login";
//    }
//
//    @PostMapping(" /addUser")
//    public ModelAndView addUser(@RequestParam("user_email") String user_email, UserData userData) {
//        ModelAndView mv = new ModelAndView("success");
//        List<UserData> list = userRepository.findByEMAIL(user_email);
//
//        if (list.size() != 0) {
//            mv.addObject("message\", \"Oops!  There is already a user registered with the email provided.");
//        } else {
//            userRepository.save(userData);
//            mv.addObject("message", "User has been successfully registered.");
//        }
//        return mv;
//    }
//
//    @GetMapping("/dummy")
//    public String dummy() {
//        return "dummy";
//    }
//
//    @PostMapping(" /login")
//    public String login_user(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, ModelMap modelMap) {
//        {
//            UserData auser = userRepository.findByUsernameAndPassword(username, password);
//
//            if (auser != null) {
//                String uname = auser.getUser_email();
//                String upass = auser.getUser_password();
//
//                if (username.equalsIgnoreCase(uname) && password.equalsIgnoreCase(upass)) {
//                    session.setAttribute("username", username);
//                    return "dummy";
//                } else {
//                    modelMap.put("error", "Invalid Account");
//                    return "login";
//
//                }
//            } else {
//                modelMap.put("error", "Invalid Account");
//                return "login";
//            }
//        }
//
//        @GetMapping(value = "/logout")
//        public String logout_user(HttpSession session)
//        {
//        session.removeAttribute("username");
//        session.invalidate();
//        return "redirect:/login";
//        }
//    }
}


