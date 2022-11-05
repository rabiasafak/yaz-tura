package yazitura;

import java.util.Random;
import java.util.Scanner;

public class yazitura {
	static boolean control (int c)
	{Random rnd=new Random();
    int i= rnd.nextInt(2)+1;
    if(i==1 && c==1)
    {
    	return true;
    }
    else if(i==2 && c==2)
    {
    	return true;
    }
    else
    {
    	return false;
    }
	}
	public static void main(String[] args) {
	 Scanner scan= new Scanner(System.in);
     int girdi;
	 System.out.println("yazi için 1 tura için 2 giriniz");
	 girdi=scan.nextInt();
	 if(control(girdi))
	 {
		 System.out.println("tebrikler bilgisayarla aynı cevap");
	 }
	 else
	 {
		 System.out.println("bilgisayarla eşleşmeyen cevap");
	 }
	 
}
}

	