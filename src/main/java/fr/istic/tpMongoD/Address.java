package fr.istic.tpMongoD;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity("address")
public class Address {

	@Id
	private ObjectId id;
	
	private String street;
	
	private String city;
	
	private String postCode;
	
	private String country;
		
	public Address() {
		this.id = new ObjectId();
	}
	
	public Address(String street, String city, String postCode, String country) {
		this.id = new ObjectId();
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
