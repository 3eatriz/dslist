package br.com._eacode.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com._eacode.DSList.dto.GameMinDTO;
import br.com._eacode.DSList.entities.Game;
import br.com._eacode.DSList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
