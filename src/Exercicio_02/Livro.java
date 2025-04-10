package Exercicio_02;

public class Livro {

		private String titulo;
		private String autor;
		private int numPaginas;

	
		public Livro(String titulo, String autor, int numPaginas) {
			this.titulo= titulo;
			this.autor = autor;
			this.numPaginas = numPaginas;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getTitulo() {
			return titulo;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public void setNumPaginas (int numPaginas) {
			this.numPaginas = numPaginas;
		}
		
		public int getNumPaginas() {
			return numPaginas;
		}

		public void imprimirInfo() {
			System.out.println("Titulo: " + getTitulo());
			System.out.println("Autor: " + getAutor());
			System.out.println("Número de páginas: " + getNumPaginas());
		}
}
