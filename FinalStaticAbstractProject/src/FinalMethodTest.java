/*
 * 
 * 						Object
 * 							|11 methods
 * 							| wait(),wait(),wait(),notify(),notifyAll()
 * 							| finalize, toString(),
 * 							| equals(), hashCode()
 * 							| clone(), getClass()
 * 			-------------------------------
 * 			|			|			|		|
 * 			String	Exception	ArrayList	DriverManager
 * 
 */
public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chess chess = new GraphicalChess();
		chess.moveBishop();
		chess.moveBishop();
		
	}

}
class Chess // Aniket
{
	final void moveBishop() { //final version of this method, no futher vesions 
		System.out.println("Moving the bishop diagonally forward/backward ");
		//a math logic is here ....
	}
}
final class GraphicalChess extends Chess // Sarah
{
	void moveMyBishop() {
		super.moveBishop(); //reuse the math logic
		System.out.println("Using graphics here....");
		System.out.println("Bishop is moving in L shape");
	}
}

class WebBasedGraphicalChess extends GraphicalChess
{
	
}







