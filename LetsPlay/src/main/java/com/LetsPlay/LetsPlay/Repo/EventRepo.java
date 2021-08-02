package com.LetsPlay.LetsPlay.Repo;

import com.LetsPlay.LetsPlay.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
    void deleteById(Long event_id);

    Optional<Event> findById(Long event_id);
}
