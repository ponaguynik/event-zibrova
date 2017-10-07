package com.ponagayba.controller;

import com.ponagayba.model.Event;
import com.ponagayba.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/event/add")
    public @ResponseBody void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @PostMapping("/event/get/date")
    public @ResponseBody List<Event> getByDate(@RequestBody Date date) {
        return eventService.getByDate(date);
    }

    @GetMapping("/event/get/all")
    public @ResponseBody List<Event> getAll() {
        return eventService.getAll();
    }
}
