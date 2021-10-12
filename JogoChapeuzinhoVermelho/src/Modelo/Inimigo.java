package Modelo;

public abstract class Inimigo extends Personagem {
	private String nome;
	
	public Inimigo(String nome, Integer vida, Integer dano) {
		super (vida, dano);
		this.nome = nome;
	}
	
	public void listarInformacoes() {
		System.out.println(getNome() + " - Vida " + getVida() + " - Dano " + getDano());
	}
	public abstract void habilidade1();
	
	public abstract void habilidade2();
	
	
	public abstract void atacar();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
