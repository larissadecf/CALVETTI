package ex;


import javax.swing.JOptionPane;

public class BuscaLinearIterativa_ex1 {
	
	public static void main(String[] args) {
		
		int iVetor[] = new int [] {0,1,2,3,4,5,6,7,8,9};
		int iIndice ,iK;
		
		iK = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A CHAVE DE BUSCA"));
		iIndice = busca(iVetor,0,iK);
		
		String sTitle ="Busca Linear Iterativa - Saida"; 
	    String sIO = "o n�mero"+iK;
	    
	    if (iIndice < iVetor.length) 
	    	sIO += "esta localizado no indice"+ iIndice +"do vetor.";
	    	else sIO +="n�o est� localizado no vetor";
	    	
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	    }
	    public static int busca (int iV[],int iI,int iK)
	    {
	    	int x = 0;
	    	for(int i = 0 ;i<iV.length;i++)
	    	{
	    		if(iV[i] == iK)
	    		{
	    		x=i;
	    		i = iV.length;
	    		}
	    	}
             
             return x;


	}

}
