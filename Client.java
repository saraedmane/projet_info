package restaurants;

public class Client {
	public double longitude;
	public double latitude;
	public Spécialité spécialité;
	public double distance;
	public Client(double longitude,double latitude,Spécialité spécialité,double distance) {
		this.longitude=longitude;
		this.latitude=latitude;
		this.spécialité=spécialité;
		this.distance=distance;		
	}
}
