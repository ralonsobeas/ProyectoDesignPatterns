package Pokemon_Abstract_Factory;

public class ContextoCrear {
	private TipoPokemonAbstractFactory tipoPokemonAbstractFactory;
	private static ContextoCrear contextoCrear = new ContextoCrear(new Nivel1AbstractFactory());
	
	private ContextoCrear(TipoPokemonAbstractFactory tipoPokemonAbstractFactory) {
		this.tipoPokemonAbstractFactory = tipoPokemonAbstractFactory;
	}
	public static ContextoCrear getInstance() {
		return contextoCrear;
	}
	public TipoPokemonAbstractFactory getTipoPokemonAbstractFactory() {
		return tipoPokemonAbstractFactory;
	}
	public void setTipoPokemonAbstractFactory(TipoPokemonAbstractFactory tipoPokemonAbstractFactory) {
		this.tipoPokemonAbstractFactory = tipoPokemonAbstractFactory;
	}
	public Pokemon createPiplup() {
		return this.tipoPokemonAbstractFactory.createPiplup();
	}
	public Pokemon createBeldum() {
		return this.tipoPokemonAbstractFactory.createBeldum();
	}
	public Pokemon createPichu() {
		return this.tipoPokemonAbstractFactory.createPichu();
	}
	public Pokemon createGastly() {
		return this.tipoPokemonAbstractFactory.createGastly();
	}
	public Pokemon createRalts() {
		return this.tipoPokemonAbstractFactory.createRalts();
	}
}
