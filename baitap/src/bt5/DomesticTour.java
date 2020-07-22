package bt5;

public class DomesticTour extends Tour {

	public DomesticTour(String name, String description, long days, double basePrice) {
		super(name, description, days, basePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		return this.basePrice;
	}

}
