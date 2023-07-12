package com.vhmarson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vhmarson.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
