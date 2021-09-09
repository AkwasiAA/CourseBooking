package com.codeclan.example.coursebooking;

import com.codeclan.example.coursebooking.models.Booking;
import com.codeclan.example.coursebooking.models.Course;
import com.codeclan.example.coursebooking.models.Customer;
import com.codeclan.example.coursebooking.repositories.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCourseByRating() {
		List<Course> foundCourses = courseRepository.findByRating(0);
		assertEquals("JavaScript", foundCourses.get(0).getName());
	}

	@Test
	public void canGetCustomerByCourseId(){
		List<Customer> foundCustomer = customerRepository.findByBookingsCourseId(1L);
		assertEquals("Alex", foundCustomer.get(0).getName());
	}

	@Test
	public void canGetCourseByCustomerId(){
		List<Course> foundCourse = courseRepository.findByBookingsCustomerId(1L);
		assertEquals("JavaScript", foundCourse.get(0).getName());
	}

	@Test
	public void canGetBookingByDate() {
		List<Booking> foundBookings = bookingRepository.findByDate("09/09/21");
		assertEquals(1, foundBookings.size());
	}



}
