package com.example.SpringProfiling.repo;

import com.example.SpringProfiling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    //List<User> findByName(String name);
    List<User> findByActiveTrue();
    Optional<User> findByEmail(String email);
    List<User> findByNameAndActive(String name,boolean active);

    @Query("SELECT u FROM User u WHERE u.active = true")
    List<User> findActiveUsers();

    @Query("SELECT u FROM User u WHERE u.name = :name")
    List<User>  findByName(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:keyword%")
    List<User> searchByName(String keyword);

    @Query("SELECT u FROM User u ORDER BY u.name ASC")
    List<User> findAllOrdered();

    //Nastive Query
    @Query(value = "SELECT * FROM User WHERE active = true", nativeQuery = true)
    List<User> findActiveUserNativeQuery();

    @Query(value="Select * from User where email=:email",nativeQuery = true)
    User findByEmailNative(String email);
}
