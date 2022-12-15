package com.Genderize.Service;

import java.util.List;

import com.Genderize.Model.Genderize;

public interface GenderizeService {
	 //create
    Genderize createNew(Genderize genderize);

    //get all
    List<Genderize> getAll();

    //get by Id
    Genderize getById(Integer id);

    //get by Name
    Genderize getByName(String name);

    void getDataFromApi();

}
