public class Main {
    public static void main(String[] args) {
        //ins
        Crowd player1 = new Crowd();
        Crowd player2 = new Crowd();
        Crowd player3 = new Crowd();

        player1.userName = "Ita";
        player1.score = 400;
        player1.people = 0;

        player1.gatheringOthers();

        System.out.println(player1.score);
        player1.gathering(player2);
        System.out.println(player1.score);

        player2.userName = "Rose";
        player2.score = 60;
        player2.people = 79;


        player2.gatheringOthers();


        System.out.println(player2.score);
        player2.gathering(player3);
        System.out.println(player2.score);
    }
}
