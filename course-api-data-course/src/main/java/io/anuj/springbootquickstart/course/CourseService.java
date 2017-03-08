package io.anuj.springbootquickstart.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRespository courseRespository;
	//	private List<Topic> topics = new ArrayList<> (Arrays.asList(
	//			new Topic("Spring","Spring Framework","SpringFramework Description"),
	//			new Topic("Core","Core Framework","CoreFramework Description"),
	//			new Topic("JavaScript","JavaScript Framework","JavaScript Description")));
	/*public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList();
		courseRespository.findByTopicId(topicId);
		.forEach(courses::add); //lambda expressions
		return courses;
	}*/
	public Course getCourse(String id){
		//return topics.stream().filter(t -> t.getId().equals(id).findFirst().get());
		
		 return courseRespository.findOne(id);
	}
	public void addCourse(Course course) {
		courseRespository.save(course);

	}
	public void updateCourse(Course course) {
		courseRespository.save(course);

	}
	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRespository.delete(id);
	}
}

