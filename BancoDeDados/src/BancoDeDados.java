public class BancoDeDados {
    private List<String> registros;
    private String senha;

    public BancoDeDados(String senha) {
        this.registros = new ArrayList<>();
        this.senha = senha;
    }

    public List<String> getRegistros(String senha) {
        if (this.senha.equals(senha)) {
            return new ArrayList<>(this.registros);
        } else {
            throw new SecurityException("Acesso negado!");
        }
    }

    public void adicionarRegistro(String registro, String senha) {
        if (this.senha.equals(senha)) {
            this.registros.add(registro);
        } else {
            throw new SecurityException("Acesso negado!");
        }
    }

    public void atualizarRegistro(int indice, String novoRegistro, String senha) {
        if (this.senha.equals(senha)) {
            if (indice >= 0 && indice < this.registros.size()) {
                this.registros.set(indice, novoRegistro);
            } else {
                throw new IllegalArgumentException("Indice invalido!");
            }
        } else {
            throw new SecurityException("Acesso negado!");
        }
    }

    public void excluirRegistro(int indice, String senha) {
        if (this.senha.equals(senha)) {
            if (indice >= 0 && indice < this.registros.size()) {
                this.registros.remove(indice);
            } else {
                throw new IllegalArgumentException("Indice invalido!");
            }
        } else {
            throw new SecurityException("Acesso negado!");
        }
    }
}
