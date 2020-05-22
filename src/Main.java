import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeDiasDaSemana = 4;
		int quantidadeSemanas = 3;
		double[][] valorAcoesMensal = new double[quantidadeSemanas][quantidadeDiasDaSemana];
		double[] mediaSemanal = new double[quantidadeDiasDaSemana];
		
		for(int contadorSemana = 0; contadorSemana < quantidadeSemanas; contadorSemana++)
		{
			for(int contadorDias = 0; contadorDias < quantidadeDiasDaSemana; contadorDias++)
			{
				double valorAcao;
				do {
					System.out.print("Digite o valor da ação do semana "+(contadorSemana+1)+" no dia "+(contadorDias+1)+": ");
					valorAcao = sc.nextDouble();
					if(valorAcao < 0)
					{
						System.out.println("Valor invalido do valor da ação. Digite novamente");
					}
				}while(valorAcao < 0);
				valorAcoesMensal[contadorSemana][contadorDias] = valorAcao;	
			}
		}
		
		for(int indexSemana = 0; indexSemana < quantidadeSemanas; indexSemana++)
		{
			int somaValoAcaoSemana = 0;
			
			for(int indexDias = 0; indexDias < quantidadeDiasDaSemana; indexDias++)
			{
				somaValoAcaoSemana += valorAcoesMensal[indexSemana][indexDias];
			}
			double media = somaValoAcaoSemana/quantidadeDiasDaSemana;
			mediaSemanal[indexSemana] = media;
		}
		
		for(int indexSemana = 0; indexSemana < quantidadeSemanas; indexSemana++)
		{
			
			for(int indexDias = 0; indexDias < quantidadeDiasDaSemana; indexDias++) {
				System.out.print(valorAcoesMensal[indexSemana][indexDias]+" ");	
			}
			System.out.print(" => Média semana = "+mediaSemanal[indexSemana]);
			System.out.print("\n");
		}
		
		double menorMedia = mediaSemanal[0];
		double maiorMedia = mediaSemanal[0];
		
		for(int indexSemana = 1; indexSemana < quantidadeSemanas; indexSemana++) {
			if(mediaSemanal[indexSemana] > maiorMedia )
			{
				maiorMedia = mediaSemanal[indexSemana];	
			}
			
			if(mediaSemanal[indexSemana] < menorMedia )
			{
				menorMedia = mediaSemanal[indexSemana];	
			}
		}
		System.out.println("Maior média = "+maiorMedia);
		System.out.println("Menor média = "+menorMedia);
	}

}
