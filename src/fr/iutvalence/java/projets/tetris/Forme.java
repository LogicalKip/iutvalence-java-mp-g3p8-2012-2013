package fr.iutvalence.java.projets.tetris;

import java.util.Arrays;
// FIXME (FIXED) déplacer dans un paquetage

// FIXME (FIXED) détailler le commentaire (ce qui caractérise une forme)
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
	 * S'il y a plusieurs blocs plus à gauche, on choisi le plus en haut.
	 */
	private Position hg;
	
	private int representationCourante;

	
	
	//TODO rajouter une var orientationCourante
	/**
	 * @param couleur
	 * Constructeur qui permet de choisir la couleur de la forme
	 */
	protected Forme(Position origine, Couleur couleur, Position[][] representations)
	{
		this.color = couleur;
		this.hg = origine;
		this.representations = representations;
		this.representationCourante = 0;
	}
	
	/**
	 * Fait descendre la forme, d'un bloc, si possible
	 */
	// FIXME (FIXED) visibilité ?
	public  void descendre() {};
	
	/**
	 * Tourne la forme vers la droite, si possible (dépend de la forme en question).
	 */
	// FIXME (FIXED) visibilité ?
	public void tourner()
	{
		this.representationCourante = (this.representationCourante + 1) % this.representations.length; 
	}
	
	/**
	 * Translation de la forme vers la gauche, si possible
	 */
	// FIXME (FIXED) visibilité ?
	public  void translationGauche(){};
	
	/**
	 * Translation de la forme vers la droite, si possible
	 */
	// FIXME (FIXED) visibilité ?
	public  void  translationDroite(){}

	@Override
	public String toString()
	{
		return "Forme [color=" + color + ", representations=" + Arrays.toString(representations) + ", hg=" + hg
				+ ", representationCourante=" + representationCourante + "]";
	};
	
	
}
