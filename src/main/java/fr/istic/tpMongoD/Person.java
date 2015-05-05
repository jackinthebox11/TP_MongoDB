package fr.istic.tpMongoD;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity("person")
public class Person {

	@Id
	private ObjectId id;
	
	private String name;
	
	@Reference
	private List<Address> address;
	

	public Person() {
		this.id = new ObjectId();
	}
	
	public Person(String name) {
		this.id = new ObjectId();
		this.name = name;
	}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
}
