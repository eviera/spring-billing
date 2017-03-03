package net.eviera.pruebas.springbilling.units.document;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Este repository hereda de {@link org.springframework.data.repository.CrudRepository}, así que se pueden usar todas las funciones CRUD y las paginables
 */
public interface DocumentRepository extends PagingAndSortingRepository<Document, Long> {

}
