package com.lahiruapi.lahiruapi.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Revenue")
@EntityListeners(AuditingEntityListener.class)
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    @Column(name = "TIME_STAMP", nullable = false)
    private Date timeStamp;

    @Column(name = "GIN", nullable = false)
    private int gin;

    @Column(name = "TONE", nullable = false)
    private int tone;

    @Column(name = "CHARGE", nullable = false)
    private int charge;

    @Column(name = "WORLD", nullable = false)
    private int world;

    @Column(name = "EERY", nullable = false)
    private int eery;

    public long getId(){
        return id;
    }

    public Date getTimeStamp(){
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp){
        this.timeStamp = timeStamp;
    }

    public int getGin(){
        return gin;
    }

    public void setGin(int gin){
        this.gin = gin;
    }

    public int getTone(){
        return tone;
    }

    public void setTone(int tone){
        this.tone = tone;
    }

    public int getCharge(){
        return charge;
    }

    public void setCharge(int charge){
        this.charge = charge;
    }

    public int getWorld(){
        return world;
    }

    public void setWorld(int world){
        this.world = world;
    }

    public int getEery(){
        return eery;
    }

    public void setEery(int eery){
        this.eery = eery;
    }

}
