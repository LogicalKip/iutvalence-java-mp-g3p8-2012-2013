package fr.iutvalence.java.projets.tetris;

/**
 * Classe "executable", celle qui va lancer l'application
 * @author duplanm  

 */
public class Main
{
	/**
	 * Fonction principale : Création et lancement d'une Partie (pour l'instant)
	 * TODO Faire un menu contenant Jouer, Options, Quitter
	 * @param args les differents arguments du main
	 * 
	 */
	public static void main(String[] args)
	{
		Partie jeu = new Partie();
		
		jeu.start();
		jeu.map.toString();
		
	}
}
