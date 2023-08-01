package com.epam.resourceservice.service;

import com.epam.resourceservice.model.Resource;

import java.util.List;

public interface ResourceService {
    Long addResource(byte[] data);
    Resource getResourceById(Long id);
    List<Long> deleteResourcesByIds(List<Long> ids);
}
