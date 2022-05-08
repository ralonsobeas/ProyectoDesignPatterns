package Pokemon_Abstract_Factory;

public enum Nivel {
	Nivel1(1),Nivel2(2),Nivel3(3);
	private Integer multiplicador;

	public Integer getMultiplicador() {
		return multiplicador;
	}

	private Nivel(Integer multiplicador) {
		this.multiplicador = multiplicador;
	}
	
}
