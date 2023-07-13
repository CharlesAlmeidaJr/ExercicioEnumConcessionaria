import java.util.Scanner;

public class Concessionaria {
	public static void main(String[] args) {
		int escolha = -1;
		Veiculos veiculoEscolhido = null;
		
		Scanner scanner = new Scanner(System.in);

		do {
			try {
				System.out.println("\nComo deseja escolher o carro?\n1 - Escolher diretamente pelo nome\n2 - Pesuisar por tipo\n3 - Escolher pelo número de portas\n4 - Escolher por capacidade do porta-malas\nEscolha 0 a qualquer momento para sair");
				escolha = scanner.nextInt();
				
				switch (escolha) {
					case 1: {
						System.out.println("\nCarros disponíveis:");
						for(Veiculos veiculo : Veiculos.values()) {
							System.out.println(veiculo.getID() + " - " + veiculo.getNome());	
						}
						
						System.out.println("\nDigite o número do carro escolhido:");
						escolha = scanner.nextInt();
						
						for(Veiculos veiculo : Veiculos.values()) {
							if(veiculo.getID() == escolha) {
								veiculoEscolhido = veiculo;
								break;
							}
						}
						break;
					}
					case 2: {
						System.out.println("\nEscolha o tipo:\n1 - SUV\n2 - Sedan\n3 - Hatch");
						escolha = scanner.nextInt();
						
						if(escolha != 0) {
							
							
							String tipo = null;
												
							switch (escolha) {
							case 1: {
								tipo = "SUV";
								break;
							}
							case 2: {
								tipo = "Sedan";
								break;
							}
							case 3: {
								tipo = "Hatch";
								break;
							}
							default:
								System.out.println("\nEscolha inválida");
								main(new String[0]);
								break;
							}
							System.out.println("Carros deste tipo disponíveis:");
							for(Veiculos veiculo : Veiculos.values()) {
								if(veiculo.getTipo().equals(tipo)) {
									System.out.println(veiculo.getID() + " - " + veiculo.getNome());
								}
							}
							
							System.out.println("\nDigite o número do carro:");
							escolha = scanner.nextInt();
							
							for(Veiculos veiculo : Veiculos.values()) {
								if(veiculo.getID() == escolha && veiculo.getTipo().equals(tipo)) {
									veiculoEscolhido = veiculo;
									break;
								}
							}
						}
						
						break;
					}
					case 3: {
						System.out.println("\nEscolha o número de portas:\n2 portas\n4 potas");
						int portas = scanner.nextInt();
						
						if(portas==0) {
							escolha = 0;
							break;
						}else {
							
											
							if (portas == 2 || portas == 4) {	
								System.out.println("Carros disponíveis:");
								for(Veiculos veiculo : Veiculos.values()) {
									if(veiculo.getNumeroPortas() == portas) {
										System.out.println(veiculo.getID() + " - " + veiculo.getNome());
									}
								}
							} else {
								System.out.println("\nEscolha inválida");
								main(new String[0]);
								break;
							}
							
							System.out.println("\nDigite o número do carro:");
							escolha = scanner.nextInt();
							
							for(Veiculos veiculo : Veiculos.values()) {
								if(veiculo.getID() == escolha && veiculo.getNumeroPortas() == portas) {
									veiculoEscolhido = veiculo;
									break;
								}
							}
						}
						
						break;
					}
					case 4: {
						
						System.out.println("Digite a quantidade mínima de litros desejados:");
						double litros = scanner.nextDouble();
						boolean achouCarro = false;
						
						for(Veiculos veiculo : Veiculos.values()) {
							if (veiculo.getLitrosPortaMalas() >= litros) {
								achouCarro = true;
								System.out.println(veiculo.getID() + " - " + veiculo.getNome());
							}
						}
						
						if(achouCarro) {
							System.out.println("\nDigite o número do carro:");
							escolha = scanner.nextInt();
							
							for(Veiculos veiculo : Veiculos.values()) {
								if(veiculo.getID() == escolha && veiculo.getLitrosPortaMalas() >= litros) {
									veiculoEscolhido = veiculo;
									break;
								}
							}
						}else {
							System.out.println("Não há carros disponíveis");
						}
						
						break;
					}
					default:{
						
					}
				}
				
				if (veiculoEscolhido != null) {
					System.out.println("\nVeículo escolhido: " + veiculoEscolhido.getNome() + ", tipo: " + veiculoEscolhido.getTipo() + ", " + veiculoEscolhido.getNumeroPortas() + " portas e " + veiculoEscolhido.getLitrosPortaMalas() + " litros de porta-malas.");
					escolha = 0;
				}else if(escolha != 0)
					System.out.println("\nEscolha inválida");
				
			}catch (Exception e) {
				System.out.println("\nEscolha inválida");
				main(new String[0]);
				break;
			}
			
		}while(escolha != 0);
		
		scanner.close();
		
		
	}
}
