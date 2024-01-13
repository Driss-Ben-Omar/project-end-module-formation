package com.springendmodule.formation.repositories;

import com.springendmodule.formation.entities.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Integer> {

}
