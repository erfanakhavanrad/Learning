import java.util.*;
public class tim
{
    public static void main (String [] args)
    {
     int highscoreposition = calculationhighscoreposition (1500);
        displayhighscoreposition = ("tim " + highscoreposition);

         highscoreposition = calculationhighscoreposition (900);
        displayhighscoreposition = ("bob " + highscoreposition);

         highscoreposition = calculationhighscoreposition (400);
        displayhighscoreposition = ("percy " + highscoreposition);

         highscoreposition = calculationhighscoreposition (50);
        displayhighscoreposition = ("gilbert" + highscoreposition);

         highscoreposition = calculationhighscoreposition (1000);
        displayhighscoreposition = ("sarah" + highscoreposition);

         highscoreposition = calculationhighscoreposition (500);
        displayhighscoreposition = ("stephen" + highscoreposition);
    }
    public static void displayhighscoreposition(String playername , int highscoreposition)
    {
        System.out.println(playername + "managed to get to into position " + highscoreposition + "on the high score table");
    }
    public static int calculationhighscoreposition ( int playerscore)
    {
        if (playerscore >= 1000)
        {
            return 1;
        }
        else if (playerscore <1000 && playerscore >=500)
        {
            return  2;
        }
        else if (playerscore >=100 && playerscore < 500)
        {
            return  3;
        }
        else
        {
            return 4;
        }
    }
}