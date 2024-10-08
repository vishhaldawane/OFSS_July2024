
public class PoetTest {
	public static void main(String[] args) {
		
		//Poet is a Person in isA way
		Poet thePoet = new Poet('M',"James Horner",60); //Pen and Paper are in hasA way
		thePoet.pen.setInkColor("Red");
		thePoet.paper.setNumberOfLines(30);
		thePoet.feel();
		thePoet.think();
		Idea idea = new Idea();
		idea.setHint("L o v e");
		
		//Poetry in producesA way
		Poetry thePoetry = thePoet.write(idea); // Idea is usesA a way
		
		System.out.println(thePoetry.getLines());
		
		
		
	}
}
class Pen { 
	int inkLevel;
	String inkColor;
	
	public int getInkLevel() {
		return inkLevel;
	}
	public void setInkLevel(int inkLevel) {
		this.inkLevel = inkLevel;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	@Override
	public String toString() {
		return "Pen [inkLevel=" + inkLevel + ", inkColor=" + inkColor + "]";
	}
	
	
}

class Paper {
	int numberOfLines;

	public int getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	@Override
	public String toString() {
		return "Paper [numberOfLines=" + numberOfLines + "]";
	}
	
}/*
    immutable string = String 
    
	String str = "rose Rose is love Rose is comap";
	str = "Rose is love";
	str = str + "Rose is compassion"
*/
class Poetry { 
	StringBuffer lines;

	public StringBuffer getLines() {
		return lines;
	}

	public void setTitle(String title) {
		lines = new StringBuffer(title);
	}
	public void appendLines(String newLines) {
		lines.append(newLines);
	}
	
}
class Idea { 
	String hint;

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
}

class Poet extends Person //isA
{
        public Poet(char gender, String name, int age) {
    	   super(gender, name, age);
       	}


		Pen pen = new Pen(); //hasA
        Paper paper = new Paper(); //hasA

        
//producesA         //usesA
        Poetry write(Idea idea) {
                String theHint = idea.getHint();    
                int lines = paper.getNumberOfLines();
                String inkColor = pen.getInkColor();
                
                System.out.println("The Poet is writing a poem");
                System.out.println("Using "+inkColor+"  color pen");
                System.out.println("On a page of "+lines+" lines");
                Poetry poetry = new Poetry();
                poetry.setTitle("\n* * * "+theHint+" * * *\n");
              
                poetry.appendLines("Every night in my dreams\n"+
                "I see you, I feel you\n"+
                "That is how I know you go on\n"+
                "Far across the distance\n"+
                "And spaces between us\n"+
                "You have come to show you go on\n"+
                "Near, far, wherever you are\n"+
                "I believe that the heart does go on\n"+
                "Once more, you open the door\n"+
                "And you're here in my heart\n"+
                "And my heart will go on and on\n");
                return poetry;
        }   
}


