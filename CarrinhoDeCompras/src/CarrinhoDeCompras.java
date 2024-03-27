public class CarrinhoDeCompras {
    private String usuario;
    private List<String> itens;

    public CarrinhoDeCompras(String usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public List<String> listarItens() {
        return itens;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras("Sal");

        carrinho.adicionarItem("Banana");
        carrinho.adicionarItem("Maça");
        carrinho.adicionarItem("Mamao");

        System.out.println(carrinho.getUsuario() + ":");
        List<String> itensNoCarrinho = carrinho.listarItens();
        for (String item : itensNoCarrinho) {
            System.out.println("- " + item);
        }

        carrinho.removerItem("Mamao");

        System.out.println("Agora os itens no carrinho de " + carrinho.getUsuario() + ": ");
        itensNoCarrinho = carrinho.listarItens();
        for (String item : itensNoCarrinho) {
            System.out.println("- " + item);
        }
    }
}
