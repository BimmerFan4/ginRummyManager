package ks.arlind.ginRummyManager.model;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {
    private int id;
    private String name;
    private List<Points> pointsList;

    public Player() {
        pointsList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Points> getPointsList() {
        return pointsList;
    }

    public void setPointsList(List<Points> pointsList) {
        this.pointsList = pointsList;
    }

    public int getAllPoints() {
        int points = 0;
        for (Points p : getPointsList()) {
            points += p.getPoints();
        }
        return points;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(getAllPoints(), o.getAllPoints());
    }
}
