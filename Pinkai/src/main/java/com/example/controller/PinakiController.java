package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.PinakiModel;
import com.example.service.PinakiService;
 
@Controller
public class PinakiController {

    @Autowired
    private PinakiService pinakiService; 

    @GetMapping("/sayhello.html")
    public String showRFIForm(Model model) {
        model.addAttribute("rfiForm", new PinakiModel());
        return "sayhello"; 
    }

    @PostMapping("/submitContactForm")
    public String submitContactForm(PinakiModel rfiForm, Model model) {
        pinakiService.saveRFIForm(rfiForm); 
        model.addAttribute("successMessage", "Your message has been sent successfully!"); 
        model.addAttribute("rfiForm", new PinakiModel()); // Reset the form
        return "sayhello"; 
    }
}

