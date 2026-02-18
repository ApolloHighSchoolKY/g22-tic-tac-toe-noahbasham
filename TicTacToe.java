//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int pos = 0; //index of the char in the string that needs to be placed in the array
		for(int r = 0; r<3; r++)
		{
			for(int c = 0; c<3; c++)
			{
				mat[r][c] = game.charAt(pos); //set the spot in the array
				pos++; //move to the next character
			}
		}

	}

	public String getWinner()
	{
		//check for horizontal wins
		for(int r = 0; r<3; r++)
		{
			if(mat[r][0] == mat[r][1] && mat[r][1] == mat[r][2])
				return "" + mat[r][0] + " wins horizontally!";
		}
		//check for vertical wins
		for(int c = 0; c<3; c++)
		{
			if(mat[0][c] == mat[1][c] && mat[1][c] == mat[2][c])
				return "" + mat[0][c] + " wins vertically!";
		}
		//check for diagonal wins - two ifs
		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return "" + mat[1][1] + " wins diagonally!"; 
		else if(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2])
			return "" + mat[1][1] + " wins diagonally!"; 
		else
		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="" + mat[0][0] + " " + mat[0][1] + " " + mat[0][2] + "\n" + mat[1][0] + " " + mat[1][1] + " " + mat[1][2] + "\n" + mat[2][0] + " " + mat[2][1] + " " + mat[2][2];
		return output+"\n\n";
	}

}
