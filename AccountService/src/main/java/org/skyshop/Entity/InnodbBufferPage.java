package org.skyshop.Entity;


public class InnodbBufferPage {

    private String poolId;

    private String blockId;

    private String space;

    private String pageNumber;

    private String pageType;

    private String flushType;

    private String fixCount;

    private String hashed;

    private String newestModification;

    private String oldestModification;

    private String accessTime;

    private String tableName;

    private String indexName;

    private String numberRecords;

    private String dataSize;

    private String compressedSize;

    private String pageState;

    private String ioFix;

    private String old;

    private String freePageClock;

    private String stale;

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getSpace() {
        return space;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getPageType() {
        return pageType;
    }

    public void setFlushType(String flushType) {
        this.flushType = flushType;
    }

    public String getFlushType() {
        return flushType;
    }

    public void setFixCount(String fixCount) {
        this.fixCount = fixCount;
    }

    public String getFixCount() {
        return fixCount;
    }

    public void setHashed(String hashed) {
        this.hashed = hashed;
    }

    public String getHashed() {
        return hashed;
    }

    public void setNewestModification(String newestModification) {
        this.newestModification = newestModification;
    }

    public String getNewestModification() {
        return newestModification;
    }

    public void setOldestModification(String oldestModification) {
        this.oldestModification = oldestModification;
    }

    public String getOldestModification() {
        return oldestModification;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setNumberRecords(String numberRecords) {
        this.numberRecords = numberRecords;
    }

    public String getNumberRecords() {
        return numberRecords;
    }

    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    public String getDataSize() {
        return dataSize;
    }

    public void setCompressedSize(String compressedSize) {
        this.compressedSize = compressedSize;
    }

    public String getCompressedSize() {
        return compressedSize;
    }

    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    public String getPageState() {
        return pageState;
    }

    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    public String getIoFix() {
        return ioFix;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getOld() {
        return old;
    }

    public void setFreePageClock(String freePageClock) {
        this.freePageClock = freePageClock;
    }

    public String getFreePageClock() {
        return freePageClock;
    }

    public void setStale(String stale) {
        this.stale = stale;
    }

    public String getStale() {
        return stale;
    }

    @Override
    public String toString() {
        return "InnodbBufferPage{" +
                "poolId=" + poolId + '\'' +
                "blockId=" + blockId + '\'' +
                "space=" + space + '\'' +
                "pageNumber=" + pageNumber + '\'' +
                "pageType=" + pageType + '\'' +
                "flushType=" + flushType + '\'' +
                "fixCount=" + fixCount + '\'' +
                "hashed=" + hashed + '\'' +
                "newestModification=" + newestModification + '\'' +
                "oldestModification=" + oldestModification + '\'' +
                "accessTime=" + accessTime + '\'' +
                "tableName=" + tableName + '\'' +
                "indexName=" + indexName + '\'' +
                "numberRecords=" + numberRecords + '\'' +
                "dataSize=" + dataSize + '\'' +
                "compressedSize=" + compressedSize + '\'' +
                "pageState=" + pageState + '\'' +
                "ioFix=" + ioFix + '\'' +
                "old=" + old + '\'' +
                "freePageClock=" + freePageClock + '\'' +
                "stale=" + stale + '\'' +
                '}';
    }
}
