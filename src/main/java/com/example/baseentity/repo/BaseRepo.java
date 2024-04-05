package com.example.baseentity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BaseRepo<T, ID>{


    T findByIdGeneric(ID id);
}
