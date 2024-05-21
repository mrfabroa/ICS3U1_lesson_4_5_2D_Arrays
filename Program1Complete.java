class Main extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    /*
    double[][] scoringAverages = {
      {19.1, 23.1, 26.5, 24.1, 26.8}, 
      {26.5, 32.6, 33.4, 31.2, 29.1}
    };
    */
    String[] players = {"Lebron James", "Michael Jordan", "Kobe Bryant", "Kevin Durant" };
    double[][] scoringAverages;
    scoringAverages = new double[4][5];

    // Lebron James
    scoringAverages[0][0] = 19.1;
    scoringAverages[0][1] = 23.1;
    scoringAverages[0][2] = 26.5;
    scoringAverages[0][3] = 24.1;
    scoringAverages[0][4] = 26.8;


    // Michael Jordan
    scoringAverages[1][0] = 26.5;
    scoringAverages[1][1] = 32.6;
    scoringAverages[1][2] = 33.4;
    scoringAverages[1][3] = 31.2;
    scoringAverages[1][4] = 29.1;

    // Kobe Bryant
    scoringAverages[2][0] = 17.6;
    scoringAverages[2][1] = 21.4;
    scoringAverages[2][2] = 18.9;
    scoringAverages[2][3] = 21.2;
    scoringAverages[2][4] = 25.1;

    // Kevin Durant
    scoringAverages[3][0] = 21.1;
    scoringAverages[3][1] = 23.3;
    scoringAverages[3][2] = 27.5;
    scoringAverages[3][3] = 25.6;
    scoringAverages[3][4] = 26.2;

    System.out.println(scoringAverages[0][0]);
    System.out.println(scoringAverages[0]);
    
  

    // print the details
    System.out.println("BASIC PRINTOUT OF DATA");
    for(int row = 0; row < scoringAverages.length; row++){
      for(int col = 0; col < scoringAverages[0].length; col++){
          System.out.println(scoringAverages[row][col]);
      }
      System.out.println("");
    }
    
 
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

      //compute the overall scoring average
      double total = 0;
      int numberOfElements = scoringAverages.length * scoringAverages[0].length;
      double overallAvg;

      for(int player = 0; player < scoringAverages.length; player++){
        for(int year = 0; year < scoringAverages[0].length; year++){
            total += scoringAverages[player][year];
        }
      }

      overallAvg = total/numberOfElements;

      System.out.printf("%s %.2f", "\nThe overall players average in the table is ", overallAvg );

      // What is value of the highest scoring average in the table? What year was it? which player?
      double highestAvg = 0;
      int highestPlyr = 0;
      int highestPlyrYear = 0;

      for(int player = 0; player < scoringAverages.length; player++){
        for(int year = 0; year < scoringAverages[0].length; year++){
            if (scoringAverages[player][year] > highestAvg){
                highestAvg = scoringAverages[player][year];
                highestPlyr = player;
                highestPlyrYear = year;
            }
        }
      }

      System.out.println(players[highestPlyr] + " had the highest scoring average of " + highestAvg + " in year " + (highestPlyrYear+1) );

      //Which player had the highest scoring average after 5 years of play?
      double currPlayerTotal;
      double currPlayerAvg;
      double highestPlayerAvg = 0;
      highestPlyr = 0;

      for(int player = 0; player < scoringAverages.length; player++){
        currPlayerTotal = 0;
        
        for(int year = 0; year < scoringAverages[0].length; year++){
            currPlayerTotal += scoringAverages[player][year];
        }
        currPlayerAvg = currPlayerTotal/scoringAverages[0].length;

        // check if the current player has the highest 5yr average
        if(currPlayerAvg > highestPlayerAvg){
            highestPlayerAvg = currPlayerAvg;
            highestPlyr = player;
        }
      }

      System.out.println(players[highestPlyr] + " had the highest 5yr scoring average of " + highestPlayerAvg+".");







  }
}