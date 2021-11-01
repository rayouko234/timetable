package com.module.timetable.RegisterCourse;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "course ")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "certification")
    private String certification;

    @Column(name = "course_name", nullable = false)
	private String courseName;

    @Column(name = "course_code")
    private String courseCode;

    public Course(){

    }
    public Course(String certification, String courseName, String courseCode){
        super();
        this.certification = certification;
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}