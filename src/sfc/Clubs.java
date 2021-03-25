package sfc;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Clubs {
    
    String TopAll = "Real Madrid, Barcelona, Juventus, Liverpool, Bayern Munchen";
    String[] TopTeams = TopAll.split(", ");
    
    String MidAll = "Sevilla, Porto, Ajax, Zenit, Roma";
    String[] MidTeams = MidAll.split(", ");
    
    String LowAll = "Spartak, Galatasaray, Genk, Getafe, West Ham United";
    String[] LowTeams = LowAll.split(", ");
    
    
    String getTop() {
        int RandomIndex = (int) (Math.random() * TopTeams.length);
        String NewClub = TopTeams[RandomIndex];
        
        return NewClub;
    }
    
    String getMid() {
        int RandomIndex = (int) (Math.random() * MidTeams.length);
        String NewClub = MidTeams[RandomIndex];
        
        return NewClub;
    }
    
    String getLow() {
        int RandomIndex = (int) (Math.random() * LowTeams.length);
        String NewClub = LowTeams[RandomIndex];
        
        return NewClub;
    }
    
}

// top RealMadrid, Barcelona, Juventus, Liverpool, BayernMunchen;
// mid Sevilla, Porto, Ajax, Zenit, Roma;
// low Spartak, Galatasaray, Genk, Getafe, WestHamUnited;


