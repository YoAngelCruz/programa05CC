/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa05cc;

import java.util.List;

/**
 *
 * @author Angel
 */
public interface IDaoGeneral <T, ID> {
    public T create(T p);
    public boolean delete(ID id);
    public T update(ID id, T p);
    
    public List<T> findAll(); //retorna una lista de pojos
    public T findByIdD(ID id);
}

