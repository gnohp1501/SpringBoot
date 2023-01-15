package io.get.userservice.repository;

import io.get.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author NNPhong
 * @since 1/15/2023
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
