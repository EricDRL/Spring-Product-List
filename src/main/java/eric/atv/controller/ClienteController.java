package eric.atv.controller;

import eric.atv.entity.ClienteEntity;
import eric.atv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteEntity salvar(@RequestBody ClienteEntity cliente) {
        return clienteService.salvar(cliente);
    }

    @GetMapping
    public List<ClienteEntity> listar() {
        return clienteService.listar();
    }
}