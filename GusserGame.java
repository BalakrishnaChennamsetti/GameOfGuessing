import java.util.Scanner;
import java.lang.*;
import java.io.*;

class GameOfGuessing{
	
Scanner sc=new Scanner(System.in);
int umpire,player1,player2,player3;
//Collecting the umpire data
void requestToUmpire(){
	System.out.print("Umpire Requesting The Gusser To Select a Number(Between 1 and 100):");
	umpire=sc.nextInt();
}
//Collecting the players data
void requestToPlayers(){
	System.out.print("Umpire Requesting The player1 To Guess The Number:");
	player1=sc.nextInt();
	System.out.print("Umpire Requesting The player2 To Guess The Number:");
	player2=sc.nextInt();
	System.out.print("Umpire Requesting The player3 To Guess The Number:");
	player3=sc.nextInt();
}
//Displays the game results
void gameResults(){
	if(umpire>=1 && umpire<=100){
		if(umpire==player1 && umpire==player2 && umpire==player3){
			System.out.println("All 3 players are won the game congratulations...!!");
		}
		else if(umpire==player2 && umpire==player3){
			System.out.println("player2 and player3 won the game congratulations...!!");	
		}
		else if(umpire==player1 && umpire==player3){
			System.out.println("player1 and player3 won the game congratulations...!!");	
		}
		else if(umpire==player1 && umpire==player3){
			System.out.println("player1 and player3 won the game congratulations...!!");	
		}
		else if(umpire==player1 && umpire==player2){
			System.out.println("player1 and player2 won the game congratulations...!!");	
		}
		else if(umpire==player1){
			System.out.println("player1 won the game congratulations...!!");
		}
		else if(umpire==player2){
			System.out.println("player2 won the game congratulations...!!");
		}
		else if(umpire==player3){
			System.out.println("player3 won the game congratulations...!!");
		}
		else {
			System.out.println("No one won the game...Try again");
		}
	}
	else {
		System.out.println("Sorry it's not a valid input for this game...Try again");
	}
	
}

}
//Launching The Game
public class GusserGame {
	
	public static void main(String args[])throws IOException{
		GameOfGuessing game=new GameOfGuessing();
		Scanner sc=new Scanner(System.in);
		try{
			while(true){
				System.out.println("Press 1 To continue The Game else press 0");
				int choice=sc.nextInt();
				switch(choice){
					case 1:
						game.requestToUmpire();
						game.requestToPlayers();
						game.gameResults();
						break;
					case 0:
						System.out.println("Game is Terminated...!!");
						break;
					default:System.out.println("Invalid choice press proper choice..Try again..!!");
				}
				if(choice==0)break;
			}
		}
		catch(Exception e){
			System.out.println("Something went wrong in your input please check and try again..!!!!");
		}
	}
		
	
}
