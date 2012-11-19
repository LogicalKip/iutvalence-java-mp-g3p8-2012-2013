package fr.iutvalence.java.projets.tetris;

/**
 * @author duplanm
 * Test de la classe Map
 */
public class TestMap
{

	/**
	 * @param args arguments inexistants du main
	 */
	public static void main(String[] args)
	{
		
		Map m = new Map();

		for (int i = 0 ; i < Map.LARGEUR_MAP ; i++) // Des lignes pleines
			{
				m.setCouleur(i, 15, Couleur.BLEU);
				m.setCouleur(i, 10, Couleur.BLEU);
				m.setCouleur(i, 19, Couleur.BLEU);
			}
	
		m.setCouleur(3, 3, Couleur.BLEU);
		m.setCouleur(4, 7, Couleur.BLEU);
		m.setCouleur(8, 12, Couleur.BLEU);
		m.setCouleur(9, 5, Couleur.BLEU);
		m.setCouleur(4, 3, Couleur.BLEU);
		m.setCouleur(5, 3, Couleur.BLEU);
		m.setCouleur(7, 6, Couleur.BLEU);
		m.setCouleur(2, 18, Couleur.BLEU);
		m.setCouleur(3, 18, Couleur.BLEU);
		m.setCouleur(5, 0, Couleur.BLEU);
		
		System.out.println(m);
		m.supprLignes();
		System.out.println(m);
		
	}

}
