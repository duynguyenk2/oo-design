package bt1;

public class Email implements Validation {

	@Override
	public boolean validation(String content) {
		if (content.contains("@")) {
			System.out.println("Email");
			return true;
		}
		System.out.println("Not Email");
		return false;
	}

}
