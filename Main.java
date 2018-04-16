package restaurants;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import Localisation.Grid;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Client yazid= new Client(33.484761, -112.078004);
		Grid earth= new Grid();
		Database data=new Database();
		ArrayList<Restaurant> restaurants=data.createDB(new File("business.json"));
		earth.makeBoxes();
		for (Restaurant r: restaurants) {
			earth.addRestaurant(r);
		}	
		for (Restaurant r: earth.listof(yazid, 1)) {
			System.out.println(r);
		}
	}

}
