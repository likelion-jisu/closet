package com.example.closet.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TBB_USER")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_seq;

    private String user_id;
    private String pw;
    private boolean bl_yn;
    private String name;
    private String email;
    private String phone_no;
    private String sex;

    @Column(name = "rgst_dtti")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgst_dtti;

    @Column(name = "updt_dtti")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updt_dtti;
}