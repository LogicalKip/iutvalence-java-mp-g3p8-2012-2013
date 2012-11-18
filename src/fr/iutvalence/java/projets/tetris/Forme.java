package fr.iutvalence.java.projets.tetris;
/**
 * 
 * Définition abstraite d'une forme. Une forme descend la zone de jeu, peut se translater
 * à gauche et à droite, mais également effectuer des rotations (spécifiques en fonction des
 * formes). Une forme possède aussi une couleur.
 * @author duplanm

 */
public abstract class Forme
{	
	/**
	 * Couleur associée à la forme
	 */
	protected Couleur color;
	
	/**
	 * Tableau à deux dimensions qui contient, pour cette forme, et pour une orientation donnée
	 * en 1er indice, la translation en x et y (Position) du bloc n° [2ème indice] qu'il faut 
	 * ajouter au bloc le plus en haut à gauche pour atteindre sa position.
	 */
	private Position[][] representations;
	
	/**
	 * Définit la position repère de la forme, à savoir le x et le y du bloc le plus à gauche.
	 * S'il y a plusieurs blocs plus à gauche, on choisit le plus en haut.
	 */
	private Position hg;
	
	/**
	 * L'indice du premier crochet de la variable representations. Correspond à l'orientation
	 * courante de la forme.
	 */
	private int representationCourante;

	/**
	 * Constructeur qui permet de créer une forme en définissant son origine (bloc supérieur gauche),
	 * sa couleur ainsi que sa représentation (appelé par la sous-forme)
	 * @param origine coordonnée représentant le coin supérieur gauche de la forme
	 * @param couleur appel à l'enumération Couleur, la couleur qu'aura la forme 
	 * @param representations définit la structure de la forme selon les orientations
	 */
	protected Forme(Position origine, Couleur couleur, Position[][] representations)
	{
		this.color = couleur;
		this.hg = origine;
		this.representations = representations;
		this.representationCourante = 0;
	}
	
	/**
	 * Fait descendre la forme, d'un bloc, si possible.
	 * Une vérification préalable est INDISPENSABLE avant d'appeler la méthode.
	 */
	public void descendre() {
		this.hg.setY(this.hg.getY()+1);
	};
	
	/**
	 * Tourne la forme vers la droite, si possible (dépend de la forme en question).
	 */
	public void tourner()
	{
		this.representationCourante = (this.representationCourante + 1) % this.representations.length; 
	}
	
	/**
	 * Translation de la forme vers la gauche, si possible.
	 * Une vérification préalable est INDISPENSABLE avant d'appeler la méthode.
	 */
	public void translationGauche(){
		this.hg.setX(this.hg.getX()-1);
	};
	
	/**
	 * Translation de la forme vers la droite, si possible.
	 *  Une vérification préalable est INDISPENSABLE avant d'appeler la méthode. 
	 */
	public void translationDroite(){
		this.hg.setX(this.hg.getX()+1);
	}

	@Override
	public String toString()
	{
		String s = "";
		boolean b;
		for (int j = 0 ; j < Map.HAUTEUR_MAP ; j++)
		{
			for (int i = 0 ; i < Map.LARGEUR_MAP ; i++)
			{		
				b = false;
				for (int k = 0 ; k <= 3 ; k++)
				{
					if (this.representations[this.representationCourante][k].getX() + this.hg.getX() == i && 
						this.representations[this.representationCourante][k].getY() + this.hg.getY() == j)
						{
							s += '#';
							b=true;
						}				
				}
				if(! b)
					s += '°';	
			}
			s += '\n';
		}
		return s;
	};
}
