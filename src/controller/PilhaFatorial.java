package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class PilhaFatorial {

	public PilhaFatorial() {

		super();
	
	}
	
	public int fatorial(int valor) {
		
		Pilha p = new Pilha();
		
		int r = 1;
		
		for (int i = valor; i >= 1; i--) {
			
			r *= i;
			p.push(r);
			
			try {
				
				r = p.pop();
			
			} catch (Exception e) {
				
				e.printStackTrace();
			
			}
		}
		
		return r;
		
	}

}
