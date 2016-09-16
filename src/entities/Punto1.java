/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "PUNTO1")
@NamedQueries({
    @NamedQuery(name = "Punto1.findAll", query = "SELECT p FROM Punto1 p"),
    @NamedQuery(name = "Punto1.findByUsername", query = "SELECT p FROM Punto1 p WHERE p.username = :username"),
    @NamedQuery(name = "Punto1.findByTotalTablas", query = "SELECT p FROM Punto1 p WHERE p.totalTablas = :totalTablas"),
    @NamedQuery(name = "Punto1.findByTotalVistas", query = "SELECT p FROM Punto1 p WHERE p.totalVistas = :totalVistas"),
    @NamedQuery(name = "Punto1.findByTotalVistasMat", query = "SELECT p FROM Punto1 p WHERE p.totalVistasMat = :totalVistasMat"),
    @NamedQuery(name = "Punto1.findByTotalTriggers", query = "SELECT p FROM Punto1 p WHERE p.totalTriggers = :totalTriggers"),
    @NamedQuery(name = "Punto1.findByAccountStatus", query = "SELECT p FROM Punto1 p WHERE p.accountStatus = :accountStatus"),
    @NamedQuery(name = "Punto1.findByDefaultTablespace", query = "SELECT p FROM Punto1 p WHERE p.defaultTablespace = :defaultTablespace"),
    @NamedQuery(name = "Punto1.findByCreated", query = "SELECT p FROM Punto1 p WHERE p.created = :created")})
public class Punto1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    @Id
    private String username;
    @Column(name = "TOTAL_TABLAS")
    private BigInteger totalTablas;
    @Column(name = "TOTAL_VISTAS")
    private BigInteger totalVistas;
    @Column(name = "TOTAL_VISTAS_MAT")
    private BigInteger totalVistasMat;
    @Column(name = "TOTAL_TRIGGERS")
    private BigInteger totalTriggers;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_STATUS")
    private String accountStatus;
    @Basic(optional = false)
    @Column(name = "DEFAULT_TABLESPACE")
    private String defaultTablespace;
    @Basic(optional = false)
    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Punto1() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigInteger getTotalTablas() {
        return totalTablas;
    }

    public void setTotalTablas(BigInteger totalTablas) {
        this.totalTablas = totalTablas;
    }

    public BigInteger getTotalVistas() {
        return totalVistas;
    }

    public void setTotalVistas(BigInteger totalVistas) {
        this.totalVistas = totalVistas;
    }

    public BigInteger getTotalVistasMat() {
        return totalVistasMat;
    }

    public void setTotalVistasMat(BigInteger totalVistasMat) {
        this.totalVistasMat = totalVistasMat;
    }

    public BigInteger getTotalTriggers() {
        return totalTriggers;
    }

    public void setTotalTriggers(BigInteger totalTriggers) {
        this.totalTriggers = totalTriggers;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getDefaultTablespace() {
        return defaultTablespace;
    }

    public void setDefaultTablespace(String defaultTablespace) {
        this.defaultTablespace = defaultTablespace;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    
}
