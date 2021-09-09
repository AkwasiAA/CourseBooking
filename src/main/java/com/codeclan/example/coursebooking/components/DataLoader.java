package com.codeclan.example.coursebooking.components;

import com.apple.eawt.Application;
import com.codeclan.example.coursebooking.models.Booking;
import com.codeclan.example.coursebooking.models.Course;
import com.codeclan.example.coursebooking.models.Customer;
import com.codeclan.example.coursebooking.repositories.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Alex", "Glasgow", 30);
        customerRepository.save(customer1);

        Course course1 = new Course("JavaScript", "Glasgow", 0);
        courseRepository.save(course1);

        Booking booking1 = new Booking("09/09/21", customer1, course1);
        bookingRepository.save(booking1);

        Customer customer2 = new Customer("Conor", "Edinburgh", 35);
        customerRepository.save(customer2);

        Course course2 = new Course("Python", "Stirling", 3);
        courseRepository.save(course2);

        Booking booking2 = new Booking("07/09/21", customer2, course2);
        bookingRepository.save(booking2);

    }




}
