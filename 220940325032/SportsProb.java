class Sports{
    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }

}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in "+getName());
    }
}

public class SportsProb {
    public static void main(String[] args) {
        Sports sp=new Sports();
        System.out.println(sp.getName()); 
        sp.getNumberOfTeamMembers();

        Soccer sc=new Soccer();
        System.out.println(sc.getName());
        sc.getNumberOfTeamMembers();
    }
}
