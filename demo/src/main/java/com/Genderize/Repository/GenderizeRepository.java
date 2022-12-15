package com.Genderize.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Genderize.Model.Genderize;

public interface GenderizeRepository extends JpaRepository<Genderize,Integer> {
	Optional<Genderize> findByName(String name);
}
