package ks.arlind.ginRummyManager.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    private int id;
    private Player[] players;
    private Match[] matches;
    private long startTime;
    private long endTime;

    public Game() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getElapsedTime() {
        setEndTime(System.currentTimeMillis());
        return getEndTime() - getStartTime();
    }

    public List<Player> getRanks(){
        List<Player> rankedList = new ArrayList<>();
        Collections.copy(rankedList, Arrays.asList(getPlayers()));

        Collections.sort(rankedList);

        return rankedList;
    }
}
