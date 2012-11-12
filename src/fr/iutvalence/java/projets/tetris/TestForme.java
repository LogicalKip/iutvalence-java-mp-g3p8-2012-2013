package fr.iutvalence.java.projets.tetris;

/**
 * Zone de test 
 * @author duplanm
 */
public class TestForme
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Forme f = new T(new Position(3,3));
		
		System.out.println(f);
		f.tourner();
		System.out.println(f);

		f.descendre();
		f.descendre();
		System.out.println(f);
		f.translationGauche();
		System.out.println(f);
		f.translationDroite();
		System.out.println(f);
		f.translationDroite();
		System.out.println(f);
		f.translationDroite();
		System.out.println(f);
	}

}
