package com.tracker.dogtag.tarkovdogtagtracker.entity;

import javax.persistence.*;

@Entity
@Table(name = "dogtag")
public class Dogtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nick_name")
    private String nickname;

    @Column(name ="faction")
    private String faction;

    @Column(name ="level")
    private int level;

    @Column(name ="date")
    private String date;

    @Column(name = "killed_by")
    private String killedBy;

    @Column(name = "weapon")
    private String weapon;


    public Dogtag(){

    }

    public Dogtag(String nickName, String faction, int level, String date, String killedBy, String weapon) {
        this.nickname = nickName;
        this.faction = faction;
        this.level = level;
        this.date = date;
        this.killedBy = killedBy;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKilledBy() {
        return killedBy;
    }

    public void setKilledBy(String killedBy) {
        this.killedBy = killedBy;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Dogtag{" +
                "id=" + id +
                ", nickName='" + nickname + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                ", date='" + date + '\'' +
                ", killedBy='" + killedBy + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
