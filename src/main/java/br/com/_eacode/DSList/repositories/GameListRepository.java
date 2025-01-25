package br.com._eacode.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com._eacode.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
