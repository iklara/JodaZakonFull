package walutkonwenter;

public class main {
	
	public static void main (String[] args) {
		double value;
		
		
		
		value = 200;
		zamienPlnEur(value);
		zamienEurPln(value);
		zamienPlnUsd(value);
		zamienUsdPln(value);
		
		
	}
	
	public static double zamienPlnEur(double value) {
		double Eur = value * 4.12;
		System.out.println("wartosc Eur =" + Eur);
		return Eur;
	}
	
	public static double zamienEurPln(double value) {
		double Pln = value / 4.12;
		System.out.println("wartosc Pln =" + Pln);
		return Pln;
	}
	
	public static double zamienPlnUsd(double value) {
		double Usd = 3 * value;
		System.out.println("wartosc USD =" + Usd);
		return Usd;
	}
	public static  double zamienUsdPln (double value ) {
		double Pln = value / 3;
		System.out.println("wartosc pln =" + Pln);
		return Pln;
	}

}
