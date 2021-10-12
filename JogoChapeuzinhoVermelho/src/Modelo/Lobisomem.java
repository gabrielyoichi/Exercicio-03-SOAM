package Modelo;

public class Lobisomem extends Inimigo {

	public Lobisomem() {
		super("Lobisomem", 30, 7);
	}
	@Override
	public void habilidade1() {
		System.out.println("O lobisomen se regenerou - cura: 10");
		setVida(getVida()+ 10);
		setDano(0);
	}
	@Override
	public void habilidade2() {
		System.out.println("O lobisomen deu uma patada em você - dano: 20");
		setDano(20);
	}
	@Override
	public void atacar() {
		System.out.println("O Lobisomem te golpeia com as garras - dano: 7");
		setDano(7);
	}

}
