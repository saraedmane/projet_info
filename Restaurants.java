package restaurants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Localisation.Grid;


public class Restaurants {
	public HashMap<Grid,List<Restaurant>> liste=new HashMap<Grid,List<Restaurant>>();	
	private void putvalue(Map<Grid,List<Restaurant>> Restos,Grid key,Restaurant value) {
		List<Restaurant> restos=Restos.get(key);
		if (restos ==null) {
			restos=new ArrayList<Restaurant>();
			Restos.put(key,restos);
		}
		restos.add(value);		
	}
	
	
	}
