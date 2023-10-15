/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import ma.projet.entites.Employer;
import org.hibernate.Session;

/**
 *
 * @author Cloud
 */
public class ServiceEmployer implements IDao<Employer> {

    public boolean create(Employer o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    public boolean delete(Employer o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    public boolean update(Employer o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        return true;
    }

    
    public Employer getById(int id) {
        Employer employer = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employer = (Employer) session.get(Employer.class, id);
        session.getTransaction().commit();
        return employer;
    }

    public List<Employer> getAll() {
        List<Employer> employes = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employes = session.createQuery("from Employer").list();
        session.getTransaction().commit();
        return employes;
    }

}
