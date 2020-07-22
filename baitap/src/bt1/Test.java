package bt1;

public class Test {

	public static void main(String[] args) {
		Component textComponent = new TextComponent("1121.2");

		textComponent.validation();

		textComponent.setValidation(new Email());
		textComponent.validation();

	}
}
