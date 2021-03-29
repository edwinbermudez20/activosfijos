package co.com.grupoasd.activosfijos.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.grupoasd.activosfijos.persistence.crud.AreasCrudRepository;
import co.com.grupoasd.activosfijos.persistence.entity.Area;
/**
 * Clase encargada de realizar la busqueda total de las areas que tienen asignados activos fijos
 * @author edwin
 *
 */
@Repository
public class AreaRepository {
	/**
	 * Variable la cual hace referencia a los metodos de la interfaz del area que tiene asignado el activo fijo
	 */
	@Autowired
	private AreasCrudRepository areasCrudRepository;
	
	/**
	 * Obtiene el listado de todas las areas que tienen asignado un activo fijo
	 * @return
	 */
	public List<Area> getAllAreas() throws Exception{
		List<Area> listadoAreas = null;
		try {
			listadoAreas = new ArrayList<Area>();
			listadoAreas = (List<Area>) areasCrudRepository.findAll();
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo getAllAreas:"+exception.getMessage());
		}
		return listadoAreas;
	}
	
	/**
	 * Metodo encargado de buscar el area asignada a un activo fijo de acuerdo a la ciudad proporcionada
	 * @param ciudad: ciudad la cual se desea buscar el activo que se tiene asignado
	 */
	public void obtenerAreaPorCiudad(String ciudad) throws Exception{
		Area area = null;
		try {
			area = new Area();
			area = areasCrudRepository.findByCiudadOrderByCiudadAcs(ciudad);
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo obtenerAreaPorCiudad:"+exception.getMessage());
		}
	}
}
