package com.swetha.FullStackCRUD.repository;

import com.swetha.FullStackCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
