package br.com._eacode.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com._eacode.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
