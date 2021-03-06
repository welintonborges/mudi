package br.com.mudi.mudi.repository;

import br.com.mudi.mudi.model.Pedido;
import br.com.mudi.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByStatus(StatusPedido statusPedido);
}
