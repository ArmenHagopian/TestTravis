// Direction.java
 
/**
* �num�ration qui repr�sente des directions de mouvement d'une pi�ce
*
* @author S�bastien Comb�fis
* @version 02-mai-08
*/
public enum Direction
{
    NORTH (0, 1),
    SOUTH (0, -1),
    EAST (1, 0),
    WEST (-1, 0);
 
    // Variables d'instance
     private int dx, dy;
 
     // Constructeur
    private Direction (int dx, int dy)
    {
        this.dx = dx;
        this.dy = dy;
    }
 
    public int dx()
    {
         return dx;
    }
 
    public int dy()
    {
        return dy;
    }
}