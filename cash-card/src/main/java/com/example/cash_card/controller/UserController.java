package com.example.cash_card.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.cash_card.model.User;
import com.example.cash_card.service.UserService;


@Controller
public class UserController {

 @Autowired
 private UserDetailsService userDetailsService;

 @Autowired
 private UserService userService;


 @GetMapping("/home")
 public String home(Model model, Principal principal) {
  UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
  model.addAttribute("userdetail", userDetails);
  return "home";
 }

 @GetMapping("/login")
 public String login(Model model, User user) {

  model.addAttribute("user", user);
  return "login";
 }

 @GetMapping("/register")
 public String register(Model model, User user) {
  model.addAttribute("user", user);
  return "register";
 }

 @PostMapping("/register")
 public String registerSave(@ModelAttribute("user") User user, Model model) {
  User client = userService.findByUsername(user.getUsername());
  if (client != null) {
   model.addAttribute("Userexist", client);
   return "register";
  }
  userService.save(user);
  return "redirect:/register?success";
 }
}