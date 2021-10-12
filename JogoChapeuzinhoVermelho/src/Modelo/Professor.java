package Modelo;

public class Professor extends Inimigo {

	public Professor() {
		super("Professor", 50, 10);
	}

	@Override
	public void habilidade1() {
		System.out.println("Você deu trabalho nas aulas, consequencia pegou DP - dano: 15");
		setDano(15);
	}

	@Override
	public void habilidade2() {
		System.out.println("Voce ficou com sono na aula, consequencia minha vida aumentou - cura: 10 e dano: 0");
		setDano(0);
		setVida(getVida() + 10);
	}

	@Override
	public void atacar() {
		System.out.println("O professor passou uma prova surpresa - dano: 10");
		setDano(10);
	}

}
