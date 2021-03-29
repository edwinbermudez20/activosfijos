package co.com.grupoasd.activosfijos.persistence.crud;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.grupoasd.activosfijos.persistence.entity.ActivoFijo;
/**
 * Clase encargada de realizar las operaciones para la busqueda total y parcial de los activos fijos de la compania
 * @author edwin
 *
 */
public interface ActivosFijosCrudRepository extends CrudRepository<ActivoFijo, Integer>{
	/**
	 * Metodo encargado de obtener el activo fijo por medio del numero de inventario
	 * @param numeroInventario: el cual es el ingresado por el usuario para realizar la busqueda de dicho activo fijo
	 * @return: el activo fijo que coincide con el numero de inventario ingresado por parametro
	 */
	ActivoFijo findByNumeroInventarioOrderByNumeroInventarioAsc(int numeroInventario);
	
	/**
	 * Metodo encargado de obtener los activos fijos por medio de los campos tipo, fecha de compra y serial
	 * @param tipo: Hace referencia al tipo de activo fijo que se esta consultando
	 * @param fechaCompra: Hace referencia a la fecha de compra cuando se adquirio el activo fijo que se esta consultando
	 * @param serial: Hace referencia al serial que se le asigno al activo fijo que se esta consultando
	 * @return: el o los activos fijos que coincidan con los criterios de busqueda
	 */
	List<ActivoFijo> findByTipoAndFechaCompraAndSerialOrderByFechaCompraDesc(String tipo, LocalDateTime fechaCompra, String serial);
}
