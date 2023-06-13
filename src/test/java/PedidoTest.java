import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertEquals(9, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoAprovado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}