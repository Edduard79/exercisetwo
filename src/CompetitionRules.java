public class CompetitionRules {

    private static CompetitionRules competitionRules = new CompetitionRules();


        private String competitionRule1 = "Do not copy and paste from StackOverflow!";

        private String competitionRule2 = "Learn every day!";
        private String competitionRule3 = "Be the best team!";
        private CompetitionRules(){
        }
        public static CompetitionRules getIstance(){
            return competitionRules;
    }
    public void printRules(){
        System.out.println("First rule: " + competitionRule1);
        System.out.println("Second rule: " + competitionRule2);
        System.out.println("Third rule: " + competitionRule3);
    }

}
