package io.anuj.springbootquickstart.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Topic {
	//primary key
	@Id
	private String id;
	private String name;

	private String description;



	public Topic() {
		//object is easier to initialize
	}




	public Topic(String name, String id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
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
