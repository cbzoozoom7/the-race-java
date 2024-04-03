//© A+ Computer Science  -  www.apluscompsci.com
import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
public class TheRace {
	private int one;
	private int two;
	private int oneCount;
	private int twoCount;
	private int[] track;
	private boolean turn;
	private int winner;
	public TheRace() {
		track=new int[18];
		oneCount=0;
		turn=false;
		one=(int)(Math.random()*track.length);
		two=(int)(Math.random()*track.length);
		track[one]=1;
		track[two]=2;
	}
	public boolean turn() {
		if (!turn) {
			track[one]=0;
			one+=(int)(Math.random()*(track.length-one));
			track[one]=1;
			if (one==track.length-1) {
				oneCount++;
				track[one]=0;
				one=0;
				track[one]=1;
				if (oneCount==5) {
					return false;
				}
			}
			if (one==two) {
				track[two]=0;
				two=0;
				track[two]=2;
			}
			return true;
		} else {
			track[two]=0;
			two+=(int)(Math.random()*(track.length-two));
			track[two]=2;
			if (two==track.length-1) {
				twoCount++;
				track[two]=0;
				two=0;
				track[two]=2;
				if (twoCount==5) {
					return false;
				}
			}
			if (one==two) {
				track[one]=0;
				one=0;
				track[one]=1;
			}
			return true;
		}
	}
	public String getWinner() {
		if (oneCount==5) {
			return "1";
		} else {
			return "2";
		}
	}
	public String toString() {
		turn=!turn;
  		return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
  	}
}