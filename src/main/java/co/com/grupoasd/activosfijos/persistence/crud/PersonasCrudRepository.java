package co.com.grupoasd.activosfijos.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import co.com.grupoasd.activosfijos.persistence.entity.Persona;

/**
 * Clase encargada de realizar las operaciones para la busqueda total y paracial de las personas que tienen asignado un activo fijo
 * @author edwin
 *
 */
public interface PersonasCrudRepository extends CrudRepository<Persona, Integer>{
	/**
	 * Metodo encargado de realizar la busqueda de la persona que tiene asignado el activo fijo de acuerdo al numero de cedula ingresado
	 * @param numeroCedula
	 * @return
	 */
	Persona findByNumeroCedulaAsc(int numeroCedula);
	
}
