/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "VISTAS_DBA")
@NamedQueries({
    @NamedQuery(name = "VistasDba.findAll", query = "SELECT v FROM VistasDba v"),
    @NamedQuery(name = "VistasDba.findByOwner", query = "SELECT v FROM VistasDba v WHERE v.owner = :owner"),
    @NamedQuery(name = "VistasDba.findByViewName", query = "SELECT v FROM VistasDba v WHERE v.viewName = :viewName"),
    @NamedQuery(name = "VistasDba.findByTextLength", query = "SELECT v FROM VistasDba v WHERE v.textLength = :textLength"),
    @NamedQuery(name = "VistasDba.findByTypeTextLength", query = "SELECT v FROM VistasDba v WHERE v.typeTextLength = :typeTextLength"),
    @NamedQuery(name = "VistasDba.findByTypeText", query = "SELECT v FROM VistasDba v WHERE v.typeText = :typeText"),
    @NamedQuery(name = "VistasDba.findByOidTextLength", query = "SELECT v FROM VistasDba v WHERE v.oidTextLength = :oidTextLength"),
    @NamedQuery(name = "VistasDba.findByOidText", query = "SELECT v FROM VistasDba v WHERE v.oidText = :oidText"),
    @NamedQuery(name = "VistasDba.findByViewTypeOwner", query = "SELECT v FROM VistasDba v WHERE v.viewTypeOwner = :viewTypeOwner"),
    @NamedQuery(name = "VistasDba.findByViewType", query = "SELECT v FROM VistasDba v WHERE v.viewType = :viewType"),
    @NamedQuery(name = "VistasDba.findBySuperviewName", query = "SELECT v FROM VistasDba v WHERE v.superviewName = :superviewName"),
    @NamedQuery(name = "VistasDba.findByEditioningView", query = "SELECT v FROM VistasDba v WHERE v.editioningView = :editioningView"),
    @NamedQuery(name = "VistasDba.findByReadOnly", query = "SELECT v FROM VistasDba v WHERE v.readOnly = :readOnly")})
public class VistasDba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "VIEW_NAME")
    @Id
    private String viewName;
    @Column(name = "TEXT_LENGTH")
    private BigInteger textLength;
    @Lob
    @Column(name = "TEXT")
    private String text;
    @Column(name = "TYPE_TEXT_LENGTH")
    private BigInteger typeTextLength;
    @Column(name = "TYPE_TEXT")
    private String typeText;
    @Column(name = "OID_TEXT_LENGTH")
    private BigInteger oidTextLength;
    @Column(name = "OID_TEXT")
    private String oidText;
    @Column(name = "VIEW_TYPE_OWNER")
    private String viewTypeOwner;
    @Column(name = "VIEW_TYPE")
    private String viewType;
    @Column(name = "SUPERVIEW_NAME")
    private String superviewName;
    @Column(name = "EDITIONING_VIEW")
    private String editioningView;
    @Column(name = "READ_ONLY")
    private String readOnly;

    public VistasDba() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public BigInteger getTextLength() {
        return textLength;
    }

    public void setTextLength(BigInteger textLength) {
        this.textLength = textLength;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigInteger getTypeTextLength() {
        return typeTextLength;
    }

    public void setTypeTextLength(BigInteger typeTextLength) {
        this.typeTextLength = typeTextLength;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public BigInteger getOidTextLength() {
        return oidTextLength;
    }

    public void setOidTextLength(BigInteger oidTextLength) {
        this.oidTextLength = oidTextLength;
    }

    public String getOidText() {
        return oidText;
    }

    public void setOidText(String oidText) {
        this.oidText = oidText;
    }

    public String getViewTypeOwner() {
        return viewTypeOwner;
    }

    public void setViewTypeOwner(String viewTypeOwner) {
        this.viewTypeOwner = viewTypeOwner;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getSuperviewName() {
        return superviewName;
    }

    public void setSuperviewName(String superviewName) {
        this.superviewName = superviewName;
    }

    public String getEditioningView() {
        return editioningView;
    }

    public void setEditioningView(String editioningView) {
        this.editioningView = editioningView;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }
    
}
