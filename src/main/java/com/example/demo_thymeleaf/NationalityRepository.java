package com.example.demo_thymeleaf;

import com.example.demo_thymeleaf.models.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality,Integer> {
}
