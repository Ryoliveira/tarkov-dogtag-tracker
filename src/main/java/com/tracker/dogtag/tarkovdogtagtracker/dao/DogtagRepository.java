package com.tracker.dogtag.tarkovdogtagtracker.dao;

import com.tracker.dogtag.tarkovdogtagtracker.entity.Dogtag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogtagRepository extends JpaRepository<Dogtag, Integer> {

    // JPA handles repository

}
