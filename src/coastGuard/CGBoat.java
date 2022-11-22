package coastGuard;

import java.util.*;
import java.util.stream.*;

public class CGBoat implements GridObject {
	int capacity;
	
	public CGBoat(int capacity) {
		this.capacity = capacity;
	}
	
	public static String  genGrid() {
		//dimensions \/
		//location of CG
		//locations of stations
		//locations of ships
		//No of passengers of each ship
		//CGboat capacity (c) \/
		int m = (int) (Math.round(Math.random()*10)+5);
		int n = (int) (Math.round(Math.random()*10)+5);
		m=3;
		n=3;
		int shipCount = (int) (Math.round(Math.random()*((m*n)-2))+1);
		int remainingLocations=(m*n) - shipCount;
		int stationCount = (int) (Math.round(Math.random()*(remainingLocations-1))+1);
		ArrayList<Integer> gridLocations=new ArrayList<Integer>(m*n);
		int c = (int) (Math.round(Math.random()*70)+30);
		String result = m+","+n+";"+c+";";
		int cgX=(int) (Math.round(Math.random()*(m-1)));
		int cgY=(int) (Math.round(Math.random()*(n-1)));
		result+=cgX+","+cgY+";"+"\n";

		for(int i=0;i<m*n;i++) {
			gridLocations.add(i);
		}
     	Collections.shuffle(gridLocations);
     	String ships=";"+"\n";
		for(int i=0;i<gridLocations.size();i++) {
			if(stationCount>0) {
				int randomXY=gridLocations.get(i);
				int x = randomXY % m;
				int y =randomXY / m;
				result+=x+","+y+",";
				
				stationCount--;
			}
			else if(shipCount>0) {
				int randomXY=gridLocations.get(i);
				int x = randomXY % m;
				int y =randomXY / m;
				int p= (int) (Math.round(Math.random()*99)+1);
				ships+=x+","+y+","+p+",";
				
				shipCount--;
			}
			else if(shipCount==0&&stationCount==0) {
				result=result.substring(0, result.length() - 1);
				ships=ships.substring(0, ships.length() - 1);
				result+=ships+";";
				break;
			}
			
		}
		return result;
	}
	public static void main(String [] args) {
		for(int i=0;i<10;i++) {
			System.out.println(genGrid());
		}
	}

}
