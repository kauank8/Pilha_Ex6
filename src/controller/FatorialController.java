package controller;

import br.com.KauanPaulino.pilhaint.Pilha;

public class FatorialController {
	int n;
	public FatorialController(int n) {
		this.n=n;
	}
	
	public void run() {
		fatcontroller();
	}
	
	private void fatcontroller() {
		Pilha p = new Pilha();
		int resultado =1;
		for(n=n;n>0;n--){
			p.push(n);
		}
		int tamanho=p.size();
		for(int i=0;i<tamanho;i++) {
			int valor;
			try {
				valor = p.pop();
				resultado *=valor;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(resultado==0) {
			resultado=1;
		}
		System.out.println((long)resultado);

	}
}
