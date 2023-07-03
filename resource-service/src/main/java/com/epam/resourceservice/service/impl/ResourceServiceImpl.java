package com.epam.resourceservice.service.impl;

import com.epam.resourceservice.dao.ResourceDao;
import com.epam.resourceservice.model.Resource;
import com.epam.resourceservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceDao resourceDao;

    @Override
    public Long addResource(byte[] data) {
        Resource resource = new Resource();
        resource.setData(data);
        return resourceDao.save(resource).getId();
    }

    @Override
    public Resource getResourceById(Long id) {
        return resourceDao.findById(id).orElse(null);
    }

    @Override
    public List<Long> deleteResourcesByIds(List<Long> ids) {
        return ids.stream()
                .filter(id -> resourceDao.existsById(id))
                .peek(id -> resourceDao.deleteById(id))
                .collect(Collectors.toList());
    }
}
