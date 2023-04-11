package Torneio;

public class Clube {
	private String nome;
	public int pontos=0, saldoGols=0;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public Clube(String nome) {
		this.nome = nome;
	}
	void ganhar(int saldoGols) {
		this.pontos+=3;
		this.saldoGols+=saldoGols;
	}
	void empatar() {
		this.pontos++;
	}
	void perder(int saldoGols) {
		this.saldoGols=saldoGols;
	}
	public String nomear() {
		String resultado = "Nome do time é: "+nome+" e sua pontuação é:"+pontos;
		return resultado;
	}
}
