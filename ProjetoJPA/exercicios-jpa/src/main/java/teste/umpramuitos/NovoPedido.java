package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class NovoPedido {

	DAO<Object> dao = new DAO<>();
	
	Pedidos pedido = new Pedidos();
	Produto produto = new Produto("Geladeira", 2789.99);
	ItemPedido item = new ItemPedido(pedido, produto, 10);
	
	dao.abrirT().incluir(produto).incluir(pedido)
		.incluir(item).fechaT().fechar();
}
