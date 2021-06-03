package com.assignment.parts.service;

import com.assignment.parts.entity.Parts;

import java.util.List;

public interface PartsService {
    List<Parts> findAll();
    Parts findById(int partsID);
    void saveOrUpdate(Parts theParts);
    void deleteById(int partsId);
}
