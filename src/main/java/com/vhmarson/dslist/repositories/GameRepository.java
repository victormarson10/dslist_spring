package com.vhmarson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhmarson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
