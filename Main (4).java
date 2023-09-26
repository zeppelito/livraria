import java.util.Scanner;

public class Main {
    public static class Livro {
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private String genero;
        private double preco;

        public Livro(String titulo, String autor, int anoPublicacao, String genero, double preco) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.genero = genero;
            this.preco = preco;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getAnoPublicacao() {
            return anoPublicacao;
        }

        public void setAnoPublicacao(int anoPublicacao) {
            this.anoPublicacao = anoPublicacao;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
    }

    public static class Cliente {
        private String nome;
        private String email;
        private String endereco;
        private String telefone;
        private int idade;

        public Cliente(String nome, String email, String endereco, String telefone, int idade) {
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
            this.telefone = telefone;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

      public static class Pedido {
        private int numeroPedido;
        private Cliente cliente;
        private Livro livro;
        private int quantidade;
        private double total; // Adicionei o atributo total

        public Pedido(int numeroPedido, Cliente cliente, Livro livro, int quantidade) {
            this.numeroPedido = numeroPedido;
            this.cliente = cliente;
            this.livro = livro;
            this.quantidade = quantidade;
            this.total = livro.getPreco() * quantidade; // Cálculo do total
        }

        public int getNumeroPedido() {
            return numeroPedido;
        }

        public void setNumeroPedido(int numeroPedido) {
            this.numeroPedido = numeroPedido;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Livro getLivro() {
            return livro;
        }

        public void setLivro(Livro livro) {
            this.livro = livro;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
            this.total = livro.getPreco() * quantidade; // Atualizar o total quando a quantidade muda
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }
    }

    public static class Livraria {
    private Livro[] livros;
    private Cliente[] clientes;
    private Pedido[] pedidos;
    private int numLivros;
    private int numClientes;
    private int numPedidos;

    public Livraria(int capacidadeLivros, int capacidadeClientes, int capacidadePedidos) {
        livros = new Livro[capacidadeLivros];
        clientes = new Cliente[capacidadeClientes];
        pedidos = new Pedido[capacidadePedidos];
        numLivros = 0;
        numClientes = 0;
        numPedidos = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (numLivros < livros.length) {
            livros[numLivros++] = livro;
        } else {
            System.out.println("A capacidade máxima de livros foi atingida.");
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if (numClientes < clientes.length) {
            clientes[numClientes++] = cliente;
        } else {
            System.out.println("A capacidade máxima de clientes foi atingida.");
        }
    }

    public void adicionarPedido(Pedido pedido) {
        if (numPedidos < pedidos.length) {
            pedidos[numPedidos++] = pedido;
        } else {
            System.out.println("A capacidade máxima de pedidos foi atingida.");
        }
    }
}  public static void main(String[] args) {
        
    }
}