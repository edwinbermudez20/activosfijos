package co.com.grupoasd.activosfijos.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.grupoasd.activosfijos.persistence.crud.PersonasCrudRepository;
import co.com.grupoasd.activosfijos.persistence.entity.Persona;
/**
 * Clase encargada de realizar la busqueda total y parcial de las personas que tienen asignado un activo fijo
 * @author edwin
 *
 */
@Repository
public class PersonaRepository {
	/**
	 * Variable la cual hace referencia a los metodos de la interfaz de la persona que tiene asignado el activo fijo
	 */
	@Autowired
	private PersonasCrudRepository personasCrudRepository;
	
	/**
	 * Metodo encargado de realizar la busqueda total de las personas que tienen asignado un activo fijo 
	 * @return
	 */
	public List<Persona> getAllPersonas() throws Exception{
		List<Persona> listadoPersonas = null;
		try {
			listadoPersonas = new ArrayList<Persona>();
			listadoPersonas = (List<Persona>) personasCrudRepository.findAll();
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
		return listadoPersonas;
	}
	
	/**
	 * Metodo encargado de consultar la persona que tiene asignado un activo fijo por medio de la cedula de ciudadania
	 * @param numeroCedula: Numero por el cual se identificara a la persona que tiene asignado un activo fijo
	 */
	public void obtenerPersonaPorCedula(int numeroCedula) throws Exception{
		Persona persona = null;
		try {
			persona = new Persona();
			persona = personasCrudRepository.findByNumeroCedulaAsc(numeroCedula);
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
	}
}
