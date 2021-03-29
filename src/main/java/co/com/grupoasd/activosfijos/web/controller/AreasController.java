package co.com.grupoasd.activosfijos.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.grupoasd.activosfijos.domain.service.AreaService;
import co.com.grupoasd.activosfijos.persistence.entity.Area;

@RestController
@RequestMapping("/areas")
public class AreasController {
	@Autowired
	private AreaService areaService;
	/**
	 * Obtiene el listado de todas las areas que tienen asignado un activo fijo
	 * @return
	 */
	@GetMapping("/listaAreas")
	public List<Area> getAllAreas() throws Exception{
		try {
			return areaService.getAllAreas();
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo getAllAreas:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de buscar el area asignada a un activo fijo de acuerdo a la ciudad proporcionada
	 * @param ciudad: ciudad la cual se desea buscar el activo que se tiene asignado
	 */
	@GetMapping("/areaXciudad/{ciudad}")
	public void obtenerAreaPorCiudad(@PathVariable("ciudad") String ciudad) throws Exception{
		try {
			areaService.obtenerAreaPorCiudad(ciudad);
		} catch (Exception exception) {
			throw new Exception("Error en la clase AreaRepository metodo obtenerAreaPorCiudad:"+exception.getMessage());
		}
	}
}
