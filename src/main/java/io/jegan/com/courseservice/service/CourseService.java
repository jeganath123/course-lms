package io.jegan.com.courseservice.service;

import io.jegan.com.courseservice.entity.Course;
import io.jegan.com.courseservice.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> findAllStudent(){
        return courseRepo.findAll();
    }

    public Optional<Course> findById(Long id){
        return courseRepo.findById(id);
    }

    public Course createStudent(Course course){
        return courseRepo.save(course);
    }

    public void deleteById(Long id){
        courseRepo.deleteById(id);
    }
}


