package com.fop.anjal.footballourpassion;

import java.io.Serializable;

/**
 * Created by anjal on 29-Jul-16.
 */
public class Players implements Serializable {
    String id,entry_name,player_first_name,player_last_name,entry,joined_time;

    public Players() {

    }

    public String getJoined_time() {
        return joined_time;
    }

    public void setJoined_time(String joined_time) {
        this.joined_time = joined_time;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayer_first_name() {
        return player_first_name;
    }

    public void setPlayer_first_name(String player_first_name) {
        this.player_first_name = player_first_name;
    }

    public String getPlayer_last_name() {
        return player_last_name;
    }

    public void setPlayer_last_name(String player_last_name) {
        this.player_last_name = player_last_name;
    }
}