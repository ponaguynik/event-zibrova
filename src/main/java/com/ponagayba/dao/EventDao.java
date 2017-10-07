package com.ponagayba.dao;

import com.ponagayba.model.Event;

import java.util.Date;
import java.util.List;

public interface EventDao {

    List<Event> getByDate(Date date);

    void create(Event event);

    List<Event> getAll();

}
