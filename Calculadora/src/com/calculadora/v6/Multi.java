package com.calculadora.v6;

public class Multi extends Operacion {
	
	Multi(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x * y;
	}
	
	@Override
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}

}
