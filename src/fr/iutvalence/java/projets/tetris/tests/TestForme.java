package fr.iutvalence.java.projets.tetris.tests;

/**
 * Zone de test 
 * @author duplanm
 */
public class TestForme
{
	/**
	 * @param ms nombre de millisecondes à attendre
	 */
	private static void attendre(final int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * @param args paramètres du test, en l'occurence aucun
	 */
	public static void main(String[] args)
	{
		Forme f = new T(new Position(3,3));
		int tempsAttente = 500;
		System.out.println(f);
		attendre(tempsAttente);
		f.tourner();
		System.out.println(f);
		attendre(tempsAttente);
		f.descendre();
		f.descendre();
		System.out.println(f);
		attendre(tempsAttente);
		f.translationGauche();
		System.out.println(f);
		attendre(tempsAttente);
		f.tourner();
		System.out.println(f);
		attendre(tempsAttente);
		f.descendre();
		System.out.println(f);
		attendre(tempsAttente);
		f.translationDroite();
		System.out.println(f);
		attendre(tempsAttente);
		f.translationDroite();
		System.out.println(f);
		attendre(tempsAttente);
		f.translationDroite();
		System.out.println(f);
	}

}
