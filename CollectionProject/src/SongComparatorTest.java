import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SongComparatorTest {
	public static void main(String[] args) {
		Song song1 = new Song("Jhoome Jo Pathhan","Arijit Singh","Pathan",2022);
        Song song2 = new Song("Zhingat","Ajay Atul","Sairat",2014);
        Song song3 = new Song("Jane Kyo Log Pyar Karte Hai","Udit Narayan","Dil Chahta Hai",1999);
        Song song4 = new Song("Aaj Ki party","Mika Singh","Bajrangi Bhai Jan",2018);
        Song song5 = new Song("Baby Doll","Sunny Leone","Ragini MMS",2019);

        ArrayList<Song> myPlayList = new ArrayList<Song>(); // no [] management here....wow

        System.out.println("adding songs....");
        myPlayList.add(song1); //add is a ready made function to append object at the end of the list....
        myPlayList.add(song2);
        myPlayList.add(song3);
        myPlayList.add(song4);
        myPlayList.add(song5);
        System.out.println("songs are added....");
        
        for(Song x : myPlayList) {
        	System.out.println("x "+x);
        }
        
        System.out.println("SORTING...");
        Collections.sort(myPlayList); //Comparable
        System.out.println("SORTED...");
        
        for(Song x : myPlayList) {
        	System.out.println("x "+x);
        }
        System.out.println("===========now lets work with comparator=====");
        Comparator<Song> comp = new ArtistComparator();
        Collections.sort(myPlayList, comp);
        for(Song x : myPlayList) {
        	System.out.println("x "+x);
        }
        
	}
}
//Hardik, Bhavya,  shresth, Ananya, Karthik, Yug, Kaustubh,
//Batool, Dilip, Sarrah, Aakanksha, Vyashnav, Amith,
// meet, Advaith
// Smit, Mann

class TitleComparator implements Comparator<Song>
{
	@Override
	public int compare(Song o1, Song o2) {
		return o1.title.compareTo(o2.title);
	}
}
class AlbumComparator implements Comparator<Song>
{
	@Override
	public int compare(Song o1, Song o2) {
		return o1.album.compareTo(o2.album);
	}
}
class ArtistComparator implements Comparator<Song>
{
	@Override
	public int compare(Song o1, Song o2) {
		return o2.artist.compareTo(o1.artist);
	}
}
class Song implements Comparable<Song>
{
	String title;
	String artist;
	String album;
	int year;
	
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Song o) {
		//comparisn done on year
		return Integer.compare(year, o.year);
	}	
}
