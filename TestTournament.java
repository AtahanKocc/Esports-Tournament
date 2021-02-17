package atahaan;

public class TestTournament {
    public static void main(String[] args) {
    	//FortNite Tournament with 10 players
        ESportsTournament FortNite = new ESportsTournament(10);
        // The tournament lasts for 10 rounds
        int rounds = 10;
        for (int i = 0; i <rounds; i++) 
        FortNite.play();
        FortNite.printPlayers();
   }
}