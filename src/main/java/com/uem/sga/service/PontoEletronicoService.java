package com.uem.sga.service;

import com.uem.sga.controller.PontoEletronico;
import com.uem.sga.repository.PontoEletronicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PontoEletronicoService {
    @Autowired
    private PontoEletronicoRepository pontoEletronicoRepository;

    public PontoEletronico marcarPonto(PontoEletronico pontoEletronico) {

        return pontoEletronicoRepository.save(pontoEletronico);
    }
}
