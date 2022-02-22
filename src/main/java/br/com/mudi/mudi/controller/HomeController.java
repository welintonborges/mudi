package br.com.mudi.mudi.controller;

import br.com.mudi.mudi.model.Pedido;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 8");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61pOZ7mAn2S._AC_UL320_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Poco-PRO-256gb-8gb/dp/B0919PLV7S/ref=Oct_d_otopr_16243890011?pd_rd_i=B0919PLV7S&pd_rd_r=91c01a75-c045-41c8-ae7a-1e35b96391ee&pd_rd_w=QV305&pd_rd_wg=mBAcD&pf_rd_p=3fd9fd9d-d2d3-4466-a00f-948526a3aced&pf_rd_r=HP7YNN5SM372N5ADPGVW&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Um celualar da hora");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
    return "Home";
    }
}
