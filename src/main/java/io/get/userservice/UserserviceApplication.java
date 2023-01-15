package io.get.userservice;

import io.get.userservice.domain.Role;
import io.get.userservice.domain.User;
import io.get.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "John", "John", "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Armet", "Armet", "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Kelvin", "Kelvin", "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Sercuz", "Sercuz", "123456", new ArrayList<>()));

            userService.addRoleToUser("John", "ROLE_USER");
            userService.addRoleToUser("Armet", "ROLE_MANAGER");
            userService.addRoleToUser("Kelvin", "ROLE_ADMIN");
            userService.addRoleToUser("Sercuz", "ROLE_SUPER_ADMIN");
        };
    }
}
