package padroescomportamentais.state;

public class PedidoEstadoEmProcessamento extends PedidoEstado {

    private PedidoEstadoEmProcessamento() {}

    private static PedidoEstadoEmProcessamento instance = new PedidoEstadoEmProcessamento();

    public static PedidoEstadoEmProcessamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Processamento";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
