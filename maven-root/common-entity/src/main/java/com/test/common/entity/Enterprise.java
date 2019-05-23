package com.test.common.entity;

import java.util.Date;

public class Enterprise {
    /**
     * 主键
     */
    private String id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 删除标志
     */
    private Boolean dr;

    /**
     * 
     */
    private String merchantId;

    /**
     * 
     */
    private String industryId;

    /**
     * 
     */
    private String merFullName;

    /**
     * 
     */
    private String merShortName;

    /**
     * 证件号
     */
    private String merCertNo;

    /**
     * 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     */
    private String merCertType;

    /**
     * 
     */
    private String legalName;

    /**
     * 
     */
    private String legalIdCard;

    /**
     * 商户联系人姓名
     */
    private String merContactName;

    /**
     * 商户联系人手机
     */
    private String merContactPhone;

    /**
     * 商户联系人邮箱
     */
    private String merContactEmail;

    /**
     * 商户一级分类
     */
    private String merLevel1No;

    /**
     * 商户二级分类
     */
    private String merLevel2No;

    /**
     * 商户省
     */
    private String merProvince;

    /**
     * 商户市
     */
    private String merCity;

    /**
     * 商户区
     */
    private String merDistrict;

    /**
     * 商户所在地址(注册地址)
     */
    private String merAddress;

    /**
     * 税务登记证编号
     */
    private String taxRegistCert;

    /**
     * 开户许可证编号
     */
    private String accountLicense;

    /**
     * 组织机构代码证
     */
    private String orgCode;

    /**
     * 组织机构代理证有效期
     */
    private String orgCodeExpiry;

    /**
     * 组织机构代码证是否长期有效
     */
    private Boolean isOrgCodeLong;

    /**
     * 
     */
    private String cardNo;

    /**
     * 
     */
    private String headBankCode;

    /**
     * 
     */
    private String bankCode;

    /**
     * 
     */
    private String bankProvince;

    /**
     * 
     */
    private String bankCity;

    /**
     * 开通产品信息
     */
    private String productInfo;

    /**
     * 资质影印件，进件的时候把图片的转成易宝需要的
     */
    private String fileInfo;

    /**
     * 
     */
    private String requestNo;

    /**
     * 
     */
    private String parentMerchantNo;

    /**
     * 
     */
    private String notifyUrl;

    /**
     * 授权类型
     */
    private String merAuthorizeType;

    /**
     * 业务功能
     */
    private String businessFunction;

    /**
     * 企业类型，企业/个体/个人
     */
    private String enterType;

    /**
     * 法人手机号（个体/个人）
     */
    private String merLegalPhone;

    /**
     * 法人邮箱（个体/个人）
     */
    private String merLegalEmail;

    /**
     * 商户经营范围
     */
    private String merScope;

    /**
     * 企业信息状态
     */
    private String enterStatus;

    /**
     * 
     */
    private String areaId;

    /**
     * 
     */
    private String areaAddress;

    /**
     * 结算户类型（对公，对私）
     */
    private String accountType;

    /**
     * 
     */
    private String accountName;

    /**
     * 
     */
    private String bankCodeName;

    /**
     * 进件产生的商户no
     */
    private String merchantNo;

    /**
     * 渠道id
     */
    private String channelId;

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改时间
     * @return update_date 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 修改时间
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 删除标志
     * @return dr 删除标志
     */
    public Boolean getDr() {
        return dr;
    }

    /**
     * 删除标志
     * @param dr 删除标志
     */
    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    /**
     * 
     * @return merchant_id 
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 
     * @param merchantId 
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * 
     * @return industry_id 
     */
    public String getIndustryId() {
        return industryId;
    }

    /**
     * 
     * @param industryId 
     */
    public void setIndustryId(String industryId) {
        this.industryId = industryId == null ? null : industryId.trim();
    }

    /**
     * 
     * @return mer_full_name 
     */
    public String getMerFullName() {
        return merFullName;
    }

    /**
     * 
     * @param merFullName 
     */
    public void setMerFullName(String merFullName) {
        this.merFullName = merFullName == null ? null : merFullName.trim();
    }

    /**
     * 
     * @return mer_short_name 
     */
    public String getMerShortName() {
        return merShortName;
    }

    /**
     * 
     * @param merShortName 
     */
    public void setMerShortName(String merShortName) {
        this.merShortName = merShortName == null ? null : merShortName.trim();
    }

    /**
     * 证件号
     * @return mer_cert_no 证件号
     */
    public String getMerCertNo() {
        return merCertNo;
    }

    /**
     * 证件号
     * @param merCertNo 证件号
     */
    public void setMerCertNo(String merCertNo) {
        this.merCertNo = merCertNo == null ? null : merCertNo.trim();
    }

    /**
     * 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     * @return mer_cert_type 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     */
    public String getMerCertType() {
        return merCertType;
    }

    /**
     * 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     * @param merCertType 证件类型，UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE＝营业执照
     */
    public void setMerCertType(String merCertType) {
        this.merCertType = merCertType == null ? null : merCertType.trim();
    }

    /**
     * 
     * @return legal_name 
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * 
     * @param legalName 
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    /**
     * 
     * @return legal_id_card 
     */
    public String getLegalIdCard() {
        return legalIdCard;
    }

    /**
     * 
     * @param legalIdCard 
     */
    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard == null ? null : legalIdCard.trim();
    }

    /**
     * 商户联系人姓名
     * @return mer_contact_name 商户联系人姓名
     */
    public String getMerContactName() {
        return merContactName;
    }

    /**
     * 商户联系人姓名
     * @param merContactName 商户联系人姓名
     */
    public void setMerContactName(String merContactName) {
        this.merContactName = merContactName == null ? null : merContactName.trim();
    }

    /**
     * 商户联系人手机
     * @return mer_contact_phone 商户联系人手机
     */
    public String getMerContactPhone() {
        return merContactPhone;
    }

    /**
     * 商户联系人手机
     * @param merContactPhone 商户联系人手机
     */
    public void setMerContactPhone(String merContactPhone) {
        this.merContactPhone = merContactPhone == null ? null : merContactPhone.trim();
    }

    /**
     * 商户联系人邮箱
     * @return mer_contact_email 商户联系人邮箱
     */
    public String getMerContactEmail() {
        return merContactEmail;
    }

    /**
     * 商户联系人邮箱
     * @param merContactEmail 商户联系人邮箱
     */
    public void setMerContactEmail(String merContactEmail) {
        this.merContactEmail = merContactEmail == null ? null : merContactEmail.trim();
    }

    /**
     * 商户一级分类
     * @return mer_level1_no 商户一级分类
     */
    public String getMerLevel1No() {
        return merLevel1No;
    }

    /**
     * 商户一级分类
     * @param merLevel1No 商户一级分类
     */
    public void setMerLevel1No(String merLevel1No) {
        this.merLevel1No = merLevel1No == null ? null : merLevel1No.trim();
    }

    /**
     * 商户二级分类
     * @return mer_level2_no 商户二级分类
     */
    public String getMerLevel2No() {
        return merLevel2No;
    }

    /**
     * 商户二级分类
     * @param merLevel2No 商户二级分类
     */
    public void setMerLevel2No(String merLevel2No) {
        this.merLevel2No = merLevel2No == null ? null : merLevel2No.trim();
    }

    /**
     * 商户省
     * @return mer_province 商户省
     */
    public String getMerProvince() {
        return merProvince;
    }

    /**
     * 商户省
     * @param merProvince 商户省
     */
    public void setMerProvince(String merProvince) {
        this.merProvince = merProvince == null ? null : merProvince.trim();
    }

    /**
     * 商户市
     * @return mer_city 商户市
     */
    public String getMerCity() {
        return merCity;
    }

    /**
     * 商户市
     * @param merCity 商户市
     */
    public void setMerCity(String merCity) {
        this.merCity = merCity == null ? null : merCity.trim();
    }

    /**
     * 商户区
     * @return mer_district 商户区
     */
    public String getMerDistrict() {
        return merDistrict;
    }

    /**
     * 商户区
     * @param merDistrict 商户区
     */
    public void setMerDistrict(String merDistrict) {
        this.merDistrict = merDistrict == null ? null : merDistrict.trim();
    }

    /**
     * 商户所在地址(注册地址)
     * @return mer_address 商户所在地址(注册地址)
     */
    public String getMerAddress() {
        return merAddress;
    }

    /**
     * 商户所在地址(注册地址)
     * @param merAddress 商户所在地址(注册地址)
     */
    public void setMerAddress(String merAddress) {
        this.merAddress = merAddress == null ? null : merAddress.trim();
    }

    /**
     * 税务登记证编号
     * @return tax_regist_cert 税务登记证编号
     */
    public String getTaxRegistCert() {
        return taxRegistCert;
    }

    /**
     * 税务登记证编号
     * @param taxRegistCert 税务登记证编号
     */
    public void setTaxRegistCert(String taxRegistCert) {
        this.taxRegistCert = taxRegistCert == null ? null : taxRegistCert.trim();
    }

    /**
     * 开户许可证编号
     * @return account_license 开户许可证编号
     */
    public String getAccountLicense() {
        return accountLicense;
    }

    /**
     * 开户许可证编号
     * @param accountLicense 开户许可证编号
     */
    public void setAccountLicense(String accountLicense) {
        this.accountLicense = accountLicense == null ? null : accountLicense.trim();
    }

    /**
     * 组织机构代码证
     * @return org_code 组织机构代码证
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 组织机构代码证
     * @param orgCode 组织机构代码证
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 组织机构代理证有效期
     * @return org_code_expiry 组织机构代理证有效期
     */
    public String getOrgCodeExpiry() {
        return orgCodeExpiry;
    }

    /**
     * 组织机构代理证有效期
     * @param orgCodeExpiry 组织机构代理证有效期
     */
    public void setOrgCodeExpiry(String orgCodeExpiry) {
        this.orgCodeExpiry = orgCodeExpiry == null ? null : orgCodeExpiry.trim();
    }

    /**
     * 组织机构代码证是否长期有效
     * @return is_org_code_long 组织机构代码证是否长期有效
     */
    public Boolean getIsOrgCodeLong() {
        return isOrgCodeLong;
    }

    /**
     * 组织机构代码证是否长期有效
     * @param isOrgCodeLong 组织机构代码证是否长期有效
     */
    public void setIsOrgCodeLong(Boolean isOrgCodeLong) {
        this.isOrgCodeLong = isOrgCodeLong;
    }

    /**
     * 
     * @return card_no 
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 
     * @param cardNo 
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 
     * @return head_bank_code 
     */
    public String getHeadBankCode() {
        return headBankCode;
    }

    /**
     * 
     * @param headBankCode 
     */
    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode == null ? null : headBankCode.trim();
    }

    /**
     * 
     * @return bank_code 
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 
     * @param bankCode 
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * 
     * @return bank_province 
     */
    public String getBankProvince() {
        return bankProvince;
    }

    /**
     * 
     * @param bankProvince 
     */
    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    /**
     * 
     * @return bank_city 
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * 
     * @param bankCity 
     */
    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    /**
     * 开通产品信息
     * @return product_info 开通产品信息
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * 开通产品信息
     * @param productInfo 开通产品信息
     */
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
    }

    /**
     * 资质影印件，进件的时候把图片的转成易宝需要的
     * @return file_info 资质影印件，进件的时候把图片的转成易宝需要的
     */
    public String getFileInfo() {
        return fileInfo;
    }

    /**
     * 资质影印件，进件的时候把图片的转成易宝需要的
     * @param fileInfo 资质影印件，进件的时候把图片的转成易宝需要的
     */
    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo == null ? null : fileInfo.trim();
    }

    /**
     * 
     * @return request_no 
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     * 
     * @param requestNo 
     */
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    /**
     * 
     * @return parent_merchant_no 
     */
    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    /**
     * 
     * @param parentMerchantNo 
     */
    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo == null ? null : parentMerchantNo.trim();
    }

    /**
     * 
     * @return notify_url 
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 
     * @param notifyUrl 
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * 授权类型
     * @return mer_authorize_type 授权类型
     */
    public String getMerAuthorizeType() {
        return merAuthorizeType;
    }

    /**
     * 授权类型
     * @param merAuthorizeType 授权类型
     */
    public void setMerAuthorizeType(String merAuthorizeType) {
        this.merAuthorizeType = merAuthorizeType == null ? null : merAuthorizeType.trim();
    }

    /**
     * 业务功能
     * @return business_function 业务功能
     */
    public String getBusinessFunction() {
        return businessFunction;
    }

    /**
     * 业务功能
     * @param businessFunction 业务功能
     */
    public void setBusinessFunction(String businessFunction) {
        this.businessFunction = businessFunction == null ? null : businessFunction.trim();
    }

    /**
     * 企业类型，企业/个体/个人
     * @return enter_type 企业类型，企业/个体/个人
     */
    public String getEnterType() {
        return enterType;
    }

    /**
     * 企业类型，企业/个体/个人
     * @param enterType 企业类型，企业/个体/个人
     */
    public void setEnterType(String enterType) {
        this.enterType = enterType == null ? null : enterType.trim();
    }

    /**
     * 法人手机号（个体/个人）
     * @return mer_legal_phone 法人手机号（个体/个人）
     */
    public String getMerLegalPhone() {
        return merLegalPhone;
    }

    /**
     * 法人手机号（个体/个人）
     * @param merLegalPhone 法人手机号（个体/个人）
     */
    public void setMerLegalPhone(String merLegalPhone) {
        this.merLegalPhone = merLegalPhone == null ? null : merLegalPhone.trim();
    }

    /**
     * 法人邮箱（个体/个人）
     * @return mer_legal_email 法人邮箱（个体/个人）
     */
    public String getMerLegalEmail() {
        return merLegalEmail;
    }

    /**
     * 法人邮箱（个体/个人）
     * @param merLegalEmail 法人邮箱（个体/个人）
     */
    public void setMerLegalEmail(String merLegalEmail) {
        this.merLegalEmail = merLegalEmail == null ? null : merLegalEmail.trim();
    }

    /**
     * 商户经营范围
     * @return mer_scope 商户经营范围
     */
    public String getMerScope() {
        return merScope;
    }

    /**
     * 商户经营范围
     * @param merScope 商户经营范围
     */
    public void setMerScope(String merScope) {
        this.merScope = merScope == null ? null : merScope.trim();
    }

    /**
     * 企业信息状态
     * @return enter_status 企业信息状态
     */
    public String getEnterStatus() {
        return enterStatus;
    }

    /**
     * 企业信息状态
     * @param enterStatus 企业信息状态
     */
    public void setEnterStatus(String enterStatus) {
        this.enterStatus = enterStatus == null ? null : enterStatus.trim();
    }

    /**
     * 
     * @return area_id 
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 
     * @param areaId 
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 
     * @return area_address 
     */
    public String getAreaAddress() {
        return areaAddress;
    }

    /**
     * 
     * @param areaAddress 
     */
    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress == null ? null : areaAddress.trim();
    }

    /**
     * 结算户类型（对公，对私）
     * @return account_type 结算户类型（对公，对私）
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 结算户类型（对公，对私）
     * @param accountType 结算户类型（对公，对私）
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 
     * @return account_name 
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 
     * @param accountName 
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * 
     * @return bank_code_name 
     */
    public String getBankCodeName() {
        return bankCodeName;
    }

    /**
     * 
     * @param bankCodeName 
     */
    public void setBankCodeName(String bankCodeName) {
        this.bankCodeName = bankCodeName == null ? null : bankCodeName.trim();
    }

    /**
     * 进件产生的商户no
     * @return merchant_no 进件产生的商户no
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 进件产生的商户no
     * @param merchantNo 进件产生的商户no
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    /**
     * 渠道id
     * @return channel_id 渠道id
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 渠道id
     * @param channelId 渠道id
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }
}