package io.anuj.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRespository extends CrudRepository <Course, String>{

	//crud repository-logic of any entity class
	//getallTopic()
	//gettopic(string id)
	//update topic(topic t)
	//deletetopic(string id)

public List<Course> findByTopicId(String name);
}
