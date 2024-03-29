package com.alejandrolopez.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejandrolopez.model.Persona;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
