class Livro {
    int id;
    String titulo;
    String autor;
    int ano;
    String genero;

    public Livro(int id, String titulo, String autor, int ano, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Gênero: " + genero;
    }
}

