// FIXME déplacer dans un paquetage différent
/**
 * Classe "executable", celle qui va lancer l'application
 * @author duplanm

 */
public class Main
{
	// FIXME compléter le commentaire
	/**
	 * Fonction principale : lancement du jeu
	 * @param args
	 * 
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
