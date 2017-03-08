package io.anuj.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRespository topicRespository;
	//	private List<Topic> topics = new ArrayList<> (Arrays.asList(
	//			new Topic("Spring","Spring Framework","SpringFramework Description"),
	//			new Topic("Core","Core Framework","CoreFramework Description"),
	//			new Topic("JavaScript","JavaScript Framework","JavaScript Description")));
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList();
		topicRespository.findAll()
		.forEach(topics::add); //lambda expressions
		return topics;
	}
	public Topic getTopic(String id){
		//return topics.stream().filter(t -> t.getId().equals(id).findFirst().get());
		return topicRespository.findOne(id);
	}
	public void addTopic(Topic topic) {
		topicRespository.save(topic);

	}
	public void updateTopic(String id, Topic topic) {
		topicRespository.save(topic);

	}
	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRespository.delete(id);
	}
}

