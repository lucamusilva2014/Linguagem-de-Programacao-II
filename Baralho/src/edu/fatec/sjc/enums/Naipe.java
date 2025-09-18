package edu.fatec.sjc.enums;

public enum Naipe {
	OURO, PAUS, COPAS, ESPADA, CORINGA;
	
	public static Naipe[] getValues() {
		Naipe[] arrayNaipesWithoutCoringa = new Naipe[values().length - 1];
		int index = 0;
		for (Naipe v : values()) {
			if (v != CORINGA)
				arrayNaipesWithoutCoringa[index++] = v;
		}
		return arrayNaipesWithoutCoringa;
	}
}
