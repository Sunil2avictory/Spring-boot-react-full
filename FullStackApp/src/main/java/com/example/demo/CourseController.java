package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/instructor/{username}/courses")
	public Iterable<Course> getAllCourses(@PathVariable String username){
		return courseService.getAllCourses();
	}
	@GetMapping("/instructor/{username}/courses/{id}")
	public Course getCourse(@PathVariable Long id) {
		return courseService.getCourseById(id);
	}
	@PostMapping("/instructor/{username}/courses/add")
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}
	@DeleteMapping("/instructor/{username}/courses/{id}")
	public String deleteCourseById(@PathVariable Long id) {
		return courseService.deleteCourse(id);
	}
	@PutMapping("/instructor/{username}/courses/{id}")
	public String updateCourseById(@RequestBody Course course, @PathVariable Long id) {
		return courseService.updateCourse(course, id);
	}
}
