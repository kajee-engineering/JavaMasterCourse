package dev.lpa;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) {
    @Override
    public String toString() {
        return name + " (" + type + " in" + countryCode + ")";
    }
}

// PlayerのサブクラスかPlayerそのもののタイプをこのクラスと一緒に使えることを意味する
// TはJavaの慣例である。複数ある場合はT, S, Uと続く。BaseballTやFootballTを意味する
public class Team<T extends Player, S> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>(); // Tというクラスパラメータをリスト化
    private int totalWins = 0;
    private int totalLoses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.affiliation = affiliation;
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {

        if (!teamMembers.contains(t)) { // 大文字と小文字は区別される
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {

        System.out.print(teamName + " Roster:"); // Roster==名簿
        System.out.println((affiliation == null ? "" : " AFFILIATION: " + affiliation));
        for (T t : teamMembers) {
            System.out.println(t.name());
        }
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

