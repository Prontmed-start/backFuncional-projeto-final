package com.prontmed.projeto.entidades;



import javax.persistence.*;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "admin")
public class Admin {

    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private int id;
    
        @Column(name = "nome", length = 100,nullable = false)
        private String nome;

        @Column(name = "matricula", length = 100,nullable = false)
        private String matricula;
    
        @Column(name = "email",length = 100,nullable = false)
        private String email;
        @Column(name = "senha",nullable = false)
        private String senha;
    
    
    
        @Column(name = "observacao",nullable = false)
        @Type(type = "text")
        private String observacao;
    
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
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
            public String getObservacao() {
                return observacao;
            }
    
            public void setObservacao(String observacao) {
                this.observacao = observacao;
            }
    
    

        }