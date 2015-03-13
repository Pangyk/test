package abd;
import java.util.Scanner;
class NewException extends Exception{
	String messa;
	
	public String getMessage(){
		messa="divisor cannot under zero.";
		return messa;
	}
}
class ex{
	
	public void  exo(){	
		try{
			ex.calu();
		}
		catch(NewException e1){
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2){
			System.out.println("divsior cannot be zero.");
			e2.printStackTrace();
		}
		catch(Exception e3){
			System.out.println("A problem is made.");
		}
		finally{
			System.out.print("Done!");
		}
	}
	public static void calu() throws NewException{
		Scanner acb=new Scanner(System.in);
		double no1=acb.nextDouble();
		Scanner abc=new Scanner(System.in);
		int no2=abc.nextInt();
		if(no1<0||no2<0){
			throw new NewException();
		}
		else{
			System.out.println(no1/no2);
		}
	}
}
public class testOfexcep {
public static void main(String[] args){
	ex exit=new ex();
	exit.exo();
}	
}