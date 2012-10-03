// FIXME déplacer dans un paquetage
/**
 * @author duplanm
 * Classe "executable", celle qui va lancer l'application
 */
public class Main
{
	/**
	 * @param args
	 * Fonction principale : lancement du jeu
	 */
	public static void main(String[] args)
	{
		Partie jeu = new Partie();
		
		jeu.start();
		
		/*
		 * ce serait pas plutôt tout simplement
		 *  //while (rejouer())
		 *  	 new Partie.start();
		 *  	?
		 */
		jeu.map.toString();
		
	}
}
