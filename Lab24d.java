//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		//Read the number at the top
		int iterations = Integer.valueOf(file.nextLine());
		
		//Loop through the different games
		for(int i = 0; i< iterations; i++)
		{
			//Next game is a string
			String game = file.nextLine();
			System.out.println(game);
			TicTacToe play = new TicTacToe(game);
			System.out.println(play);
			System.out.println(play.getWinner() + "\n");
		}

		file.close();





	}
}



