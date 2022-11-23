public class UTENTE {

        private String nome;
        private String genero;
        private int idade;
        private float altura;
        private int peso;

        public UTENTE(String nome, String genero, int idade, float altura, int peso) {
            this.nome = nome;
            this.genero = genero;
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        @Override
        public String toString() {
            return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
                    + peso + "]";
        }



}
