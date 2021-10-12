package Modelo;

public class Vampiro extends Inimigo {

	public Vampiro() {
		super("Vampiro", 45, 5);
	}

	@Override
	public void habilidade1() {
		System.out.println("O vampiro moideu seu bumbum - dano :3");
		setDano(3);
	}

	@Override
	public void habilidade2() {
		System.out.println("O vampiro usou a ultimate e virou o Temer, consequentemente voce foi roubado - dano : 20");
		setDano(20);
	}

	@Override
	public void atacar() {
		System.out.println("O vampiro da uma abucanhada na guela - dano: 5");
		setDano(5);
	}

}
