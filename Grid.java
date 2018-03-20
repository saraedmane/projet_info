package Localisation;
import restaurants.Client;
import java.util.List;
import java.util.ArrayList;
import restaurants.Restaurant;

public class Grid {
	public List<Case> boxes;
	public Grid() {
		boxes=new ArrayList<Case>();
	}
	public void makeBoxes() {
		Coordinates left=new Coordinates(0,0);
		Coordinates right=new Coordinates(0,0);
		Coordinates upleft=new Coordinates(0,0);
		Coordinates upright=new Coordinates(0,0);
		for (int i=-90;i<90;i++) {
			for (int j=-180;j<180;j++) {
				left.latitude=i;
				left.longitude=j;
				right.latitude=i;
				right.longitude=j+1;
				upleft.latitude=i+1;
				upleft.longitude=j;
				upright.latitude=i+1;
				upright.longitude=j+1;
				boxes.add(new Case(left,right,upleft,upright));
			}
		}
		
	}
	public void addRestaurant(Restaurant resto) {
		this.boxes.get((int) ((90+Math.floor(resto.latitude))*360 + 180 + Math.floor(resto.longitude))).liste.add(resto);
	}
	public ArrayList<Restaurant> listof(Client client,double distance) {
		ArrayList<Restaurant> result=new ArrayList<Restaurant>();
		List<Restaurant> relevant=this.boxes.get((int) ((90+Math.floor(client.latitude))*360 + 180 + Math.floor(client.longitude))).liste;
		for (Restaurant r: relevant) {
			if (Locate.distance(client,r)<distance) {
				result.add(r);			
			}
		}
		return result;
		
	}
}
