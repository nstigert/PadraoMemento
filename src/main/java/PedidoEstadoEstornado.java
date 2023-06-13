public class PedidoEstadoEstornado implements PedidoEstado {
    private PedidoEstadoEstornado() {};
    private static PedidoEstadoEstornado instance = new PedidoEstadoEstornado();
    public static PedidoEstadoEstornado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Estornado";
    }
}
