package restaurants;

public class Restaurant {
	String nom;
	String adresse;
	public double latitude;
	public double longitude;
	double note;
	public Spécialité spéc;
	public Restaurant(String nom,String adresse,double latitude,double longitude,double note,Spécialité spécialité) {
		this.nom=nom;
		this.adresse=adresse;
		this.latitude=latitude;
		this.longitude=longitude;
		this.note=note;
		spéc=spécialité;
	}
	

}
