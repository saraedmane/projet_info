package restaurants;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import Localisation.Grid;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Client yazid= new Client(33.506191, -112.086337);
		Find.FindServices("business.json",yazid,0.5,"");
	}

}
