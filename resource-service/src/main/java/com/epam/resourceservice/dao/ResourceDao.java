package com.epam.resourceservice.dao;

import com.epam.resourceservice.model.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceDao extends CrudRepository<Resource, Long> {
}
