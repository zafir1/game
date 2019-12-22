package com.psych.game.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Game")
public class Game {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "psych_face")
    private String psychFace;

    @Column(name = "pic")
    private String pic;

    @Column(name = "players")
    @ElementCollection
    private List<Player> playerList;

    @OneToOne
    @Column(name = "leader_id")
    @JoinColumn(name = "id")
    private Player leaderId;

    @Column(name = "is_over")
    private boolean isOver;

    @ManyToOne
    @Column(name = "game_id")
    @JoinColumn(name = "id")
    private GameMode gameMode;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "modified_at")
    private Date lastmodifiedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsychFace() {
        return psychFace;
    }

    public void setPsychFace(String psychFace) {
        this.psychFace = psychFace;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Player getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Player leaderId) {
        this.leaderId = leaderId;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastmodifiedAt() {
        return lastmodifiedAt;
    }

    public void setLastmodifiedAt(Date lastmodifiedAt) {
        this.lastmodifiedAt = lastmodifiedAt;
    }
}
