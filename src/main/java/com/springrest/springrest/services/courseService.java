package com.springrest.springrest.services;

import com.springrest.springrest.entities.course;

import java.util.List;

public interface courseService {

    public List<course>getcourses();

    public  course getcourse(long courseId);

    public  course addcourse(course course);

    public course updatecourse  (course course);

    public void deleteCourse(long parseLong);

}
