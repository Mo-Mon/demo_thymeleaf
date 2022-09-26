package com.example.demo_thymeleaf;

import com.example.demo_thymeleaf.models.Nationality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityServiceImpl implements  NationalityService{
    @Autowired
    private NationalityRepository nationalityRepository;

    public List<Nationality> getNationalities(){
        return nationalityRepository.findAll();
    }

    public Optional<Nationality> getNationalityById(Integer id){
        return nationalityRepository.findById(id);
    }

    public void addNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }

    public void updateNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }

    public void deleteNationalityById(Integer id){
        nationalityRepository.deleteById(id);
    }
}
