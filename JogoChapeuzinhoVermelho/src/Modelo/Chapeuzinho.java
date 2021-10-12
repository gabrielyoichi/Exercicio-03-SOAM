package Modelo;

public class Chapeuzinho extends Personagem {
	private Integer mana;
	private Integer ataque;
	private Integer magia;

	public Chapeuzinho() {
		super(100, 0);
		mana = 10;
		ataque = 5;
		magia = 10;
	}

	public void listarAtributos() {
		System.out.println("Parabens, escolha um atributo para melhorar: ");
		System.out.println("1 - Vida + 10");
		System.out.println("2 - Mana + 10");
		System.out.println("3 - Ataque + 2");
		System.out.println("4 - Magia + 2");

	}

	public void aumentarNivel(Integer atributo) {
		switch (atributo) {
		case 1:
			setVida(getVida() + 10);
			break;
		case 2:
			mana = mana + 10;
			break;
		case 3:
			ataque = ataque + 2;
			break;
		case 4:
			magia = magia + 2;
			break;
		default:
			System.out.println("Valor invalido, vai ficar sem o bonus!");
		}
	}

	public void listarOpcoes() {
		System.out.println("Chapeuzinho - Vida " + getVida() + " - Mana " + getMana() + " - Ataque " + getAtaque()
				+ " - Magia " + getMagia());
		System.out.println("Escolha sua acao: ");
		System.out.println("1 - Atacar (dano: ataque)");
		System.out.println("2 - Lan�a de Fogo (dano: magia / 2, mana - 5)");
		System.out.println("3 - Bola de Fogo (dano: magia, mana - 8)");
		System.out.println("4 - Espada de Fogo (dano: ataque * 2 + magia, mana - 15)");
		System.out.println("5 - Fogo Revigorante (cura: magia, mana - 10)");
		System.out.println("6 - Comer docinhos (mana + 15)");
	}

	public void acao(int opcao) throws ZeroManaException {
		switch (opcao) {
		case 1:
			atacar();
			break;
		case 2:
			lancaDeFogo();
			break;
		case 3:
			bolaDeFogo();
			break;
		case 4:
			espadaDeFogo();
			break;
		case 5:
			fogoRevigorante();
			break;
		case 6:
			comerDocinho();
			break;
		default:
			System.out.println("Opcao e invalida, voce perdeu sua acao");
		}
	}

	public void atacar() {
		System.out.println("A Chapeuzinho arremessa broinhas no inimigo");
		setDano(ataque);
	}

	public void lancaDeFogo() throws ZeroManaException {
		if (mana < 5) {
			throw new ZeroManaException();
		}
		System.out.println("A Chapeuzinho utiliza lancas de fogo para acertar o inimigo");
		mana = mana - 5;
		setDano(magia / 2);
	}

	public void bolaDeFogo() throws ZeroManaException {
		if (mana < 8) {
			throw new ZeroManaException();
		}
		System.out.println("A Chapeuzinho canaliza uma bola de fogo de suas maos");
		mana = mana - 8;
		setDano(magia);
	}

	public void espadaDeFogo() throws ZeroManaException {
		if (mana < 15) {
			throw new ZeroManaException();
		}
		System.out.println("A Chapeuzinho cria uma espada de fogo que utiliza para cortar o inimigo");
		mana = mana - 15;
		setDano(magia + ataque * 2);
	}

	public void fogoRevigorante() throws ZeroManaException {
		if (mana < 10) {
			throw new ZeroManaException();
		}
		System.out.println("A Chapeuzinho se regenera atrav�s do seu fogo");
		mana = mana - 10;
		setVida(getVida() + magia);
		setDano(0);
	}

	public void comerDocinho() {
		System.out.println("'Tenho que maneirar nesses docinhos, afinal, eles sao para a vovo...'");
		mana = mana + 15;
		setDano(0);
	}

	public void bolaDeAgua() {
		System.out.println("A Chapeuzinho cospe no inimigo");
		setDano(2);
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getMagia() {
		return magia;
	}

	public void setMagia(Integer magia) {
		this.magia = magia;
	}
}
