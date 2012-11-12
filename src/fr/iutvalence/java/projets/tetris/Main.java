// FIXME (FIXED) déplacer dans un paquetage différent
package fr.iutvalence.java.projets.tetris;

/**
 * Classe "executable", celle qui va lancer l'application
 * @author duplanm  

 */
public class Main
{
	// FIXME (FIXED) compléter le commentaire
	/**
	 * Fonction principale : Création et lancement d'une Partie (pour l'instant)
	 * TODO Faire un menu contenant Jouer, Options, Quitter
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
