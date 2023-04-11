package Torneio;
import java.util.Random;
import java.util.Scanner;

public class Campeonato {
		Random gerador = new Random();
		Clube clubes[] = new Clube[8];
		public void popularClube1() {
			Scanner scan = new Scanner(System.in);
			for(int i=0;i<8;i++) {
				clubes[i]= new Clube(scan.nextLine());
			}
		scan.close();
		}
		public void jogarPartida(Clube i, Clube j) {
			int gols1 = gerador.nextInt(5);
			int gols2 = gerador.nextInt(5);
			
			if(gols1>gols2) {
				i.ganhar(gols1-gols2);
				j.perder(gols2-gols1);}
			else if(gols2>gols1) {
				i.perder(gols2-gols1);
				j.ganhar(gols1-gols2);}
			else if(gols1==gols2) {
				i.empatar();
				j.empatar();
					}
				}
		public void jogarCampeonato() {
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) {
						if(i==j) {
							continue;
						}else {
						jogarPartida(clubes[i],clubes[j]);
					}
				}
			}
	}
		public void getClassificaçao() {
			int i,j;
				for(i=0;i<7;i++) {
					for(j=i+1;j<8;j++) {
						if(clubes[j].pontos > clubes[i].pontos) {
							Clube clubeOrg = clubes[j];
							clubes[j] = clubes[i];
							clubes[i] = clubeOrg;
						}
							if(clubes[j].pontos == clubes[i].pontos) {
								if(clubes[j].saldoGols > clubes[i].saldoGols) {
									Clube clubeOrg = clubes[j];
									clubes[j] = clubes[i];
									clubes[i] = clubeOrg;	
								}
							}
					}
				}
		for(i=0;i<8;i++) {
			System.out.println("Time "+clubes[i].getNome());
			System.out.println("Pontuação: "+clubes[i].pontos);
			System.out.println("Saldo de Gols: "+clubes[i].saldoGols);
		}
		}
	}