package view;

import javax.swing.JOptionPane;
import controller.PilhaFatorial;

public class Principal {

	public static void main(String[] args) {

		PilhaFatorial pf = new PilhaFatorial();
		
		int valor = -1;
		
		while (valor < 0 || valor > 10) {
			
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		}
		
		int fat = pf.fatorial(valor);
		System.out.println(fat);
		
	}

}
