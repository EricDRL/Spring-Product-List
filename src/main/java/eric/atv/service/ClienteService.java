package eric.atv.service;

import eric.atv.entity.ClienteEntity;
import eric.atv.entity.ProdutoEntity;
import eric.atv.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteEntity salvar(ClienteEntity cliente) {

        for (ProdutoEntity produto : cliente.getProducts()) {
            produto.setCliente(cliente);
        }

        return clienteRepository.save(cliente);
    }

    public List<ClienteEntity> listar() {
        return clienteRepository.findAll();
    }
}