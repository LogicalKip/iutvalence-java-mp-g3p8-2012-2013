package fr.iutvalence.java.projets.tetris;

public class TestForme
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Forme f = new Barre(new Position(3,3));
		
		System.out.println(f);
		f.tourner();
		System.out.println(f);
		f.tourner();
		System.out.println(f);
	}

}
