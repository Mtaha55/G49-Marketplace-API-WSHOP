package se.lexicon.g49marketplaceapiwshop.service;


import org.springframework.stereotype.Service;
import se.lexicon.g49marketplaceapiwshop.entity.User;
import se.lexicon.g49marketplaceapiwshop.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
