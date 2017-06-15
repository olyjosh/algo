package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
class TicTacToe1{

     private char[][] squares;
     public TicTacToe1(char [][] a ){
         squares=a;
     }
    /** Return 1 if X has won, -1 if O has won, and 0 otherwise. */
    
  public  int score() {
    int lineScore;
    for (int i = 0; i < 4; i++) {
      lineScore = scoreLine(squares[i][0],squares[i][1],squares[i][2],squares[i][3]);
      if (lineScore != 0) {
        return lineScore;
      }
      lineScore = scoreLine(squares[0][i],squares[1][i],squares[2][i],squares[3][i]);
      if (lineScore != 0) {
        return lineScore;
      }
    }
    lineScore = scoreLine(squares[0][0], squares[1][1],  squares[2][2],squares[3][3]);
    if (lineScore != 0) {
      return lineScore;
    }
    return scoreLine(squares[0][3], squares[1][2], squares[2][1],squares[3][0]);
  }
  
  protected int scoreLine(char a, char b, char c, char d) {
    if ((a == 'X' || a== 'T') && (b == 'X' || b== 'T') && (c == 'X' || c== 'T') && (d == 'X' || d== 'T')) { return 1; }
    if ((a == 'O' || a== 'T') && (b == 'O' || b== 'T') && (c == 'O' || c== 'T') && (d == 'O' || d== 'T') ) { return -1; }
    if ((a == '.' ) && (b == '.') && (c == '.' ) && (d == '.') ) { return 2; }
    return 0;
  }
}

public class TicTacToeTomek {
    public static void main(String[] args) throws FileNotFoundException {
                //Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\TicTacToeTomek\\A-small-practice.in"));
                Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\TicTacToeTomek\\A-large-practice.in"));
                char[][] cha;
                int x = Integer.valueOf(sc.nextLine());
                int counter = 0;
                while(sc.hasNext()){
                    cha = new char[][]{{'.', '.', '.', '.'},
                                        {'.', '.', '.', '.'},
                                        {'.', '.', '.', '.'},
                                        {'.', '.', '.', '.'}};
                    for (int i = 0; i < 4; i++) {
                        String line=sc.nextLine();
                        for (int j = 0; j < 4; j++) {
                            cha[i][j]= line.charAt(j);
                        }
                    }
                    counter++;
                    if(counter<x)sc.nextLine();                    
                    TicTacToe1 t1 = new TicTacToe1(cha);
                    int score = t1.score();
                    if(score == 1){
                        System.out.println("Case #"+counter+": "+"X won");
                    }else if(score == -1){
                        System.out.println("Case #"+counter+": "+"O won");
                    }else if(score == 2){
                        System.out.println("Case #"+counter+": "+"Game has not completed");
                    }else{
                        System.out.println("Case #"+counter+": "+"Draw");
                    }
                }
    }
}