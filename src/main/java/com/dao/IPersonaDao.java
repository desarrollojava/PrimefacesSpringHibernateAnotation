/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;
import com.modelo.Persona;

/**
 *
 * @author Desarrollador1
 */
public interface IPersonaDao {
    Persona recuperarPersonaPorId(int idPersona);

    Persona recuperarPersonaPorNombre(Persona persona);

    public void agregarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
    public List<Persona> listarPersonas();

    long contadorPersonas(); 
}
