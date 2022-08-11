package com.prontmed.projeto.entidades;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity //Definição: são componentes que são salvos e manipulados dento do banco de dados(ele vai se transformar em uma tabela)
@Table(name = "NovoProntuario")

public class NovoProntuario {

    @Id//Define qual atributo é a chave primaria de uma entidade
    @GeneratedValue(strategy = GenerationType.AUTO)//Estrategia para gerar os valores da chave primaria da entidade
    private Long id;

    @Column(unique = false,name = "nome")
    private String nome;

    @Column(unique = true,name = "cpf")
    private String cpf;

    @Column(unique = false,name = "dataNascimento")
    private Date dataNascimento;

    @Column(unique = false,name = "exerciciosFisicos")
    private boolean exerciciosFisicos;

    @Column(unique = false,name = "alimentacaoBalanceada")
    private boolean alimentacaoBalanceada;

    @Column(unique = false,name = "tabagismo")
    private boolean tabagismo;

    @Column(unique = false,name = "consomeAlcool")
    private boolean consomeAlcool;

    @Column(unique = false,name = "possuiAlergias")
    private boolean possuiAlergias;

    @Column(unique = false,name = "problemasCardiacos")
    private boolean problemasCardiacos;

    @Column(unique = false,name = "problemasOrtopedicos")
    private boolean problemasOrtopedicos;

    @Column(unique = false,name = "medicacaoControlada")
    private boolean medicacaoControlada;

    @Column(unique = false,name = "possuiDiabetes")
    private boolean possuiDiabetes;

    @Column(unique = false,name = "possuiHipertencao")
    private boolean possuiHipertencao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(final Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isExerciciosFisicos() {
        return exerciciosFisicos;
    }

    public void setExerciciosFisicos(final boolean exerciciosFisicos) {
        this.exerciciosFisicos = exerciciosFisicos;
    }

    public boolean isAlimentacaoBalanceada() {
        return alimentacaoBalanceada;
    }

    public void setAlimentacaoBalanceada(final boolean alimentacaoBalanceada) {
        this.alimentacaoBalanceada = alimentacaoBalanceada;
    }

    public boolean isTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(final boolean tabagismo) {
        this.tabagismo = tabagismo;
    }

    public boolean isConsomeAlcool() {
        return consomeAlcool;
    }

    public void setConsomeAlcool(final boolean consomeAlcool) {
        this.consomeAlcool = consomeAlcool;
    }

    public boolean isPossuiAlergias() {
        return possuiAlergias;
    }

    public void setPossuiAlergias(final boolean possuiAlergias) {
        this.possuiAlergias = possuiAlergias;
    }

    public boolean isProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(final boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public boolean isProblemasOrtopedicos() {
        return problemasOrtopedicos;
    }

    public void setProblemasOrtopedicos(final boolean problemasOrtopedicos) {
        this.problemasOrtopedicos = problemasOrtopedicos;
    }

    public boolean isMedicacaoControlada() {
        return medicacaoControlada;
    }

    public void setMedicacaoControlada(final boolean medicacaoControlada) {
        this.medicacaoControlada = medicacaoControlada;
    }

    public boolean isPossuiDiabetes() {
        return possuiDiabetes;
    }

    public void setPossuiDiabetes(final boolean possuiDiabetes) {
        this.possuiDiabetes = possuiDiabetes;
    }

    public boolean isPossuiHipertencao() {
        return possuiHipertencao;
    }

    public void setPossuiHipertencao(final boolean possuiHipertencao) {
        this.possuiHipertencao = possuiHipertencao;
    }

}
