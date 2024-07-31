package dao;

interface Playable {
	void play(int time);
}
public class Test {

	
	public static void main(String[] args) {
		
		Playable player = (int t) -> { 
			System.out.println("Playing for "+t+" time");
		};
		player.play(50);
		player.play(60);
		player.play(70);
		
	}
}
