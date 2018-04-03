package restaurants;

public class Restaurant {
	String nom;
	String adresse;
	public double latitude;
	public double longitude;
	double note;
	public Spécialité spéc;
	public Restaurant(double latitude,double longitude) {
		this.latitude=latitude;
		this.longitude=longitude;
	}
	public String toString() {
		return "("+this.latitude+","+this.longitude+")";
	}
}
