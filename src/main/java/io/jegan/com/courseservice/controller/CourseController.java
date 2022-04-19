package io.jegan.com.courseservice.controller;

import io.jegan.com.courseservice.entity.Course;
import io.jegan.com.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class CourseController {
    @Autowired
    private CourseService courseService;

  
    @RequestMapping("/course")
    public List<Course> findAllStudent(){
        return courseService.findAllStudent();
    }

    @GetMapping("/course/{id}")
    public Optional<Course> findById(@PathVariable Long id){
        return courseService.findById(id);
    }

    @PostMapping("/course")
    public void createStudent(@RequestBody Course course){

       courseService.createStudent(course);
    }

    @DeleteMapping("/course/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Long id){
        courseService.deleteById(id);
    }
}


