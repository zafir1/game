package com.psych.game.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@Table(name = "players")
public class Player implements Serializable {
    /*
     * Unique Id -> Long
     * Auto generated
     * User cannot modify
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    /*
     * Name -> String
     * User can modify
     * */
    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    @NotBlank
    private String name;

    /*
     * email -> String
     * User modifiable
     * */
    @Column(name = "email")
    @Setter
    @Getter
    private String email;

    /*
     * User psychFace
     * String
     * user modifiable
     * */
    @Column(name = "psychface")
    @Getter
    @Setter
    private String psychFace;

    /*
     * User normal Picture
     * String
     * user Modifiable
     * */
    @Column(name = "photo")
    @Getter
    @Setter
    private String photo;

    /*
     * One time Generation (OTG)
     * User non Modifiable
     * Date java.util
     * */
    @Column(name = "createdAt", nullable = false)
    @CreationTimestamp
    @Getter
    @Setter
    private Date createdAt;


    /*
     * User non modifiable
     * update with every change
     * Date Java.util
     * */
    @Column(name = "updatedAt", nullable = false)
    @UpdateTimestamp
    @Getter
    @Setter
    private Date updatedAt;

    public Long getId() {
        return id;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


    //    @Column(name = "name")
//    @Getter
//    @Setter
//    @NotBlank
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Column(nullable = false, updatable = false)
//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    @Getter
//    @Setter
//    private Date createdAt = new Date();
//
//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    @Getter
//    @Setter
//    private Date updatedAt = new Date();
//
//    @Column(name = "psychface")
//    @Getter
//    @Setter
//    private String psychFace;


}
