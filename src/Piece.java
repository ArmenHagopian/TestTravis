// Piece.java
 
import java.awt. Point;
 
/**
* Interface qui d�crit une pi�ce d'un jeu de plateau
*
* @author S�bastien Comb�fis
* @version 02-mai-08
*/
public interface Piece
{
    public Point getPosition();
 
    public void move ( Direction d);
}