public class Animal {
        private String nome;
        private String classe;
        private String familia;
        private Integer idade;
        private Boolean estado;
        private Integer fome;
        private Integer forca;

        public Animal(String nome,String classe,String familia,Integer idade,Boolean estado,
        Integer fome, Integer forca) { // Construtor padrao
            this.nome = nome;
            this.classe = classe;
            this.familia = familia;
            this.idade = idade;
            this.estado = estado;
            this.fome = fome;
            this.forca = forca;
        }

        public Animal(String nome,String classe,String familia) {
            this.nome = nome; //Neste contrutor iremos setar alguns atributos para o novo animal
            this.classe = classe;
            this.familia = familia;
            this.idade = 0;
            this.estado = true;
            this.fome = 10;
            this.forca = 10;
        }

        public String getNome(){
            return nome;
        }

        public String getClasse(){
            return classe;
        }

        public String getFamilia(){
            return familia;
        }

        public Integer getIdade(){
            return idade;
        }

        public Integer getFome(){
            return fome;
        }

        public Integer getForca(){
            return forca;
        }

        public Boolean getEstado(){
            return estado;
        }

        public String nasceu(){
            return(
                    "\nSeu Animal nasceu!!! Seu é " + nome +
                    "\nSua Idade é: " + idade +
                    "\nSua Classe é: " + classe +
                    "\nSua Familia é: " + familia +
                    "\nSua Fome é: " + fome +
                    "\nSua Forca é: " + forca + "\n"
            );
        }

        public String morreu(){
            this.forca = 0;
            this.estado = false;

            return("O Seu animal chamado " + nome + " Morreu" + "\n");
        }

        public String comer(){
            this.fome -= 10;
            this.forca += 5;
            return("Seu animal comeu agora sua Forca é de: " + forca +
                    " e sua Fome é de: " + fome + "\n");
        }

        public String correr(){
            this.fome += 10;
            this.forca -= 5;
            return("Seu animal correu agora sua Forca é de: " + forca +
                    " e sua Fome é de: " + fome + "\n");
        }

        public String dormir(){
            this.fome += 5;
            this.forca += 2;
            return("Seu animal Dormiu agora sua Forca é de: " + forca +
                    " e sua Fome é de: " + fome + "\n");
        }

        public String status(){
            return("O Seu animal chamado " + nome + " tem "
            + forca + " de Força e " + fome + " de fome.\n");
        }
}