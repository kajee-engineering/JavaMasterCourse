package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {

    private String teamName;
    private List<Player> teamMembers = new ArrayList<>(); // Playerというクラスパラメータをリスト化
    private int totalWins = 0;
    private int totalLoses = 0;
    private int totalTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player) {

        if (!teamMembers.contains(player)) { // 大文字と小文字は区別される
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {

        System.out.println(teamName + " Roster:"); // Roster==名簿
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLoses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLoses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}

