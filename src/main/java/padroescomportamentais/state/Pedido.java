    package padroescomportamentais.state;

    public class Pedido {

        private String descricao;
        private PedidoEstado estado;

        public Pedido() {
            this.estado = PedidoEstadoAguardandoPagamento.getInstance();
        }

        public void setEstado(PedidoEstado estado) {
            this.estado = estado;
        }

        public boolean pagar() {
            return estado.pagar(this);
        }

        public boolean cancelar() {
            return estado.cancelar(this);
        }

        public boolean enviar() {
            return estado.enviar(this);
        }

        public boolean entregar() {
            return estado.entregar(this);
        }

        public boolean processar() {
            return estado.processar(this);
        }

        public String getDescricaoEstado() {
            return estado.getEstado();
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public PedidoEstado getEstado() {
            return estado;
        }
    }
