package fr.iutvalence.java.projets.tetris;

/**
 * @author duplanm
 *
 */
public class Position
{


	/**
	 * Le point x=0 signifie complètement à gauche. Il s'agit des abscisses.
	 */
	private int x;
	/**
	 * Le point y=0 signifie complètement en haut. Il s'agit des ordonnées.
	 */
	private int y;
	
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Position(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Renvoie la valeur de x
	 * @return x
	 */
	public int getX()
	{
		return this.x;
	}
	
	/**
	 * Renvoie la valeur de y
	 * @return y
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * @param x
	 * Modifie la valeur de x
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * @param y
	 * Modifie la valeur de y
	 */
	public void setY(int y)
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Position [x=" + x + ", y=" + y + "]";
	}
	
	
}
