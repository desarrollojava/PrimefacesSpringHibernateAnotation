/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javabeat.spring.service;

import java.util.List;
import net.javabeat.spring.model.Persona;

/**
 *
 * @author Desarrollador1
 */
public interface IPersonaServicio {

    public List<Persona> listarPersonas();

    Persona recuperarPersonaPorId(int idPersona);

    Persona recuperarPersonaPorNombre(Persona persona);

    public void agregarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

    long contadorPersonas();
}
