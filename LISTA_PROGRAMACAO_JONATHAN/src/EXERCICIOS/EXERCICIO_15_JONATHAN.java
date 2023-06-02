package EXERCICIOS;

public class EXERCICIO_15_JONATHAN {

	public static void main(String[] args) {
		
		System.out.println("--------------------Funções--------------------");
		
		System.out.println("\nsoma(3,8)= "+soma(3,8)); 
		System.out.println("quadradoDeX(5)= "+quadradoDeX(5));
		System.out.println("juntaTexto('Jonathan','Oliveira')= "+juntaTexto("Jonathan","Oliveira"));
		System.out.println("valoreIguais(7,7))= "+valoreIguais(7,7));
		System.out.println("fatorial(5)= "+fatorial(5));
		
		System.out.println("\n---------------------procedimento---------------------\n\nmostrarResultados(10,5,7,'Natan','Emanuel',6,5,10):"); 
		mostrarResultados(10,5,7,"Natan","Emanuel",6,5,10);
		
	}
	
	
	//soma
	 public static int soma(int x, int y) {
	       return x + y;
	 } 
	//quadradoDeX
	 public static double quadradoDeX (double x) {
	       return  Math.pow(x,2); 
	 }
	 
	 //juntaTexto
	 public static String juntaTexto(String x, String y) {
	       return x + y;
	 }
	 
	 //valoreIguais
	 public static boolean valoreIguais (int x, int y) {
		 boolean test;	
		 if(x==y){
			 test=true;
		 }else {
			 test=false;
		 }
	       return test;
	 }
	 
	 //fatorial
	 public static int fatorial (int numeroFat) {
		 	int fatorial;
		
			if(numeroFat<0){
				numeroFat*=-1;
			}if(numeroFat==0) {
				fatorial=1;
			}else if(numeroFat<3) {
				fatorial =numeroFat;
			}else{
				fatorial=numeroFat;
				for(int x=numeroFat-1; x>=1;x--) {
					fatorial*= x;
				}
	
			}  
		 return fatorial;
	 }
	 
	 //mostrarResultados
	 public static void mostrarResultados(int a, int b,double c,String d, String e,int f, int g,int h) {
		 	System.out.println("\nsoma("+a+","+b+")= "+soma(a,b)); 
			System.out.println("quadradoDeX("+c+")= "+quadradoDeX(c));
			System.out.println("juntaTexto('"+d+"'5,'"+e+"')= "+juntaTexto(d,e));
			System.out.println("valoreIguais("+f+","+g+"))= "+valoreIguais(f,g));
			System.out.println("fatorial("+h+")= "+fatorial(h));
	 }
	 

}
