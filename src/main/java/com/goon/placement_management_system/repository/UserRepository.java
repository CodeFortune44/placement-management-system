package com.goon.placement_management_system.repository;

import com.goon.placement_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // This will help us find users by their email during login/signup
    Optional<User> findByEmail(String email);
}
