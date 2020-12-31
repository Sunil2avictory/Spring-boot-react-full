package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	CourseRepository courseRepository;
	
	public Iterable<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
	public String deleteCourse(Long id) {
		courseRepository.deleteById(id);
		return "Deleted";
	}
	public String updateCourse(Course course, Long id) {
		Optional<Course> optCourse = courseRepository.findById(id);
		optCourse.get().setDescription(course.getDescription());
		optCourse.get().setUsername(course.getUsername());
		courseRepository.save(optCourse.get());
		return "Updated";
		
	}
}
