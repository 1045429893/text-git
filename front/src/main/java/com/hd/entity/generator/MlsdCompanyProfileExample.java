package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdCompanyProfileExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdCompanyProfileExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public boolean getDistinct()
    {
        return distinct;
    }

    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    public void setLimitStart(Integer limitStart)
    {
        this.limitStart = limitStart;
    }

    public void setLimitEnd(Integer limitEnd)
    {
        this.limitEnd = limitEnd;
    }

    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        limitStart = -1;
        limitEnd = -1;
    }

    public void setPage(int pageIndex, int pageSize)
    {
        this.setLimitStart((pageIndex - 1) * pageSize);
        this.setLimitEnd(pageSize);
    }

    protected abstract static class GeneratedCriteria  implements Serializable
    {

        private static final long serialVersionUID = 1L;


        protected List<Criterion> criteria;

         protected GeneratedCriteria()
         {
             super();
             this.criteria = new ArrayList<Criterion>();
         }

         public boolean isValid()
         {
             return this.criteria.size() > 0;
         }

         public List<Criterion> getAllCriteria()
         {
             return this.criteria;
         }

         public List<Criterion> getCriteria()
         {
             return this.criteria;
         }

         protected void addCriterion(String condition)
         {
             if (condition == null)
             {
                 throw new RuntimeException("Value for condition cannot be null");
             }
             this.criteria.add(new Criterion(condition));
         }

         protected void addCriterion(String condition, Object value, String property)
         {
             if (value == null)
             {
                 throw new RuntimeException("Value for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value));
         }

         protected void addCriterion(String condition, Object value1, Object value2, String property)
         {
             if (value1 == null|| value2 == null)
             {
                 throw new RuntimeException("Between values for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value1, value2));
         }
         public Criteria andIdIsNull()
         {
              addCriterion("id is null");
              return (Criteria) this;
         }

         public Criteria andIdIsNotNull()
         {
              addCriterion("id  is not null");
              return (Criteria) this;
         }

         public Criteria andIdEqualTo(String value)
         {
              addCriterion("id  = ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotEqualTo(String value)
         {
              addCriterion("id  <> ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdGreaterThan(String value)
         {
              addCriterion("id  > ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdGreaterThanOrEqualTo(String value)
         {
              addCriterion("id  >= ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLessThan(String value)
         {
              addCriterion("id  < ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLessThanOrEqualTo(String value)
         {
              addCriterion("id  <= ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdLike(String value)
         {
              addCriterion("id  like ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotLike(String value)
         {
              addCriterion("id  not like ", value, "id ");
              return (Criteria) this;
         }

         public Criteria andIdIn(List<String> values)
         {
              addCriterion("id  in ", values, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotIn(List<String> values)
         {
              addCriterion("id  not in ", values, "id ");
              return (Criteria) this;
         }

         public Criteria andIdBetween(String value1, String value2)
         {
              addCriterion("id  between ", value1,value2, "id ");
              return (Criteria) this;
         }

         public Criteria andIdNotBetween(String value1, String value2)
         {
              addCriterion("id  not between ", value1,value2, "id ");
              return (Criteria) this;
         }
         public Criteria andCompanyNameIsNull()
         {
              addCriterion("company_name is null");
              return (Criteria) this;
         }

         public Criteria andCompanyNameIsNotNull()
         {
              addCriterion("company_name  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyNameEqualTo(String value)
         {
              addCriterion("company_name  = ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameNotEqualTo(String value)
         {
              addCriterion("company_name  <> ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameGreaterThan(String value)
         {
              addCriterion("company_name  > ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_name  >= ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameLessThan(String value)
         {
              addCriterion("company_name  < ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameLessThanOrEqualTo(String value)
         {
              addCriterion("company_name  <= ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameLike(String value)
         {
              addCriterion("company_name  like ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameNotLike(String value)
         {
              addCriterion("company_name  not like ", value, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameIn(List<String> values)
         {
              addCriterion("company_name  in ", values, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameNotIn(List<String> values)
         {
              addCriterion("company_name  not in ", values, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameBetween(String value1, String value2)
         {
              addCriterion("company_name  between ", value1,value2, "company_name ");
              return (Criteria) this;
         }

         public Criteria andCompanyNameNotBetween(String value1, String value2)
         {
              addCriterion("company_name  not between ", value1,value2, "company_name ");
              return (Criteria) this;
         }
         public Criteria andCompanyAddressIsNull()
         {
              addCriterion("company_address is null");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressIsNotNull()
         {
              addCriterion("company_address  is not null");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressEqualTo(String value)
         {
              addCriterion("company_address  = ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressNotEqualTo(String value)
         {
              addCriterion("company_address  <> ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressGreaterThan(String value)
         {
              addCriterion("company_address  > ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressGreaterThanOrEqualTo(String value)
         {
              addCriterion("company_address  >= ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressLessThan(String value)
         {
              addCriterion("company_address  < ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressLessThanOrEqualTo(String value)
         {
              addCriterion("company_address  <= ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressLike(String value)
         {
              addCriterion("company_address  like ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressNotLike(String value)
         {
              addCriterion("company_address  not like ", value, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressIn(List<String> values)
         {
              addCriterion("company_address  in ", values, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressNotIn(List<String> values)
         {
              addCriterion("company_address  not in ", values, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressBetween(String value1, String value2)
         {
              addCriterion("company_address  between ", value1,value2, "company_address ");
              return (Criteria) this;
         }

         public Criteria andCompanyAddressNotBetween(String value1, String value2)
         {
              addCriterion("company_address  not between ", value1,value2, "company_address ");
              return (Criteria) this;
         }
         public Criteria andHotLineIsNull()
         {
              addCriterion("hotLine is null");
              return (Criteria) this;
         }

         public Criteria andHotLineIsNotNull()
         {
              addCriterion("hotLine  is not null");
              return (Criteria) this;
         }

         public Criteria andHotLineEqualTo(String value)
         {
              addCriterion("hotLine  = ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineNotEqualTo(String value)
         {
              addCriterion("hotLine  <> ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineGreaterThan(String value)
         {
              addCriterion("hotLine  > ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineGreaterThanOrEqualTo(String value)
         {
              addCriterion("hotLine  >= ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineLessThan(String value)
         {
              addCriterion("hotLine  < ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineLessThanOrEqualTo(String value)
         {
              addCriterion("hotLine  <= ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineLike(String value)
         {
              addCriterion("hotLine  like ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineNotLike(String value)
         {
              addCriterion("hotLine  not like ", value, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineIn(List<String> values)
         {
              addCriterion("hotLine  in ", values, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineNotIn(List<String> values)
         {
              addCriterion("hotLine  not in ", values, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineBetween(String value1, String value2)
         {
              addCriterion("hotLine  between ", value1,value2, "hotLine ");
              return (Criteria) this;
         }

         public Criteria andHotLineNotBetween(String value1, String value2)
         {
              addCriterion("hotLine  not between ", value1,value2, "hotLine ");
              return (Criteria) this;
         }
         public Criteria andEmailIsNull()
         {
              addCriterion("email is null");
              return (Criteria) this;
         }

         public Criteria andEmailIsNotNull()
         {
              addCriterion("email  is not null");
              return (Criteria) this;
         }

         public Criteria andEmailEqualTo(String value)
         {
              addCriterion("email  = ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailNotEqualTo(String value)
         {
              addCriterion("email  <> ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailGreaterThan(String value)
         {
              addCriterion("email  > ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailGreaterThanOrEqualTo(String value)
         {
              addCriterion("email  >= ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailLessThan(String value)
         {
              addCriterion("email  < ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailLessThanOrEqualTo(String value)
         {
              addCriterion("email  <= ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailLike(String value)
         {
              addCriterion("email  like ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailNotLike(String value)
         {
              addCriterion("email  not like ", value, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailIn(List<String> values)
         {
              addCriterion("email  in ", values, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailNotIn(List<String> values)
         {
              addCriterion("email  not in ", values, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailBetween(String value1, String value2)
         {
              addCriterion("email  between ", value1,value2, "email ");
              return (Criteria) this;
         }

         public Criteria andEmailNotBetween(String value1, String value2)
         {
              addCriterion("email  not between ", value1,value2, "email ");
              return (Criteria) this;
         }
         public Criteria andUrlIsNull()
         {
              addCriterion("url is null");
              return (Criteria) this;
         }

         public Criteria andUrlIsNotNull()
         {
              addCriterion("url  is not null");
              return (Criteria) this;
         }

         public Criteria andUrlEqualTo(String value)
         {
              addCriterion("url  = ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlNotEqualTo(String value)
         {
              addCriterion("url  <> ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlGreaterThan(String value)
         {
              addCriterion("url  > ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("url  >= ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlLessThan(String value)
         {
              addCriterion("url  < ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlLessThanOrEqualTo(String value)
         {
              addCriterion("url  <= ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlLike(String value)
         {
              addCriterion("url  like ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlNotLike(String value)
         {
              addCriterion("url  not like ", value, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlIn(List<String> values)
         {
              addCriterion("url  in ", values, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlNotIn(List<String> values)
         {
              addCriterion("url  not in ", values, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlBetween(String value1, String value2)
         {
              addCriterion("url  between ", value1,value2, "url ");
              return (Criteria) this;
         }

         public Criteria andUrlNotBetween(String value1, String value2)
         {
              addCriterion("url  not between ", value1,value2, "url ");
              return (Criteria) this;
         }
         public Criteria andCreateTimeIsNull()
         {
              addCriterion("create_time is null");
              return (Criteria) this;
         }

         public Criteria andCreateTimeIsNotNull()
         {
              addCriterion("create_time  is not null");
              return (Criteria) this;
         }

		 public Criteria andCreateTimeEqualTo(Date value)
         {
              addCriterion("create_time  = ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotEqualTo(Date value)
         {
              addCriterion("create_time  <> ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeGreaterThan(Date value)
         {
              addCriterion("create_time  > ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeGreaterThanOrEqualTo(Date value)
         {
              addCriterion("create_time  >= ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLessThan(Date value)
         {
              addCriterion("create_time  < ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLessThanOrEqualTo(Date value)
         {
              addCriterion("create_time  <= ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeLike(Date value)
         {
              addCriterion("create_time  like ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotLike(Date value)
         {
              addCriterion("create_time  not like ", value, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeIn(List<Date> values)
         {
              addCriterion("create_time  in ", values, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotIn(List<Date> values)
         {
              addCriterion("create_time  not in ", values, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeBetween(Date value1, Date value2)
         {
              addCriterion("create_time  between ", value1,value2, "create_time ");
              return (Criteria) this;
         }

         public Criteria andCreateTimeNotBetween(Date value1, Date value2)
         {
              addCriterion("create_time  not between ", value1,value2, "create_time ");
              return (Criteria) this;
         }
         public Criteria andUpdateTimeIsNull()
         {
              addCriterion("update_time is null");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeIsNotNull()
         {
              addCriterion("update_time  is not null");
              return (Criteria) this;
         }

		 public Criteria andUpdateTimeEqualTo(Date value)
         {
              addCriterion("update_time  = ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotEqualTo(Date value)
         {
              addCriterion("update_time  <> ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeGreaterThan(Date value)
         {
              addCriterion("update_time  > ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value)
         {
              addCriterion("update_time  >= ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLessThan(Date value)
         {
              addCriterion("update_time  < ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLessThanOrEqualTo(Date value)
         {
              addCriterion("update_time  <= ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeLike(Date value)
         {
              addCriterion("update_time  like ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotLike(Date value)
         {
              addCriterion("update_time  not like ", value, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeIn(List<Date> values)
         {
              addCriterion("update_time  in ", values, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotIn(List<Date> values)
         {
              addCriterion("update_time  not in ", values, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeBetween(Date value1, Date value2)
         {
              addCriterion("update_time  between ", value1,value2, "update_time ");
              return (Criteria) this;
         }

         public Criteria andUpdateTimeNotBetween(Date value1, Date value2)
         {
              addCriterion("update_time  not between ", value1,value2, "update_time ");
              return (Criteria) this;
         }
         public Criteria andDownloadLinkIsNull()
         {
              addCriterion("download_link is null");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkIsNotNull()
         {
              addCriterion("download_link  is not null");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkEqualTo(String value)
         {
              addCriterion("download_link  = ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkNotEqualTo(String value)
         {
              addCriterion("download_link  <> ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkGreaterThan(String value)
         {
              addCriterion("download_link  > ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkGreaterThanOrEqualTo(String value)
         {
              addCriterion("download_link  >= ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkLessThan(String value)
         {
              addCriterion("download_link  < ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkLessThanOrEqualTo(String value)
         {
              addCriterion("download_link  <= ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkLike(String value)
         {
              addCriterion("download_link  like ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkNotLike(String value)
         {
              addCriterion("download_link  not like ", value, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkIn(List<String> values)
         {
              addCriterion("download_link  in ", values, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkNotIn(List<String> values)
         {
              addCriterion("download_link  not in ", values, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkBetween(String value1, String value2)
         {
              addCriterion("download_link  between ", value1,value2, "download_link ");
              return (Criteria) this;
         }

         public Criteria andDownloadLinkNotBetween(String value1, String value2)
         {
              addCriterion("download_link  not between ", value1,value2, "download_link ");
              return (Criteria) this;
         }
         public Criteria andIsShowIsNull()
         {
              addCriterion("is_show is null");
              return (Criteria) this;
         }

         public Criteria andIsShowIsNotNull()
         {
              addCriterion("is_show  is not null");
              return (Criteria) this;
         }

         public Criteria andIsShowEqualTo(String value)
         {
              addCriterion("is_show  = ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowNotEqualTo(String value)
         {
              addCriterion("is_show  <> ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowGreaterThan(String value)
         {
              addCriterion("is_show  > ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowGreaterThanOrEqualTo(String value)
         {
              addCriterion("is_show  >= ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowLessThan(String value)
         {
              addCriterion("is_show  < ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowLessThanOrEqualTo(String value)
         {
              addCriterion("is_show  <= ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowLike(String value)
         {
              addCriterion("is_show  like ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowNotLike(String value)
         {
              addCriterion("is_show  not like ", value, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowIn(List<String> values)
         {
              addCriterion("is_show  in ", values, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowNotIn(List<String> values)
         {
              addCriterion("is_show  not in ", values, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowBetween(String value1, String value2)
         {
              addCriterion("is_show  between ", value1,value2, "is_show ");
              return (Criteria) this;
         }

         public Criteria andIsShowNotBetween(String value1, String value2)
         {
              addCriterion("is_show  not between ", value1,value2, "is_show ");
              return (Criteria) this;
         }
		public Criteria andCustomSql(String value)
        {
            addCriterion("custom", value, "CUSTOMSQL");
            return (Criteria) this;
        }
    }

	
	
	 public static class ColumnName implements Serializable
    {

        private static final long serialVersionUID = 1L;

        public String quereyColumnNameStr="";		

		public ColumnName addIdColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="id";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",id";
            }
            return this;
        }

		public ColumnName addCompanyNameColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_name";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_name";
            }
            return this;
        }

		public ColumnName addCompanyAddressColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="company_address";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",company_address";
            }
            return this;
        }

		public ColumnName addHotLineColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="hotLine";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",hotLine";
            }
            return this;
        }

		public ColumnName addEmailColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="email";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",email";
            }
            return this;
        }

		public ColumnName addUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",url";
            }
            return this;
        }

		public ColumnName addCreateTimeColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="create_time";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",create_time";
            }
            return this;
        }

		public ColumnName addUpdateTimeColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="update_time";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",update_time";
            }
            return this;
        }

		public ColumnName addDownloadLinkColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="download_link";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",download_link";
            }
            return this;
        }

		public ColumnName addIsShowColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="is_show";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",is_show";
            }
            return this;
        }
	}
	
    public static class Criteria extends GeneratedCriteria implements Serializable
    {

        private static final long serialVersionUID = 1L;

        protected Criteria()
        {
            super();
        }
    }
    public static class Criterion implements Serializable
    {

        private static final long serialVersionUID = 1L;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;
		//�Զ���SQL
		private boolean customValue;

        public boolean isCustomValue()
        {
            return this.customValue;
        }
        public String getCondition()
        {
            return this.condition;
        }

        public Object getValue()
        {
            return this.value;
        }

        public Object getSecondValue()
        {
            return this.secondValue;
        }

        public boolean isNoValue()
        {
            return this.noValue;
        }

        public boolean isSingleValue()
        {
            return this.singleValue;
        }

        public boolean isBetweenValue()
        {
            return this.betweenValue;
        }

        public boolean isListValue()
        {
            return this.listValue;
        }

        public String getTypeHandler()
        {
            return this.typeHandler;
        }

        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
			if ("custom".equals(condition))
            {
                this.customValue = true;
            }
            else if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }
	 public ColumnName createColumnName()
    {
        if (this.columnName == null)
        {
            return this.columnName = new ColumnName();
        }
        return this.columnName;
    }
}
