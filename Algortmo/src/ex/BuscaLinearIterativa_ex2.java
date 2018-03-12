package ex;


import javax.swing.JOptionPane;

public class BuscaLinearIterativa_ex2 {
	public static void main(String[] args) {
		
			
			int iVetor[] = new int [] {0,1,2,3,4,10,6,7,8,9};
			int iIndice ,iK;
			
			iK = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A CHAVE DE BUSCA"));
			iIndice = busca(iVetor,9,iK);
			
			String sTitle ="Busca Linear Iterativa - Saida"; 
		    String sIO = "o número"+iK;
		    
		    if (iIndice<= iVetor.length -1  ) 
		    	sIO += "esta localizado no indice"+ iIndice +"do vetor.";
		    	else sIO +="não está localizado no vetor";
		    	
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);

			System.exit(0);
		    }
		    public static int busca (int iV[],int iI,int iK)
		    {
		    	int x = 0;
		    	for(int i = 0 ;i<=iV.length-1;i++)
		    	{
		    		if(iV[i] == iK)
		    		{
		    		x=i;
		    		i = iV.length -1;
		    		}
		    	}
	             
	             return x;


		}
			
	}

