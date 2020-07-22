package bt5;

public class SuperSaleTour extends TourDecorator {

	private double saleRate;

	public SuperSaleTour(Tour tour, double saleRate) {
		super(tour);
		this.saleRate = saleRate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return tour.price() * (1 - this.saleRate);
	}

}
