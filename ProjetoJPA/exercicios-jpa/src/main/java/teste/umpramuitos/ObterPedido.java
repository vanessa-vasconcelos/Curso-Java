package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class ObterPedido {

	public static void main(String[] args) {
		DAO<Pedidos> dao = new DAO<>(Pedidos.class);
		
		Pedidos pedido = dao.obterPorId(1L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		dao.fechar();
	}
}
