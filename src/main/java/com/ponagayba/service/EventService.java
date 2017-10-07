package com.ponagayba.service;

import com.ponagayba.model.Event;

import java.util.Date;
import java.util.List;

public interface EventService {

    List<Event> getByDate(Date date);

    void addEvent(Event event);

    List<Event> getAll();
}
