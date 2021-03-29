package co.com.grupoasd.activosfijos.persistence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.grupoasd.activosfijos.persistence.crud.ActivosFijosCrudRepository;
import co.com.grupoasd.activosfijos.persistence.entity.ActivoFijo;

/**
 * Clase encargada de realizar las operaciones designadas para la busqueda, creacion y actualizacion de activos fijos de la compania
 * @author edwin
 *
 */
@Repository
public class ActivoFijoRepository {
	/**
	 * Variable la cual hace referencia a los metodos de la interfaz de activos fijos
	 */
	private ActivosFijosCrudRepository activosFijosCrudRepository;
	
	/**
	 * Metodo encargado de realizar la consulta de todos los activos fijos que se encuentran en BD
	 * @return: listado de todos los activos fijos que se encuentran reportados en BD
	 */
	public List<ActivoFijo> getAllActivosFijos() throws Exception{
		List<ActivoFijo> listadoActivosFijos = null;
		try {
			listadoActivosFijos = new ArrayList<ActivoFijo>();
			listadoActivosFijos = (List<ActivoFijo>) activosFijosCrudRepository.findAll();
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoRepository metodo getAllActivosFijos:"+exception.getMessage());
		}
		return listadoActivosFijos;
	}
	
	/**
	 * Metodo encargado de obtener el activo fijo por medio del numero de inventario
	 * @param numeroInventario: el cual es el ingresado por el usuario para realizar la busqueda de dicho activo fijo
	 * @return: el activo fijo que coincide con el numero de inventario ingresado por parametro
	 */
	public ActivoFijo obtenerActivoPorNumeroInventario (int numeroInventario)throws Exception{
		ActivoFijo activoFijo = null;
		try {
			activoFijo = new ActivoFijo();
			activoFijo = activosFijosCrudRepository.findByNumeroInventarioOrderByNumeroInventarioAsc(numeroInventario);
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoRepository metodo getAllActivosFijos:"+exception.getMessage());
		}
		return activoFijo;
	}
	
	/**
	 * Metodo encargado de obtener los activos fijos por medio de los campos tipo, fecha de compra y serial
	 * @param tipo: Hace referencia al tipo de activo fijo que se esta consultando
	 * @param fechaCompra: Hace referencia a la fecha de compra cuando se adquirio el activo fijo que se esta consultando
	 * @param serial: Hace referencia al serial que se le asigno al activo fijo que se esta consultando
	 * @return: el o los activos fijos que coincidan con los criterios de busqueda
	 */
	public List<ActivoFijo> obtenerTipoAndFechaCompraAndSerial (String tipo, LocalDateTime fechaCompra, String serial) throws Exception{
		List<ActivoFijo> listadoActivosFijos = null;
		try {
			listadoActivosFijos = new ArrayList<ActivoFijo>();
			listadoActivosFijos = (List<ActivoFijo>) activosFijosCrudRepository.findByTipoAndFechaCompraAndSerialOrderByFechaCompraDesc(tipo, fechaCompra, serial);
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoRepository metodo obtenerTipoAndFechaCompraAndSerial:"+exception.getMessage());
		}
		return listadoActivosFijos;
	}
	
	/**
	 * Metodo encargado de crear un nuevo activo fijo
	 * @param activoFijo: Es el objeto con cada uno de los datos necesarios para crear un nuevo activo fijo
	 */
	public void crearActivosFijos (ActivoFijo activoFijo) throws Exception{
		ActivoFijo activoFijoLocal = null;
		try {
			activoFijoLocal = new ActivoFijo();
			activoFijoLocal = activosFijosCrudRepository.save(activoFijo);
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoRepository metodo crearActivosFijos:"+exception.getMessage());
		}
	}
	
	/**
	 * Metodo encargado de actualizar el activo fijo dado por medio del numero de inventario donde se actualizara el serial y la fecha de baja 
	 * @param numeroInventrio: Es el numero de inventario del activo fijo que se desea actualizar
	 * @param serial: Corresponde al nuevo valor que se actualizara en el activo fijo dado por el numero de inventario
	 * @param fechaBaja: Corresponde a la fecha de baja que se actualizara en el activo fijo dado por el numero de inventario
	 */
	public void actualizarActivosFijos (int numeroInventario, String serial, LocalDateTime fechaBaja) throws Exception{
		ActivoFijo activoFijoAnt = null;
		ActivoFijo activoFijoAct = null;
		try {
			activoFijoAnt = new ActivoFijo();
			activoFijoAct = new ActivoFijo();
			activoFijoAnt = activosFijosCrudRepository.findByNumeroInventarioOrderByNumeroInventarioAsc(numeroInventario);
			activoFijoAnt.setSerial(serial);
			activoFijoAnt.setFechaBaja(fechaBaja);
			activoFijoAct = activosFijosCrudRepository.save(activoFijoAnt);
		} catch (Exception exception) {
			throw new Exception("Error en la clase ActivoFijoRepository metodo actualizarActivosFijos:"+exception.getMessage());
		}
	}
}
