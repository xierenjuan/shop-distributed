package com.test.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseExample {
    /**
     * enterprise
     */
    protected String orderByClause;

    /**
     * enterprise
     */
    protected boolean distinct;

    /**
     * enterprise
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public EnterpriseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * enterprise null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Boolean value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Boolean value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Boolean value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Boolean value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Boolean value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Boolean> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Boolean> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Boolean value1, Boolean value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dr not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("industry_id like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("industry_id not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andMerFullNameIsNull() {
            addCriterion("mer_full_name is null");
            return (Criteria) this;
        }

        public Criteria andMerFullNameIsNotNull() {
            addCriterion("mer_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerFullNameEqualTo(String value) {
            addCriterion("mer_full_name =", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameNotEqualTo(String value) {
            addCriterion("mer_full_name <>", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameGreaterThan(String value) {
            addCriterion("mer_full_name >", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_full_name >=", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameLessThan(String value) {
            addCriterion("mer_full_name <", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameLessThanOrEqualTo(String value) {
            addCriterion("mer_full_name <=", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameLike(String value) {
            addCriterion("mer_full_name like", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameNotLike(String value) {
            addCriterion("mer_full_name not like", value, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameIn(List<String> values) {
            addCriterion("mer_full_name in", values, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameNotIn(List<String> values) {
            addCriterion("mer_full_name not in", values, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameBetween(String value1, String value2) {
            addCriterion("mer_full_name between", value1, value2, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerFullNameNotBetween(String value1, String value2) {
            addCriterion("mer_full_name not between", value1, value2, "merFullName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameIsNull() {
            addCriterion("mer_short_name is null");
            return (Criteria) this;
        }

        public Criteria andMerShortNameIsNotNull() {
            addCriterion("mer_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerShortNameEqualTo(String value) {
            addCriterion("mer_short_name =", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameNotEqualTo(String value) {
            addCriterion("mer_short_name <>", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameGreaterThan(String value) {
            addCriterion("mer_short_name >", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_short_name >=", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameLessThan(String value) {
            addCriterion("mer_short_name <", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameLessThanOrEqualTo(String value) {
            addCriterion("mer_short_name <=", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameLike(String value) {
            addCriterion("mer_short_name like", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameNotLike(String value) {
            addCriterion("mer_short_name not like", value, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameIn(List<String> values) {
            addCriterion("mer_short_name in", values, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameNotIn(List<String> values) {
            addCriterion("mer_short_name not in", values, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameBetween(String value1, String value2) {
            addCriterion("mer_short_name between", value1, value2, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerShortNameNotBetween(String value1, String value2) {
            addCriterion("mer_short_name not between", value1, value2, "merShortName");
            return (Criteria) this;
        }

        public Criteria andMerCertNoIsNull() {
            addCriterion("mer_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andMerCertNoIsNotNull() {
            addCriterion("mer_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerCertNoEqualTo(String value) {
            addCriterion("mer_cert_no =", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoNotEqualTo(String value) {
            addCriterion("mer_cert_no <>", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoGreaterThan(String value) {
            addCriterion("mer_cert_no >", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_cert_no >=", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoLessThan(String value) {
            addCriterion("mer_cert_no <", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoLessThanOrEqualTo(String value) {
            addCriterion("mer_cert_no <=", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoLike(String value) {
            addCriterion("mer_cert_no like", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoNotLike(String value) {
            addCriterion("mer_cert_no not like", value, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoIn(List<String> values) {
            addCriterion("mer_cert_no in", values, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoNotIn(List<String> values) {
            addCriterion("mer_cert_no not in", values, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoBetween(String value1, String value2) {
            addCriterion("mer_cert_no between", value1, value2, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertNoNotBetween(String value1, String value2) {
            addCriterion("mer_cert_no not between", value1, value2, "merCertNo");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeIsNull() {
            addCriterion("mer_cert_type is null");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeIsNotNull() {
            addCriterion("mer_cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeEqualTo(String value) {
            addCriterion("mer_cert_type =", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeNotEqualTo(String value) {
            addCriterion("mer_cert_type <>", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeGreaterThan(String value) {
            addCriterion("mer_cert_type >", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mer_cert_type >=", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeLessThan(String value) {
            addCriterion("mer_cert_type <", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeLessThanOrEqualTo(String value) {
            addCriterion("mer_cert_type <=", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeLike(String value) {
            addCriterion("mer_cert_type like", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeNotLike(String value) {
            addCriterion("mer_cert_type not like", value, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeIn(List<String> values) {
            addCriterion("mer_cert_type in", values, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeNotIn(List<String> values) {
            addCriterion("mer_cert_type not in", values, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeBetween(String value1, String value2) {
            addCriterion("mer_cert_type between", value1, value2, "merCertType");
            return (Criteria) this;
        }

        public Criteria andMerCertTypeNotBetween(String value1, String value2) {
            addCriterion("mer_cert_type not between", value1, value2, "merCertType");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legal_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legal_name =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legal_name <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legal_name >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_name >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legal_name <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legal_name <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legal_name like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legal_name not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legal_name in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legal_name not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legal_name between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legal_name not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIsNull() {
            addCriterion("legal_id_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIsNotNull() {
            addCriterion("legal_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardEqualTo(String value) {
            addCriterion("legal_id_card =", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotEqualTo(String value) {
            addCriterion("legal_id_card <>", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardGreaterThan(String value) {
            addCriterion("legal_id_card >", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_id_card >=", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLessThan(String value) {
            addCriterion("legal_id_card <", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLessThanOrEqualTo(String value) {
            addCriterion("legal_id_card <=", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLike(String value) {
            addCriterion("legal_id_card like", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotLike(String value) {
            addCriterion("legal_id_card not like", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIn(List<String> values) {
            addCriterion("legal_id_card in", values, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotIn(List<String> values) {
            addCriterion("legal_id_card not in", values, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardBetween(String value1, String value2) {
            addCriterion("legal_id_card between", value1, value2, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotBetween(String value1, String value2) {
            addCriterion("legal_id_card not between", value1, value2, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andMerContactNameIsNull() {
            addCriterion("mer_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andMerContactNameIsNotNull() {
            addCriterion("mer_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerContactNameEqualTo(String value) {
            addCriterion("mer_contact_name =", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameNotEqualTo(String value) {
            addCriterion("mer_contact_name <>", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameGreaterThan(String value) {
            addCriterion("mer_contact_name >", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_contact_name >=", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameLessThan(String value) {
            addCriterion("mer_contact_name <", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameLessThanOrEqualTo(String value) {
            addCriterion("mer_contact_name <=", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameLike(String value) {
            addCriterion("mer_contact_name like", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameNotLike(String value) {
            addCriterion("mer_contact_name not like", value, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameIn(List<String> values) {
            addCriterion("mer_contact_name in", values, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameNotIn(List<String> values) {
            addCriterion("mer_contact_name not in", values, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameBetween(String value1, String value2) {
            addCriterion("mer_contact_name between", value1, value2, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactNameNotBetween(String value1, String value2) {
            addCriterion("mer_contact_name not between", value1, value2, "merContactName");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneIsNull() {
            addCriterion("mer_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneIsNotNull() {
            addCriterion("mer_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneEqualTo(String value) {
            addCriterion("mer_contact_phone =", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneNotEqualTo(String value) {
            addCriterion("mer_contact_phone <>", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneGreaterThan(String value) {
            addCriterion("mer_contact_phone >", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mer_contact_phone >=", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneLessThan(String value) {
            addCriterion("mer_contact_phone <", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("mer_contact_phone <=", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneLike(String value) {
            addCriterion("mer_contact_phone like", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneNotLike(String value) {
            addCriterion("mer_contact_phone not like", value, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneIn(List<String> values) {
            addCriterion("mer_contact_phone in", values, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneNotIn(List<String> values) {
            addCriterion("mer_contact_phone not in", values, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneBetween(String value1, String value2) {
            addCriterion("mer_contact_phone between", value1, value2, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactPhoneNotBetween(String value1, String value2) {
            addCriterion("mer_contact_phone not between", value1, value2, "merContactPhone");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailIsNull() {
            addCriterion("mer_contact_email is null");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailIsNotNull() {
            addCriterion("mer_contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailEqualTo(String value) {
            addCriterion("mer_contact_email =", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailNotEqualTo(String value) {
            addCriterion("mer_contact_email <>", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailGreaterThan(String value) {
            addCriterion("mer_contact_email >", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("mer_contact_email >=", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailLessThan(String value) {
            addCriterion("mer_contact_email <", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailLessThanOrEqualTo(String value) {
            addCriterion("mer_contact_email <=", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailLike(String value) {
            addCriterion("mer_contact_email like", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailNotLike(String value) {
            addCriterion("mer_contact_email not like", value, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailIn(List<String> values) {
            addCriterion("mer_contact_email in", values, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailNotIn(List<String> values) {
            addCriterion("mer_contact_email not in", values, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailBetween(String value1, String value2) {
            addCriterion("mer_contact_email between", value1, value2, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerContactEmailNotBetween(String value1, String value2) {
            addCriterion("mer_contact_email not between", value1, value2, "merContactEmail");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoIsNull() {
            addCriterion("mer_level1_no is null");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoIsNotNull() {
            addCriterion("mer_level1_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoEqualTo(String value) {
            addCriterion("mer_level1_no =", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoNotEqualTo(String value) {
            addCriterion("mer_level1_no <>", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoGreaterThan(String value) {
            addCriterion("mer_level1_no >", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_level1_no >=", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoLessThan(String value) {
            addCriterion("mer_level1_no <", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoLessThanOrEqualTo(String value) {
            addCriterion("mer_level1_no <=", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoLike(String value) {
            addCriterion("mer_level1_no like", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoNotLike(String value) {
            addCriterion("mer_level1_no not like", value, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoIn(List<String> values) {
            addCriterion("mer_level1_no in", values, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoNotIn(List<String> values) {
            addCriterion("mer_level1_no not in", values, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoBetween(String value1, String value2) {
            addCriterion("mer_level1_no between", value1, value2, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel1NoNotBetween(String value1, String value2) {
            addCriterion("mer_level1_no not between", value1, value2, "merLevel1No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoIsNull() {
            addCriterion("mer_level2_no is null");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoIsNotNull() {
            addCriterion("mer_level2_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoEqualTo(String value) {
            addCriterion("mer_level2_no =", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoNotEqualTo(String value) {
            addCriterion("mer_level2_no <>", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoGreaterThan(String value) {
            addCriterion("mer_level2_no >", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_level2_no >=", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoLessThan(String value) {
            addCriterion("mer_level2_no <", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoLessThanOrEqualTo(String value) {
            addCriterion("mer_level2_no <=", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoLike(String value) {
            addCriterion("mer_level2_no like", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoNotLike(String value) {
            addCriterion("mer_level2_no not like", value, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoIn(List<String> values) {
            addCriterion("mer_level2_no in", values, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoNotIn(List<String> values) {
            addCriterion("mer_level2_no not in", values, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoBetween(String value1, String value2) {
            addCriterion("mer_level2_no between", value1, value2, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerLevel2NoNotBetween(String value1, String value2) {
            addCriterion("mer_level2_no not between", value1, value2, "merLevel2No");
            return (Criteria) this;
        }

        public Criteria andMerProvinceIsNull() {
            addCriterion("mer_province is null");
            return (Criteria) this;
        }

        public Criteria andMerProvinceIsNotNull() {
            addCriterion("mer_province is not null");
            return (Criteria) this;
        }

        public Criteria andMerProvinceEqualTo(String value) {
            addCriterion("mer_province =", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceNotEqualTo(String value) {
            addCriterion("mer_province <>", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceGreaterThan(String value) {
            addCriterion("mer_province >", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("mer_province >=", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceLessThan(String value) {
            addCriterion("mer_province <", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceLessThanOrEqualTo(String value) {
            addCriterion("mer_province <=", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceLike(String value) {
            addCriterion("mer_province like", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceNotLike(String value) {
            addCriterion("mer_province not like", value, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceIn(List<String> values) {
            addCriterion("mer_province in", values, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceNotIn(List<String> values) {
            addCriterion("mer_province not in", values, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceBetween(String value1, String value2) {
            addCriterion("mer_province between", value1, value2, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerProvinceNotBetween(String value1, String value2) {
            addCriterion("mer_province not between", value1, value2, "merProvince");
            return (Criteria) this;
        }

        public Criteria andMerCityIsNull() {
            addCriterion("mer_city is null");
            return (Criteria) this;
        }

        public Criteria andMerCityIsNotNull() {
            addCriterion("mer_city is not null");
            return (Criteria) this;
        }

        public Criteria andMerCityEqualTo(String value) {
            addCriterion("mer_city =", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityNotEqualTo(String value) {
            addCriterion("mer_city <>", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityGreaterThan(String value) {
            addCriterion("mer_city >", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityGreaterThanOrEqualTo(String value) {
            addCriterion("mer_city >=", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityLessThan(String value) {
            addCriterion("mer_city <", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityLessThanOrEqualTo(String value) {
            addCriterion("mer_city <=", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityLike(String value) {
            addCriterion("mer_city like", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityNotLike(String value) {
            addCriterion("mer_city not like", value, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityIn(List<String> values) {
            addCriterion("mer_city in", values, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityNotIn(List<String> values) {
            addCriterion("mer_city not in", values, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityBetween(String value1, String value2) {
            addCriterion("mer_city between", value1, value2, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerCityNotBetween(String value1, String value2) {
            addCriterion("mer_city not between", value1, value2, "merCity");
            return (Criteria) this;
        }

        public Criteria andMerDistrictIsNull() {
            addCriterion("mer_district is null");
            return (Criteria) this;
        }

        public Criteria andMerDistrictIsNotNull() {
            addCriterion("mer_district is not null");
            return (Criteria) this;
        }

        public Criteria andMerDistrictEqualTo(String value) {
            addCriterion("mer_district =", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictNotEqualTo(String value) {
            addCriterion("mer_district <>", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictGreaterThan(String value) {
            addCriterion("mer_district >", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("mer_district >=", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictLessThan(String value) {
            addCriterion("mer_district <", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictLessThanOrEqualTo(String value) {
            addCriterion("mer_district <=", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictLike(String value) {
            addCriterion("mer_district like", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictNotLike(String value) {
            addCriterion("mer_district not like", value, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictIn(List<String> values) {
            addCriterion("mer_district in", values, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictNotIn(List<String> values) {
            addCriterion("mer_district not in", values, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictBetween(String value1, String value2) {
            addCriterion("mer_district between", value1, value2, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerDistrictNotBetween(String value1, String value2) {
            addCriterion("mer_district not between", value1, value2, "merDistrict");
            return (Criteria) this;
        }

        public Criteria andMerAddressIsNull() {
            addCriterion("mer_address is null");
            return (Criteria) this;
        }

        public Criteria andMerAddressIsNotNull() {
            addCriterion("mer_address is not null");
            return (Criteria) this;
        }

        public Criteria andMerAddressEqualTo(String value) {
            addCriterion("mer_address =", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressNotEqualTo(String value) {
            addCriterion("mer_address <>", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressGreaterThan(String value) {
            addCriterion("mer_address >", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mer_address >=", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressLessThan(String value) {
            addCriterion("mer_address <", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressLessThanOrEqualTo(String value) {
            addCriterion("mer_address <=", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressLike(String value) {
            addCriterion("mer_address like", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressNotLike(String value) {
            addCriterion("mer_address not like", value, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressIn(List<String> values) {
            addCriterion("mer_address in", values, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressNotIn(List<String> values) {
            addCriterion("mer_address not in", values, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressBetween(String value1, String value2) {
            addCriterion("mer_address between", value1, value2, "merAddress");
            return (Criteria) this;
        }

        public Criteria andMerAddressNotBetween(String value1, String value2) {
            addCriterion("mer_address not between", value1, value2, "merAddress");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertIsNull() {
            addCriterion("tax_regist_cert is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertIsNotNull() {
            addCriterion("tax_regist_cert is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertEqualTo(String value) {
            addCriterion("tax_regist_cert =", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertNotEqualTo(String value) {
            addCriterion("tax_regist_cert <>", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertGreaterThan(String value) {
            addCriterion("tax_regist_cert >", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertGreaterThanOrEqualTo(String value) {
            addCriterion("tax_regist_cert >=", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertLessThan(String value) {
            addCriterion("tax_regist_cert <", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertLessThanOrEqualTo(String value) {
            addCriterion("tax_regist_cert <=", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertLike(String value) {
            addCriterion("tax_regist_cert like", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertNotLike(String value) {
            addCriterion("tax_regist_cert not like", value, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertIn(List<String> values) {
            addCriterion("tax_regist_cert in", values, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertNotIn(List<String> values) {
            addCriterion("tax_regist_cert not in", values, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertBetween(String value1, String value2) {
            addCriterion("tax_regist_cert between", value1, value2, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andTaxRegistCertNotBetween(String value1, String value2) {
            addCriterion("tax_regist_cert not between", value1, value2, "taxRegistCert");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseIsNull() {
            addCriterion("account_license is null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseIsNotNull() {
            addCriterion("account_license is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseEqualTo(String value) {
            addCriterion("account_license =", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseNotEqualTo(String value) {
            addCriterion("account_license <>", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseGreaterThan(String value) {
            addCriterion("account_license >", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("account_license >=", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseLessThan(String value) {
            addCriterion("account_license <", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseLessThanOrEqualTo(String value) {
            addCriterion("account_license <=", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseLike(String value) {
            addCriterion("account_license like", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseNotLike(String value) {
            addCriterion("account_license not like", value, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseIn(List<String> values) {
            addCriterion("account_license in", values, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseNotIn(List<String> values) {
            addCriterion("account_license not in", values, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseBetween(String value1, String value2) {
            addCriterion("account_license between", value1, value2, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andAccountLicenseNotBetween(String value1, String value2) {
            addCriterion("account_license not between", value1, value2, "accountLicense");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryIsNull() {
            addCriterion("org_code_expiry is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryIsNotNull() {
            addCriterion("org_code_expiry is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryEqualTo(String value) {
            addCriterion("org_code_expiry =", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryNotEqualTo(String value) {
            addCriterion("org_code_expiry <>", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryGreaterThan(String value) {
            addCriterion("org_code_expiry >", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryGreaterThanOrEqualTo(String value) {
            addCriterion("org_code_expiry >=", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryLessThan(String value) {
            addCriterion("org_code_expiry <", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryLessThanOrEqualTo(String value) {
            addCriterion("org_code_expiry <=", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryLike(String value) {
            addCriterion("org_code_expiry like", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryNotLike(String value) {
            addCriterion("org_code_expiry not like", value, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryIn(List<String> values) {
            addCriterion("org_code_expiry in", values, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryNotIn(List<String> values) {
            addCriterion("org_code_expiry not in", values, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryBetween(String value1, String value2) {
            addCriterion("org_code_expiry between", value1, value2, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andOrgCodeExpiryNotBetween(String value1, String value2) {
            addCriterion("org_code_expiry not between", value1, value2, "orgCodeExpiry");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongIsNull() {
            addCriterion("is_org_code_long is null");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongIsNotNull() {
            addCriterion("is_org_code_long is not null");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongEqualTo(Boolean value) {
            addCriterion("is_org_code_long =", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongNotEqualTo(Boolean value) {
            addCriterion("is_org_code_long <>", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongGreaterThan(Boolean value) {
            addCriterion("is_org_code_long >", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_org_code_long >=", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongLessThan(Boolean value) {
            addCriterion("is_org_code_long <", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongLessThanOrEqualTo(Boolean value) {
            addCriterion("is_org_code_long <=", value, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongIn(List<Boolean> values) {
            addCriterion("is_org_code_long in", values, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongNotIn(List<Boolean> values) {
            addCriterion("is_org_code_long not in", values, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongBetween(Boolean value1, Boolean value2) {
            addCriterion("is_org_code_long between", value1, value2, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andIsOrgCodeLongNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_org_code_long not between", value1, value2, "isOrgCodeLong");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeIsNull() {
            addCriterion("head_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeIsNotNull() {
            addCriterion("head_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeEqualTo(String value) {
            addCriterion("head_bank_code =", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotEqualTo(String value) {
            addCriterion("head_bank_code <>", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeGreaterThan(String value) {
            addCriterion("head_bank_code >", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("head_bank_code >=", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLessThan(String value) {
            addCriterion("head_bank_code <", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLessThanOrEqualTo(String value) {
            addCriterion("head_bank_code <=", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLike(String value) {
            addCriterion("head_bank_code like", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotLike(String value) {
            addCriterion("head_bank_code not like", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeIn(List<String> values) {
            addCriterion("head_bank_code in", values, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotIn(List<String> values) {
            addCriterion("head_bank_code not in", values, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeBetween(String value1, String value2) {
            addCriterion("head_bank_code between", value1, value2, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotBetween(String value1, String value2) {
            addCriterion("head_bank_code not between", value1, value2, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNull() {
            addCriterion("bank_province is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("bank_province =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("bank_province <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("bank_province >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("bank_province >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("bank_province <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("bank_province <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("bank_province like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("bank_province not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("bank_province in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("bank_province not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("bank_province between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("bank_province not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("product_info is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("product_info is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("product_info =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("product_info <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("product_info >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("product_info >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("product_info <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("product_info <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("product_info like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("product_info not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("product_info in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("product_info not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("product_info between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("product_info not between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoIsNull() {
            addCriterion("file_info is null");
            return (Criteria) this;
        }

        public Criteria andFileInfoIsNotNull() {
            addCriterion("file_info is not null");
            return (Criteria) this;
        }

        public Criteria andFileInfoEqualTo(String value) {
            addCriterion("file_info =", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoNotEqualTo(String value) {
            addCriterion("file_info <>", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoGreaterThan(String value) {
            addCriterion("file_info >", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoGreaterThanOrEqualTo(String value) {
            addCriterion("file_info >=", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoLessThan(String value) {
            addCriterion("file_info <", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoLessThanOrEqualTo(String value) {
            addCriterion("file_info <=", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoLike(String value) {
            addCriterion("file_info like", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoNotLike(String value) {
            addCriterion("file_info not like", value, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoIn(List<String> values) {
            addCriterion("file_info in", values, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoNotIn(List<String> values) {
            addCriterion("file_info not in", values, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoBetween(String value1, String value2) {
            addCriterion("file_info between", value1, value2, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andFileInfoNotBetween(String value1, String value2) {
            addCriterion("file_info not between", value1, value2, "fileInfo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNull() {
            addCriterion("request_no is null");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNotNull() {
            addCriterion("request_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNoEqualTo(String value) {
            addCriterion("request_no =", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotEqualTo(String value) {
            addCriterion("request_no <>", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThan(String value) {
            addCriterion("request_no >", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("request_no >=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThan(String value) {
            addCriterion("request_no <", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThanOrEqualTo(String value) {
            addCriterion("request_no <=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLike(String value) {
            addCriterion("request_no like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotLike(String value) {
            addCriterion("request_no not like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIn(List<String> values) {
            addCriterion("request_no in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotIn(List<String> values) {
            addCriterion("request_no not in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoBetween(String value1, String value2) {
            addCriterion("request_no between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotBetween(String value1, String value2) {
            addCriterion("request_no not between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIsNull() {
            addCriterion("parent_merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIsNotNull() {
            addCriterion("parent_merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoEqualTo(String value) {
            addCriterion("parent_merchant_no =", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotEqualTo(String value) {
            addCriterion("parent_merchant_no <>", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoGreaterThan(String value) {
            addCriterion("parent_merchant_no >", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("parent_merchant_no >=", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLessThan(String value) {
            addCriterion("parent_merchant_no <", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("parent_merchant_no <=", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLike(String value) {
            addCriterion("parent_merchant_no like", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotLike(String value) {
            addCriterion("parent_merchant_no not like", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIn(List<String> values) {
            addCriterion("parent_merchant_no in", values, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotIn(List<String> values) {
            addCriterion("parent_merchant_no not in", values, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoBetween(String value1, String value2) {
            addCriterion("parent_merchant_no between", value1, value2, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotBetween(String value1, String value2) {
            addCriterion("parent_merchant_no not between", value1, value2, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeIsNull() {
            addCriterion("mer_authorize_type is null");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeIsNotNull() {
            addCriterion("mer_authorize_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeEqualTo(String value) {
            addCriterion("mer_authorize_type =", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeNotEqualTo(String value) {
            addCriterion("mer_authorize_type <>", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeGreaterThan(String value) {
            addCriterion("mer_authorize_type >", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mer_authorize_type >=", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeLessThan(String value) {
            addCriterion("mer_authorize_type <", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeLessThanOrEqualTo(String value) {
            addCriterion("mer_authorize_type <=", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeLike(String value) {
            addCriterion("mer_authorize_type like", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeNotLike(String value) {
            addCriterion("mer_authorize_type not like", value, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeIn(List<String> values) {
            addCriterion("mer_authorize_type in", values, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeNotIn(List<String> values) {
            addCriterion("mer_authorize_type not in", values, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeBetween(String value1, String value2) {
            addCriterion("mer_authorize_type between", value1, value2, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andMerAuthorizeTypeNotBetween(String value1, String value2) {
            addCriterion("mer_authorize_type not between", value1, value2, "merAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionIsNull() {
            addCriterion("business_function is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionIsNotNull() {
            addCriterion("business_function is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionEqualTo(String value) {
            addCriterion("business_function =", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionNotEqualTo(String value) {
            addCriterion("business_function <>", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionGreaterThan(String value) {
            addCriterion("business_function >", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("business_function >=", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionLessThan(String value) {
            addCriterion("business_function <", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionLessThanOrEqualTo(String value) {
            addCriterion("business_function <=", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionLike(String value) {
            addCriterion("business_function like", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionNotLike(String value) {
            addCriterion("business_function not like", value, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionIn(List<String> values) {
            addCriterion("business_function in", values, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionNotIn(List<String> values) {
            addCriterion("business_function not in", values, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionBetween(String value1, String value2) {
            addCriterion("business_function between", value1, value2, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andBusinessFunctionNotBetween(String value1, String value2) {
            addCriterion("business_function not between", value1, value2, "businessFunction");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIsNull() {
            addCriterion("enter_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIsNotNull() {
            addCriterion("enter_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTypeEqualTo(String value) {
            addCriterion("enter_type =", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotEqualTo(String value) {
            addCriterion("enter_type <>", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeGreaterThan(String value) {
            addCriterion("enter_type >", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enter_type >=", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLessThan(String value) {
            addCriterion("enter_type <", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLessThanOrEqualTo(String value) {
            addCriterion("enter_type <=", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeLike(String value) {
            addCriterion("enter_type like", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotLike(String value) {
            addCriterion("enter_type not like", value, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeIn(List<String> values) {
            addCriterion("enter_type in", values, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotIn(List<String> values) {
            addCriterion("enter_type not in", values, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeBetween(String value1, String value2) {
            addCriterion("enter_type between", value1, value2, "enterType");
            return (Criteria) this;
        }

        public Criteria andEnterTypeNotBetween(String value1, String value2) {
            addCriterion("enter_type not between", value1, value2, "enterType");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneIsNull() {
            addCriterion("mer_legal_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneIsNotNull() {
            addCriterion("mer_legal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneEqualTo(String value) {
            addCriterion("mer_legal_phone =", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneNotEqualTo(String value) {
            addCriterion("mer_legal_phone <>", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneGreaterThan(String value) {
            addCriterion("mer_legal_phone >", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mer_legal_phone >=", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneLessThan(String value) {
            addCriterion("mer_legal_phone <", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneLessThanOrEqualTo(String value) {
            addCriterion("mer_legal_phone <=", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneLike(String value) {
            addCriterion("mer_legal_phone like", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneNotLike(String value) {
            addCriterion("mer_legal_phone not like", value, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneIn(List<String> values) {
            addCriterion("mer_legal_phone in", values, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneNotIn(List<String> values) {
            addCriterion("mer_legal_phone not in", values, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneBetween(String value1, String value2) {
            addCriterion("mer_legal_phone between", value1, value2, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalPhoneNotBetween(String value1, String value2) {
            addCriterion("mer_legal_phone not between", value1, value2, "merLegalPhone");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailIsNull() {
            addCriterion("mer_legal_email is null");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailIsNotNull() {
            addCriterion("mer_legal_email is not null");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailEqualTo(String value) {
            addCriterion("mer_legal_email =", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailNotEqualTo(String value) {
            addCriterion("mer_legal_email <>", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailGreaterThan(String value) {
            addCriterion("mer_legal_email >", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("mer_legal_email >=", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailLessThan(String value) {
            addCriterion("mer_legal_email <", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailLessThanOrEqualTo(String value) {
            addCriterion("mer_legal_email <=", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailLike(String value) {
            addCriterion("mer_legal_email like", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailNotLike(String value) {
            addCriterion("mer_legal_email not like", value, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailIn(List<String> values) {
            addCriterion("mer_legal_email in", values, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailNotIn(List<String> values) {
            addCriterion("mer_legal_email not in", values, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailBetween(String value1, String value2) {
            addCriterion("mer_legal_email between", value1, value2, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerLegalEmailNotBetween(String value1, String value2) {
            addCriterion("mer_legal_email not between", value1, value2, "merLegalEmail");
            return (Criteria) this;
        }

        public Criteria andMerScopeIsNull() {
            addCriterion("mer_scope is null");
            return (Criteria) this;
        }

        public Criteria andMerScopeIsNotNull() {
            addCriterion("mer_scope is not null");
            return (Criteria) this;
        }

        public Criteria andMerScopeEqualTo(String value) {
            addCriterion("mer_scope =", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeNotEqualTo(String value) {
            addCriterion("mer_scope <>", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeGreaterThan(String value) {
            addCriterion("mer_scope >", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeGreaterThanOrEqualTo(String value) {
            addCriterion("mer_scope >=", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeLessThan(String value) {
            addCriterion("mer_scope <", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeLessThanOrEqualTo(String value) {
            addCriterion("mer_scope <=", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeLike(String value) {
            addCriterion("mer_scope like", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeNotLike(String value) {
            addCriterion("mer_scope not like", value, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeIn(List<String> values) {
            addCriterion("mer_scope in", values, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeNotIn(List<String> values) {
            addCriterion("mer_scope not in", values, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeBetween(String value1, String value2) {
            addCriterion("mer_scope between", value1, value2, "merScope");
            return (Criteria) this;
        }

        public Criteria andMerScopeNotBetween(String value1, String value2) {
            addCriterion("mer_scope not between", value1, value2, "merScope");
            return (Criteria) this;
        }

        public Criteria andEnterStatusIsNull() {
            addCriterion("enter_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterStatusIsNotNull() {
            addCriterion("enter_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterStatusEqualTo(String value) {
            addCriterion("enter_status =", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusNotEqualTo(String value) {
            addCriterion("enter_status <>", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusGreaterThan(String value) {
            addCriterion("enter_status >", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusGreaterThanOrEqualTo(String value) {
            addCriterion("enter_status >=", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusLessThan(String value) {
            addCriterion("enter_status <", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusLessThanOrEqualTo(String value) {
            addCriterion("enter_status <=", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusLike(String value) {
            addCriterion("enter_status like", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusNotLike(String value) {
            addCriterion("enter_status not like", value, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusIn(List<String> values) {
            addCriterion("enter_status in", values, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusNotIn(List<String> values) {
            addCriterion("enter_status not in", values, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusBetween(String value1, String value2) {
            addCriterion("enter_status between", value1, value2, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andEnterStatusNotBetween(String value1, String value2) {
            addCriterion("enter_status not between", value1, value2, "enterStatus");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIsNull() {
            addCriterion("area_address is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIsNotNull() {
            addCriterion("area_address is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEqualTo(String value) {
            addCriterion("area_address =", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotEqualTo(String value) {
            addCriterion("area_address <>", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressGreaterThan(String value) {
            addCriterion("area_address >", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("area_address >=", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLessThan(String value) {
            addCriterion("area_address <", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLessThanOrEqualTo(String value) {
            addCriterion("area_address <=", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLike(String value) {
            addCriterion("area_address like", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotLike(String value) {
            addCriterion("area_address not like", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIn(List<String> values) {
            addCriterion("area_address in", values, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotIn(List<String> values) {
            addCriterion("area_address not in", values, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressBetween(String value1, String value2) {
            addCriterion("area_address between", value1, value2, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotBetween(String value1, String value2) {
            addCriterion("area_address not between", value1, value2, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameIsNull() {
            addCriterion("bank_code_name is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameIsNotNull() {
            addCriterion("bank_code_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameEqualTo(String value) {
            addCriterion("bank_code_name =", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameNotEqualTo(String value) {
            addCriterion("bank_code_name <>", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameGreaterThan(String value) {
            addCriterion("bank_code_name >", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code_name >=", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameLessThan(String value) {
            addCriterion("bank_code_name <", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameLessThanOrEqualTo(String value) {
            addCriterion("bank_code_name <=", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameLike(String value) {
            addCriterion("bank_code_name like", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameNotLike(String value) {
            addCriterion("bank_code_name not like", value, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameIn(List<String> values) {
            addCriterion("bank_code_name in", values, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameNotIn(List<String> values) {
            addCriterion("bank_code_name not in", values, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameBetween(String value1, String value2) {
            addCriterion("bank_code_name between", value1, value2, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andBankCodeNameNotBetween(String value1, String value2) {
            addCriterion("bank_code_name not between", value1, value2, "bankCodeName");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }
    }

    /**
     * enterprise
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * enterprise null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}