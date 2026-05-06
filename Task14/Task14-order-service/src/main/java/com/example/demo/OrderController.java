package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IdentityClient identityClient;

    @GetMapping("/{orderId}/{userId}")
    public String getOrder(@PathVariable int orderId, @PathVariable int userId) {

        String user = identityClient.getUser(userId);

        return "Order #" + orderId + " placed by " + user;
    }
}