package org.uv.programa05cc;

import java.util.List;

/**
 *
 * @author Angel
 */
public class Programa05CC {

    public static void main(String[] args) {

        IDaoGeneral dao = new DaoEmpleado();

        //CREATE
        Empleado empleado=new Empleado();
        empleado.setDireccion("Calle 3");
        empleado.setNombre("Angel");
        empleado.setTelefono("446665332");
        
        dao.create(empleado);

//      Delete
//        dao.delete(1);

//        //Find by Id
//        Empleado emp=dao.findById(2);
//        System.out.println(emp.getNombre()+"\n"+emp.getDireccion());
//      Update
//       Empleado emp=new Empleado();
//       emp.setNombre("Juan");
//       emp.setDireccion("Avenida 9");
//       emp.setTelefono("10192837465");
//      
//       Empleado emp2 = dao.update(3, emp);
//       System.out.println(emp2.getNombre()+"\n"+emp2.getDireccion());

        //FindAll
        /*List<Empleado> empleados = dao.findAll();
        
        for (Empleado empleado : empleados) {
        System.out.println(empleado.getNombre() + "\n" + empleado.getDireccion() + "\n");
        }*/

    }
}
