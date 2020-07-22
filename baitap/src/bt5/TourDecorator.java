package bt5;

public abstract class TourDecorator extends Tour {

	Tour tour;

	public TourDecorator(Tour tour) {
		this.tour = tour;
	}
	
	

}
