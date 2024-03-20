package com.github.zipcodewilmington;

public class Player {
    String name;
    Integer totalChips;
    int[] tally = {0, 0};

    public Player(String name, Integer totalChips, int tally) {
        this.name = name;
        this.totalChips = totalChips;
        this.tally = new int[]{tally};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalChips() {
        return totalChips;
    }

    public void setTotalChips(Integer totalChips) {
        this.totalChips = totalChips;
    }

    public int[] getTally() {
        return tally;
    }

    public void setTally(int[] tally) {
        this.tally = tally;
    }
}
