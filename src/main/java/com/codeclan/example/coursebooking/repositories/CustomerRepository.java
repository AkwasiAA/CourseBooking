package com.codeclan.example.coursebooking.repositories;

import com.codeclan.example.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseId(Long CourseId);
    List<Customer> findByTownIgnoreCaseAndBookingsCourseId(String town, Long CourseId);
    List<Customer> findByTownIgnoreCaseAndAgeGreaterThanAndBookingsCourseId(String town, int age, Long id);

}
