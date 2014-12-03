import java.util.Scanner;


public class StatistickiPodaci {

	/**
	 * Funkcija računa prosjek zadanih 5 elemenata niza
	 * @param niz
	 * @return
	 */
	
	private static double nadjiProsjek(int[] niz) {
		double suma=0;
		for (int i=0; i<5; i++)
		{
			suma += niz[i];
		}
		return suma/5.0;
	}

	/**
	 * Funkcija pronalazi maksimum od 5 zadanih brojeva
	 * @param niz
	 * @return
	 */
	
	private static int nadjiMaximum(int[] niz) {
		int max = niz[0];
		for (int i=0; i<5; i++)
		{
			if (max<niz[i])
			{
				max = niz[i];
			}
		}
		return max;
	}

	/**
	 * Funkcija pronalazi minimum od 5 zadanih brojeva
	 * @param niz
	 * @return
	 */
	
	private static int nadjiMinumum(int[] niz) {
		int min = niz[0];
		for (int i=0; i<5; i++)
		{
			if (min>niz[i])
			{
				min = niz[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int[] niz = new int [5];
		for (int i=0; i<5; i++)
		{
			System.out.println("Unesite broj: ");
			niz[i] = unos.nextInt();
		}
		int min = nadjiMinumum(niz);
		int max = nadjiMaximum(niz);
		double avg = nadjiProsjek(niz);
		if (args.length != 0)
		{
			if (args[0].equals("-min"))
			{
				System.out.println("Minimum je: " + min);
			}
			else if (args[0].equals("-max"))
			{
				System.out.println("Maximum je: " + max);
			}
			else if (args[0].equals("-avg"))
			{
				System.out.println("Prosjek je: " + avg);
			}
		}
		else
		{
			System.out.println("Minimum je: " + min + "\nMaximum je: " + max + "\nProsjek je: " + avg);
		}

	}

}
