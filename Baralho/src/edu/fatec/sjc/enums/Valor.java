package edu.fatec.sjc.enums;

public enum Valor {
	AIS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REIS, CORINGA;
	
	public static Valor[] getValues() {
		Valor[] arrayValorWithoutCoringa = new Valor[values().length - 1];
		int index = 0;
		for (Valor v : values()) {
			if (v != CORINGA)
				arrayValorWithoutCoringa[index++] = v;
		}
		return arrayValorWithoutCoringa;
	}
}
