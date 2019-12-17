package br.com.maicon.SpringMVC.repository;

import br.com.maicon.SpringMVC.model.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {
}
