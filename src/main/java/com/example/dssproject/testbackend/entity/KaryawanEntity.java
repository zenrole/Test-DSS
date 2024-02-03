package com.example.dssproject.testbackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "karyawan", schema = "public")

public class KaryawanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nama;

    @Column
    private String tgl_lahir;

    @Column(name = "group_id")
    private Integer group;

    @Column
    private Integer saldo;

    public Integer getId() {
        return id;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saldo_id")
    @JsonProperty("saldo_data")
    private SaldoEntity saldo_data;

    @OneToOne
    @JoinColumn(name = "group", referencedColumnName = "group_id")
    @JsonProperty("group_data")
    private GroupEntity groupEntity;

    public KaryawanEntity(Integer id, String nama, String tgl_lahir, Integer group, Integer saldo, SaldoEntity saldo_data, GroupEntity groupEntity) {
        this.id = id;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.group = group;
        this.saldo = saldo;
        this.saldo_data = saldo_data;
        this.groupEntity = groupEntity;
    }

    public KaryawanEntity() {

    }

    public GroupEntity getGroupEntity() {
        return groupEntity;
    }

    public void setGroupEntity(GroupEntity groupEntity) {
        this.groupEntity = groupEntity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

//    public Integer getGroup() {
//        return group;
//    }

    public void setGroup(Integer group) {
        this.group = group;
    }

//    public Integer getSaldo() {
//        return saldo;
//    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public SaldoEntity getSaldo_data() {
        return saldo_data;
    }

    public void setSaldo_data(SaldoEntity saldo_data) {
        this.saldo_data = saldo_data;
    }
}
