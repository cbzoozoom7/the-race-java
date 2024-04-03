//© A+ Computer Science  -  www.apluscompsci.com
public class TheRaceRunner {
	public static void main( String args[] ) {
		TheRace r = new TheRace();
		System.out.println(r);
		while(r.turn()) {
			System.out.println( r );
		}
		System.out.println( r.getWinner() );
	}
}