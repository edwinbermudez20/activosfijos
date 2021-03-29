package co.com.grupoasd.activosfijos.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.grupoasd.activosfijos.persistence.AreaRepository;
import co.com.grupoasd.activosfijos.persistence.entity.Area;

@Service
public class AreaService {
	
	@Autowired
	private AreaRepository areaRepository;
	
	/**
	 * Obtiene el listado de todas las areas que tienen asignado un activo fijo
	 * @return
	 */
	public List<Area> getAllAreas() throws Exception{
		try {
			return areaRepository.getAllAreas();
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo getAllAreas:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de buscar el area asignada a un activo fijo de acuerdo a la ciudad proporcionada
	 * @param ciudad: ciudad la cual se desea buscar el activo que se tiene asignado
	 */
	public void obtenerAreaPorCiudad(String ciudad) throws Exception{
		try {
			areaRepository.obtenerAreaPorCiudad(ciudad);
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo obtenerAreaPorCiudad:"+exception.getMessage());
		}
	}
}
