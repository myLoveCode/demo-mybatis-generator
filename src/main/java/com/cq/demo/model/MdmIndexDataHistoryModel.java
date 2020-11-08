package com.cq.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2020-11-08
 */
@TableName("mdm_index_data_history")
public class MdmIndexDataHistoryModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 展示数据领域的拼音
     */
    private String indexKey;

    /**
     * 值
     */
    private Integer indexValue;

    /**
     * 类型
     */
    private String category;

    /**
     * 前端图标
     */
    private String indexIcon;

    /**
     * 前端展示的中文
     */
    private String indexLabel;

    /**
     * 是否删除 1-是 0-否
     */
    private String delFlag;

    /**
     * 来源(1:华西新数据，2医联体)
     */
    private Integer businessType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getIndexKey() {
        return indexKey;
    }

    public void setIndexKey(String indexKey) {
        this.indexKey = indexKey;
    }
    public Integer getIndexValue() {
        return indexValue;
    }

    public void setIndexValue(Integer indexValue) {
        this.indexValue = indexValue;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getIndexIcon() {
        return indexIcon;
    }

    public void setIndexIcon(String indexIcon) {
        this.indexIcon = indexIcon;
    }
    public String getIndexLabel() {
        return indexLabel;
    }

    public void setIndexLabel(String indexLabel) {
        this.indexLabel = indexLabel;
    }
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MdmIndexDataHistoryModel{" +
            "id=" + id +
            ", indexKey=" + indexKey +
            ", indexValue=" + indexValue +
            ", category=" + category +
            ", indexIcon=" + indexIcon +
            ", indexLabel=" + indexLabel +
            ", delFlag=" + delFlag +
            ", businessType=" + businessType +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
