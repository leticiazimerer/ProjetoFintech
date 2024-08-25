public class Usuario {

    private String nomeCompleto;
    private String cpfCnpj;
    private String email;
    private String senha;
    private boolean isPessoaFisica;

    public Usuario() {
    }

    public Usuario(String nomeCompleto, String cpfCnpj, String email, String senha, boolean isPessoaFisica) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.senha = senha;
        this.isPessoaFisica = isPessoaFisica;
    }

    public void criarConta() {
        System.out.println("Conta criada para o usuário: " + nomeCompleto);
    }
}

