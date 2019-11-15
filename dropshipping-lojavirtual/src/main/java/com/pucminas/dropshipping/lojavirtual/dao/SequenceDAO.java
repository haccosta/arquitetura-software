package com.pucminas.dropshipping.lojavirtual.dao;


import com.pucminas.dropshipping.lojavirtual.exception.SequenceException;

public interface SequenceDAO {
    long getNextSequenceId(String key) throws SequenceException;
}
