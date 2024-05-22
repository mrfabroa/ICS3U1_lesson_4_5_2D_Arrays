class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // declare an array of player names
    String[] players= {"LeBron James", "Michael Jordan", "Kobe Bryant", "Kevin Durant"};

    // declare and initialize the scoring averages array
    double[][] scoringAverages = {
      {19.1, 23.1, 26.5, 24.1, 26.8},
      {26.5, 32.6, 33.4, 31.2, 29.1},
      {17.6, 21.4, 18.9, 21.2, 25.1},
      {21.1, 21.3, 27.5, 25.6, 26.2},
    };
    

    /* 
    double[][] scoringAverages = new double[4][5];

    // LeBron James
    scoringAverages[0][0] = 19.1;
    scoringAverages[0][1] = 23.1;
    scoringAverages[0][2] = 26.5;
    scoringAverages[0][3] = 24.1;
    scoringAverages[0][4] = 26.8;

    // Michael Jordan
    scoringAverages[1][0] = 26.5;
    scoringAverages[1][1] = 32.6;
    //...
    */



    // output the the first year scoring average for the first player
    System.out.println("The scoring average for " + players[0] + " in his first year was " + scoringAverages[0][0]);

    // attempt to output the scoring averages of the first player
    System.out.println(scoringAverages[0]);

    
    // use a nested loop to print out all cells of the table
    System.out.println("BASIC TABLE OUTPUT");

    for (int row = 0; row < scoringAverages.length; row++){
      // out put the player name
      System.out.println(players[row]);

      // output player stats, one per line
      for(int col = 0; col < scoringAverages[row].length; col++){
        System.out.println(scoringAverages[row][col]);
      }
    System.out.println("");
    }

    

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
  // total up all data in the table
  double total = 0;
  double average = 0;

  for (int row = 0; row < scoringAverages.length; row++){
    // output player stats, one per line
    for(int col = 0; col < scoringAverages[row].length; col++){
      total = total + scoringAverages[row][col];
    }
  }

  average = total/(scoringAverages.length * scoringAverages[0].length);
  System.out.println(average);

  // What is value of the highest scoring average in the table? What year was it? which player?
  double highest = scoringAverages[0][0];

  for (int row = 0; row < scoringAverages.length; row++){
    for(int col = 0; col < scoringAverages[row].length; col++){
      if (scoringAverages[row][col] > highest){
        highest = scoringAverages[row][col];
      }
    }
  }

  System.out.println(highest);

  //Which player had the highest scoring average after 5 years of play?

  }
}
