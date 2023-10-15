/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.util.List;
import javax.mail.Session;
import ma.projet.dao.IDao;
import ma.projet.entites.Client;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author Cloud
 */
public class ServiceClient implements IDao<Client> {

    @Override
    public boolean create(Client o) {
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }
    
    @Override
      public boolean delete(Client o) {
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Client o) {
          org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Client getById(int id) {
        Client client = null;
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        client = (Client) session.get(Client.class, id);
        session.getTransaction().commit();
        return client;
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients = null;
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        clients = session.createQuery("from Client").list();
        session.getTransaction().commit();
        return clients;
    }

    public Client getByEmail(String email) {
        Client c = null;
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = (Client) session.createQuery("from Client where email = ?").setParameter(0, email).uniqueResult();
        session.getTransaction().commit();
        return c;
    }

}
