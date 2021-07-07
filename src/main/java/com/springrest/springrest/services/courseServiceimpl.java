package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class courseServiceimpl implements courseService{


    @Autowired
    private CourseDao courseDao;

    public courseServiceimpl(){

    }
    @Override
    public List<course> getcourses() {
        return courseDao.findAll();
    }

    @Override
    public course getcourse(long courseId) {
        return courseDao.getById(courseId);
    }

    @Override
    public course addcourse(course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public course updatecourse(course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        course entity = courseDao.getById(parseLong);
        courseDao.delete(entity);
    }
}
