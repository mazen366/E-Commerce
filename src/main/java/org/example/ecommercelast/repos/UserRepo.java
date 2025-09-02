package org.example.ecommercelast.repos;

import org.example.ecommercelast.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
