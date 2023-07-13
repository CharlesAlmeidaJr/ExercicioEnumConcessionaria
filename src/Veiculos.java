
public enum Veiculos {
	JEEP_RENEGADE(1,"Jeep Renegade", 4, "SUV", 320),
	HONDA_CITY(2,"Honda City", 4, "Sedan", 500),
	FIAT_MOBI(3,"Fiat Mobi", 4, "Hatch", 235),
	FIAT_UNO_MILLE(4,"Fiat Uno Mille", 2, "Hatch", 280);
	
	private int id;
	private String nome;
	private int numeroPortas;
	private String tipo;
	private double litrosPortaMalas;
	
	Veiculos(int id, String nome, int numeroPortas,	String tipo, double litrosPortaMalas){
		this.id = id;
		this.nome = nome;
		this.numeroPortas = numeroPortas;
		this.tipo = tipo;
		this.litrosPortaMalas = litrosPortaMalas;
	}
	
	public int getID() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public String getTipo() {
		return tipo;
	}

	public double getLitrosPortaMalas() {
		return litrosPortaMalas;
	}
	
	
}
