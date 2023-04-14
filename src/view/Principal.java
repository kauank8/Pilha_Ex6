package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		int n;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10"));
		while(n<0 || n>10) {
			n=Integer.parseInt(JOptionPane.showInputDialog("Erro, Digite um numero de 0 a 10"));
		}
		FatorialController f = new FatorialController(n);
		f.run();
	}

}
