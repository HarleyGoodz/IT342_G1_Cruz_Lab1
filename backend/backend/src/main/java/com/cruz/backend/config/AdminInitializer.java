package com.cruz.backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cruz.backend.entity.Role;
import com.cruz.backend.entity.User;
import com.cruz.backend.repository.UserRepository;

@Configuration
public class AdminInitializer {

    @Bean
    CommandLineRunner createAdmin(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        return args -> {

            String adminEmail = "johnharleycruz571@gmail.com";

            if (userRepository.findByEmail(adminEmail).isEmpty()) {

                User admin = new User();
                admin.setUsername("Admin");
                admin.setEmail(adminEmail);
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.setRole(Role.ADMIN);

                userRepository.save(admin);

                System.out.println("ADMIN account created.");
            }
        };
    }
}