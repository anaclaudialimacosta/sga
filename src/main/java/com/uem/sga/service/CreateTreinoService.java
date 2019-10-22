package com.uem.sga.service;

import com.uem.sga.repository.TreinoRepository;
import model.Treino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    public void createTreino(Treino treino){


    }
}
