public class PedidoEstadoEmTransito implements PedidoEstado {
    private PedidoEstadoEmTransito() {};
    private static PedidoEstadoEmTransito instance = new PedidoEstadoEmTransito();
    public static PedidoEstadoEmTransito getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em trânsito";
    }
}
