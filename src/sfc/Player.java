package sfc;

/**
 * @version PRE-ALPHA 0.1 (work in progress...)
 * @author Frenk K. Chambers
 */

public class Player {
    
    Clubs club = new Clubs();
    
    
    String Name;
    int Age = 18;
    String Club = club.getLow(); // change later
    int ClubLevel = 1;
    int Rating = 5000 + (int) (Math.random() * 500 + 1);
    int maxRating = (int) (10000 - (Math.random() * 1100));
    int MaxGameInSeasonRegressValue = 8;
    int MAX_AGE = (int) (Math.random() * 8+1) + 32;
    int SimpleRating = Rating / 100;
    int Games = 0;
    int Goals = 0;
    int Assists = 0;
    int Tackles = 0;
    
    Player(String Name) {
        this.Name = Name;
    }
    
    int SeasonDateFirstYear = 2019;
    int SeasonDateSecondYear = 2020;
    
    
    String Transfer() {
        
        int TransferValue = 0;
        
        if(Rating >= 8500) {
            TransferValue = Rating * 20000;
        } else if(Rating >= 7000) {
            TransferValue = Rating * 7000;
        } else if (Rating >= 5000) {
            TransferValue = Rating * 2000;
        }
        
        if(Rating >= 8500) {
            Club = club.getTop();
            ClubLevel = 3;
        } else if(Rating >= 7000) {
            Club = club.getMid();
            ClubLevel = 2;
        } else if(Rating >= 5000) {
            Club = club.getLow();
            ClubLevel = 1;
        }
        
        String transfer = ( Name + " moving to " + Club + " for " + TransferValue + " euro");
        return transfer;
    }
    
    String EndCareer() {
        String endCareer = ("It's end of your career! Thank you for that time. \nBelow you can see your player statistics: \n" +
                Name + " - " + Games + " games | " + Goals + " goals | " + Assists + " assists | " + Tackles + " tackles");
        return endCareer;
    }
    
}

class Forward extends Player {
    
    Forward(String Name) {
        super(Name);
    }
    
    int ChanceGoal = 20; // 20 10 2 0 0 ---> 60 29 ...
    int ChanceTwoGoals = 10; 
    int ChanceThreeGoals = 2; 
    int ChanceFourGoals = 1; 
    int ChanceFiveGoals = 0;
    
    int CountUpgrades = 0;
    
    int ChanceAssist = 5; // 5 2 2 0 0
    int ChanceTwoAssists = 2;
    int ChanceThreeAssists = 2;
    int ChanceFourAssists = 0;
    int ChanceFiveAssists = 0;
    
    int ChanceTackle = 5; // 5 2 2 0 0
    int ChanceTwoTackles = 2;
    int ChanceThreeTackles = 2;
    int ChanceFourTackles = 0;
    int ChanceFiveTackles = 0;
    int ChanceSixTackles = 0;
    
    int POINTS_PER_GOAL = 24;
    int POINTS_PER_ASSIST = 12;
    int POINTS_PER_TACKLE = 8;
    
    String oneSeason() {
        int StartSeasonSimpleRating = SimpleRating;
        int SeasonGame = 0;
        int SeasonGoal = 0;
        int SeasonAssist = 0;
        int SeasonTackle = 0;
            
        int MaxGameInSeason = (int) (Math.random() * 9+1) + 35;
        if(Age > 32) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue;
            MaxGameInSeasonRegressValue += 5;
        } else if(Age <= 21) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue * 1.5;
        }
            
        // check count of GAT
            
            
        if(Rating>=10000 && CountUpgrades < 5) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=9000 && CountUpgrades < 4) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=8000 && CountUpgrades < 3) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 5;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 3;
                
        } else if(Rating>=7000 && CountUpgrades < 2) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 8;
            POINTS_PER_ASSIST = 5;
            POINTS_PER_TACKLE = 5;
                
        } else if(Rating>=6000 && CountUpgrades < 1) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;

            CountUpgrades++;
                
            POINTS_PER_GOAL = 20;
            POINTS_PER_ASSIST = 10;
            POINTS_PER_TACKLE = 5;
                
        }
            
            
        // transfer window
            
        if(Rating >= 8500 && ClubLevel < 3) {
            Transfer();
        } else if(Rating >= 7000 && ClubLevel < 2) {
            Transfer();
        } else {
                
        }
            
            
        for(int i = 0; i <= MaxGameInSeason; i++) {
            // games counter
                
            int ThisGameForm = (int) (Math.random() * 100+1);
                
            // block of check ThisGameForm and Chances to GAT
                
            if(ThisGameForm >= 100-ChanceFiveGoals) {
                SeasonGoal += 5;
                Goals += 5;
                ThisGameForm -= ChanceFiveGoals;
            } else if(ThisGameForm >= 100-ChanceFourGoals) {
                SeasonGoal += 4;
                Goals += 4;
                ThisGameForm -= ChanceFourGoals;
            } else if(ThisGameForm >= 100-ChanceThreeGoals) {
                SeasonGoal += 3;
                Goals += 3;
                ThisGameForm -= ChanceThreeGoals;
            } else if(ThisGameForm >= 100-ChanceTwoGoals) {
                SeasonGoal += 2;
                Goals += 2;
                ThisGameForm -= ChanceTwoGoals;
            } else if(ThisGameForm >= 100-ChanceGoal) {
                SeasonGoal++;
                Goals++;
                ThisGameForm -= ChanceGoal;
            } else {
                    
            }
                
                
            if(ThisGameForm >= 100-ChanceFiveAssists) {
                SeasonAssist += 5;
                Assists += 5;
                ThisGameForm -= ChanceFiveAssists;
            } else if(ThisGameForm >= 100-ChanceFourAssists) {
                SeasonAssist += 4;
                Assists += 4;
                ThisGameForm -= ChanceFourAssists;
            } else if(ThisGameForm >= 100-ChanceThreeAssists) {
                SeasonAssist += 3;
                Assists += 3;
                ThisGameForm -= ChanceThreeAssists;
            } else if(ThisGameForm >= 100-ChanceTwoAssists) {
                SeasonAssist += 2;
                Assists += 2;
                ThisGameForm -= ChanceTwoAssists;
            } else if(ThisGameForm >= 100-ChanceAssist) {
                SeasonAssist++;
                Assists++;
                ThisGameForm -= ChanceAssist;
            } else {
                    
            }
                
                
            if(ThisGameForm >= 100-ChanceFiveTackles) {
                SeasonTackle += 5;
                Tackles += 5;
                ThisGameForm -= ChanceFiveTackles;
            } else if(ThisGameForm >= 100-ChanceFourTackles) {
                SeasonTackle += 4;
                Tackles += 4;
                ThisGameForm -= ChanceFourTackles;
            } else if(ThisGameForm >= 100-ChanceThreeTackles) {
                SeasonTackle += 3;
                Tackles += 3;
                ThisGameForm -= ChanceThreeTackles;
            } else if(ThisGameForm >= 100-ChanceTwoTackles) {
                SeasonTackle += 2;
                Tackles += 2;
                ThisGameForm -= ChanceTwoTackles;
            } else if(ThisGameForm >= 100-ChanceTackle) {
                SeasonTackle++;
                Tackles++;
                ThisGameForm -= ChanceTackle;
            } else {
                    
            }
                
            SeasonGame++;
            Games++;
        }
        
        Age++;
        
        Rating += (SeasonGoal*POINTS_PER_GOAL) + (SeasonAssist*POINTS_PER_ASSIST) + (SeasonTackle*POINTS_PER_TACKLE);
        if(Rating > maxRating) {
            Rating = maxRating;
        }
        
        int regressValue = (int) (Math.random() * 600);
        if(Age >= 32) {
            Rating -= regressValue;
            
            ChanceGoal -= 5; 
            ChanceTwoGoals -= 3; 
            ChanceThreeGoals -= 2; 
            ChanceFourGoals -= 2; 
            ChanceFiveGoals -= 1;
                
            ChanceAssist -= 5; 
            ChanceTwoAssists -= 3; 
            ChanceThreeAssists -= 2; 
            ChanceFourAssists -= 2; 
            ChanceFiveAssists -= 1;
                
            ChanceTackle -= 5; 
            ChanceTwoTackles -= 3; 
            ChanceThreeTackles -= 2; 
            ChanceFourTackles -= 2; 
            ChanceFiveTackles -= 1;
        }
        
        SimpleRating = Rating / 100;
        
        
        String season = (SeasonDateFirstYear + "/" + SeasonDateSecondYear + ": " + SeasonGame + " games | " + SeasonGoal + " goal(s) | " +
                SeasonAssist + " assist(s) | " + SeasonTackle + " tackle(s) | " + "\n");
        SeasonDateFirstYear++;
        SeasonDateSecondYear++;
        
        return season;
    }
    
    String wholeCareer() {
        
        for( ; Age <= MAX_AGE; ) {
            oneSeason();
        }
        return EndCareer();
    }
       
}


class Midfielder extends Player {
    
    Midfielder(String Name) {
        super(Name);
    }
    
    int ChanceGoal = 5; // if Goals >= 100 ---> 70 if Goals >= 300 ---> 90
    int ChanceTwoGoals = 2; // +10
    int ChanceThreeGoals = 2; // +5
    int ChanceFourGoals = 0; // +3
    int ChanceFiveGoals = 0; // +2
    int CountUpgrades = 0;
    
    int ChanceAssist = 20; // if Assists >= 100 ---> 50 ... 70
    int ChanceTwoAssists = 10;
    int ChanceThreeAssists = 2;
    int ChanceFourAssists = 1;
    int ChanceFiveAssists = 0;
    
    int ChanceTackle = 5; // if Tackles >= 100 ---> 40 ... 60 (+20)
    int ChanceTwoTackles = 2;
    int ChanceThreeTackles = 2;
    int ChanceFourTackles = 0;
    int ChanceFiveTackles = 0;
    int ChanceSixTackles = 0;
    
    
    int POINTS_PER_GOAL = 12;
    int POINTS_PER_ASSIST = 24;
    int POINTS_PER_TACKLE = 8;
    
    String oneSeason() {
        int StartSeasonSimpleRating = SimpleRating;
        int SeasonGame = 0;
        int SeasonGoal = 0;
        int SeasonAssist = 0;
        int SeasonTackle = 0;
            
        int MaxGameInSeason = (int) (Math.random() * 9+1) + 35;
        if(Age > 32) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue;
            MaxGameInSeasonRegressValue += 5;
        } else if(Age <= 21) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue * 1.5;
        }
            
        // check count of GAT
            
            
        if(Rating>=10000 && CountUpgrades < 5) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=9000 && CountUpgrades < 4) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=8000 && CountUpgrades < 3) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 5;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 3;
                
        } else if(Rating>=7000 && CountUpgrades < 2) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 8;
            POINTS_PER_ASSIST = 5;
            POINTS_PER_TACKLE = 5;
                
        } else if(Rating>=6000 && CountUpgrades < 1) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;

            CountUpgrades++;
                
            POINTS_PER_GOAL = 20;
            POINTS_PER_ASSIST = 10;
            POINTS_PER_TACKLE = 5;
                
        }
            
            
        // transfer window
            
        if(Rating >= 8500 && ClubLevel < 3) {
            Transfer();
        } else if(Rating >= 7000 && ClubLevel < 2) {
            Transfer();
        } else {
                
        }
            
            
        for(int i = 0; i <= MaxGameInSeason; i++) {
            // games counter
                
            int ThisGameForm = (int) (Math.random() * 100+1);
                
            // block of check ThisGameForm and Chances to GAT
                   
            if(ThisGameForm >= 100-ChanceFiveAssists) {
                SeasonAssist += 5;
                Assists += 5;
                ThisGameForm -= ChanceFiveAssists;
            } else if(ThisGameForm >= 100-ChanceFourAssists) {
                SeasonAssist += 4;
                Assists += 4;
                ThisGameForm -= ChanceFourAssists;
            } else if(ThisGameForm >= 100-ChanceThreeAssists) {
                SeasonAssist += 3;
                Assists += 3;
                ThisGameForm -= ChanceThreeAssists;
            } else if(ThisGameForm >= 100-ChanceTwoAssists) {
                SeasonAssist += 2;
                Assists += 2;
                ThisGameForm -= ChanceTwoAssists;
            } else if(ThisGameForm >= 100-ChanceAssist) {
                SeasonAssist++;
                Assists++;
                ThisGameForm -= ChanceAssist;
            } else {
                    
            }
            
            if(ThisGameForm >= 100-ChanceFiveGoals) {
                SeasonGoal += 5;
                Goals += 5;
                ThisGameForm -= ChanceFiveGoals;
            } else if(ThisGameForm >= 100-ChanceFourGoals) {
                SeasonGoal += 4;
                Goals += 4;
                ThisGameForm -= ChanceFourGoals;
            } else if(ThisGameForm >= 100-ChanceThreeGoals) {
                SeasonGoal += 3;
                Goals += 3;
                ThisGameForm -= ChanceThreeGoals;
            } else if(ThisGameForm >= 100-ChanceTwoGoals) {
                SeasonGoal += 2;
                Goals += 2;
                ThisGameForm -= ChanceTwoGoals;
            } else if(ThisGameForm >= 100-ChanceGoal) {
                SeasonGoal++;
                Goals++;
                ThisGameForm -= ChanceGoal;
            } else {
                    
            }
                
            if(ThisGameForm >= 100-ChanceFiveTackles) {
                SeasonTackle += 5;
                Tackles += 5;
                ThisGameForm -= ChanceFiveTackles;
            } else if(ThisGameForm >= 100-ChanceFourTackles) {
                SeasonTackle += 4;
                Tackles += 4;
                ThisGameForm -= ChanceFourTackles;
            } else if(ThisGameForm >= 100-ChanceThreeTackles) {
                SeasonTackle += 3;
                Tackles += 3;
                ThisGameForm -= ChanceThreeTackles;
            } else if(ThisGameForm >= 100-ChanceTwoTackles) {
                SeasonTackle += 2;
                Tackles += 2;
                ThisGameForm -= ChanceTwoTackles;
            } else if(ThisGameForm >= 100-ChanceTackle) {
                SeasonTackle++;
                Tackles++;
                ThisGameForm -= ChanceTackle;
            } else {
                    
            }
                
            SeasonGame++;
            Games++;
        }
        
        Age++;
        
        Rating += (SeasonGoal*POINTS_PER_GOAL) + (SeasonAssist*POINTS_PER_ASSIST) + (SeasonTackle*POINTS_PER_TACKLE);
        if(Rating > maxRating) {
            Rating = maxRating;
        }
        
        int regressValue = (int) (Math.random() * 600);
        if(Age >= 32) {
            Rating -= regressValue;
            
            ChanceGoal -= 5; 
            ChanceTwoGoals -= 3; 
            ChanceThreeGoals -= 2; 
            ChanceFourGoals -= 2; 
            ChanceFiveGoals -= 1;
                
            ChanceAssist -= 5; 
            ChanceTwoAssists -= 3; 
            ChanceThreeAssists -= 2; 
            ChanceFourAssists -= 2; 
            ChanceFiveAssists -= 1;
                
            ChanceTackle -= 5; 
            ChanceTwoTackles -= 3; 
            ChanceThreeTackles -= 2; 
            ChanceFourTackles -= 2; 
            ChanceFiveTackles -= 1;
        }
        
        SimpleRating = Rating / 100;
        
        
        String season = (SeasonDateFirstYear + "/" + SeasonDateSecondYear + ": " + SeasonGame + " games | " + SeasonGoal + " goal(s) | " +
                SeasonAssist + " assist(s) | " + SeasonTackle + " tackle(s) | " + "\n");
        SeasonDateFirstYear++;
        SeasonDateSecondYear++;
        
        return season;
    }
    
    String wholeCareer() {
        
        for( ; Age <= MAX_AGE; ) {
            oneSeason();
        }
        return EndCareer();
    }
    
}

class Defender extends Player {
    
    Defender(String Name) {
        super(Name);
    }
    
    int ChanceGoal = 5; // if Goals >= 100 ---> 70 if Goals >= 300 ---> 90
    int ChanceTwoGoals = 2; // +10
    int ChanceThreeGoals = 2; // +5
    int ChanceFourGoals = 0; // +3
    int ChanceFiveGoals = 0; // +2
    int CountUpgrades = 0;
    
    int ChanceAssist = 5; // if Assists >= 100 ---> 50 ... 70
    int ChanceTwoAssists = 2;
    int ChanceThreeAssists = 2;
    int ChanceFourAssists = 0;
    int ChanceFiveAssists = 0;
    
    int ChanceTackle = 20; // if Tackles >= 100 ---> 40 ... 60 (+20)
    int ChanceTwoTackles = 10;
    int ChanceThreeTackles = 2;
    int ChanceFourTackles = 1;
    int ChanceFiveTackles = 0;
    
      
    int POINTS_PER_GOAL = 8;
    int POINTS_PER_ASSIST = 12;
    int POINTS_PER_TACKLE = 24; 
    
    String oneSeason() {
        int StartSeasonSimpleRating = SimpleRating;
        int SeasonGame = 0;
        int SeasonGoal = 0;
        int SeasonAssist = 0;
        int SeasonTackle = 0;
            
        int MaxGameInSeason = (int) (Math.random() * 9+1) + 35;
        if(Age > 32) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue;
            MaxGameInSeasonRegressValue += 5;
        } else if(Age <= 21) {
            MaxGameInSeason -= MaxGameInSeasonRegressValue * 1.5;
        }
            
        // check count of GAT
            
            
        if(Rating>=10000 && CountUpgrades < 5) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=9000 && CountUpgrades < 4) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 1; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 1; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 1; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 3;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 1;
                
        } else if(Rating>=8000 && CountUpgrades < 3) {
            ChanceGoal += 5; 
            ChanceTwoGoals += 2; 
            ChanceThreeGoals += 2; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 5; 
            ChanceTwoAssists += 2; 
            ChanceThreeAssists += 2; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 5; 
            ChanceTwoTackles += 2; 
            ChanceThreeTackles += 2; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 5;
            POINTS_PER_ASSIST = 3;
            POINTS_PER_TACKLE = 3;
                
        } else if(Rating>=7000 && CountUpgrades < 2) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
            CountUpgrades++;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;
                
            POINTS_PER_GOAL = 8;
            POINTS_PER_ASSIST = 5;
            POINTS_PER_TACKLE = 5;
                
        } else if(Rating>=6000 && CountUpgrades < 1) {
            ChanceGoal += 10; 
            ChanceTwoGoals += 5; 
            ChanceThreeGoals += 3; 
            ChanceFourGoals += 2; 
            ChanceFiveGoals += 1;
                
            ChanceAssist += 10; 
            ChanceTwoAssists += 5; 
            ChanceThreeAssists += 3; 
            ChanceFourAssists += 2; 
            ChanceFiveAssists += 1;
                
            ChanceTackle += 10; 
            ChanceTwoTackles += 5; 
            ChanceThreeTackles += 3; 
            ChanceFourTackles += 2; 
            ChanceFiveTackles += 1;

            CountUpgrades++;
                
            POINTS_PER_GOAL = 20;
            POINTS_PER_ASSIST = 10;
            POINTS_PER_TACKLE = 5;
                
        }
            
            
        // transfer window
            
        if(Rating >= 8500 && ClubLevel < 3) {
            Transfer();
        } else if(Rating >= 7000 && ClubLevel < 2) {
            Transfer();
        } else {
                
        }
            
            
        for(int i = 0; i <= MaxGameInSeason; i++) {
            // games counter
                
            int ThisGameForm = (int) (Math.random() * 100+1);
                
            // block of check ThisGameForm and Chances to GAT
            
            if(ThisGameForm >= 100-ChanceFiveTackles) {
                SeasonTackle += 5;
                Tackles += 5;
                ThisGameForm -= ChanceFiveTackles;
            } else if(ThisGameForm >= 100-ChanceFourTackles) {
                SeasonTackle += 4;
                Tackles += 4;
                ThisGameForm -= ChanceFourTackles;
            } else if(ThisGameForm >= 100-ChanceThreeTackles) {
                SeasonTackle += 3;
                Tackles += 3;
                ThisGameForm -= ChanceThreeTackles;
            } else if(ThisGameForm >= 100-ChanceTwoTackles) {
                SeasonTackle += 2;
                Tackles += 2;
                ThisGameForm -= ChanceTwoTackles;
            } else if(ThisGameForm >= 100-ChanceTackle) {
                SeasonTackle++;
                Tackles++;
                ThisGameForm -= ChanceTackle;
            } else {
                    
            }
            
            if(ThisGameForm >= 100-ChanceFiveAssists) {
                SeasonAssist += 5;
                Assists += 5;
                ThisGameForm -= ChanceFiveAssists;
            } else if(ThisGameForm >= 100-ChanceFourAssists) {
                SeasonAssist += 4;
                Assists += 4;
                ThisGameForm -= ChanceFourAssists;
            } else if(ThisGameForm >= 100-ChanceThreeAssists) {
                SeasonAssist += 3;
                Assists += 3;
                ThisGameForm -= ChanceThreeAssists;
            } else if(ThisGameForm >= 100-ChanceTwoAssists) {
                SeasonAssist += 2;
                Assists += 2;
                ThisGameForm -= ChanceTwoAssists;
            } else if(ThisGameForm >= 100-ChanceAssist) {
                SeasonAssist++;
                Assists++;
                ThisGameForm -= ChanceAssist;
            } else {
                    
            }
            
            if(ThisGameForm >= 100-ChanceFiveGoals) {
                SeasonGoal += 5;
                Goals += 5;
                ThisGameForm -= ChanceFiveGoals;
            } else if(ThisGameForm >= 100-ChanceFourGoals) {
                SeasonGoal += 4;
                Goals += 4;
                ThisGameForm -= ChanceFourGoals;
            } else if(ThisGameForm >= 100-ChanceThreeGoals) {
                SeasonGoal += 3;
                Goals += 3;
                ThisGameForm -= ChanceThreeGoals;
            } else if(ThisGameForm >= 100-ChanceTwoGoals) {
                SeasonGoal += 2;
                Goals += 2;
                ThisGameForm -= ChanceTwoGoals;
            } else if(ThisGameForm >= 100-ChanceGoal) {
                SeasonGoal++;
                Goals++;
                ThisGameForm -= ChanceGoal;
            } else {
                    
            }
                   
            SeasonGame++;
            Games++;
        }
        
        Age++;
        
        Rating += (SeasonGoal*POINTS_PER_GOAL) + (SeasonAssist*POINTS_PER_ASSIST) + (SeasonTackle*POINTS_PER_TACKLE);
        if(Rating > maxRating) {
            Rating = maxRating;
        }
        
        int regressValue = (int) (Math.random() * 600);
        if(Age >= 32) {
            Rating -= regressValue;
            
            ChanceGoal -= 5; 
            ChanceTwoGoals -= 3; 
            ChanceThreeGoals -= 2; 
            ChanceFourGoals -= 2; 
            ChanceFiveGoals -= 1;
                
            ChanceAssist -= 5; 
            ChanceTwoAssists -= 3; 
            ChanceThreeAssists -= 2; 
            ChanceFourAssists -= 2; 
            ChanceFiveAssists -= 1;
                
            ChanceTackle -= 5; 
            ChanceTwoTackles -= 3; 
            ChanceThreeTackles -= 2; 
            ChanceFourTackles -= 2; 
            ChanceFiveTackles -= 1;
        }
        
        SimpleRating = Rating / 100;
        
        
        String season = (SeasonDateFirstYear + "/" + SeasonDateSecondYear + ": " + SeasonGame + " games | " + SeasonGoal + " goal(s) | " +
                SeasonAssist + " assist(s) | " + SeasonTackle + " tackle(s) | " + "\n");
        SeasonDateFirstYear++;
        SeasonDateSecondYear++;
        
        return season;
    }
    
    String wholeCareer() {
        
        for( ; Age <= MAX_AGE; ) {
            oneSeason();
        }
        return EndCareer();
    }
}
