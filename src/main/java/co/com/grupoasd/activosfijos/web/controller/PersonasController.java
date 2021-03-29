package co.com.grupoasd.activosfijos.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.grupoasd.activosfijos.domain.service.PersonalService;
import co.com.grupoasd.activosfijos.persistence.entity.Persona;

@RestController
@RequestMapping("/personas")
public class PersonasController {
	@Autowired
	private PersonalService personalService;
	/**
	 * Metodo encargado de realizar la busqueda total de las personas que tienen asignado un activo fijo 
	 * @return
	 */
	@GetMapping("/listadoPersonas")
	public List<Persona> getAllPersonas() throws Exception{
		try {
			return personalService.getAllPersonas();
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de consultar la persona que tiene asignado un activo fijo por medio de la cedula de ciudadania
	 * @param numeroCedula: Numero por el cual se identificara a la persona que tiene asignado un activo fijo
	 */
	@GetMapping("/obtenerPersonaXCedula/{numeroCedula}")
	public void obtenerPersonaPorCedula(@PathVariable("numeroCedula") int numeroCedula) throws Exception{
		try {
			personalService.obtenerPersonaPorCedula(numeroCedula);
		} catch (Exception exception) {
			throw new Exception("Error en la clase PersonaRepository metodo getAllPersonas:"+exception.getMessage());
		}
	}
}
