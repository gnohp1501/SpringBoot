package io.get.userservice.repository;

import io.get.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NNPhong
 * @since 1/15/2023
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
