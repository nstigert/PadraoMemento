public class PedidoEstadoEmSeparacao implements PedidoEstado {
    private PedidoEstadoEmSeparacao() {};
    private static PedidoEstadoEmSeparacao instance = new PedidoEstadoEmSeparacao();
    public static PedidoEstadoEmSeparacao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em separação";
    }
}
