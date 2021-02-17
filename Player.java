package atahaan;

public class Player {
	
   private String name;
   private double rank;
   private int num_play;

  public Player(String name, double rank, int num_play) {
    // I want to access the property of this object.
	this.name = name;
	this.rank = rank;
	this.num_play = num_play;
   }

  public String getName() {
	  return name;
  }
  public void setName(String name) {
		 this.name = name;
  }	
  public double getRank() {
	  return rank;
  }
  public void setRank(double rank) {
	  this.rank = rank;
  }
  public int getNum_play() {
	return num_play;
  }
  public void setNum_play(int num_play) {
	  this.num_play = num_play;
   }
}
