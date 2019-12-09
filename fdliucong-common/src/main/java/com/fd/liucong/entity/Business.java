package com.fd.liucong.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 商家表
 * </p>
 *
 * @author generator
 */
@ApiModel(value = "商家表")
@TableName("ai_business")
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公司id")
    @TableId(value = "bid", type = IdType.AUTO)
    private Integer bid;

    @ApiModelProperty(value = "代理商id")
    @TableField("aid")
    private Integer aid;

    @ApiModelProperty(value = "手机号码")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "企业logo")
    @TableField("business_logo")
    private String businessLogo;

    @ApiModelProperty(value = "真实姓名")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty(value = "6：正常使用；7：停止使用；")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "用户角色id")
    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty(value = "企业名称")
    @TableField("company_name")
    private String companyName;

    @ApiModelProperty(value = "企业地址")
    @TableField("company_addr")
    private String companyAddr;

    @ApiModelProperty(value = "企业简称")
    @TableField("company")
    private String company;

    @ApiModelProperty(value = "公司默认折扣，默认是10折")
    @TableField("discount_rate")
    private Integer discountRate;

    @ApiModelProperty(value = "二级分销开关，默认关闭")
    @TableField("dis_flag")
    private String disFlag;

    @ApiModelProperty(value = "外部人员名片申请开关，默认关闭")
    @TableField("dis_apply_flag")
    private String disApplyFlag;

    @ApiModelProperty(value = "一级分销百分比")
    @TableField("dis_first_level")
    private Integer disFirstLevel;

    @ApiModelProperty(value = "二级分销百分比")
    @TableField("dis_second_level")
    private Integer disSecondLevel;

    @ApiModelProperty(value = "积分")
    @TableField("score")
    private Integer score;

    @ApiModelProperty(value = "经度")
    @TableField("longitude")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    @TableField("latitude")
    private String latitude;

    @ApiModelProperty(value = "加入公司的小程序二维码")
    @TableField("company_xcx_ewm")
    private String companyXcxEwm;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Integer createTime;

    @ApiModelProperty(value = "代理商确认商家所有数据正常后，即可开启红包的功能：0：为开启；1：已开启；")
    @TableField("red_confirm_flag")
    private String redConfirmFlag;

    @ApiModelProperty(value = "行业类型")
    @TableField("biid")
    private Integer biid;

    @ApiModelProperty(value = "开启红包功能: 0: 关闭; 1: 开启")
    @TableField("red_status")
    private String redStatus;

    @ApiModelProperty(value = "大额限额状态及金额: 0: 关闭大额限额; 非0: 开启大额限额并设定额度")
    @TableField("big_amount")
    private BigDecimal bigAmount;

    @ApiModelProperty(value = "商家名片状态：1：正常使用；2：停止使用；")
    @TableField("business_status")
    private String businessStatus;

    @ApiModelProperty(value = "名片数量")
    @TableField("card_num")
    private Integer cardNum;

    @ApiModelProperty(value = "小程序类型id")
    @TableField("bxtid")
    private Integer bxtid;

    @ApiModelProperty(value = "默认收货时间(7天时间戳)")
    @TableField("default_receipt_time")
    private Integer defaultReceiptTime;

    @ApiModelProperty(value = "订单收货后，默认订单完成时间（5天的时间戳）；")
    @TableField("default_finish_time")
    private Integer defaultFinishTime;

    @ApiModelProperty(value = "兼职人员职位")
    @TableField("default_part_job_position")
    private String defaultPartJobPosition;

    @ApiModelProperty(value = "使用结束时间")
    @TableField("end_time")
    private Integer endTime;

    @ApiModelProperty(value = "红包祝福语")
    @TableField("red_wishing")
    private String redWishing;

    @ApiModelProperty(value = "红包活动名称")
    @TableField("red_act_name")
    private String redActName;

    @ApiModelProperty(value = "红包备注")
    @TableField("red_remark")
    private String redRemark;

    @ApiModelProperty(value = "授权类型: 1: 授权成功; 2: 未授权: 3: 更新授权; 4: 授权异常")
    @TableField("gzh_authorization")
    private String gzhAuthorization;

    @ApiModelProperty(value = "授权类型: 1: 授权成功; 2: 未授权: 3: 更新授权; 4: 授权异常")
    @TableField("xcx_authorization")
    private String xcxAuthorization;

    @ApiModelProperty(value = "圈子开启状态: 1: 开启 , 2: 关闭")
    @TableField("cricle_status")
    private String cricleStatus;

    @ApiModelProperty(value = "资源开开启状态：1：开通；2：关闭；")
    @TableField("library_status")
    private String libraryStatus;

    @ApiModelProperty(value = "是否可以发布任务商品: 1: 可以; 2: 不可以")
    @TableField("publish_task")
    private String publishTask;

    @ApiModelProperty(value = "是否可以发布积分商品: 1:可以；2：不可以；")
    @TableField("publish_score")
    private String publishScore;

    @ApiModelProperty(value = "发票抬头")
    @TableField("tax_title")
    private String taxTitle;

    @ApiModelProperty(value = "纳税号")
    @TableField("tax_num")
    private String taxNum;

    @ApiModelProperty(value = "开户银行")
    @TableField("tax_bank")
    private String taxBank;

    @ApiModelProperty(value = "银行账号")
    @TableField("bank_num")
    private String bankNum;

    @ApiModelProperty(value = "纳税企业地址")
    @TableField("tax_addr")
    private String taxAddr;

    @ApiModelProperty(value = "纳税企业电话")
    @TableField("tax_phone")
    private String taxPhone;

    @ApiModelProperty(value = "积分商城开关，1：打开；2：关闭；")
    @TableField("score_flag")
    private String scoreFlag;


    public Integer getBid() {
        return bid;
    }

    public Business setBid(Integer bid) {
        this.bid = bid;
        return this;
    }

    public Integer getAid() {
        return aid;
    }

    public Business setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public String getBusinessName() {
        return businessName;
    }

    public Business setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Business setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getBusinessLogo() {
        return businessLogo;
    }

    public Business setBusinessLogo(String businessLogo) {
        this.businessLogo = businessLogo;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public Business setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Business setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Business setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Business setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public Business setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Business setCompany(String company) {
        this.company = company;
        return this;
    }

    public Integer getDiscountRate() {
        return discountRate;
    }

    public Business setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public String getDisFlag() {
        return disFlag;
    }

    public Business setDisFlag(String disFlag) {
        this.disFlag = disFlag;
        return this;
    }

    public String getDisApplyFlag() {
        return disApplyFlag;
    }

    public Business setDisApplyFlag(String disApplyFlag) {
        this.disApplyFlag = disApplyFlag;
        return this;
    }

    public Integer getDisFirstLevel() {
        return disFirstLevel;
    }

    public Business setDisFirstLevel(Integer disFirstLevel) {
        this.disFirstLevel = disFirstLevel;
        return this;
    }

    public Integer getDisSecondLevel() {
        return disSecondLevel;
    }

    public Business setDisSecondLevel(Integer disSecondLevel) {
        this.disSecondLevel = disSecondLevel;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Business setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public Business setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public Business setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getCompanyXcxEwm() {
        return companyXcxEwm;
    }

    public Business setCompanyXcxEwm(String companyXcxEwm) {
        this.companyXcxEwm = companyXcxEwm;
        return this;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Business setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getRedConfirmFlag() {
        return redConfirmFlag;
    }

    public Business setRedConfirmFlag(String redConfirmFlag) {
        this.redConfirmFlag = redConfirmFlag;
        return this;
    }

    public Integer getBiid() {
        return biid;
    }

    public Business setBiid(Integer biid) {
        this.biid = biid;
        return this;
    }

    public String getRedStatus() {
        return redStatus;
    }

    public Business setRedStatus(String redStatus) {
        this.redStatus = redStatus;
        return this;
    }

    public BigDecimal getBigAmount() {
        return bigAmount;
    }

    public Business setBigAmount(BigDecimal bigAmount) {
        this.bigAmount = bigAmount;
        return this;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public Business setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public Business setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
        return this;
    }

    public Integer getBxtid() {
        return bxtid;
    }

    public Business setBxtid(Integer bxtid) {
        this.bxtid = bxtid;
        return this;
    }

    public Integer getDefaultReceiptTime() {
        return defaultReceiptTime;
    }

    public Business setDefaultReceiptTime(Integer defaultReceiptTime) {
        this.defaultReceiptTime = defaultReceiptTime;
        return this;
    }

    public Integer getDefaultFinishTime() {
        return defaultFinishTime;
    }

    public Business setDefaultFinishTime(Integer defaultFinishTime) {
        this.defaultFinishTime = defaultFinishTime;
        return this;
    }

    public String getDefaultPartJobPosition() {
        return defaultPartJobPosition;
    }

    public Business setDefaultPartJobPosition(String defaultPartJobPosition) {
        this.defaultPartJobPosition = defaultPartJobPosition;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public Business setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getRedWishing() {
        return redWishing;
    }

    public Business setRedWishing(String redWishing) {
        this.redWishing = redWishing;
        return this;
    }

    public String getRedActName() {
        return redActName;
    }

    public Business setRedActName(String redActName) {
        this.redActName = redActName;
        return this;
    }

    public String getRedRemark() {
        return redRemark;
    }

    public Business setRedRemark(String redRemark) {
        this.redRemark = redRemark;
        return this;
    }

    public String getGzhAuthorization() {
        return gzhAuthorization;
    }

    public Business setGzhAuthorization(String gzhAuthorization) {
        this.gzhAuthorization = gzhAuthorization;
        return this;
    }

    public String getXcxAuthorization() {
        return xcxAuthorization;
    }

    public Business setXcxAuthorization(String xcxAuthorization) {
        this.xcxAuthorization = xcxAuthorization;
        return this;
    }

    public String getCricleStatus() {
        return cricleStatus;
    }

    public Business setCricleStatus(String cricleStatus) {
        this.cricleStatus = cricleStatus;
        return this;
    }

    public String getLibraryStatus() {
        return libraryStatus;
    }

    public Business setLibraryStatus(String libraryStatus) {
        this.libraryStatus = libraryStatus;
        return this;
    }

    public String getPublishTask() {
        return publishTask;
    }

    public Business setPublishTask(String publishTask) {
        this.publishTask = publishTask;
        return this;
    }

    public String getPublishScore() {
        return publishScore;
    }

    public Business setPublishScore(String publishScore) {
        this.publishScore = publishScore;
        return this;
    }

    public String getTaxTitle() {
        return taxTitle;
    }

    public Business setTaxTitle(String taxTitle) {
        this.taxTitle = taxTitle;
        return this;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public Business setTaxNum(String taxNum) {
        this.taxNum = taxNum;
        return this;
    }

    public String getTaxBank() {
        return taxBank;
    }

    public Business setTaxBank(String taxBank) {
        this.taxBank = taxBank;
        return this;
    }

    public String getBankNum() {
        return bankNum;
    }

    public Business setBankNum(String bankNum) {
        this.bankNum = bankNum;
        return this;
    }

    public String getTaxAddr() {
        return taxAddr;
    }

    public Business setTaxAddr(String taxAddr) {
        this.taxAddr = taxAddr;
        return this;
    }

    public String getTaxPhone() {
        return taxPhone;
    }

    public Business setTaxPhone(String taxPhone) {
        this.taxPhone = taxPhone;
        return this;
    }

    public String getScoreFlag() {
        return scoreFlag;
    }

    public Business setScoreFlag(String scoreFlag) {
        this.scoreFlag = scoreFlag;
        return this;
    }

    @Override
    public String toString() {
        return "Business{" +
                ", bid=" + bid +
                ", aid=" + aid +
                ", businessName=" + businessName +
                ", password=" + password +
                ", businessLogo=" + businessLogo +
                ", realName=" + realName +
                ", status=" + status +
                ", roleId=" + roleId +
                ", companyName=" + companyName +
                ", companyAddr=" + companyAddr +
                ", company=" + company +
                ", discountRate=" + discountRate +
                ", disFlag=" + disFlag +
                ", disApplyFlag=" + disApplyFlag +
                ", disFirstLevel=" + disFirstLevel +
                ", disSecondLevel=" + disSecondLevel +
                ", score=" + score +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", companyXcxEwm=" + companyXcxEwm +
                ", createTime=" + createTime +
                ", redConfirmFlag=" + redConfirmFlag +
                ", biid=" + biid +
                ", redStatus=" + redStatus +
                ", bigAmount=" + bigAmount +
                ", businessStatus=" + businessStatus +
                ", cardNum=" + cardNum +
                ", bxtid=" + bxtid +
                ", defaultReceiptTime=" + defaultReceiptTime +
                ", defaultFinishTime=" + defaultFinishTime +
                ", defaultPartJobPosition=" + defaultPartJobPosition +
                ", endTime=" + endTime +
                ", redWishing=" + redWishing +
                ", redActName=" + redActName +
                ", redRemark=" + redRemark +
                ", gzhAuthorization=" + gzhAuthorization +
                ", xcxAuthorization=" + xcxAuthorization +
                ", cricleStatus=" + cricleStatus +
                ", libraryStatus=" + libraryStatus +
                ", publishTask=" + publishTask +
                ", publishScore=" + publishScore +
                ", taxTitle=" + taxTitle +
                ", taxNum=" + taxNum +
                ", taxBank=" + taxBank +
                ", bankNum=" + bankNum +
                ", taxAddr=" + taxAddr +
                ", taxPhone=" + taxPhone +
                ", scoreFlag=" + scoreFlag +
                "}";
    }

}
