package com.fop.anjal.footballourpassion;

import java.io.Serializable;

/**
 * Created by anjal on 29-Jul-16.
 */
public class Players implements Serializable {
    String id,entry_name,player_name,entry,gw_score,rank;

    public Players() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getGw_score() {
        return gw_score;
    }

    public void setGw_score(String gw_score) {
        this.gw_score = gw_score;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}