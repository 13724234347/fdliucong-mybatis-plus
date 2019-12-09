package com.fd.liucong.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author generator
 */
@ApiModel(value = "")
@TableName("fdft_fastdfs_file")
public class FastdfsFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "fdfs_pkid", type = IdType.AUTO)
    private Integer fdfsPkid;

    @ApiModelProperty(value = "文件CODE")
    @TableField("fdfs_code")
    private String fdfsCode;

    @ApiModelProperty(value = "文件名称")
    @TableField("fdfs_file_name")
    private String fdfsFileName;

    @ApiModelProperty(value = "文件描述")
    @TableField("fdfs_file_desc")
    private String fdfsFileDesc;

    @ApiModelProperty(value = "文件地址")
    @TableField("fdfs_file_url")
    private String fdfsFileUrl;

    @ApiModelProperty(value = "文件全路径")
    @TableField("fdfs_file_full_url")
    private String fdfsFileFullUrl;

    @ApiModelProperty(value = "创建时间")
    @TableField("cree_time")
    private Date creeTime;

    @ApiModelProperty(value = "创建用户")
    @TableField("cree_user")
    private String creeUser;

    @ApiModelProperty(value = "修改时间")
    @TableField("mody_time")
    private Date modyTime;

    @ApiModelProperty(value = "修改用户")
    @TableField("mody_user")
    private String modyUser;


    public Integer getFdfsPkid() {
        return fdfsPkid;
    }

    public FastdfsFile setFdfsPkid(Integer fdfsPkid) {
        this.fdfsPkid = fdfsPkid;
        return this;
    }

    public String getFdfsCode() {
        return fdfsCode;
    }

    public FastdfsFile setFdfsCode(String fdfsCode) {
        this.fdfsCode = fdfsCode;
        return this;
    }

    public String getFdfsFileName() {
        return fdfsFileName;
    }

    public FastdfsFile setFdfsFileName(String fdfsFileName) {
        this.fdfsFileName = fdfsFileName;
        return this;
    }

    public String getFdfsFileDesc() {
        return fdfsFileDesc;
    }

    public FastdfsFile setFdfsFileDesc(String fdfsFileDesc) {
        this.fdfsFileDesc = fdfsFileDesc;
        return this;
    }

    public String getFdfsFileUrl() {
        return fdfsFileUrl;
    }

    public FastdfsFile setFdfsFileUrl(String fdfsFileUrl) {
        this.fdfsFileUrl = fdfsFileUrl;
        return this;
    }

    public String getFdfsFileFullUrl() {
        return fdfsFileFullUrl;
    }

    public FastdfsFile setFdfsFileFullUrl(String fdfsFileFullUrl) {
        this.fdfsFileFullUrl = fdfsFileFullUrl;
        return this;
    }

    public Date getCreeTime() {
        return creeTime;
    }

    public FastdfsFile setCreeTime(Date creeTime) {
        this.creeTime = creeTime;
        return this;
    }

    public String getCreeUser() {
        return creeUser;
    }

    public FastdfsFile setCreeUser(String creeUser) {
        this.creeUser = creeUser;
        return this;
    }

    public Date getModyTime() {
        return modyTime;
    }

    public FastdfsFile setModyTime(Date modyTime) {
        this.modyTime = modyTime;
        return this;
    }

    public String getModyUser() {
        return modyUser;
    }

    public FastdfsFile setModyUser(String modyUser) {
        this.modyUser = modyUser;
        return this;
    }

    @Override
    public String toString() {
        return "FastdfsFile{" +
                ", fdfsPkid=" + fdfsPkid +
                ", fdfsCode=" + fdfsCode +
                ", fdfsFileName=" + fdfsFileName +
                ", fdfsFileDesc=" + fdfsFileDesc +
                ", fdfsFileUrl=" + fdfsFileUrl +
                ", fdfsFileFullUrl=" + fdfsFileFullUrl +
                ", creeTime=" + creeTime +
                ", creeUser=" + creeUser +
                ", modyTime=" + modyTime +
                ", modyUser=" + modyUser +
                "}";
    }


}
