package bt5;

public class FiveStartTour extends TourDecorator {

	public FiveStartTour(Tour tour) {
		super(tour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		return tour.price() * 1.5;
	}

}
