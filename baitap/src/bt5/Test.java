package bt5;

public class Test {

	public static void main(String[] args) {
		Tour domesticTour = new DomesticTour("PThiet", "Phan Thiet - Mui Ne", 3, 550000);
		// gia tien co ban cua domesticTour
		System.out.println(domesticTour.price());
		domesticTour = new FiveStartTour(domesticTour);
		// gia tien sau khi nang cap len 5 sao
		System.out.println(domesticTour.price());

		Tour domesticTour2 = new DomesticTour("NTrang", "Nha Trang", 4, 900000);

		Tour domesticTour3 = new DomesticTour("DLNT", "Da Lat - Nha Trang", 4, 1250000);

		Tour overseasTour = new OverSeasTour("Thai", "HCM - Bangkok", 5, 3600000, "Thailand", 500000);
		// gia tien co ban
		System.out.println(overseasTour.price());
		// gia tien sau khi sale
		overseasTour = new SuperSaleTour(overseasTour, 0.3);
		System.out.println(overseasTour.price());

	}
}
