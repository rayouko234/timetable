package com.module.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimetableApplication {

    public static void main(String[] args) {

        SpringApplication.run(TimetableApplication.class, args);
    }

   @Autowired
   private CourseRepo courseRepo;

   @Override
   public void run(String... args) throws Exception{

   }

}