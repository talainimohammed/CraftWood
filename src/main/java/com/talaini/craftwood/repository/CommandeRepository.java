package com.talaini.craftwood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.talaini.craftwood.entity.Commande;

@Repository("commandeRepository")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
