package ru.markethub.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.markethub.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}