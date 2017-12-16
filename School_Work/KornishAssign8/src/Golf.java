import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.io.*;

public class Golf {

	public static void main(String[] args) throws IOException{

		final int HOLES =18, LINE=5;
		
		ArrayList<Integer> count = new ArrayList<Integer>(LINE);
		
		int index =0, hole =0;
		int player =1, winner =1;
		
		Scanner scan = new Scanner(new File("./src/golf.txt"));
		
		while(index<LINE){
			count.add(0);
			index++;
		}
		
		while (hole<HOLES){
			index=0;
			while(index<LINE){
				count.set(index, count.get(index)+scan.nextInt());
				index++;
			}
			hole++;
		}
		
		System.out.println("Par for the course: "+count.get(0));
		
		while(player<LINE){
			System.out.println("Player "+player+": "+count.get(player));
			if(count.get(player)<count.get(winner)){
				winner =player;
			}
			player++;
		}
		
		System.out.println("The winner is player: "+winner);
		
		
		
		
		/*		
		 * Initial way i made the program
		 * 
		ArrayList<Integer> par, player1,player2,player3,player4;
		
		par     = new ArrayList<Integer>(Arrays.asList(3,4,4,4,3,4,5,4,4,5,3,4,5,4,4,5,4,4));
		player1 = new ArrayList<Integer>(Arrays.asList(3,4,6,7,4,6,7,5,5,6,3,5,6,5,5,5,4,6));
		player2 = new ArrayList<Integer>(Arrays.asList(4,6,4,5,3,5,5,6,4,6,5,4,7,4,5,4,4,5));
		player3 = new ArrayList<Integer>(Arrays.asList(3,5,4,6,4,5,7,5,6,6,4,4,6,4,7,5,4,5));
		player4 = new ArrayList<Integer>(Arrays.asList(3,6,5,6,4,6,6,4,7,6,3,4,5,6,4,6,5,5));
		
		int sumPar=0,sum1=0,sum2=0,sum3=0,sum4=0;
		
		for(int i=0; i<par.size();i++){
			sumPar+=par.get(i);
			sum1+=player1.get(i);
			sum2+=player2.get(i);
			sum3+=player3.get(i);
			sum4+=player4.get(i);
		}

		System.out.println("Par for the course:  "+sumPar);
		System.out.println("Player 1: "+sum1);
		System.out.println("Player 2: "+sum2);
		System.out.println("Player 3: "+sum3);
		System.out.println("Player 4: "+sum4);
		
		if(sum1<sum2){
			if(sum1<sum3){
				if(sum1<sum4){
					System.out.println("The winner is Player 1!");
				}
				else{
					System.out.println("The winner is Player 4!");
				}
			}
			else{
				if(sum3<sum4){
			
					System.out.println("The winner is Player 3!");
				}
				else{
					System.out.println("The winner is Player 4!");
				}
			}
		}
		else{
			if (sum2<sum3){
				if(sum2<sum4){
					System.out.println("The winner is Player 2!");
				}
				else{
					System.out.println("The winner is Player 4!");
				}
			}
			else{
				if(sum3<sum4){
					
					System.out.println("The winner is Player 3!");
				}
				else{
					System.out.println("The winner is Player 4!");
				}
			}
		}
*/
	}

}
