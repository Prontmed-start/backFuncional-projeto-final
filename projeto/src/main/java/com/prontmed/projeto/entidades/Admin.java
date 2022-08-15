package com.prontmed.projeto.entidades;



import javax.persistence.*;




@Entity
@Table(name = "admin")
public class Admin {

    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Long id;
    
        @Column(name = "nome", length = 100)
        private String nome;

        @Column(name = "matricula", length = 100)
        private String matricula;
    
        @Column(name = "email",length = 100)
        private String email;
        @Column(name = "senha")
        private String senha;
    
    
    
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
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
    
        public String getSenha() {
            return senha;
        }
    
        public void setSenha(String senha) {
            this.senha = senha;
        }
        

      
           
    
    

        
    /** */
    public String getMatricula() {
        return matricula;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}