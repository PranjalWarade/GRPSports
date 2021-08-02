package com.LetsPlay.LetsPlay.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Event implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long event_id;
    private String name;
    private Date date;
    private String description;
    private String selection;
    private Integer capacityy;
    private String location;
    private String type;
    private String img;
    private Boolean published;

    SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");

    public Event(String name, String date, String description,
                         String selection, Integer capacityy, String location, String type, String img, Boolean published) throws ParseException {
        this.name = name;
        this.date = formatter.parse(date);
        this.description = description;
        this.selection = selection;
        this.capacityy = capacityy;
        this.location = location;
        this.type = type;
        this.img = img;
        this.published = published;
    }
}
