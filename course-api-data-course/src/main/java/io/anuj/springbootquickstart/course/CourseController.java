package io.anuj.springbootquickstart.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.anuj.springbootquickstart.topic.Topic;


@RestController
//wherever rest controller is written it will give json as output send back as a HTTP response
public class CourseController {

	@Autowired
	private CourseService courseService;

	/*//get request by default
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getallCourses(@PathVariable String id){
		return courseService.getAllCourses(id);

	}*/
	//get request
	@RequestMapping("/topics/{topicid}/courses{id}")
	public Course getCourse(@PathVariable String id){
		return 	courseService.getCourse(id);
	}
	//
	@RequestMapping(method=RequestMethod.POST, value= "/topics/{topicid}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId){
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{topicid}/courses/{id}")
	public void updateTopic(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{topicid}/courses/{id}")
	public void deleteTopic(@PathVariable String id){
		courseService.deleteTopic(id);
	}
}
