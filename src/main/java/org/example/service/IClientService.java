package org.example.service;

import org.example.model.Client;

import java.util.ArrayList;
/**
 * @Author: José Antonio Quintero Maya
 */
public interface IClientService {

    void add(Client client);
    void deleteById(Long id);
    ArrayList findAll();
    Client findByDni(String dni);
    void update(Client client);

}
