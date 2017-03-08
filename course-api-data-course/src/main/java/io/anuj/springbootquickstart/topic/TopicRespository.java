package io.anuj.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRespository extends CrudRepository <Topic, String>{

	//crud repository-logic of any entity class
	//getallTopic()
	//gettopic(string id)
	//update topic(topic t)
	//deletetopic(string id)


}
