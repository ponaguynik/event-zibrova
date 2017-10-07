package com.ponagayba.service;

import com.ponagayba.dao.EventDao;
import com.ponagayba.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDao eventDao;

    @Override
    public List<Event> getByDate(Date date) {
        return eventDao.getByDate(date);
    }

    @Override
    public void addEvent(Event event) {
        eventDao.create(event);
    }

    @Override
    public List<Event> getAll() {
        return eventDao.getAll();
    }
}
