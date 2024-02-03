package com.example.dssproject.testbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "saldo", schema = "public")
public class SaldoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer saldo_id;

    @Column
    private String jenis;

    @Column
    private Integer saldo;

    public SaldoEntity(Integer saldo_id, String jenis, Integer saldo) {
        this.saldo_id = saldo_id;
        this.jenis = jenis;
        this.saldo = saldo;
    }

    public SaldoEntity() {

    }

//    public Integer getSaldo_id() {
//        return saldo_id;
//    }

    public void setSaldo_id(Integer saldo_id) {
        this.saldo_id = saldo_id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
