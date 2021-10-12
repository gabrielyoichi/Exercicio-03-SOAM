package Modelo;

public class QueenBee extends Inimigo {
	public QueenBee() {
		super("Abelha Rainha", 60, 20);
	}
	
	@Override
	public void habilidade1() {
		System.out.println("Ela comeu o mel e consequentemente ganhou vida - cura: 30");
		setVida(getVida());
		setDano(0);
	}
	@Override
	public void habilidade2() {
		System.out.println("Você bateu na abelha que escolha ruim, ela te atacou com o Ferrão - dano: 30");
		setDano(30);
	}
	@Override
	public void atacar() {
		System.out.println("Você irritou a Abelha Rainha e ela chamou seu enxame - dano: 20");
		setDano(20);
	}
}
