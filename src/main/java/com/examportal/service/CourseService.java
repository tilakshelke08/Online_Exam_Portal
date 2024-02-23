package com.examportal.service;

import java.util.List;

import com.examportal.entity.Course;
import com.examportal.entity.Grade;

public interface CourseService {
	
	Course addCourse(Course course);

	Course updateCourse(Course course);

	Course getCourseById(int courseId);

	List<Course> getAllCoursesByStatus(String status);
	
	List<Course> getAllCoursesByGradeAndStatus(Grade grade, String status);

}
