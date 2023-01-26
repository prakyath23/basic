public class NewClass {
    public static void main(String[] args) {

        displayHighScorePosition("Tim",calculateHighScorePosition(900));
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println( name + " managed to get into the position " + position +" in the high score list." );
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000) {
            return 1;
        }
        else if( score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
            return 4;
}
