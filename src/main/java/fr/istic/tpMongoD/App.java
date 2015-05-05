package fr.istic.tpMongoD;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	Morphia morphia = new Morphia();	
    	Mongo mongo = new Mongo();
    	morphia.map(Person.class).map(Address.class);
    	Datastore ds = morphia.createDatastore(mongo, "my_database");
    	
    	Person p = new Person();
    	p.setName("Tintin");
    	
    	Person p1 = new Person();
    	p1.setName("Alex");
    	
    	Person p2 = new Person();
    	p2.setName("Thibault");
    	
        ds.save(p);
        ds.save(p1);
        ds.save(p2);

    	Address address = new Address();
    	address.setStreet("123 Some street");
    	address.setCity("Some city");
    	address.setPostCode("123 456");
    	address.setCountry("Some country");
    	
    	Address address1 = new Address();
    	address1.setStreet("6 rue perrin de la touche");
    	address1.setCity("Rennes");
    	address1.setPostCode("35000");
    	address1.setCountry("France");
    	
    	Address address2 = new Address();
    	address2.setStreet("24 rue du burel");
    	address2.setCity("Rennes");
    	address2.setPostCode("35000");
    	address2.setCountry("France");
    	
    	//set address
    	List<Address> ad = new ArrayList<Address>();
		ad.add(address);
		p.setAddress(ad);
		
    	List<Address> ad1 = new ArrayList<Address>();
		ad1.add(address1);
		p1.setAddress(ad1);
		
    	List<Address> ad2 = new ArrayList<Address>();
		ad2.add(address2);
		p2.setAddress(ad2);
		
    	// Save the POJO
    	ds.save(address);
    	ds.save(address1);
    	ds.save(address2);
    	
    	
    	Article article = new Article();
        article.setName("mon article");
        
        Article article1 = new Article();
        article1.setName("console");
        
        Article article2 = new Article();
        article2.setName("lit");
        
        ArrayList<Person> buyer = new ArrayList<Person>();
        buyer.add(p);
        
        ArrayList<Person> buyer1 = new ArrayList<Person>();
        buyer1.add(p1);
        
        ArrayList<Person> buyer2 = new ArrayList<Person>();
        buyer2.add(p2);

        article.setBuyers(buyer);
        article1.setBuyers(buyer1);
        article2.setBuyers(buyer2);
    	
        ds.save(article);
        ds.save(article1);
        ds.save(article2);
    	
    	for (Person e : ds.find(Person.class))
    		 System.err.println(e);
    }
}
