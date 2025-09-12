package org.example.testsecurity.repository;


import org.example.testsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // username이 중복으로 존재하는지 true, false
    boolean existsByUsername(String username);
}
