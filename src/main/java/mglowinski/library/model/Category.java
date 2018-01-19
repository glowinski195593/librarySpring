package mglowinski.library.model;

public enum Category {
	Dla_dzieci("Dla dzieci"),
	Dla_młodzieży("Dla młodzieży"),
	Fantasy("Fantasy"),
	Horror("Horror"),
	Klasyka("Klasyka"),
	Obyczajowe("Obyczajowe"),
	Powieść("Powieść"),
	Romans("Romans"),
	Tragedia("Tragedia");
	
	private String displayName;
	
	Category(String displayName) {
		this.displayName = displayName;
	}
	
	public String displayName() {
		return displayName;
	}
}
