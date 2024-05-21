class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // declare an array of player names

    
    // declare and initialize the scoring averages array
    


    // output the the first year scoring average for the first player

    // attempt to output the scoring average of the first player
    
    // use a nested loop to print out all cells of the table
    

    // output a formatted table of the 2D array
  
    // print the column headers
    System.out.printf("%15s","");
    for(int year = 1; year <= scoringAverages[0].length; year++){
       System.out.printf("%10s", "Year " + year);
    }
    System.out.println();

    // print out with player names
    for(int currPlayer = 0; currPlayer < players.length; currPlayer++) {
      // print out the player name
      //System.out.println(players[currPlayer]);
       System.out.printf("%15s",players[currPlayer]);
  
      for (int currYear = 0; currYear < scoringAverages[0].length; currYear++) {
          //System.out.print("Year " + (currYear + 1) + ": ");
          //System.out.println(scoringAverages[currPlayer][currYear]);
          System.out.printf("%10.1f",scoringAverages[currPlayer][currYear]);
  
      }
      System.out.println("");
    }

  //compute the overall scoring average of the 2D array
  

  // What is value of the highest scoring average in the table? What year was it? which player?
 

  //Which player had the highest scoring average after 5 years of play?
  


  }
}
