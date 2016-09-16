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
import javax.persistence.Lob;
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
@Table(name = "COLUMNAS_DBA")
@NamedQueries({
    @NamedQuery(name = "ColumnasDba.findAll", query = "SELECT c FROM ColumnasDba c"),
    @NamedQuery(name = "ColumnasDba.findByOwner", query = "SELECT c FROM ColumnasDba c WHERE c.owner = :owner"),
    @NamedQuery(name = "ColumnasDba.findByTableName", query = "SELECT c FROM ColumnasDba c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "ColumnasDba.findByColumnName", query = "SELECT c FROM ColumnasDba c WHERE c.columnName = :columnName"),
    @NamedQuery(name = "ColumnasDba.findByDataType", query = "SELECT c FROM ColumnasDba c WHERE c.dataType = :dataType"),
    @NamedQuery(name = "ColumnasDba.findByDataTypeMod", query = "SELECT c FROM ColumnasDba c WHERE c.dataTypeMod = :dataTypeMod"),
    @NamedQuery(name = "ColumnasDba.findByDataTypeOwner", query = "SELECT c FROM ColumnasDba c WHERE c.dataTypeOwner = :dataTypeOwner"),
    @NamedQuery(name = "ColumnasDba.findByDataLength", query = "SELECT c FROM ColumnasDba c WHERE c.dataLength = :dataLength"),
    @NamedQuery(name = "ColumnasDba.findByDataPrecision", query = "SELECT c FROM ColumnasDba c WHERE c.dataPrecision = :dataPrecision"),
    @NamedQuery(name = "ColumnasDba.findByDataScale", query = "SELECT c FROM ColumnasDba c WHERE c.dataScale = :dataScale"),
    @NamedQuery(name = "ColumnasDba.findByNullable", query = "SELECT c FROM ColumnasDba c WHERE c.nullable = :nullable"),
    @NamedQuery(name = "ColumnasDba.findByColumnId", query = "SELECT c FROM ColumnasDba c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnasDba.findByDefaultLength", query = "SELECT c FROM ColumnasDba c WHERE c.defaultLength = :defaultLength"),
    @NamedQuery(name = "ColumnasDba.findByNumDistinct", query = "SELECT c FROM ColumnasDba c WHERE c.numDistinct = :numDistinct"),
    @NamedQuery(name = "ColumnasDba.findByDensity", query = "SELECT c FROM ColumnasDba c WHERE c.density = :density"),
    @NamedQuery(name = "ColumnasDba.findByNumNulls", query = "SELECT c FROM ColumnasDba c WHERE c.numNulls = :numNulls"),
    @NamedQuery(name = "ColumnasDba.findByNumBuckets", query = "SELECT c FROM ColumnasDba c WHERE c.numBuckets = :numBuckets"),
    @NamedQuery(name = "ColumnasDba.findByLastAnalyzed", query = "SELECT c FROM ColumnasDba c WHERE c.lastAnalyzed = :lastAnalyzed"),
    @NamedQuery(name = "ColumnasDba.findBySampleSize", query = "SELECT c FROM ColumnasDba c WHERE c.sampleSize = :sampleSize"),
    @NamedQuery(name = "ColumnasDba.findByCharacterSetName", query = "SELECT c FROM ColumnasDba c WHERE c.characterSetName = :characterSetName"),
    @NamedQuery(name = "ColumnasDba.findByCharColDeclLength", query = "SELECT c FROM ColumnasDba c WHERE c.charColDeclLength = :charColDeclLength"),
    @NamedQuery(name = "ColumnasDba.findByGlobalStats", query = "SELECT c FROM ColumnasDba c WHERE c.globalStats = :globalStats"),
    @NamedQuery(name = "ColumnasDba.findByUserStats", query = "SELECT c FROM ColumnasDba c WHERE c.userStats = :userStats"),
    @NamedQuery(name = "ColumnasDba.findByAvgColLen", query = "SELECT c FROM ColumnasDba c WHERE c.avgColLen = :avgColLen"),
    @NamedQuery(name = "ColumnasDba.findByCharLength", query = "SELECT c FROM ColumnasDba c WHERE c.charLength = :charLength"),
    @NamedQuery(name = "ColumnasDba.findByCharUsed", query = "SELECT c FROM ColumnasDba c WHERE c.charUsed = :charUsed"),
    @NamedQuery(name = "ColumnasDba.findByV80FmtImage", query = "SELECT c FROM ColumnasDba c WHERE c.v80FmtImage = :v80FmtImage"),
    @NamedQuery(name = "ColumnasDba.findByDataUpgraded", query = "SELECT c FROM ColumnasDba c WHERE c.dataUpgraded = :dataUpgraded"),
    @NamedQuery(name = "ColumnasDba.findByHistogram", query = "SELECT c FROM ColumnasDba c WHERE c.histogram = :histogram")})
public class ColumnasDba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Basic(optional = false)
    @Column(name = "COLUMN_NAME")
    @Id
    private String columnName;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "DATA_TYPE_MOD")
    private String dataTypeMod;
    @Column(name = "DATA_TYPE_OWNER")
    private String dataTypeOwner;
    @Basic(optional = false)
    @Column(name = "DATA_LENGTH")
    private BigInteger dataLength;
    @Column(name = "DATA_PRECISION")
    private BigInteger dataPrecision;
    @Column(name = "DATA_SCALE")
    private BigInteger dataScale;
    @Column(name = "NULLABLE")
    private String nullable;
    @Column(name = "COLUMN_ID")
    private BigInteger columnId;
    @Column(name = "DEFAULT_LENGTH")
    private BigInteger defaultLength;
    @Lob
    @Column(name = "DATA_DEFAULT")
    private String dataDefault;
    @Column(name = "NUM_DISTINCT")
    private BigInteger numDistinct;
    @Lob
    @Column(name = "LOW_VALUE")
    private byte[] lowValue;
    @Lob
    @Column(name = "HIGH_VALUE")
    private byte[] highValue;
    @Column(name = "DENSITY")
    private BigInteger density;
    @Column(name = "NUM_NULLS")
    private BigInteger numNulls;
    @Column(name = "NUM_BUCKETS")
    private BigInteger numBuckets;
    @Column(name = "LAST_ANALYZED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAnalyzed;
    @Column(name = "SAMPLE_SIZE")
    private BigInteger sampleSize;
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
    @Column(name = "CHAR_COL_DECL_LENGTH")
    private BigInteger charColDeclLength;
    @Column(name = "GLOBAL_STATS")
    private String globalStats;
    @Column(name = "USER_STATS")
    private String userStats;
    @Column(name = "AVG_COL_LEN")
    private BigInteger avgColLen;
    @Column(name = "CHAR_LENGTH")
    private BigInteger charLength;
    @Column(name = "CHAR_USED")
    private String charUsed;
    @Column(name = "V80_FMT_IMAGE")
    private String v80FmtImage;
    @Column(name = "DATA_UPGRADED")
    private String dataUpgraded;
    @Column(name = "HISTOGRAM")
    private String histogram;

    public ColumnasDba() {
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataTypeMod() {
        return dataTypeMod;
    }

    public void setDataTypeMod(String dataTypeMod) {
        this.dataTypeMod = dataTypeMod;
    }

    public String getDataTypeOwner() {
        return dataTypeOwner;
    }

    public void setDataTypeOwner(String dataTypeOwner) {
        this.dataTypeOwner = dataTypeOwner;
    }

    public BigInteger getDataLength() {
        return dataLength;
    }

    public void setDataLength(BigInteger dataLength) {
        this.dataLength = dataLength;
    }

    public BigInteger getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(BigInteger dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public BigInteger getDataScale() {
        return dataScale;
    }

    public void setDataScale(BigInteger dataScale) {
        this.dataScale = dataScale;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public BigInteger getColumnId() {
        return columnId;
    }

    public void setColumnId(BigInteger columnId) {
        this.columnId = columnId;
    }

    public BigInteger getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(BigInteger defaultLength) {
        this.defaultLength = defaultLength;
    }

    public String getDataDefault() {
        return dataDefault;
    }

    public void setDataDefault(String dataDefault) {
        this.dataDefault = dataDefault;
    }

    public BigInteger getNumDistinct() {
        return numDistinct;
    }

    public void setNumDistinct(BigInteger numDistinct) {
        this.numDistinct = numDistinct;
    }

    public byte[] getLowValue() {
        return lowValue;
    }

    public void setLowValue(byte[] lowValue) {
        this.lowValue = lowValue;
    }

    public byte[] getHighValue() {
        return highValue;
    }

    public void setHighValue(byte[] highValue) {
        this.highValue = highValue;
    }

    public BigInteger getDensity() {
        return density;
    }

    public void setDensity(BigInteger density) {
        this.density = density;
    }

    public BigInteger getNumNulls() {
        return numNulls;
    }

    public void setNumNulls(BigInteger numNulls) {
        this.numNulls = numNulls;
    }

    public BigInteger getNumBuckets() {
        return numBuckets;
    }

    public void setNumBuckets(BigInteger numBuckets) {
        this.numBuckets = numBuckets;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public BigInteger getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigInteger sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public BigInteger getCharColDeclLength() {
        return charColDeclLength;
    }

    public void setCharColDeclLength(BigInteger charColDeclLength) {
        this.charColDeclLength = charColDeclLength;
    }

    public String getGlobalStats() {
        return globalStats;
    }

    public void setGlobalStats(String globalStats) {
        this.globalStats = globalStats;
    }

    public String getUserStats() {
        return userStats;
    }

    public void setUserStats(String userStats) {
        this.userStats = userStats;
    }

    public BigInteger getAvgColLen() {
        return avgColLen;
    }

    public void setAvgColLen(BigInteger avgColLen) {
        this.avgColLen = avgColLen;
    }

    public BigInteger getCharLength() {
        return charLength;
    }

    public void setCharLength(BigInteger charLength) {
        this.charLength = charLength;
    }

    public String getCharUsed() {
        return charUsed;
    }

    public void setCharUsed(String charUsed) {
        this.charUsed = charUsed;
    }

    public String getV80FmtImage() {
        return v80FmtImage;
    }

    public void setV80FmtImage(String v80FmtImage) {
        this.v80FmtImage = v80FmtImage;
    }

    public String getDataUpgraded() {
        return dataUpgraded;
    }

    public void setDataUpgraded(String dataUpgraded) {
        this.dataUpgraded = dataUpgraded;
    }

    public String getHistogram() {
        return histogram;
    }

    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }
    
}
