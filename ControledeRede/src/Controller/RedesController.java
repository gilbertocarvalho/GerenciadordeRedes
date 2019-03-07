package Controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import org.omg.SendingContext.RunTime;

public class RedesController {

	public RedesController() {
		
		
		
		super();
	}
	
	
	public void visualizarip(String comando) {
		
		try {
			
			Process p = Runtime.getRuntime().exec(comando);
			
			InputStream is = p.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader gravador  = new BufferedReader(isr);
			
			String linha = gravador.readLine();
			
			while(linha !=null) {
				
				if(linha.contains("Adaptador Ethernet") || linha.contains("IPv4")){
				  System.out.println(linha);
				
				}
				linha = gravador.readLine();
			}
			
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
			
			
		}
		
		
	}
	
	public void ping(String comando) {
		
		try {
			
			Process p = Runtime.getRuntime().exec(comando);
			
			InputStream is = p.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader leitor = new BufferedReader(isr);
			
			String linha = leitor.readLine();
			
			
			
			int i=0;
			
			int soma = 0;
			while(linha != null) {
				
				if(linha.contains("tempo")) {
				
		
			
				
				
				int n =linha.indexOf("ms");
				
				
				
				soma = soma + Integer.parseInt(linha.substring(n-2,n));
				i++;
				
				}
				
				linha = leitor.readLine();
				
			}
			
			soma = soma/10;
			 System.out.println(soma + "ms");
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
			
			
		}
	
		
		
		
		
	}
	
	
	
	
}
