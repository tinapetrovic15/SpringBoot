package com.example.demo.helloword;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorld, Long> {
    @Query("select t from HelloWorld t where t.shortcut = ?1")
    Optional<HelloWorld> findHelloWorldByShortcut(String shortcut);

}
