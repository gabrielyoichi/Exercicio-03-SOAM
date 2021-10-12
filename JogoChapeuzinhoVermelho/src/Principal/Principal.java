package Principal;

import java.util.Random;
import java.util.Scanner;

import Modelo.Chapeuzinho;
import Modelo.Inimigo;
import Modelo.Lobisomem;
import Modelo.Professor;
import Modelo.QueenBee;
import Modelo.Vampiro;
import Modelo.ZeroManaException;

public class Principal {

	public static void main(String[] args) {
		jogo();
	}

	public static void jogo() {
		introducao();
		Chapeuzinho chapeuzinho = new Chapeuzinho();
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		Integer porcentagemDoCaminho = 0;

		while (porcentagemDoCaminho < 100) {
			System.out.println("Voce ja completou " + porcentagemDoCaminho
					+ "% do caminho para a casa da vovozinha. O que deseja fazer?");
			System.out.println("1 - Continuar pelo caminho // 2 - Pegar um atalho");
			int opcao = input.nextInt();
			if (opcao == 1) {
				porcentagemDoCaminho++;
			} else if (opcao == 2) {
				Inimigo inimigo = null;
				int escolherInimigo = random.nextInt(4);
				switch (escolherInimigo) {
				case 0:
					inimigo = new Lobisomem();
					break;
				case 1:
					inimigo = new Vampiro();
					break;
				case 2:
					inimigo = new Professor();
					break;
				case 3:
					inimigo = new QueenBee();
					break;
				}
				System.out.println("Ao pegar um atalho voc� se depara com um terr�vel " + inimigo.getNome());
				while (inimigo.estaVivo() && chapeuzinho.estaVivo()) {
					inimigo.listarInformacoes();
					chapeuzinho.listarOpcoes();
					int acao = input.nextInt();
					try {
						chapeuzinho.acao(acao);
						int escolherAtaque = random.nextInt(3);
						switch (escolherAtaque) {
						case 0:
							inimigo.atacar();
							break;
						case 1:
							inimigo.habilidade1();
							break;
						case 2:
							inimigo.habilidade2();
							break;
						}

						inimigo.receberDano(chapeuzinho.getDano());
						chapeuzinho.receberDano(inimigo.getDano());
					} catch (ZeroManaException exception) {
						System.out
								.println("A mana é inferior que a opcao escolhida, selecione outra e tente novamente.");
					}
				}
				if (!chapeuzinho.estaVivo()) {
					System.out.println("Você morreu! Voltou para a estaca zero");
					porcentagemDoCaminho = 0;
					chapeuzinho = new Chapeuzinho();
				} else {
					System.out.println("A batalha est� completa");
					porcentagemDoCaminho += 10;
					chapeuzinho.listarAtributos();
					int atributo = input.nextInt();
					chapeuzinho.aumentarNivel(atributo);
				}
			} else {
				System.out.println("Opcao Invalida");
			}
		}
		if (chapeuzinho.estaVivo())
			input.close();
			System.out.println(
					"Voce completou o caminho!! Parab�ns, voc� venceu. Opa, mas o que � isso? N�o parece ser a vov� na cama... (CONTINUA)");

	}

	public static void introducao() {
		System.out.println(
				"Era uma vez, numa pequena cidade �s margens da floresta, uma menina de olhos negros e louros cabelos cacheados, t�o graciosa quanto valiosa.\r\n"
						+ "Um dia, com um retalho de tecido vermelho, sua m�e costurou para ela uma curta capa com capuz; ficou uma belezinha, combinando muito bem com os cabelos louros e os olhos negros da menina.\r\n"
						+ "Daquele dia em diante, a menina n�o quis mais saber de vestir outra roupa, sen�o aquela e, com o tempo, os moradores da vila passaram a cham�-la de �Chapeuzinho Vermelho�.");
		System.out.println(
				"Nesse jogo, voc� estar� no controle de Chapeuzinho Vermelho, uma maga do fogo com habilidades de luta impressionantes. Sua miss�o � levar a cesta de doces para a vov�zinha, no caminho, voc� encontrar� vastos desafios.");
	}
}
