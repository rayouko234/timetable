package com.module.timetable.RegisterCourse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class courseController {
    private CourseServices courseServices;

    public courseController(CourseServices courseServices){
        super();
        this.courseServices = courseServices;
    }
    @GetMapping("/courses")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseServices.getAllCourse());
        return courses;
    }
    @GetMapping("/courses/new")
    public String createCourseForm(Model model){
        Course course = new Course();
        model.addAttribute("course", course);
        return "create_course";
    }
    @PostMapping("/courses")
    public String saveCourse(@ModelAttribute("course") Course course){
        courseServices.saveCourse(course);
        return "redirect:/courses";
    }
    @GetMapping("/courses/edit/{id}")
    public String editCourseForm(@PathVariable Long id, Model model){
        model.addAttribute("course", courseServices.getCourseById(id));
        return "edit_course";
    }
    @PostMapping("/courses/{id}")
    public String updateCourse(@PathVariable Long id,
			@ModelAttribute("courses") Course course,
			Model model) {
        Course existingCourse = courseService.getStudentById(id);
		existingCourse.setId(id);
		existingCourse.setCertification(course.getCertification());
		existingCourse.setCourseCode(course.getCourseCode());
		existingCourse.setCourseName(course.getCourseName());
		
		// save updated object
        courseServices.updateCourse(existingCourse);
		return "redirect:/courses";
	}
	
	// handler method to handle delete request
	
	@GetMapping("/courses/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseServices.deleteStudentById(id);
		return "redirect:/courses";
	}
}
