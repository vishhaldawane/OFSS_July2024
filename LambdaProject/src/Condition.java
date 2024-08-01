
public interface Condition {
	public boolean test(Person p);
}

















/*

	Process.printThem((Perso p) -> {logic of comparing firstname });
	 (Perso p) -> {logic of comparing lastname };

class Process
{
	static void printThem(Condition cnd) {
	
	}
}
*/
















/*

class TitleComparator implements Comparator<Song>
{
		public int compare(Song s1, Song s2) {
			return s1.geTitle().compare(s2.getTitle());
		}
}

class Tester
{
		Song s1, s2, s3, s4, s5;
		List playList = new ArrayList();
		playList.add(s1 ... s2....s5);
		
	
		Collections.sort(playList, (Song s1,Song s2) -> { };) ;
		
}

*/