package com.tracker.dogtag.tarkovdogtagtracker.service;

import com.tracker.dogtag.tarkovdogtagtracker.dao.DogtagRepository;
import com.tracker.dogtag.tarkovdogtagtracker.entity.Dogtag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogtagServiceImpl implements DogtagService {


    private DogtagRepository dogtagRepository;


    public DogtagServiceImpl(DogtagRepository theDogtagRepository){
        dogtagRepository = theDogtagRepository;
    }

    @Override
    public List<Dogtag> findAll() {
        List<Dogtag> theDogtags = dogtagRepository.findAll();

        return theDogtags;
    }

    @Override
    public Dogtag findById(int theId) {
        Optional<Dogtag> result = dogtagRepository.findById(theId);

        Dogtag theDogtag = null;
        if(result.isPresent()){
            theDogtag = result.get();
        }
        else{
            throw new RuntimeException("Could not find Dogtag with id - " + theId);
        }

        return theDogtag;
    }

    @Override
    public void save(Dogtag theDogtag) {

        dogtagRepository.save(theDogtag);

    }

    @Override
    public void deleteById(int theId) {

        dogtagRepository.deleteById(theId);

    }
}
