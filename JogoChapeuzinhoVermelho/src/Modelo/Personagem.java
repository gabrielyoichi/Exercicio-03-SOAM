package Modelo;

public class Personagem {

	private Integer vida;

	private Integer dano;
	
	public Personagem(Integer vida, Integer dano) {
		this.vida = vida;
		this.dano = dano;
	}
	
	public void receberDano(Integer dano) {
		vida -= dano;
	}
	
	public void setDano(Integer dano) {
		this.dano = dano;
	}
	
	public boolean estaVivo() {
		return vida > 0;
	}
	
	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
	public Integer getDano() {
		return dano;
	}

}