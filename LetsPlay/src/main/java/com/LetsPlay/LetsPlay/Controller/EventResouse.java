package com.LetsPlay.LetsPlay.Controller;

import com.LetsPlay.LetsPlay.Model.Event;
import com.LetsPlay.LetsPlay.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventResouse {

    private final EventService eventService;

    @Autowired
    public EventResouse(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Event>> getAllEvent () {
        List<Event> events = eventService.findAllEvents();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    @GetMapping("/find/{event_id}")
    public ResponseEntity<Event> getEventByEvent_id (@PathVariable("event_id") Long event_id) {
        Event event = eventService.findEventBYEvent_id(event_id);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Event> addEvent(@RequestBody Event event){
        Event newEvent = eventService.addEvent(event);
        return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Event> updateEvent(@RequestBody Event event){
        Event updateEvent = eventService.updateEvent(event);
        return new ResponseEntity<>(updateEvent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{event_id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("event_id") Long event_id){
        eventService.deleteEvent(event_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

