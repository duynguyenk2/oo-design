package bt5;

public class OverSeasTour extends Tour {

	private String country;
	private double visaSurtax;

	public OverSeasTour(String name, String description, long days, double basePrice, String country,
			double visaSurtax) {
		super(name, description, days, basePrice);
		this.country = country;
		this.visaSurtax = visaSurtax;
	}

	@Override
	public double price() {
		return this.basePrice + this.visaSurtax;
	}

}
