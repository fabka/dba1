/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "RESTRICCIONES_PUNTO3")
@NamedQueries({
    @NamedQuery(name = "RestriccionesPunto3.findAll", query = "SELECT r FROM RestriccionesPunto3 r"),
    @NamedQuery(name = "RestriccionesPunto3.findByOwner", query = "SELECT r FROM RestriccionesPunto3 r WHERE r.owner = :owner"),
    @NamedQuery(name = "RestriccionesPunto3.findByTableName", query = "SELECT r FROM RestriccionesPunto3 r WHERE r.tableName = :tableName"),
    @NamedQuery(name = "RestriccionesPunto3.findByColumnName", query = "SELECT r FROM RestriccionesPunto3 r WHERE r.columnName = :columnName"),
    @NamedQuery(name = "RestriccionesPunto3.findByConstraintType", query = "SELECT r FROM RestriccionesPunto3 r WHERE r.constraintType = :constraintType")})
public class RestriccionesPunto3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Column(name = "COLUMN_NAME")
    @Id
    private String columnName;
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;

    public RestriccionesPunto3() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }
    
}
