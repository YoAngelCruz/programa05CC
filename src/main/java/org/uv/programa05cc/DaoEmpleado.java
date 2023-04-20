package org.uv.programa05cc;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Angel
 */
public class DaoEmpleado implements IDaoGeneral<Empleado, Integer>{

    @Override
    public Empleado create(Empleado p) {
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        
        session.save(p);
        
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Integer id) {
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
   
        Empleado ps =session.get(Empleado.class, id);
        
        if(ps==null){
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.INFO, "No existe el id......");
            return false;
        }
        else{
            session.delete(ps);
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.INFO, "Se ha borrado....");
            t.commit();
            session.close();
            return true;
        }
    }

    @Override
    public Empleado update(Integer id, Empleado p) {
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        Empleado ps =session.get(Empleado.class, id);
        
        if(ps!=null && p.getId()==id){
            session.update(p);
        }
        t.commit();
        session.close();
        return ps;
    }

    @Override
    public List<Empleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado findByIdD(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
