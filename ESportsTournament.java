package atahaan;

import java.util.Comparator; // Sort all total ordering collection.
import java.util.Random;
import java.util.PriorityQueue;

  public class ESportsTournament {
	PriorityQueue <Player> queue;
	Random random;
	
   public ESportsTournament(int num_players) { // Players' priority
	    random= new Random();
	    queue = new PriorityQueue<>(10, new SortPlayer()); //10 players are specified.
	    for (int i = 0; i < 10; i++) {
	    queue.add(new Player(Integer.toString(i),0,10));
	    }	
	 }  
	    public void play() {
		  for (int i = 0; i < 10; i++) {
	      Player player1 = queue.poll(); 
	      player1.setNum_play(player1.getNum_play() + 1);

        //Rank finding function
	    double new_rank = 0.75 * player1.getRank() + 0.25 * (double) random.nextInt(100); //new rank
        player1.setRank(new_rank);
        //added to the queue.
        queue.add(player1); 
		 }
	}
	    public void printPlayers(){ 
	    for(Player player1 : queue)  //The player1 specified here is not the player, only the variable name.	
	   // We printed player features.    
	   System.out.println("Player Name: " + player1.getName() + " Rank: "+ player1.getRank() + " Games Played: " + player1.getNum_play());
	  }
 
	 //We use it to access interface methods.
	 public static class SortPlayer implements Comparator <Player> {
		 public int compare(Player p1, Player p2) {	  
		//Their priorities are being tested.
	     if (p1.getNum_play() == p2.getNum_play()) { 
	      if (p1.getRank() > p2.getRank()) return -1;
	         else return 1;
	      }
	     else return p1.getNum_play() - p2.getNum_play();
	    }
	 }    
}
