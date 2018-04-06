package restaurants;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.omg.CORBA.portable.InputStream;

import junit.framework.Test;

public class test {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"business_id\": \"lZ18HyZhfrrN_VAJIpyhxQ\", \"name\": \"X-Nail & Spa\", \"neighborhood\": \"Liberty Village\", \"address\": \"111 Jefferson Avenue\", \"city\": \"Toronto\", \"state\": \"ON\", \"postal_code\": \"M6K 3E4\", \"latitude\": 43.6383877, \"longitude\": -79.4216517, \"stars\": 3.0, \"review_count\": 25, \"is_open\": 1, \"attributes\": {\"BusinessAcceptsCreditCards\": false, \"RestaurantsPriceRange2\": 1, \"BusinessParking\": {\"garage\": false, \"street\": true, \"validated\": false, \"lot\": false, \"valet\": false}, \"BikeParking\": true, \"ByAppointmentOnly\": false}, \"categories\": [\"Hair Salons\", \"Beauty & Spas\", \"Nail Salons\"], \"hours\": {\"Monday\": \"10:00-20:00\", \"Tuesday\": \"10:00-20:00\", \"Friday\": \"10:00-20:00\", \"Wednesday\": \"10:00-20:00\", \"Thursday\": \"10:00-20:00\", \"Sunday\": \"11:00-17:00\", \"Saturday\": \"10:00-18:00\"}}";
		test obj = mapper.readValue(new File("c:\Documents\business.json"), test.class);*/
		Yelptest obj = mapper.readValue(jsonInString, Yelptest.class);
		System.out.println(obj);

	}

}
