package com.ponagayba.dao;

import com.ponagayba.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Repository
public class EventDaoImpl implements EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Event> getByDate(Date date) {
        String hql = "from Event where date=:date";
        return (List<Event>) sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setParameter("date", date)
                .list();
    }

    @Override
    public void create(Event event) {
        sessionFactory.getCurrentSession().persist(event);
    }

    @Override
    public List<Event> getAll() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Event.class)
                .list();
    }
}
