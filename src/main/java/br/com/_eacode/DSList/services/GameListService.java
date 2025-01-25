package br.com._eacode.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com._eacode.DSList.dto.GameListDTO;
import br.com._eacode.DSList.entities.GameList;
import br.com._eacode.DSList.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository listRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = listRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
