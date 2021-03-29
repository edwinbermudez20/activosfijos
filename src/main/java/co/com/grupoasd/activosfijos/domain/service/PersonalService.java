package co.com.grupoasd.activosfijos.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.grupoasd.activosfijos.persistence.PersonaRepository;
import co.com.grupoasd.activosfijos.persistence.entity.Persona;

@Service
public class PersonalService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	/**
	 * Metodo encargado de realizar la busqueda total de las personas que tienen asignado un activo fijo 
	 * @return
	 */
	public List<Persona> getAllPersonas() throws Exception{
		try {
			return personaRepository.getAllPersonas();
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de consultar la persona que tiene asignado un activo fijo por medio de la cedula de ciudadania
	 * @param numeroCedula: Numero por el cual se identificara a la persona que tiene asignado un activo fijo
	 */
	public void obtenerPersonaPorCedula(int numeroCedula) throws Exception{
		try {
			personaRepository.obtenerPersonaPorCedula(numeroCedula);
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
	}
}
