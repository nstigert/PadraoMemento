public class PedidoEstadoAguardandoPagamento implements PedidoEstado {
    private PedidoEstadoAguardandoPagamento() {};
    private static PedidoEstadoAguardandoPagamento instance = new PedidoEstadoAguardandoPagamento();
    public static PedidoEstadoAguardandoPagamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aguardando pagamento";
    }
}
