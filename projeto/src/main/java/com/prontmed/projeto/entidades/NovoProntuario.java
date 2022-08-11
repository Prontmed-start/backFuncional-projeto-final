package com.prontmed.projeto.entidades;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity //Definição: são componentes que são salvos e manipulados dento do banco de dados(ele vai se transformar em uma tabela)
@Table(name = "NovoProntuario")

public class NovoProntuario {

    @Id//Define qual atributo é a chave primaria de uma entidade
    @GeneratedValue(strategy = GenerationType.AUTO)//Estrategia para gerar os valores da chave primaria da entidade
    private Long id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private Data dataNascimento;

    @Column
    private boolean exerciciosFisicos;

    @Column
    private boolean alimentacaoBalanceada;

    @Column
    private boolean tabagismo;

    @Column
    private boolean consomeAlcool;

    @Column
    private boolean possuiAlergias;

    @Column
    private boolean problemasCardiacos;

    @Column
    private boolean problemasOrtopedicos;

    @Column
    private boolean medicacaoControlada;

    @Column
    private boolean possuiDiabetes;

    @Column
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

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(final Data dataNascimento) {
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
