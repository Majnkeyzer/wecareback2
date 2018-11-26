package bios.springframework.spring5webapp.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "Stoel")
public class Stoel {

    @Id
    @Column(name= "stoelid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stoelid;

    @Column(name= "StoelNummer", unique = true,nullable=false)
    private Long stoelNummer;

    public Stoel(){

    }

    public Long getId() {
        return stoelid;
    }

    public void setId(Long id) {
        this.stoelid = id;
    }

    public Long getstoelNummer() {
        return stoelNummer;
    }

    public void setstoelNummer(Long stoelNummer) {
        this.stoelNummer = stoelNummer;
    }

}




