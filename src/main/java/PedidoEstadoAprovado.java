public class PedidoEstadoAprovado implements PedidoEstado {
    private PedidoEstadoAprovado() {};
    private static PedidoEstadoAprovado instance = new PedidoEstadoAprovado();
    public static PedidoEstadoAprovado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aprovado";
    }
}
