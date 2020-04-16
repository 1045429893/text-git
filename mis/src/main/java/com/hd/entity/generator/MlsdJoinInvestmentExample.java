package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdJoinInvestmentExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdJoinInvestmentExample()
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
         public Criteria andBanner1IsNull()
         {
              addCriterion("banner_1 is null");
              return (Criteria) this;
         }

         public Criteria andBanner1IsNotNull()
         {
              addCriterion("banner_1  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner1EqualTo(String value)
         {
              addCriterion("banner_1  = ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotEqualTo(String value)
         {
              addCriterion("banner_1  <> ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1GreaterThan(String value)
         {
              addCriterion("banner_1  > ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_1  >= ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1LessThan(String value)
         {
              addCriterion("banner_1  < ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1LessThanOrEqualTo(String value)
         {
              addCriterion("banner_1  <= ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1Like(String value)
         {
              addCriterion("banner_1  like ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotLike(String value)
         {
              addCriterion("banner_1  not like ", value, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1In(List<String> values)
         {
              addCriterion("banner_1  in ", values, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotIn(List<String> values)
         {
              addCriterion("banner_1  not in ", values, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1Between(String value1, String value2)
         {
              addCriterion("banner_1  between ", value1,value2, "banner_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner1NotBetween(String value1, String value2)
         {
              addCriterion("banner_1  not between ", value1,value2, "banner_1 ");
              return (Criteria) this;
         }
         public Criteria andPartnershipImgUrl1IsNull()
         {
              addCriterion("partnership_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1IsNotNull()
         {
              addCriterion("partnership_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1EqualTo(String value)
         {
              addCriterion("partnership_img_url_1  = ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1NotEqualTo(String value)
         {
              addCriterion("partnership_img_url_1  <> ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1GreaterThan(String value)
         {
              addCriterion("partnership_img_url_1  > ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_1  >= ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1LessThan(String value)
         {
              addCriterion("partnership_img_url_1  < ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_1  <= ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1Like(String value)
         {
              addCriterion("partnership_img_url_1  like ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1NotLike(String value)
         {
              addCriterion("partnership_img_url_1  not like ", value, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1In(List<String> values)
         {
              addCriterion("partnership_img_url_1  in ", values, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1NotIn(List<String> values)
         {
              addCriterion("partnership_img_url_1  not in ", values, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1Between(String value1, String value2)
         {
              addCriterion("partnership_img_url_1  between ", value1,value2, "partnership_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("partnership_img_url_1  not between ", value1,value2, "partnership_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andPartnershipImgUrl2IsNull()
         {
              addCriterion("partnership_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2IsNotNull()
         {
              addCriterion("partnership_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2EqualTo(String value)
         {
              addCriterion("partnership_img_url_2  = ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2NotEqualTo(String value)
         {
              addCriterion("partnership_img_url_2  <> ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2GreaterThan(String value)
         {
              addCriterion("partnership_img_url_2  > ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_2  >= ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2LessThan(String value)
         {
              addCriterion("partnership_img_url_2  < ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_2  <= ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2Like(String value)
         {
              addCriterion("partnership_img_url_2  like ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2NotLike(String value)
         {
              addCriterion("partnership_img_url_2  not like ", value, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2In(List<String> values)
         {
              addCriterion("partnership_img_url_2  in ", values, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2NotIn(List<String> values)
         {
              addCriterion("partnership_img_url_2  not in ", values, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2Between(String value1, String value2)
         {
              addCriterion("partnership_img_url_2  between ", value1,value2, "partnership_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("partnership_img_url_2  not between ", value1,value2, "partnership_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andPartnershipImgUrl3IsNull()
         {
              addCriterion("partnership_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3IsNotNull()
         {
              addCriterion("partnership_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3EqualTo(String value)
         {
              addCriterion("partnership_img_url_3  = ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3NotEqualTo(String value)
         {
              addCriterion("partnership_img_url_3  <> ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3GreaterThan(String value)
         {
              addCriterion("partnership_img_url_3  > ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_3  >= ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3LessThan(String value)
         {
              addCriterion("partnership_img_url_3  < ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url_3  <= ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3Like(String value)
         {
              addCriterion("partnership_img_url_3  like ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3NotLike(String value)
         {
              addCriterion("partnership_img_url_3  not like ", value, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3In(List<String> values)
         {
              addCriterion("partnership_img_url_3  in ", values, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3NotIn(List<String> values)
         {
              addCriterion("partnership_img_url_3  not in ", values, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3Between(String value1, String value2)
         {
              addCriterion("partnership_img_url_3  between ", value1,value2, "partnership_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("partnership_img_url_3  not between ", value1,value2, "partnership_img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl1IsNull()
         {
              addCriterion("img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl1IsNotNull()
         {
              addCriterion("img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl1EqualTo(String value)
         {
              addCriterion("img_url_1  = ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1NotEqualTo(String value)
         {
              addCriterion("img_url_1  <> ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1GreaterThan(String value)
         {
              addCriterion("img_url_1  > ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_1  >= ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1LessThan(String value)
         {
              addCriterion("img_url_1  < ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_1  <= ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1Like(String value)
         {
              addCriterion("img_url_1  like ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1NotLike(String value)
         {
              addCriterion("img_url_1  not like ", value, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1In(List<String> values)
         {
              addCriterion("img_url_1  in ", values, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1NotIn(List<String> values)
         {
              addCriterion("img_url_1  not in ", values, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1Between(String value1, String value2)
         {
              addCriterion("img_url_1  between ", value1,value2, "img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("img_url_1  not between ", value1,value2, "img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl2IsNull()
         {
              addCriterion("img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl2IsNotNull()
         {
              addCriterion("img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl2EqualTo(String value)
         {
              addCriterion("img_url_2  = ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2NotEqualTo(String value)
         {
              addCriterion("img_url_2  <> ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2GreaterThan(String value)
         {
              addCriterion("img_url_2  > ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_2  >= ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2LessThan(String value)
         {
              addCriterion("img_url_2  < ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_2  <= ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2Like(String value)
         {
              addCriterion("img_url_2  like ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2NotLike(String value)
         {
              addCriterion("img_url_2  not like ", value, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2In(List<String> values)
         {
              addCriterion("img_url_2  in ", values, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2NotIn(List<String> values)
         {
              addCriterion("img_url_2  not in ", values, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2Between(String value1, String value2)
         {
              addCriterion("img_url_2  between ", value1,value2, "img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("img_url_2  not between ", value1,value2, "img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl3IsNull()
         {
              addCriterion("img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl3IsNotNull()
         {
              addCriterion("img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl3EqualTo(String value)
         {
              addCriterion("img_url_3  = ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3NotEqualTo(String value)
         {
              addCriterion("img_url_3  <> ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3GreaterThan(String value)
         {
              addCriterion("img_url_3  > ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_3  >= ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3LessThan(String value)
         {
              addCriterion("img_url_3  < ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_3  <= ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3Like(String value)
         {
              addCriterion("img_url_3  like ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3NotLike(String value)
         {
              addCriterion("img_url_3  not like ", value, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3In(List<String> values)
         {
              addCriterion("img_url_3  in ", values, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3NotIn(List<String> values)
         {
              addCriterion("img_url_3  not in ", values, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3Between(String value1, String value2)
         {
              addCriterion("img_url_3  between ", value1,value2, "img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("img_url_3  not between ", value1,value2, "img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl4IsNull()
         {
              addCriterion("img_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl4IsNotNull()
         {
              addCriterion("img_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl4EqualTo(String value)
         {
              addCriterion("img_url_4  = ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4NotEqualTo(String value)
         {
              addCriterion("img_url_4  <> ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4GreaterThan(String value)
         {
              addCriterion("img_url_4  > ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_4  >= ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4LessThan(String value)
         {
              addCriterion("img_url_4  < ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_4  <= ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4Like(String value)
         {
              addCriterion("img_url_4  like ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4NotLike(String value)
         {
              addCriterion("img_url_4  not like ", value, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4In(List<String> values)
         {
              addCriterion("img_url_4  in ", values, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4NotIn(List<String> values)
         {
              addCriterion("img_url_4  not in ", values, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4Between(String value1, String value2)
         {
              addCriterion("img_url_4  between ", value1,value2, "img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("img_url_4  not between ", value1,value2, "img_url_4 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl5IsNull()
         {
              addCriterion("img_url_5 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl5IsNotNull()
         {
              addCriterion("img_url_5  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl5EqualTo(String value)
         {
              addCriterion("img_url_5  = ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5NotEqualTo(String value)
         {
              addCriterion("img_url_5  <> ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5GreaterThan(String value)
         {
              addCriterion("img_url_5  > ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_5  >= ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5LessThan(String value)
         {
              addCriterion("img_url_5  < ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_5  <= ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5Like(String value)
         {
              addCriterion("img_url_5  like ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5NotLike(String value)
         {
              addCriterion("img_url_5  not like ", value, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5In(List<String> values)
         {
              addCriterion("img_url_5  in ", values, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5NotIn(List<String> values)
         {
              addCriterion("img_url_5  not in ", values, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5Between(String value1, String value2)
         {
              addCriterion("img_url_5  between ", value1,value2, "img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl5NotBetween(String value1, String value2)
         {
              addCriterion("img_url_5  not between ", value1,value2, "img_url_5 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl6IsNull()
         {
              addCriterion("img_url_6 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl6IsNotNull()
         {
              addCriterion("img_url_6  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl6EqualTo(String value)
         {
              addCriterion("img_url_6  = ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6NotEqualTo(String value)
         {
              addCriterion("img_url_6  <> ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6GreaterThan(String value)
         {
              addCriterion("img_url_6  > ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_6  >= ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6LessThan(String value)
         {
              addCriterion("img_url_6  < ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_6  <= ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6Like(String value)
         {
              addCriterion("img_url_6  like ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6NotLike(String value)
         {
              addCriterion("img_url_6  not like ", value, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6In(List<String> values)
         {
              addCriterion("img_url_6  in ", values, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6NotIn(List<String> values)
         {
              addCriterion("img_url_6  not in ", values, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6Between(String value1, String value2)
         {
              addCriterion("img_url_6  between ", value1,value2, "img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl6NotBetween(String value1, String value2)
         {
              addCriterion("img_url_6  not between ", value1,value2, "img_url_6 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl7IsNull()
         {
              addCriterion("img_url_7 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl7IsNotNull()
         {
              addCriterion("img_url_7  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl7EqualTo(String value)
         {
              addCriterion("img_url_7  = ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7NotEqualTo(String value)
         {
              addCriterion("img_url_7  <> ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7GreaterThan(String value)
         {
              addCriterion("img_url_7  > ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_7  >= ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7LessThan(String value)
         {
              addCriterion("img_url_7  < ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_7  <= ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7Like(String value)
         {
              addCriterion("img_url_7  like ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7NotLike(String value)
         {
              addCriterion("img_url_7  not like ", value, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7In(List<String> values)
         {
              addCriterion("img_url_7  in ", values, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7NotIn(List<String> values)
         {
              addCriterion("img_url_7  not in ", values, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7Between(String value1, String value2)
         {
              addCriterion("img_url_7  between ", value1,value2, "img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl7NotBetween(String value1, String value2)
         {
              addCriterion("img_url_7  not between ", value1,value2, "img_url_7 ");
              return (Criteria) this;
         }
         public Criteria andImgUrl8IsNull()
         {
              addCriterion("img_url_8 is null");
              return (Criteria) this;
         }

         public Criteria andImgUrl8IsNotNull()
         {
              addCriterion("img_url_8  is not null");
              return (Criteria) this;
         }

         public Criteria andImgUrl8EqualTo(String value)
         {
              addCriterion("img_url_8  = ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8NotEqualTo(String value)
         {
              addCriterion("img_url_8  <> ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8GreaterThan(String value)
         {
              addCriterion("img_url_8  > ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8GreaterThanOrEqualTo(String value)
         {
              addCriterion("img_url_8  >= ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8LessThan(String value)
         {
              addCriterion("img_url_8  < ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8LessThanOrEqualTo(String value)
         {
              addCriterion("img_url_8  <= ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8Like(String value)
         {
              addCriterion("img_url_8  like ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8NotLike(String value)
         {
              addCriterion("img_url_8  not like ", value, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8In(List<String> values)
         {
              addCriterion("img_url_8  in ", values, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8NotIn(List<String> values)
         {
              addCriterion("img_url_8  not in ", values, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8Between(String value1, String value2)
         {
              addCriterion("img_url_8  between ", value1,value2, "img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andImgUrl8NotBetween(String value1, String value2)
         {
              addCriterion("img_url_8  not between ", value1,value2, "img_url_8 ");
              return (Criteria) this;
         }
         public Criteria andPartnershipImgUrlIsNull()
         {
              addCriterion("partnership_img_url is null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlIsNotNull()
         {
              addCriterion("partnership_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlEqualTo(String value)
         {
              addCriterion("partnership_img_url  = ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlNotEqualTo(String value)
         {
              addCriterion("partnership_img_url  <> ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlGreaterThan(String value)
         {
              addCriterion("partnership_img_url  > ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url  >= ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlLessThan(String value)
         {
              addCriterion("partnership_img_url  < ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("partnership_img_url  <= ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlLike(String value)
         {
              addCriterion("partnership_img_url  like ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlNotLike(String value)
         {
              addCriterion("partnership_img_url  not like ", value, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlIn(List<String> values)
         {
              addCriterion("partnership_img_url  in ", values, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlNotIn(List<String> values)
         {
              addCriterion("partnership_img_url  not in ", values, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlBetween(String value1, String value2)
         {
              addCriterion("partnership_img_url  between ", value1,value2, "partnership_img_url ");
              return (Criteria) this;
         }

         public Criteria andPartnershipImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("partnership_img_url  not between ", value1,value2, "partnership_img_url ");
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

		public ColumnName addBanner1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_1";
            }
            return this;
        }

		public ColumnName addPartnershipImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="partnership_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",partnership_img_url_1";
            }
            return this;
        }

		public ColumnName addPartnershipImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="partnership_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",partnership_img_url_2";
            }
            return this;
        }

		public ColumnName addPartnershipImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="partnership_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",partnership_img_url_3";
            }
            return this;
        }

		public ColumnName addImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_1";
            }
            return this;
        }

		public ColumnName addImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_2";
            }
            return this;
        }

		public ColumnName addImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_3";
            }
            return this;
        }

		public ColumnName addImgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_4";
            }
            return this;
        }

		public ColumnName addImgUrl5Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_5";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_5";
            }
            return this;
        }

		public ColumnName addImgUrl6Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_6";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_6";
            }
            return this;
        }

		public ColumnName addImgUrl7Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_7";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_7";
            }
            return this;
        }

		public ColumnName addImgUrl8Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="img_url_8";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",img_url_8";
            }
            return this;
        }

		public ColumnName addPartnershipImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="partnership_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",partnership_img_url";
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
