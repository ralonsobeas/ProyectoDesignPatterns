package Pokemon_Abstract_Factory;

public class Nivel2AbstractFactory implements TipoPokemonAbstractFactory{

	public Nivel2AbstractFactory() {
		super();
	}
	
	@Override
	public Pokemon createPiplup() {
		Pokemon prinplup = new PrinplupNivel2("Prinplup",4,12,10,12);
		return prinplup;
	}

	@Override
	public Pokemon createBeldum() {
		Pokemon metang = new MetangNivel2("Metang",6,10,5,12);
		return metang;
	}

	@Override
	public Pokemon createPichu() {
		Pokemon pikachu = new PikachuNivel2("Pikachu",5,4,15,12);
		return pikachu;
	}

	@Override
	public Pokemon createRalts() {
		Pokemon kirlia = new KirliaNivel2("Kirlia",6,5,10,12);
		return kirlia;
	}

	@Override
	public Pokemon createGastly() {
		Pokemon hunter = new HunterNivel2("Hunter",8,3,4,12);
		return hunter;
	}

}
