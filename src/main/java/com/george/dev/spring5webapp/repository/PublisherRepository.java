package com.george.dev.spring5webapp.repository;

import com.george.dev.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by George 5/11/2018
 */

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
