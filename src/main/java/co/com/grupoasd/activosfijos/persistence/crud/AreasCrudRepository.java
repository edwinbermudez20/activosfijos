package co.com.grupoasd.activosfijos.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import co.com.grupoasd.activosfijos.persistence.entity.Area;

/**
 * Clase encargada de realizar las operaciones para la busqueda total de las areas que tienen asignado un activo fijo
 * @author edwin
 *
 */
public interface AreasCrudRepository extends CrudRepository<Area, Integer>{
	/**
	 * Metodo encargado de realizar la busqueda de la cidudad que tiene asignada un activo fijo de acuerdo a una ciudad especifica
	 * @param ciudad: Nombre de la ciudad por la cual se quiere realizar la busqueda
	 * @return
	 */
	Area findByCiudadOrderByCiudadAcs(String ciudad);

}
