package com.example.Vinsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vinsys.model.ContactUs;



@RestController
@RequestMapping("/api")
public class ContactUsController {

    @GetMapping("/contact")
    public ContactUs getContactDetails() {
        // Contact Us page details
        ContactUs contactUs = new ContactUs(
            "Vinsys Support Team",
            "support@vinsys.com",
            "123-456-7890",
            "Vinsys Technologies Pvt. Ltd.",
            "123 Tech Street, Suite 101, Pune, Maharashtra, India"
        );
        return contactUs;
    }
}
