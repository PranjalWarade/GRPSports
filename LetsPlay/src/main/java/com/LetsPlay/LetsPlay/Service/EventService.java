package com.LetsPlay.LetsPlay.Service;

import com.LetsPlay.LetsPlay.Model.Event;
import com.LetsPlay.LetsPlay.Repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EventService {

    private final EventRepo eventRepo;

    @Autowired
    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public Event addEvent(Event event){
        return eventRepo.save(event);
    }

    public List<Event> findAllEvents(){
        return eventRepo.findAll();
    }

    public Event updateEvent(Event event){
        return eventRepo.save(event);
    }

    public Event findEventBYEvent_id(Long event_id)  {
        return (Event) eventRepo.findById(event_id).orElseThrow(() -> new UsernameNotFoundException("User by id "+event_id+" was not found"));
    }

    public void deleteEvent(Long event_id){
        eventRepo.deleteById(event_id);
    }
}
