package com.idld.user.service.service.imp;

import com.idld.user.service.exception.UserException;
import com.idld.user.service.model.User;
import com.idld.user.service.repository.UserRepository;
import com.idld.user.service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public User getUserById(Long id) throws UserException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new UserException("User not existent!");
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) throws UserException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new UserException("User not found with id: " + id);
        }

        userRepository.deleteById(userOptional.get().getId());
     }

    @Override
    public User updateUser(Long id, User user) throws UserException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new UserException("User not found with id: " + id);
        }

        User existingUser = userOptional.get();
        existingUser.setFullName(user.getFullName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }
}
