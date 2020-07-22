package bt1;

public abstract class Component {

	protected String content;
	protected Validation validation;

	public Component(String content) {
		super();
		this.content = content;
		validation = new Number();
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	public void validation() {
		validation.validation(this.content);
	}

}
