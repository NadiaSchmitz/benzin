import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		int i;
		double auto_typ_a[] = {8.0, 7.0, 7.4, 7.8, 8.2, 8.6, 9.3, 8.4, 8.3, 7.9, 8.2};
		double auto_typ_b[] = {8.7, 7.6, 7.8, 7.7, 7.9, 8.1, 7.9, 7.8, 8.5, 8.5, 8.4};
		double summe_a, summe_b, durschnitt_a, durschnitt_b;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		summe_a = 0;
		summe_b = 0;
		
		for (i = 0; i < auto_typ_a.length; i++) {
			summe_a = summe_a + auto_typ_a[i];
			summe_b = summe_b + auto_typ_b[i];
		}
		
		durschnitt_a = summe_a / auto_typ_a.length;
		durschnitt_b = summe_b / auto_typ_b.length;
		
		System.out.println("Auto Typ A verbraucht durschnittlich " + df.format(durschnitt_a) + " l/100 km");
		System.out.println("Auto Typ B verbraucht durschnittlich " + df.format(durschnitt_b) + " l/100 km");

	}

}
