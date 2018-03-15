package restaurants;

public class Main {

	public static void main(String[] args) {
		System.out.println(2*distance(0,0,0,180));

}
	public static double distance(double lat1,double long1,double lat2,double long2) {
		return 6378 * (Math.PI/2 - Math.asin(Math.sin((Math.PI *lat2)/180) * Math.sin(Math.PI * lat1/180) + Math.cos((Math.PI * long2/180) - (Math.PI * long1/180)) * Math.cos(Math.PI * lat2/ 180) * Math.cos(Math.PI * lat1/180)));
	}
	}
