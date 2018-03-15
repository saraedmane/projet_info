package Localisation;
import restaurants.Client;
import restaurants.Restaurants;
import java.util.ArrayList;
import restaurants.Restaurant;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Locate {
	private void putvalue(Map<Grid,List<Restaurant>> Restos,Grid key,Restaurant value) {
		List<Restaurant> restos=Restos.get(key);
		if (restos ==null) {
			restos=new ArrayList<Restaurant>();
			Restos.put(key,restos);
		}
		restos.add(value);		
	}
	public static double distance(Client client, Restaurant resto) {
		return 6378 * (Math.PI/2 - Math.asin(Math.sin((Math.PI * client.latitude) / 180) * Math.sin(Math.PI * resto.latitude) / 180) + Math.cos((Math.PI * client.longitude/180) - (Math.PI * resto.longitude/180)) * Math.cos(Math.PI * resto.latitude / 180) * Math.cos(Math.PI * client.latitude/180));
	}
	public ArrayList<Restaurant> RestauList(Client client, Restaurants resto, double radius) {
		ArrayList résultat=new ArrayList();
		Grid geodesique=Grid.whichGrid(client);
		List<Restaurant> restaurants=resto.liste.get(geodesique);
		for (Restaurant a: restaurants) {
			if (distance(client,a) < radius) 
				résultat.add(a);
		}
		return résultat;
	}
	}
