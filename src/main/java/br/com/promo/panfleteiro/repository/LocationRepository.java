package br.com.promo.panfleteiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.promo.panfleteiro.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

    
} 
