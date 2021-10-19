package com.module.timetable.RegisterCourse;
import java.util.List;
public class Services {
    List<course> getAllCourse();
    Course saveCourse(Course course);
    Course getCourseById(Long id);
    Course updateCourse(Course course);
    void deleteStudentById(Long id);
}
