package com.dfire.platform.alchemy.connectors.tsdb;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author congbai
 * @date 2018/7/12
 */
public class TsdbProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    private String url;

    private Map<String, String> metricValues;

    private String timestampField;

    private List<String> tags;

    private String mapClazz;

    private Integer ioThreadCount;

    private Integer batchPutBufferSize;

    private Integer batchPutConsumerThreadCount;

    private Integer batchPutSize;

    private Integer batchPutTimeLimit;

    private Integer putRequestLimit;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getMetricValues() {
        return metricValues;
    }

    public void setMetricValues(Map<String, String> metricValues) {
        this.metricValues = metricValues;
    }

    public String getTimestampField() {
        return timestampField;
    }

    public void setTimestampField(String timestampField) {
        this.timestampField = timestampField;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getMapClazz() {
        return mapClazz;
    }

    public void setMapClazz(String mapClazz) {
        this.mapClazz = mapClazz;
    }

    public Integer getIoThreadCount() {
        return ioThreadCount;
    }

    public void setIoThreadCount(Integer ioThreadCount) {
        this.ioThreadCount = ioThreadCount;
    }

    public Integer getBatchPutBufferSize() {
        return batchPutBufferSize;
    }

    public void setBatchPutBufferSize(Integer batchPutBufferSize) {
        this.batchPutBufferSize = batchPutBufferSize;
    }

    public Integer getBatchPutConsumerThreadCount() {
        return batchPutConsumerThreadCount;
    }

    public void setBatchPutConsumerThreadCount(Integer batchPutConsumerThreadCount) {
        this.batchPutConsumerThreadCount = batchPutConsumerThreadCount;
    }

    public Integer getBatchPutSize() {
        return batchPutSize;
    }

    public void setBatchPutSize(Integer batchPutSize) {
        this.batchPutSize = batchPutSize;
    }

    public Integer getBatchPutTimeLimit() {
        return batchPutTimeLimit;
    }

    public void setBatchPutTimeLimit(Integer batchPutTimeLimit) {
        this.batchPutTimeLimit = batchPutTimeLimit;
    }

    public Integer getPutRequestLimit() {
        return putRequestLimit;
    }

    public void setPutRequestLimit(Integer putRequestLimit) {
        this.putRequestLimit = putRequestLimit;
    }
}
