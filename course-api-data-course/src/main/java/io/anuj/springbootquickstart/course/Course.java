package io.anuj.springbootquickstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.anuj.springbootquickstart.topic.Topic;


@Entity
public class Course {
@ManyToOne
private Topic topic;

	public Topic getTopic() {
	return topic;
}




public void setTopic(Topic topic) {
	this.topic = topic;
}
	//primary key
	@Id
	private String id;
	private String name;

	private String description;



	public Course() {
		//object is easier to initialize
	}




	public Course(String name, String id, String description, String topicId) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.topic = new Topic(topicId,"","");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}

