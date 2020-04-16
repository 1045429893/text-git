package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdStrengthExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdStrengthExample()
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
         public Criteria andStrengthImgUrl1IsNull()
         {
              addCriterion("strength_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1IsNotNull()
         {
              addCriterion("strength_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1EqualTo(String value)
         {
              addCriterion("strength_img_url_1  = ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1NotEqualTo(String value)
         {
              addCriterion("strength_img_url_1  <> ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1GreaterThan(String value)
         {
              addCriterion("strength_img_url_1  > ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_1  >= ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1LessThan(String value)
         {
              addCriterion("strength_img_url_1  < ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_1  <= ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1Like(String value)
         {
              addCriterion("strength_img_url_1  like ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1NotLike(String value)
         {
              addCriterion("strength_img_url_1  not like ", value, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1In(List<String> values)
         {
              addCriterion("strength_img_url_1  in ", values, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1NotIn(List<String> values)
         {
              addCriterion("strength_img_url_1  not in ", values, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1Between(String value1, String value2)
         {
              addCriterion("strength_img_url_1  between ", value1,value2, "strength_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_1  not between ", value1,value2, "strength_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andStrengthImgUrl2IsNull()
         {
              addCriterion("strength_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2IsNotNull()
         {
              addCriterion("strength_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2EqualTo(String value)
         {
              addCriterion("strength_img_url_2  = ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2NotEqualTo(String value)
         {
              addCriterion("strength_img_url_2  <> ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2GreaterThan(String value)
         {
              addCriterion("strength_img_url_2  > ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_2  >= ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2LessThan(String value)
         {
              addCriterion("strength_img_url_2  < ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_2  <= ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2Like(String value)
         {
              addCriterion("strength_img_url_2  like ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2NotLike(String value)
         {
              addCriterion("strength_img_url_2  not like ", value, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2In(List<String> values)
         {
              addCriterion("strength_img_url_2  in ", values, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2NotIn(List<String> values)
         {
              addCriterion("strength_img_url_2  not in ", values, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2Between(String value1, String value2)
         {
              addCriterion("strength_img_url_2  between ", value1,value2, "strength_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_2  not between ", value1,value2, "strength_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andStrengthImgUrl3IsNull()
         {
              addCriterion("strength_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3IsNotNull()
         {
              addCriterion("strength_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3EqualTo(String value)
         {
              addCriterion("strength_img_url_3  = ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3NotEqualTo(String value)
         {
              addCriterion("strength_img_url_3  <> ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3GreaterThan(String value)
         {
              addCriterion("strength_img_url_3  > ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_3  >= ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3LessThan(String value)
         {
              addCriterion("strength_img_url_3  < ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_3  <= ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3Like(String value)
         {
              addCriterion("strength_img_url_3  like ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3NotLike(String value)
         {
              addCriterion("strength_img_url_3  not like ", value, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3In(List<String> values)
         {
              addCriterion("strength_img_url_3  in ", values, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3NotIn(List<String> values)
         {
              addCriterion("strength_img_url_3  not in ", values, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3Between(String value1, String value2)
         {
              addCriterion("strength_img_url_3  between ", value1,value2, "strength_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_3  not between ", value1,value2, "strength_img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andStrengthImgUrl4IsNull()
         {
              addCriterion("strength_img_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4IsNotNull()
         {
              addCriterion("strength_img_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4EqualTo(String value)
         {
              addCriterion("strength_img_url_4  = ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4NotEqualTo(String value)
         {
              addCriterion("strength_img_url_4  <> ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4GreaterThan(String value)
         {
              addCriterion("strength_img_url_4  > ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_4  >= ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4LessThan(String value)
         {
              addCriterion("strength_img_url_4  < ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_4  <= ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4Like(String value)
         {
              addCriterion("strength_img_url_4  like ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4NotLike(String value)
         {
              addCriterion("strength_img_url_4  not like ", value, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4In(List<String> values)
         {
              addCriterion("strength_img_url_4  in ", values, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4NotIn(List<String> values)
         {
              addCriterion("strength_img_url_4  not in ", values, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4Between(String value1, String value2)
         {
              addCriterion("strength_img_url_4  between ", value1,value2, "strength_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_4  not between ", value1,value2, "strength_img_url_4 ");
              return (Criteria) this;
         }
         public Criteria andStrengthImgUrl5IsNull()
         {
              addCriterion("strength_img_url_5 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5IsNotNull()
         {
              addCriterion("strength_img_url_5  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5EqualTo(String value)
         {
              addCriterion("strength_img_url_5  = ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5NotEqualTo(String value)
         {
              addCriterion("strength_img_url_5  <> ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5GreaterThan(String value)
         {
              addCriterion("strength_img_url_5  > ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_5  >= ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5LessThan(String value)
         {
              addCriterion("strength_img_url_5  < ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_5  <= ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5Like(String value)
         {
              addCriterion("strength_img_url_5  like ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5NotLike(String value)
         {
              addCriterion("strength_img_url_5  not like ", value, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5In(List<String> values)
         {
              addCriterion("strength_img_url_5  in ", values, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5NotIn(List<String> values)
         {
              addCriterion("strength_img_url_5  not in ", values, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5Between(String value1, String value2)
         {
              addCriterion("strength_img_url_5  between ", value1,value2, "strength_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl5NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_5  not between ", value1,value2, "strength_img_url_5 ");
              return (Criteria) this;
         }
         public Criteria andStrengthImgUrl6IsNull()
         {
              addCriterion("strength_img_url_6 is null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6IsNotNull()
         {
              addCriterion("strength_img_url_6  is not null");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6EqualTo(String value)
         {
              addCriterion("strength_img_url_6  = ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6NotEqualTo(String value)
         {
              addCriterion("strength_img_url_6  <> ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6GreaterThan(String value)
         {
              addCriterion("strength_img_url_6  > ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6GreaterThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_6  >= ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6LessThan(String value)
         {
              addCriterion("strength_img_url_6  < ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6LessThanOrEqualTo(String value)
         {
              addCriterion("strength_img_url_6  <= ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6Like(String value)
         {
              addCriterion("strength_img_url_6  like ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6NotLike(String value)
         {
              addCriterion("strength_img_url_6  not like ", value, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6In(List<String> values)
         {
              addCriterion("strength_img_url_6  in ", values, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6NotIn(List<String> values)
         {
              addCriterion("strength_img_url_6  not in ", values, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6Between(String value1, String value2)
         {
              addCriterion("strength_img_url_6  between ", value1,value2, "strength_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andStrengthImgUrl6NotBetween(String value1, String value2)
         {
              addCriterion("strength_img_url_6  not between ", value1,value2, "strength_img_url_6 ");
              return (Criteria) this;
         }
         public Criteria andIntegrityShowImgUrl1IsNull()
         {
              addCriterion("integrity_show_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1IsNotNull()
         {
              addCriterion("integrity_show_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1EqualTo(String value)
         {
              addCriterion("integrity_show_img_url_1  = ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1NotEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_1  <> ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1GreaterThan(String value)
         {
              addCriterion("integrity_show_img_url_1  > ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_1  >= ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1LessThan(String value)
         {
              addCriterion("integrity_show_img_url_1  < ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_1  <= ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1Like(String value)
         {
              addCriterion("integrity_show_img_url_1  like ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1NotLike(String value)
         {
              addCriterion("integrity_show_img_url_1  not like ", value, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1In(List<String> values)
         {
              addCriterion("integrity_show_img_url_1  in ", values, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1NotIn(List<String> values)
         {
              addCriterion("integrity_show_img_url_1  not in ", values, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1Between(String value1, String value2)
         {
              addCriterion("integrity_show_img_url_1  between ", value1,value2, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("integrity_show_img_url_1  not between ", value1,value2, "integrity_show_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andIntegrityShowImgUrl2IsNull()
         {
              addCriterion("integrity_show_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2IsNotNull()
         {
              addCriterion("integrity_show_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2EqualTo(String value)
         {
              addCriterion("integrity_show_img_url_2  = ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2NotEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_2  <> ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2GreaterThan(String value)
         {
              addCriterion("integrity_show_img_url_2  > ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_2  >= ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2LessThan(String value)
         {
              addCriterion("integrity_show_img_url_2  < ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("integrity_show_img_url_2  <= ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2Like(String value)
         {
              addCriterion("integrity_show_img_url_2  like ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2NotLike(String value)
         {
              addCriterion("integrity_show_img_url_2  not like ", value, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2In(List<String> values)
         {
              addCriterion("integrity_show_img_url_2  in ", values, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2NotIn(List<String> values)
         {
              addCriterion("integrity_show_img_url_2  not in ", values, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2Between(String value1, String value2)
         {
              addCriterion("integrity_show_img_url_2  between ", value1,value2, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andIntegrityShowImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("integrity_show_img_url_2  not between ", value1,value2, "integrity_show_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andSignUpCaseImgUrlIsNull()
         {
              addCriterion("sign_up_case_img_url is null");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlIsNotNull()
         {
              addCriterion("sign_up_case_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlEqualTo(String value)
         {
              addCriterion("sign_up_case_img_url  = ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlNotEqualTo(String value)
         {
              addCriterion("sign_up_case_img_url  <> ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlGreaterThan(String value)
         {
              addCriterion("sign_up_case_img_url  > ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("sign_up_case_img_url  >= ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlLessThan(String value)
         {
              addCriterion("sign_up_case_img_url  < ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("sign_up_case_img_url  <= ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlLike(String value)
         {
              addCriterion("sign_up_case_img_url  like ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlNotLike(String value)
         {
              addCriterion("sign_up_case_img_url  not like ", value, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlIn(List<String> values)
         {
              addCriterion("sign_up_case_img_url  in ", values, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlNotIn(List<String> values)
         {
              addCriterion("sign_up_case_img_url  not in ", values, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlBetween(String value1, String value2)
         {
              addCriterion("sign_up_case_img_url  between ", value1,value2, "sign_up_case_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignUpCaseImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("sign_up_case_img_url  not between ", value1,value2, "sign_up_case_img_url ");
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

		public ColumnName addStrengthImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_1";
            }
            return this;
        }

		public ColumnName addStrengthImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_2";
            }
            return this;
        }

		public ColumnName addStrengthImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_3";
            }
            return this;
        }

		public ColumnName addStrengthImgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_4";
            }
            return this;
        }

		public ColumnName addStrengthImgUrl5Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_5";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_5";
            }
            return this;
        }

		public ColumnName addStrengthImgUrl6Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="strength_img_url_6";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",strength_img_url_6";
            }
            return this;
        }

		public ColumnName addIntegrityShowImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="integrity_show_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",integrity_show_img_url_1";
            }
            return this;
        }

		public ColumnName addIntegrityShowImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="integrity_show_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",integrity_show_img_url_2";
            }
            return this;
        }

		public ColumnName addSignUpCaseImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="sign_up_case_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",sign_up_case_img_url";
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
