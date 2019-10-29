package com.uem.sga.service;

import com.uem.sga.model.PontoEletronico;
import com.uem.sga.repository.PontoEletronicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PontoEletronicoService {
    @Autowired
    private PontoEletronicoRepository pontoEletronicoRepository;

    public PontoEletronico marcarPonto(PontoEletronico pontoEletronico) {

        return pontoEletronicoRepository.save(pontoEletronico);
    }


    public List<PontoEletronico> listarPontosMarcados() {
        Iterable<PontoEletronico> aulas = pontoEletronicoRepository.findAll();
        List<PontoEletronico> novo = new ArrayList<>();
        aulas.iterator().forEachRemaining(novo::add);
        return novo;
    }
}
