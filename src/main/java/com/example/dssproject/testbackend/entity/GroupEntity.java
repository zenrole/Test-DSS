package com.example.dssproject.testbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "group", schema = "public")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer group_id;

    @Column
    private String nama;

    @Column
    private String tgl_join;

    public GroupEntity(Integer group_id, String nama, String tgl_join) {
        this.group_id = group_id;
        this.nama = nama;
        this.tgl_join = tgl_join;
    }

    public GroupEntity() {

    }

//    public Integer getGroup_id() {
//        return group_id;
//    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_join() {
        return tgl_join;
    }

    public void setTgl_join(String tgl_join) {
        this.tgl_join = tgl_join;
    }
}
