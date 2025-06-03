package padroescomportamentais.state;

public class PedidoEstadoPago extends PedidoEstado {

    private PedidoEstadoPago() {}

    private static PedidoEstadoPago instance = new PedidoEstadoPago();

    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }

    public boolean processar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEmProcessamento.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
