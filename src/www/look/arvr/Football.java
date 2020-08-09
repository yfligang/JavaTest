package www.look.arvr;

public interface Football extends Sports {

    @Override
    void setHomeTeam(String name);

    @Override
    void setVisitingTeam(String name);

    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}
