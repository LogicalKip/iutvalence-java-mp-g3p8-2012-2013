
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map m = new Map();
		Bloc b1 = new Bloc(0,0);
		Bloc b2 = new Bloc(1, 0);
		m.passe1(b1.abscisse(), b1.ordonnee());
		m.passe1(b2.abscisse(), b2.ordonnee());
		m.affiche();
		System.out.println("");
		b1.descendre();
		b2.descendre();
		m.passe0(b1.abscisse(), b1.ordonnee()-1);
		m.passe1(b1.abscisse(), b1.ordonnee());
		m.passe0(b2.abscisse(), b2.ordonnee()-1);
		m.passe1(b2.abscisse(), b2.ordonnee());
		m.affiche();
		System.out.println("");
		b1.descendre();
		b2.descendre();
		m.passe0(b1.abscisse(), b1.ordonnee()-1);
		m.passe1(b1.abscisse(), b1.ordonnee());
		m.passe0(b2.abscisse(), b2.ordonnee()-1);
		m.passe1(b2.abscisse(), b2.ordonnee());
		m.affiche();
		System.out.println("");
	}

}
