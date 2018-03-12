package ex;

import javax.swing.JOptionPane;

public class BuscaLinearRecursiva_ex3 {
	public static void main(String[] args) {
		int iVetor[] = new int [] {0,1,2,3,4,10,6,7,8,9,5,11,12,13,14,15,16,17,18,19};
		int iIndice ,iK;
		
		iK = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A CHAVE DE BUSCA"));
		iIndice = busca(iVetor,0,iK);
		
		String sTitle ="Busca Linear Recursiva - Saida"; 
	    String sIO = "o número"+iK;
	    
	    if (iIndice < iVetor.length) 
	    	sIO += "esta localizado no indice"+ iIndice +"do vetor.";
	    	else sIO +="não está localizado no vetor";
	    	
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	    }
	    public static int busca (int iV[],int iI,int iK)
	    {
	    	if((iI<=iV.length) && (iK!= iV[iI]))
             return busca(iV,iI+1,iK);
             return iI;

	}

}
