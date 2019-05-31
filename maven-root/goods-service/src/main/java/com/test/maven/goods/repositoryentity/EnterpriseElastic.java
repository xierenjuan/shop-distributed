package com.test.maven.goods.repositoryentity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;


@Document(indexName = "peanut",type = "enterprise",shards = 1,replicas = 0, refreshInterval = "-1")
public class EnterpriseElastic {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 创建时间
     */
    @Field
    private Date createDate;

    /**
     * 修改时间
     */
    @Field
    private Date updateDate;

    /**
     * 删除标志
     */
    @Field
    private Boolean dr;

    /**
     *
     */
    @Field
    private String merchantId;

    /**
     *
     */
    @Field
    private String industryId;

    /**
     *
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String merFullName;

    /**
     *
     */
    @Field
    private String merShortName;

    /**
     * 证件号
     */
    @Field
    private String merCertNo;

    /**
     * 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     */
    @Field
    private String merCertType;

    /**
     *
     */
    @Field
    private String legalName;

    /**
     *
     */
    @Field
    private String legalIdCard;

    /**
     * 商户联系人姓名
     */
    @Field
    private String merContactName;

    /**
     * 商户联系人手机
     */
    @Field
    private String merContactPhone;

    /**
     * 商户联系人邮箱
     */
    @Field
    private String merContactEmail;

    /**
     * 商户一级分类
     */
    @Field
    private String merLevel1No;

    /**
     * 商户二级分类
     */
    @Field
    private String merLevel2No;

    /**
     * 商户省
     */
    @Field
    private String merProvince;

    /**
     * 商户市
     */
    @Field
    private String merCity;

    /**
     * 商户区
     */
    @Field
    private String merDistrict;

    /**
     * 商户所在地址(注册地址)
     */
    @Field
    private String merAddress;

    /**
     * 税务登记证编号
     */
    @Field
    private String taxRegistCert;

    /**
     * 开户许可证编号
     */
    @Field
    private String accountLicense;

    /**
     * 组织机构代码证
     */
    @Field
    private String orgCode;

    /**
     * 组织机构代理证有效期
     */
    @Field
    private String orgCodeExpiry;

    /**
     * 组织机构代码证是否长期有效
     */
    @Field
    private Boolean isOrgCodeLong;

    /**
     *
     */
    @Field
    private String cardNo;

    /**
     *
     */
    @Field
    private String headBankCode;

    /**
     *
     */
    @Field
    private String bankCode;

    /**
     *
     */
    @Field
    private String bankProvince;

    /**
     *
     */
    @Field
    private String bankCity;

    /**
     * 开通产品信息
     */
    @Field
    private String productInfo;

    /**
     * 资质影印件，进件的时候把图片的转成易宝需要的
     */
    @Field
    private String fileInfo;

    /**
     *
     */
    @Field
    private String requestNo;

    /**
     *
     */
    @Field
    private String parentMerchantNo;

    /**
     *
     */
    @Field
    private String notifyUrl;


    /**
     * 授权类型
     */
    @Field
    private String merAuthorizeType;

    /**
     * 业务功能
     */
    @Field
    private String businessFunction;

    /**
     * 企业类型，企业/个体/个人
     */
    @Field
    private String enterType;

    /**
     * 法人手机号（个体/个人）
     */
    @Field
    private String merLegalPhone;

    /**
     * 法人邮箱（个体/个人）
     */
    @Field
    private String merLegalEmail;

    /**
     * 商户经营范围
     */
    @Field
    private String merScope;

    /**
     * 企业信息状态
     */
    @Field
    private String enterStatus;

    /**
     *
     */
    @Field
    private String areaId;

    /**
     *
     */
    @Field
    private String areaAddress;

    /**
     * 结算户类型（对公，对私）
     */
    @Field
    private String accountType;

    /**
     *
     */
    @Field
    private String accountName;

    /**
     *
     */
    @Field
    private String bankCodeName;

    /**
     * 进件产生的商户no
     */
    @Field
    private String merchantNo;

    /**
     * 渠道id
     */
    @Field
    private String channelId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getDr() {
        return dr;
    }

    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getMerFullName() {
        return merFullName;
    }

    public void setMerFullName(String merFullName) {
        this.merFullName = merFullName;
    }

    public String getMerShortName() {
        return merShortName;
    }

    public void setMerShortName(String merShortName) {
        this.merShortName = merShortName;
    }

    public String getMerCertNo() {
        return merCertNo;
    }

    public void setMerCertNo(String merCertNo) {
        this.merCertNo = merCertNo;
    }

    public String getMerCertType() {
        return merCertType;
    }

    public void setMerCertType(String merCertType) {
        this.merCertType = merCertType;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalIdCard() {
        return legalIdCard;
    }

    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard;
    }

    public String getMerContactName() {
        return merContactName;
    }

    public void setMerContactName(String merContactName) {
        this.merContactName = merContactName;
    }

    public String getMerContactPhone() {
        return merContactPhone;
    }

    public void setMerContactPhone(String merContactPhone) {
        this.merContactPhone = merContactPhone;
    }

    public String getMerContactEmail() {
        return merContactEmail;
    }

    public void setMerContactEmail(String merContactEmail) {
        this.merContactEmail = merContactEmail;
    }

    public String getMerLevel1No() {
        return merLevel1No;
    }

    public void setMerLevel1No(String merLevel1No) {
        this.merLevel1No = merLevel1No;
    }

    public String getMerLevel2No() {
        return merLevel2No;
    }

    public void setMerLevel2No(String merLevel2No) {
        this.merLevel2No = merLevel2No;
    }

    public String getMerProvince() {
        return merProvince;
    }

    public void setMerProvince(String merProvince) {
        this.merProvince = merProvince;
    }

    public String getMerCity() {
        return merCity;
    }

    public void setMerCity(String merCity) {
        this.merCity = merCity;
    }

    public String getMerDistrict() {
        return merDistrict;
    }

    public void setMerDistrict(String merDistrict) {
        this.merDistrict = merDistrict;
    }

    public String getMerAddress() {
        return merAddress;
    }

    public void setMerAddress(String merAddress) {
        this.merAddress = merAddress;
    }

    public String getTaxRegistCert() {
        return taxRegistCert;
    }

    public void setTaxRegistCert(String taxRegistCert) {
        this.taxRegistCert = taxRegistCert;
    }

    public String getAccountLicense() {
        return accountLicense;
    }

    public void setAccountLicense(String accountLicense) {
        this.accountLicense = accountLicense;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgCodeExpiry() {
        return orgCodeExpiry;
    }

    public void setOrgCodeExpiry(String orgCodeExpiry) {
        this.orgCodeExpiry = orgCodeExpiry;
    }

    public Boolean getOrgCodeLong() {
        return isOrgCodeLong;
    }

    public void setOrgCodeLong(Boolean orgCodeLong) {
        isOrgCodeLong = orgCodeLong;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHeadBankCode() {
        return headBankCode;
    }

    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerAuthorizeType() {
        return merAuthorizeType;
    }

    public void setMerAuthorizeType(String merAuthorizeType) {
        this.merAuthorizeType = merAuthorizeType;
    }

    public String getBusinessFunction() {
        return businessFunction;
    }

    public void setBusinessFunction(String businessFunction) {
        this.businessFunction = businessFunction;
    }

    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public String getMerLegalPhone() {
        return merLegalPhone;
    }

    public void setMerLegalPhone(String merLegalPhone) {
        this.merLegalPhone = merLegalPhone;
    }

    public String getMerLegalEmail() {
        return merLegalEmail;
    }

    public void setMerLegalEmail(String merLegalEmail) {
        this.merLegalEmail = merLegalEmail;
    }

    public String getMerScope() {
        return merScope;
    }

    public void setMerScope(String merScope) {
        this.merScope = merScope;
    }

    public String getEnterStatus() {
        return enterStatus;
    }

    public void setEnterStatus(String enterStatus) {
        this.enterStatus = enterStatus;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankCodeName() {
        return bankCodeName;
    }

    public void setBankCodeName(String bankCodeName) {
        this.bankCodeName = bankCodeName;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
