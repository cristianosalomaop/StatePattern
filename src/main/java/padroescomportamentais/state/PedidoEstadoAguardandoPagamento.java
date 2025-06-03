package padroescomportamentais.state;

public class PedidoEstadoAguardandoPagamento extends PedidoEstado {

    private PedidoEstadoAguardandoPagamento() {}

    private static PedidoEstadoAguardandoPagamento instance = new PedidoEstadoAguardandoPagamento();

    public static PedidoEstadoAguardandoPagamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aguardando Pagamento";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
