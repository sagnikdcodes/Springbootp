package com.springrest.springrest.controller;


import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class mycontroller {

    @Autowired
    private courseService courseService;

    @GetMapping("/home")
    public String home() {
        return (" Welcome to courses application ");
    }


    @GetMapping("/allcourses")
    public List<course> getcourses() {
        return this.courseService.getcourses();

    }


    @GetMapping("/courses/{courseId}")
    public course getcourse(@PathVariable String courseId) {
        return  this.courseService.getcourse(Long.parseLong(courseId));
    }





     @PostMapping ("/courses")
    public course addcourse(@RequestBody course course){
        return this.courseService.addcourse(course);
    }




      @PutMapping ("/courses")
     public course updatecourse(@RequestBody course course){

        return this.courseService.updatecourse(course);
     }



     @DeleteMapping ("/courses/{courseId}")
     public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }


}
