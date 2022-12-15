package com.Genderize.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Genderize.Model.Genderize;
import com.Genderize.Service.GenderizeService;

@RestController
@RequestMapping("/genderize/")
public class GenderizeController {
	 @Autowired
	    private GenderizeService service;

	    @GetMapping("/get/data")
	    public ResponseEntity<Genderize> getData()
	    {
	        String uri = "https://api.genderize.io/?name=lue";
	        Genderize genderize = new RestTemplate().getForObject(uri, Genderize.class);
	        return this.createNew(genderize);
	    }

	    @PostMapping("/create/new")
	    public ResponseEntity<Genderize> createNew(@RequestBody Genderize genderize)
	    {
	        Genderize createdGenderize = this.service.createNew(genderize);
	        return new ResponseEntity<>(createdGenderize, HttpStatus.OK);
	    }

	    @GetMapping("/get/all")
	    public ResponseEntity<List<Genderize>> getAll()
	    {
	        List<Genderize> genderizeList = this.service.getAll();
	        return new ResponseEntity<>(genderizeList,HttpStatus.OK);
	    }

	    @GetMapping("/get/by/id/{id}")
	    public ResponseEntity<Genderize> getById(@PathVariable Integer id)
	    {
	        Genderize byId = this.service.getById(id);
	        return new ResponseEntity<>(byId,HttpStatus.OK);
	    }

	    @GetMapping("/get/by/name")
	    public ResponseEntity<Genderize> getByName(@RequestParam String name)
	    {
	        Genderize byName = this.service.getByName(name);
	        return new ResponseEntity<>(byName,HttpStatus.OK);
	    }
	}

