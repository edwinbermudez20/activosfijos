package co.com.grupoasd.activosfijos.web.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.grupoasd.activosfijos.domain.service.ActivoFijoService;
import co.com.grupoasd.activosfijos.persistence.entity.ActivoFijo;

@RestController
@RequestMapping("/activosFijos")
public class ActivosFijosController {
	
	@Autowired
	private ActivoFijoService activoFijoService;
	
	/**
	 * Metodo encargado de realizar la consulta de todos los activos fijos que se encuentran en BD
	 * @return: listado de todos los activos fijos que se encuentran reportados en BD
	 */
	@GetMapping("/listadoActivosFijos")
	public List<ActivoFijo> getAllActivosFijos() throws Exception{
		try {
			return activoFijoService.getAllActivosFijos();
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoService metodo getAllActivosFijos:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de obtener el activo fijo por medio del numero de inventario
	 * @param numeroInventario: el cual es el ingresado por el usuario para realizar la busqueda de dicho activo fijo
	 * @return: el activo fijo que coincide con el numero de inventario ingresado por parametro
	 */
	@GetMapping("/activoFijoXnumeroInventario/{numeroInventario}")
	public ActivoFijo obtenerActivoPorNumeroInventario (@PathVariable ("numeroInvetario") int numeroInventario)throws Exception{
		try {
			return activoFijoService.obtenerActivoPorNumeroInventario(numeroInventario);
		} catch (Exception exception) {
			throw new Exception("Error en la clase activoFijoService metodo getAllActivosFijos:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de obtener los activos fijos por medio de los campos tipo, fecha de compra y serial
	 * @param tipo: Hace referencia al tipo de activo fijo que se esta consultando
	 * @param fechaCompra: Hace referencia a la fecha de compra cuando se adquirio el activo fijo que se esta consultando
	 * @param serial: Hace referencia al serial que se le asigno al activo fijo que se esta consultando
	 * @return: el o los activos fijos que coincidan con los criterios de busqueda
	 */
	@GetMapping("/activoFijoXtipoFechaCompraSerial/{tipo}/{fechaCompra}/{serial")
	public List<ActivoFijo> obtenerTipoAndFechaCompraAndSerial (@PathVariable ("tipo") String tipo, @PathVariable ("fechaCompra") LocalDateTime fechaCompra, @PathVariable ("serial") String serial) throws Exception{
		try {
			return activoFijoService.obtenerTipoAndFechaCompraAndSerial(tipo, fechaCompra, serial);
		} catch (Exception exception) {
			throw new Exception("Error en la clase activoFijoService metodo obtenerTipoAndFechaCompraAndSerial:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de crear un nuevo activo fijo
	 * @param activoFijo: Es el objeto con cada uno de los datos necesarios para crear un nuevo activo fijo
	 */
	@PostMapping("/crearActivoFijo")
	public void crearActivosFijos (@RequestBody ActivoFijo activoFijo) throws Exception{
		try {
			activoFijoService.crearActivosFijos(activoFijo);
		} catch (Exception exception) {
			throw new Exception("Error en la clase activoFijoService metodo crearActivosFijos:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de actualizar el activo fijo dado por medio del numero de inventario donde se actualizara el serial y la fecha de baja 
	 * @param numeroInventrio: Es el numero de inventario del activo fijo que se desea actualizar
	 * @param serial: Corresponde al nuevo valor que se actualizara en el activo fijo dado por el numero de inventario
	 * @param fechaBaja: Corresponde a la fecha de baja que se actualizara en el activo fijo dado por el numero de inventario
	 */
	@PutMapping("/actualizarActivoFijo/{numeroInventario}/{serial}/{fechaBaja}")
	public void actualizarActivosFijos (@PathVariable("numeroInventario") int numeroInventario,@PathVariable("serial")  String serial,@PathVariable("fechaBaja")  LocalDateTime fechaBaja) throws Exception{
		try {
			activoFijoService.actualizarActivosFijos(numeroInventario, serial, fechaBaja);
		} catch (Exception exception) {
			throw new Exception("Error en la clase activoFijoService metodo actualizarActivosFijos:"+exception.getMessage());
		}
	}
}
