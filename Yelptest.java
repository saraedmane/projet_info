package restaurants;
import java.util.HashMap;
import java.util.ArrayList;

public class Yelptest {
	String business_id;
	public void setbusiness_id(String business_id) {
		this.business_id=business_id;
	}
	public Yelptest(String business_id) {
		
	}
	String name;
	String Neighborhood;
	String adress;
	String city;
	String State;
	Double postal_code;
	Double latitude;
	Double longitude;
	Double stars;
	Double review_count;
	Boolean is_open;
	HashMap<String,Boolean> attributes;
	ArrayList<String> categories;
	HashMap<String,String> hours;
	
	
	

}
