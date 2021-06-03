package com.assignment.parts.dao;


import com.assignment.parts.entity.Parts;

import java.util.List;

public interface PartsDAO {
    List<Parts> findAll();
    Parts findById(int theId);
    void saveOrUpdate(Parts theParts);
    void deleteById(int theId);
}
