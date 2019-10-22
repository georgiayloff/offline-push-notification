package com.aylorithm.offlinepush;

public class Score {
    private String teamHome;
    private String teamGuest;
    private String result;
    private String comment;

    public Score(String teamHome, String teamGuest, String result, String comment) {
        this.teamHome = teamHome;
        this.teamGuest = teamGuest;
        this.result = result;
        this.comment = comment;
    }

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamGuest() {
        return teamGuest;
    }

    public void setTeamGuest(String teamGuest) {
        this.teamGuest = teamGuest;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
