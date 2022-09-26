package com.example.demo_thymeleaf;

import com.example.demo_thymeleaf.models.Nationality;

import java.util.List;
import java.util.Optional;

public interface NationalityService {
    public List<Nationality> getNationalities();

    public Optional<Nationality> getNationalityById(Integer id);

    public void addNationality(Nationality nationality);

    public void updateNationality(Nationality nationality);

    public void deleteNationalityById(Integer id);
}
