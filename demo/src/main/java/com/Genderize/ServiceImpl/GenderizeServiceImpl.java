package com.Genderize.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Genderize.Exception.ApiException;
import com.Genderize.Exception.ResourceNotFoundException;
import com.Genderize.Model.Genderize;
import com.Genderize.Repository.GenderizeRepository;
import com.Genderize.Service.GenderizeService;

@Service
public class GenderizeServiceImpl implements GenderizeService {
	 @Autowired
	    private GenderizeRepository repository;

	    @Override
	    public Genderize createNew(Genderize genderize) {
	        if (genderize!=null)
	            return this.repository.save(genderize);
	        else
	            throw new ApiException("Data not created, something went wrong !!");
	    }

	    @Override
	    @Scheduled(cron = "0 */5 * * * *")
	    public void getDataFromApi() {
	        String uri = "http://localhost:8080/genderize/get/data";
	        Genderize genderize = new RestTemplate().getForObject(uri, Genderize.class);
	        System.out.println(genderize.toString() + " DateTime: " + new Date());
	    }

	    @Override
	    public List<Genderize> getAll() {
	        return this.repository.findAll();
	    }

	    @Override
	    public Genderize getById(Integer id) {
	        return this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genderize", "id", id));
	    }

	    @Override
	    public Genderize getByName(String name) {
	        return this.repository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Genderize","name",name));
	    }
	}


