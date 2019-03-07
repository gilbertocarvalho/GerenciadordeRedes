package View;
import java.util.Scanner;
public class Principal {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		
		Controller.Metodos m = new Controller.Metodos();
		
		System.out.println(m.IdentificarOs());
		
		Controller.RedesController rede = new Controller.RedesController();
		
		int decisao =0;
		
		do {
		
		System.out.println("\n 1- Para ver adaptadores na rede \n 2- para ver o ping \n 9- para finalizar");
		
		
		decisao = ler.nextInt();
		
		
		
		switch(decisao) {
		
		case 1:
		rede.visualizarip("ipconfig");
		
		break;
		case 2:
		rede.ping("ping -n 10 www.google.com");
		break;
		
		}
		
		}while(decisao!=9);

	}
	
	
	
	
	
	
	
	
	
	
}
