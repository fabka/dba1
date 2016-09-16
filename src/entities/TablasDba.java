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
@Table(name = "TABLAS_DBA")
@NamedQueries({
    @NamedQuery(name = "TablasDba.findAll", query = "SELECT t FROM TablasDba t"),
    @NamedQuery(name = "TablasDba.findByOwner", query = "SELECT t FROM TablasDba t WHERE t.owner = :owner"),
    @NamedQuery(name = "TablasDba.findByTableName", query = "SELECT t FROM TablasDba t WHERE t.tableName = :tableName"),
    @NamedQuery(name = "TablasDba.findByTablespaceName", query = "SELECT t FROM TablasDba t WHERE t.tablespaceName = :tablespaceName"),
    @NamedQuery(name = "TablasDba.findByClusterName", query = "SELECT t FROM TablasDba t WHERE t.clusterName = :clusterName"),
    @NamedQuery(name = "TablasDba.findByIotName", query = "SELECT t FROM TablasDba t WHERE t.iotName = :iotName"),
    @NamedQuery(name = "TablasDba.findByStatus", query = "SELECT t FROM TablasDba t WHERE t.status = :status"),
    @NamedQuery(name = "TablasDba.findByPctFree", query = "SELECT t FROM TablasDba t WHERE t.pctFree = :pctFree"),
    @NamedQuery(name = "TablasDba.findByPctUsed", query = "SELECT t FROM TablasDba t WHERE t.pctUsed = :pctUsed"),
    @NamedQuery(name = "TablasDba.findByIniTrans", query = "SELECT t FROM TablasDba t WHERE t.iniTrans = :iniTrans"),
    @NamedQuery(name = "TablasDba.findByMaxTrans", query = "SELECT t FROM TablasDba t WHERE t.maxTrans = :maxTrans"),
    @NamedQuery(name = "TablasDba.findByInitialExtent", query = "SELECT t FROM TablasDba t WHERE t.initialExtent = :initialExtent"),
    @NamedQuery(name = "TablasDba.findByNextExtent", query = "SELECT t FROM TablasDba t WHERE t.nextExtent = :nextExtent"),
    @NamedQuery(name = "TablasDba.findByMinExtents", query = "SELECT t FROM TablasDba t WHERE t.minExtents = :minExtents"),
    @NamedQuery(name = "TablasDba.findByMaxExtents", query = "SELECT t FROM TablasDba t WHERE t.maxExtents = :maxExtents"),
    @NamedQuery(name = "TablasDba.findByPctIncrease", query = "SELECT t FROM TablasDba t WHERE t.pctIncrease = :pctIncrease"),
    @NamedQuery(name = "TablasDba.findByFreelists", query = "SELECT t FROM TablasDba t WHERE t.freelists = :freelists"),
    @NamedQuery(name = "TablasDba.findByFreelistGroups", query = "SELECT t FROM TablasDba t WHERE t.freelistGroups = :freelistGroups"),
    @NamedQuery(name = "TablasDba.findByLogging", query = "SELECT t FROM TablasDba t WHERE t.logging = :logging"),
    @NamedQuery(name = "TablasDba.findByBackedUp", query = "SELECT t FROM TablasDba t WHERE t.backedUp = :backedUp"),
    @NamedQuery(name = "TablasDba.findByNumRows", query = "SELECT t FROM TablasDba t WHERE t.numRows = :numRows"),
    @NamedQuery(name = "TablasDba.findByBlocks", query = "SELECT t FROM TablasDba t WHERE t.blocks = :blocks"),
    @NamedQuery(name = "TablasDba.findByEmptyBlocks", query = "SELECT t FROM TablasDba t WHERE t.emptyBlocks = :emptyBlocks"),
    @NamedQuery(name = "TablasDba.findByAvgSpace", query = "SELECT t FROM TablasDba t WHERE t.avgSpace = :avgSpace"),
    @NamedQuery(name = "TablasDba.findByChainCnt", query = "SELECT t FROM TablasDba t WHERE t.chainCnt = :chainCnt"),
    @NamedQuery(name = "TablasDba.findByAvgRowLen", query = "SELECT t FROM TablasDba t WHERE t.avgRowLen = :avgRowLen"),
    @NamedQuery(name = "TablasDba.findByAvgSpaceFreelistBlocks", query = "SELECT t FROM TablasDba t WHERE t.avgSpaceFreelistBlocks = :avgSpaceFreelistBlocks"),
    @NamedQuery(name = "TablasDba.findByNumFreelistBlocks", query = "SELECT t FROM TablasDba t WHERE t.numFreelistBlocks = :numFreelistBlocks"),
    @NamedQuery(name = "TablasDba.findByDegree", query = "SELECT t FROM TablasDba t WHERE t.degree = :degree"),
    @NamedQuery(name = "TablasDba.findByInstances", query = "SELECT t FROM TablasDba t WHERE t.instances = :instances"),
    @NamedQuery(name = "TablasDba.findByCache", query = "SELECT t FROM TablasDba t WHERE t.cache = :cache"),
    @NamedQuery(name = "TablasDba.findByTableLock", query = "SELECT t FROM TablasDba t WHERE t.tableLock = :tableLock"),
    @NamedQuery(name = "TablasDba.findBySampleSize", query = "SELECT t FROM TablasDba t WHERE t.sampleSize = :sampleSize"),
    @NamedQuery(name = "TablasDba.findByLastAnalyzed", query = "SELECT t FROM TablasDba t WHERE t.lastAnalyzed = :lastAnalyzed"),
    @NamedQuery(name = "TablasDba.findByPartitioned", query = "SELECT t FROM TablasDba t WHERE t.partitioned = :partitioned"),
    @NamedQuery(name = "TablasDba.findByIotType", query = "SELECT t FROM TablasDba t WHERE t.iotType = :iotType"),
    @NamedQuery(name = "TablasDba.findByTemporary", query = "SELECT t FROM TablasDba t WHERE t.temporary = :temporary"),
    @NamedQuery(name = "TablasDba.findBySecondary", query = "SELECT t FROM TablasDba t WHERE t.secondary = :secondary"),
    @NamedQuery(name = "TablasDba.findByNested", query = "SELECT t FROM TablasDba t WHERE t.nested = :nested"),
    @NamedQuery(name = "TablasDba.findByBufferPool", query = "SELECT t FROM TablasDba t WHERE t.bufferPool = :bufferPool"),
    @NamedQuery(name = "TablasDba.findByFlashCache", query = "SELECT t FROM TablasDba t WHERE t.flashCache = :flashCache"),
    @NamedQuery(name = "TablasDba.findByCellFlashCache", query = "SELECT t FROM TablasDba t WHERE t.cellFlashCache = :cellFlashCache"),
    @NamedQuery(name = "TablasDba.findByRowMovement", query = "SELECT t FROM TablasDba t WHERE t.rowMovement = :rowMovement"),
    @NamedQuery(name = "TablasDba.findByGlobalStats", query = "SELECT t FROM TablasDba t WHERE t.globalStats = :globalStats"),
    @NamedQuery(name = "TablasDba.findByUserStats", query = "SELECT t FROM TablasDba t WHERE t.userStats = :userStats"),
    @NamedQuery(name = "TablasDba.findByDuration", query = "SELECT t FROM TablasDba t WHERE t.duration = :duration"),
    @NamedQuery(name = "TablasDba.findBySkipCorrupt", query = "SELECT t FROM TablasDba t WHERE t.skipCorrupt = :skipCorrupt"),
    @NamedQuery(name = "TablasDba.findByMonitoring", query = "SELECT t FROM TablasDba t WHERE t.monitoring = :monitoring"),
    @NamedQuery(name = "TablasDba.findByClusterOwner", query = "SELECT t FROM TablasDba t WHERE t.clusterOwner = :clusterOwner"),
    @NamedQuery(name = "TablasDba.findByDependencies", query = "SELECT t FROM TablasDba t WHERE t.dependencies = :dependencies"),
    @NamedQuery(name = "TablasDba.findByCompression", query = "SELECT t FROM TablasDba t WHERE t.compression = :compression"),
    @NamedQuery(name = "TablasDba.findByCompressFor", query = "SELECT t FROM TablasDba t WHERE t.compressFor = :compressFor"),
    @NamedQuery(name = "TablasDba.findByDropped", query = "SELECT t FROM TablasDba t WHERE t.dropped = :dropped"),
    @NamedQuery(name = "TablasDba.findByReadOnly", query = "SELECT t FROM TablasDba t WHERE t.readOnly = :readOnly"),
    @NamedQuery(name = "TablasDba.findBySegmentCreated", query = "SELECT t FROM TablasDba t WHERE t.segmentCreated = :segmentCreated"),
    @NamedQuery(name = "TablasDba.findByResultCache", query = "SELECT t FROM TablasDba t WHERE t.resultCache = :resultCache")})
public class TablasDba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;
    @Column(name = "CLUSTER_NAME")
    private String clusterName;
    @Column(name = "IOT_NAME")
    private String iotName;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PCT_FREE")
    private BigInteger pctFree;
    @Column(name = "PCT_USED")
    private BigInteger pctUsed;
    @Column(name = "INI_TRANS")
    private BigInteger iniTrans;
    @Column(name = "MAX_TRANS")
    private BigInteger maxTrans;
    @Column(name = "INITIAL_EXTENT")
    private BigInteger initialExtent;
    @Column(name = "NEXT_EXTENT")
    private BigInteger nextExtent;
    @Column(name = "MIN_EXTENTS")
    private BigInteger minExtents;
    @Column(name = "MAX_EXTENTS")
    private BigInteger maxExtents;
    @Column(name = "PCT_INCREASE")
    private BigInteger pctIncrease;
    @Column(name = "FREELISTS")
    private BigInteger freelists;
    @Column(name = "FREELIST_GROUPS")
    private BigInteger freelistGroups;
    @Column(name = "LOGGING")
    private String logging;
    @Column(name = "BACKED_UP")
    private String backedUp;
    @Column(name = "NUM_ROWS")
    private BigInteger numRows;
    @Column(name = "BLOCKS")
    private BigInteger blocks;
    @Column(name = "EMPTY_BLOCKS")
    private BigInteger emptyBlocks;
    @Column(name = "AVG_SPACE")
    private BigInteger avgSpace;
    @Column(name = "CHAIN_CNT")
    private BigInteger chainCnt;
    @Column(name = "AVG_ROW_LEN")
    private BigInteger avgRowLen;
    @Column(name = "AVG_SPACE_FREELIST_BLOCKS")
    private BigInteger avgSpaceFreelistBlocks;
    @Column(name = "NUM_FREELIST_BLOCKS")
    private BigInteger numFreelistBlocks;
    @Column(name = "DEGREE")
    private String degree;
    @Column(name = "INSTANCES")
    private String instances;
    @Column(name = "CACHE")
    private String cache;
    @Column(name = "TABLE_LOCK")
    private String tableLock;
    @Column(name = "SAMPLE_SIZE")
    private BigInteger sampleSize;
    @Column(name = "LAST_ANALYZED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAnalyzed;
    @Column(name = "PARTITIONED")
    private String partitioned;
    @Column(name = "IOT_TYPE")
    private String iotType;
    @Column(name = "TEMPORARY")
    private String temporary;
    @Column(name = "SECONDARY")
    private String secondary;
    @Column(name = "NESTED")
    private String nested;
    @Column(name = "BUFFER_POOL")
    private String bufferPool;
    @Column(name = "FLASH_CACHE")
    private String flashCache;
    @Column(name = "CELL_FLASH_CACHE")
    private String cellFlashCache;
    @Column(name = "ROW_MOVEMENT")
    private String rowMovement;
    @Column(name = "GLOBAL_STATS")
    private String globalStats;
    @Column(name = "USER_STATS")
    private String userStats;
    @Column(name = "DURATION")
    private String duration;
    @Column(name = "SKIP_CORRUPT")
    private String skipCorrupt;
    @Column(name = "MONITORING")
    private String monitoring;
    @Column(name = "CLUSTER_OWNER")
    private String clusterOwner;
    @Column(name = "DEPENDENCIES")
    private String dependencies;
    @Column(name = "COMPRESSION")
    private String compression;
    @Column(name = "COMPRESS_FOR")
    private String compressFor;
    @Column(name = "DROPPED")
    private String dropped;
    @Column(name = "READ_ONLY")
    private String readOnly;
    @Column(name = "SEGMENT_CREATED")
    private String segmentCreated;
    @Column(name = "RESULT_CACHE")
    private String resultCache;

    public TablasDba() {
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

    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getIotName() {
        return iotName;
    }

    public void setIotName(String iotName) {
        this.iotName = iotName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getPctFree() {
        return pctFree;
    }

    public void setPctFree(BigInteger pctFree) {
        this.pctFree = pctFree;
    }

    public BigInteger getPctUsed() {
        return pctUsed;
    }

    public void setPctUsed(BigInteger pctUsed) {
        this.pctUsed = pctUsed;
    }

    public BigInteger getIniTrans() {
        return iniTrans;
    }

    public void setIniTrans(BigInteger iniTrans) {
        this.iniTrans = iniTrans;
    }

    public BigInteger getMaxTrans() {
        return maxTrans;
    }

    public void setMaxTrans(BigInteger maxTrans) {
        this.maxTrans = maxTrans;
    }

    public BigInteger getInitialExtent() {
        return initialExtent;
    }

    public void setInitialExtent(BigInteger initialExtent) {
        this.initialExtent = initialExtent;
    }

    public BigInteger getNextExtent() {
        return nextExtent;
    }

    public void setNextExtent(BigInteger nextExtent) {
        this.nextExtent = nextExtent;
    }

    public BigInteger getMinExtents() {
        return minExtents;
    }

    public void setMinExtents(BigInteger minExtents) {
        this.minExtents = minExtents;
    }

    public BigInteger getMaxExtents() {
        return maxExtents;
    }

    public void setMaxExtents(BigInteger maxExtents) {
        this.maxExtents = maxExtents;
    }

    public BigInteger getPctIncrease() {
        return pctIncrease;
    }

    public void setPctIncrease(BigInteger pctIncrease) {
        this.pctIncrease = pctIncrease;
    }

    public BigInteger getFreelists() {
        return freelists;
    }

    public void setFreelists(BigInteger freelists) {
        this.freelists = freelists;
    }

    public BigInteger getFreelistGroups() {
        return freelistGroups;
    }

    public void setFreelistGroups(BigInteger freelistGroups) {
        this.freelistGroups = freelistGroups;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getBackedUp() {
        return backedUp;
    }

    public void setBackedUp(String backedUp) {
        this.backedUp = backedUp;
    }

    public BigInteger getNumRows() {
        return numRows;
    }

    public void setNumRows(BigInteger numRows) {
        this.numRows = numRows;
    }

    public BigInteger getBlocks() {
        return blocks;
    }

    public void setBlocks(BigInteger blocks) {
        this.blocks = blocks;
    }

    public BigInteger getEmptyBlocks() {
        return emptyBlocks;
    }

    public void setEmptyBlocks(BigInteger emptyBlocks) {
        this.emptyBlocks = emptyBlocks;
    }

    public BigInteger getAvgSpace() {
        return avgSpace;
    }

    public void setAvgSpace(BigInteger avgSpace) {
        this.avgSpace = avgSpace;
    }

    public BigInteger getChainCnt() {
        return chainCnt;
    }

    public void setChainCnt(BigInteger chainCnt) {
        this.chainCnt = chainCnt;
    }

    public BigInteger getAvgRowLen() {
        return avgRowLen;
    }

    public void setAvgRowLen(BigInteger avgRowLen) {
        this.avgRowLen = avgRowLen;
    }

    public BigInteger getAvgSpaceFreelistBlocks() {
        return avgSpaceFreelistBlocks;
    }

    public void setAvgSpaceFreelistBlocks(BigInteger avgSpaceFreelistBlocks) {
        this.avgSpaceFreelistBlocks = avgSpaceFreelistBlocks;
    }

    public BigInteger getNumFreelistBlocks() {
        return numFreelistBlocks;
    }

    public void setNumFreelistBlocks(BigInteger numFreelistBlocks) {
        this.numFreelistBlocks = numFreelistBlocks;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTableLock() {
        return tableLock;
    }

    public void setTableLock(String tableLock) {
        this.tableLock = tableLock;
    }

    public BigInteger getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigInteger sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public String getPartitioned() {
        return partitioned;
    }

    public void setPartitioned(String partitioned) {
        this.partitioned = partitioned;
    }

    public String getIotType() {
        return iotType;
    }

    public void setIotType(String iotType) {
        this.iotType = iotType;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getNested() {
        return nested;
    }

    public void setNested(String nested) {
        this.nested = nested;
    }

    public String getBufferPool() {
        return bufferPool;
    }

    public void setBufferPool(String bufferPool) {
        this.bufferPool = bufferPool;
    }

    public String getFlashCache() {
        return flashCache;
    }

    public void setFlashCache(String flashCache) {
        this.flashCache = flashCache;
    }

    public String getCellFlashCache() {
        return cellFlashCache;
    }

    public void setCellFlashCache(String cellFlashCache) {
        this.cellFlashCache = cellFlashCache;
    }

    public String getRowMovement() {
        return rowMovement;
    }

    public void setRowMovement(String rowMovement) {
        this.rowMovement = rowMovement;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSkipCorrupt() {
        return skipCorrupt;
    }

    public void setSkipCorrupt(String skipCorrupt) {
        this.skipCorrupt = skipCorrupt;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getClusterOwner() {
        return clusterOwner;
    }

    public void setClusterOwner(String clusterOwner) {
        this.clusterOwner = clusterOwner;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getCompressFor() {
        return compressFor;
    }

    public void setCompressFor(String compressFor) {
        this.compressFor = compressFor;
    }

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }

    public String getSegmentCreated() {
        return segmentCreated;
    }

    public void setSegmentCreated(String segmentCreated) {
        this.segmentCreated = segmentCreated;
    }

    public String getResultCache() {
        return resultCache;
    }

    public void setResultCache(String resultCache) {
        this.resultCache = resultCache;
    }
    
}
