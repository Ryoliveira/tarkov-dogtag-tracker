package com.tracker.dogtag.tarkovdogtagtracker.service;

import com.tracker.dogtag.tarkovdogtagtracker.entity.Dogtag;

import java.util.List;

public interface DogtagService {

    public List<Dogtag> findAll();

    public Dogtag findById(int theId);

    public void save(Dogtag theDogtag);

    public void deleteById(int theId);


}
