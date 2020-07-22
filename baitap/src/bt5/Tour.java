package bt5;

public abstract class Tour {

	protected String name;
	protected String description;
	protected long days;
	protected double basePrice;

	public Tour(String name, String description, long days, double basePrice) {
		super();
		this.name = name;
		this.description = description;
		this.days = days;
		this.basePrice = basePrice;
	}

	public Tour() {
		// TODO Auto-generated constructor stub
	}

	// gia tour
	public abstract double price();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
