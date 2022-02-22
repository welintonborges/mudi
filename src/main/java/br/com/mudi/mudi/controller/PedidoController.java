package br.com.mudi.mudi.controller;

import br.com.mudi.mudi.dto.RequisicaoNovoPedido;
import br.com.mudi.mudi.model.Pedido;
import br.com.mudi.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("/formulario")
    public String formulario(){
    return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicaoNovoPedido){
        Pedido pedido = requisicaoNovoPedido.toPedido();
        pedidoRepository.save(pedido);
        return "pedido/formulario";
    }
}
