public class Competition {

    public Competition(){
    }

    public static void main(String[] args){

        //Inserire regole.
        CompetitionRules rules = CompetitionRules.getIstance();
        rules.printRules();


        Team teamA = new Team();
        Team teamB = new Team();
        teamA.teamName = "Nomebello";
        teamB.teamName = "Nomeancorapiùbello";

        //Team A info:
        teamA.p1.name = "Marco";
        teamA.p2.name = "Federico";
        teamA.p1.programmingLanguage = "C";
        teamA.p2.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 5;
        teamA.p2.yearsOfExperience = 4;

        //Team B info:
        teamB.p1.name = "Federica";
        teamB.p2.name = "Andrew";
        teamB.p1.programmingLanguage  = "C++";
        teamB.p2.programmingLanguage = "Python";
        teamB.p1.yearsOfExperience = 8;
        teamB.p2.yearsOfExperience = 3;

        teamA.printTeamDetails();
        teamB.printTeamDetails();









    }
}
