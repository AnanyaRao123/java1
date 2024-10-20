class Students{
    String name;
    String post;
    public Students(String name, String post){
        this.name = name;
        this.post = post;
    }
    public void displayCandidate(){
        System.out.println(name + " is running for " + post);
    }
}
class Elections{
    String post;
    Students[] candidates;
    Students winner;
    public Elections(String post, Students[] candidates){
        this.post = post;
        this.candidates = candidates;
    }
    public void announce(){
        System.out.println("Election announced for: " + post);
        System.out.println("Candidates are:");
        for (Students candidate : candidates){
            candidate.displayCandidate();
        }
    }
    public void voteAndSelectWinner(){
        System.out.println("Voting done for " + post);
        winner = candidates[0];  
    }
    public void announceResult(){
        System.out.println("The elected " + post + " is: " + winner.name);
    }
}
public class A15 {
    public static void main(String[] args){
        Students[] presidentCandidates = { new Students("Anurag Rao", "President"), new Students("Adithi","President") };
        Students[] vpCandidates = { new Students("Barath Devadiga", "Vice President"), new Students("Sathwik", "Vice President") };
        Students[] techCandidates = { new Students("Ramachandra Udupa", "Technical Coordinator"), new Students("Avani", "Technical Coordinator") };
        Students[] cultureCandidates = { new Students("Hitashree", "Cultural Secretary"), new Students("Manish","Cultural Secretary") };
        Elections presidentElections = new Elections("President", presidentCandidates);
        Elections vpElections = new Elections("Vice President", vpCandidates);
        Elections techElections = new Elections("TechnicaleCoordinator",techCandidates);
        Elections culturalElections = new Elections( "Cultural Secretary",cultureCandidates);
        presidentElections.announce();
        presidentElections.voteAndSelectWinner();
        presidentElections.announceResult();
        System.out.println();
        vpElections.announce();
        vpElections.voteAndSelectWinner();
        vpElections.announceResult();
        System.out.println();
        techElections.announce();
        techElections.voteAndSelectWinner();
        techElections.announceResult();
        System.out.println();
        culturalElections.announce();
        culturalElections.voteAndSelectWinner();
        culturalElections.announceResult();
    }
}