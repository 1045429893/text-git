package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdProductPresentationExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdProductPresentationExample()
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
         public Criteria andNewRoductsImgUrl1IsNull()
         {
              addCriterion("new_roducts_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1IsNotNull()
         {
              addCriterion("new_roducts_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_1  = ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_1  <> ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_1  > ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_1  >= ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1LessThan(String value)
         {
              addCriterion("new_roducts_img_url_1  < ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_1  <= ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1Like(String value)
         {
              addCriterion("new_roducts_img_url_1  like ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1NotLike(String value)
         {
              addCriterion("new_roducts_img_url_1  not like ", value, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1In(List<String> values)
         {
              addCriterion("new_roducts_img_url_1  in ", values, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_1  not in ", values, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_1  between ", value1,value2, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_1  not between ", value1,value2, "new_roducts_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl2IsNull()
         {
              addCriterion("new_roducts_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2IsNotNull()
         {
              addCriterion("new_roducts_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_2  = ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_2  <> ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_2  > ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_2  >= ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2LessThan(String value)
         {
              addCriterion("new_roducts_img_url_2  < ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_2  <= ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2Like(String value)
         {
              addCriterion("new_roducts_img_url_2  like ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2NotLike(String value)
         {
              addCriterion("new_roducts_img_url_2  not like ", value, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2In(List<String> values)
         {
              addCriterion("new_roducts_img_url_2  in ", values, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_2  not in ", values, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_2  between ", value1,value2, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_2  not between ", value1,value2, "new_roducts_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl3IsNull()
         {
              addCriterion("new_roducts_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3IsNotNull()
         {
              addCriterion("new_roducts_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_3  = ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_3  <> ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_3  > ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_3  >= ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3LessThan(String value)
         {
              addCriterion("new_roducts_img_url_3  < ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_3  <= ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3Like(String value)
         {
              addCriterion("new_roducts_img_url_3  like ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3NotLike(String value)
         {
              addCriterion("new_roducts_img_url_3  not like ", value, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3In(List<String> values)
         {
              addCriterion("new_roducts_img_url_3  in ", values, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_3  not in ", values, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_3  between ", value1,value2, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_3  not between ", value1,value2, "new_roducts_img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl4IsNull()
         {
              addCriterion("new_roducts_img_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4IsNotNull()
         {
              addCriterion("new_roducts_img_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_4  = ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_4  <> ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_4  > ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_4  >= ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4LessThan(String value)
         {
              addCriterion("new_roducts_img_url_4  < ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_4  <= ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4Like(String value)
         {
              addCriterion("new_roducts_img_url_4  like ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4NotLike(String value)
         {
              addCriterion("new_roducts_img_url_4  not like ", value, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4In(List<String> values)
         {
              addCriterion("new_roducts_img_url_4  in ", values, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_4  not in ", values, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_4  between ", value1,value2, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_4  not between ", value1,value2, "new_roducts_img_url_4 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl5IsNull()
         {
              addCriterion("new_roducts_img_url_5 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5IsNotNull()
         {
              addCriterion("new_roducts_img_url_5  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_5  = ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_5  <> ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_5  > ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_5  >= ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5LessThan(String value)
         {
              addCriterion("new_roducts_img_url_5  < ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_5  <= ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5Like(String value)
         {
              addCriterion("new_roducts_img_url_5  like ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5NotLike(String value)
         {
              addCriterion("new_roducts_img_url_5  not like ", value, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5In(List<String> values)
         {
              addCriterion("new_roducts_img_url_5  in ", values, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_5  not in ", values, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_5  between ", value1,value2, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl5NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_5  not between ", value1,value2, "new_roducts_img_url_5 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl6IsNull()
         {
              addCriterion("new_roducts_img_url_6 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6IsNotNull()
         {
              addCriterion("new_roducts_img_url_6  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_6  = ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_6  <> ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_6  > ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_6  >= ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6LessThan(String value)
         {
              addCriterion("new_roducts_img_url_6  < ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_6  <= ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6Like(String value)
         {
              addCriterion("new_roducts_img_url_6  like ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6NotLike(String value)
         {
              addCriterion("new_roducts_img_url_6  not like ", value, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6In(List<String> values)
         {
              addCriterion("new_roducts_img_url_6  in ", values, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_6  not in ", values, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_6  between ", value1,value2, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl6NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_6  not between ", value1,value2, "new_roducts_img_url_6 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl7IsNull()
         {
              addCriterion("new_roducts_img_url_7 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7IsNotNull()
         {
              addCriterion("new_roducts_img_url_7  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_7  = ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_7  <> ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_7  > ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_7  >= ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7LessThan(String value)
         {
              addCriterion("new_roducts_img_url_7  < ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_7  <= ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7Like(String value)
         {
              addCriterion("new_roducts_img_url_7  like ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7NotLike(String value)
         {
              addCriterion("new_roducts_img_url_7  not like ", value, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7In(List<String> values)
         {
              addCriterion("new_roducts_img_url_7  in ", values, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_7  not in ", values, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_7  between ", value1,value2, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl7NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_7  not between ", value1,value2, "new_roducts_img_url_7 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsImgUrl8IsNull()
         {
              addCriterion("new_roducts_img_url_8 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8IsNotNull()
         {
              addCriterion("new_roducts_img_url_8  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8EqualTo(String value)
         {
              addCriterion("new_roducts_img_url_8  = ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8NotEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_8  <> ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8GreaterThan(String value)
         {
              addCriterion("new_roducts_img_url_8  > ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_8  >= ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8LessThan(String value)
         {
              addCriterion("new_roducts_img_url_8  < ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_img_url_8  <= ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8Like(String value)
         {
              addCriterion("new_roducts_img_url_8  like ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8NotLike(String value)
         {
              addCriterion("new_roducts_img_url_8  not like ", value, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8In(List<String> values)
         {
              addCriterion("new_roducts_img_url_8  in ", values, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8NotIn(List<String> values)
         {
              addCriterion("new_roducts_img_url_8  not in ", values, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8Between(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_8  between ", value1,value2, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsImgUrl8NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_img_url_8  not between ", value1,value2, "new_roducts_img_url_8 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl1IsNull()
         {
              addCriterion("signature_cuisineimg_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_1  = ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_1  <> ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_1  > ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_1  >= ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_1  < ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_1  <= ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1Like(String value)
         {
              addCriterion("signature_cuisineimg_url_1  like ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_1  not like ", value, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_1  in ", values, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_1  not in ", values, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_1  between ", value1,value2, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_1  not between ", value1,value2, "signature_cuisineimg_url_1 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl2IsNull()
         {
              addCriterion("signature_cuisineimg_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_2  = ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_2  <> ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_2  > ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_2  >= ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_2  < ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_2  <= ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2Like(String value)
         {
              addCriterion("signature_cuisineimg_url_2  like ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_2  not like ", value, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_2  in ", values, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_2  not in ", values, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_2  between ", value1,value2, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_2  not between ", value1,value2, "signature_cuisineimg_url_2 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl3IsNull()
         {
              addCriterion("signature_cuisineimg_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_3  = ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_3  <> ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_3  > ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_3  >= ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_3  < ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_3  <= ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3Like(String value)
         {
              addCriterion("signature_cuisineimg_url_3  like ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_3  not like ", value, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_3  in ", values, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_3  not in ", values, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_3  between ", value1,value2, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_3  not between ", value1,value2, "signature_cuisineimg_url_3 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl4IsNull()
         {
              addCriterion("signature_cuisineimg_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_4  = ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_4  <> ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_4  > ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_4  >= ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_4  < ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_4  <= ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4Like(String value)
         {
              addCriterion("signature_cuisineimg_url_4  like ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_4  not like ", value, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_4  in ", values, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_4  not in ", values, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_4  between ", value1,value2, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_4  not between ", value1,value2, "signature_cuisineimg_url_4 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl5IsNull()
         {
              addCriterion("signature_cuisineimg_url_5 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_5  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_5  = ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_5  <> ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_5  > ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_5  >= ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_5  < ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_5  <= ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5Like(String value)
         {
              addCriterion("signature_cuisineimg_url_5  like ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_5  not like ", value, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_5  in ", values, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_5  not in ", values, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_5  between ", value1,value2, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl5NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_5  not between ", value1,value2, "signature_cuisineimg_url_5 ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgUrl6IsNull()
         {
              addCriterion("signature_cuisineimg_url_6 is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6IsNotNull()
         {
              addCriterion("signature_cuisineimg_url_6  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6EqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_6  = ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6NotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_6  <> ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6GreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_url_6  > ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6GreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_6  >= ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6LessThan(String value)
         {
              addCriterion("signature_cuisineimg_url_6  < ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6LessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_url_6  <= ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6Like(String value)
         {
              addCriterion("signature_cuisineimg_url_6  like ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6NotLike(String value)
         {
              addCriterion("signature_cuisineimg_url_6  not like ", value, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6In(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_6  in ", values, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6NotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_url_6  not in ", values, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6Between(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_6  between ", value1,value2, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgUrl6NotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_url_6  not between ", value1,value2, "signature_cuisineimg_url_6 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle1IsNull()
         {
              addCriterion("new_roducts_title_1 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1IsNotNull()
         {
              addCriterion("new_roducts_title_1  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1EqualTo(String value)
         {
              addCriterion("new_roducts_title_1  = ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_1  <> ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1GreaterThan(String value)
         {
              addCriterion("new_roducts_title_1  > ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_1  >= ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1LessThan(String value)
         {
              addCriterion("new_roducts_title_1  < ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_1  <= ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1Like(String value)
         {
              addCriterion("new_roducts_title_1  like ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1NotLike(String value)
         {
              addCriterion("new_roducts_title_1  not like ", value, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1In(List<String> values)
         {
              addCriterion("new_roducts_title_1  in ", values, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_1  not in ", values, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_1  between ", value1,value2, "new_roducts_title_1 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle1NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_1  not between ", value1,value2, "new_roducts_title_1 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle2IsNull()
         {
              addCriterion("new_roducts_title_2 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2IsNotNull()
         {
              addCriterion("new_roducts_title_2  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2EqualTo(String value)
         {
              addCriterion("new_roducts_title_2  = ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_2  <> ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2GreaterThan(String value)
         {
              addCriterion("new_roducts_title_2  > ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_2  >= ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2LessThan(String value)
         {
              addCriterion("new_roducts_title_2  < ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_2  <= ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2Like(String value)
         {
              addCriterion("new_roducts_title_2  like ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2NotLike(String value)
         {
              addCriterion("new_roducts_title_2  not like ", value, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2In(List<String> values)
         {
              addCriterion("new_roducts_title_2  in ", values, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_2  not in ", values, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_2  between ", value1,value2, "new_roducts_title_2 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle2NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_2  not between ", value1,value2, "new_roducts_title_2 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle3IsNull()
         {
              addCriterion("new_roducts_title_3 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3IsNotNull()
         {
              addCriterion("new_roducts_title_3  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3EqualTo(String value)
         {
              addCriterion("new_roducts_title_3  = ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_3  <> ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3GreaterThan(String value)
         {
              addCriterion("new_roducts_title_3  > ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_3  >= ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3LessThan(String value)
         {
              addCriterion("new_roducts_title_3  < ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_3  <= ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3Like(String value)
         {
              addCriterion("new_roducts_title_3  like ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3NotLike(String value)
         {
              addCriterion("new_roducts_title_3  not like ", value, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3In(List<String> values)
         {
              addCriterion("new_roducts_title_3  in ", values, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_3  not in ", values, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_3  between ", value1,value2, "new_roducts_title_3 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle3NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_3  not between ", value1,value2, "new_roducts_title_3 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle4IsNull()
         {
              addCriterion("new_roducts_title_4 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4IsNotNull()
         {
              addCriterion("new_roducts_title_4  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4EqualTo(String value)
         {
              addCriterion("new_roducts_title_4  = ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_4  <> ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4GreaterThan(String value)
         {
              addCriterion("new_roducts_title_4  > ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_4  >= ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4LessThan(String value)
         {
              addCriterion("new_roducts_title_4  < ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_4  <= ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4Like(String value)
         {
              addCriterion("new_roducts_title_4  like ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4NotLike(String value)
         {
              addCriterion("new_roducts_title_4  not like ", value, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4In(List<String> values)
         {
              addCriterion("new_roducts_title_4  in ", values, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_4  not in ", values, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_4  between ", value1,value2, "new_roducts_title_4 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle4NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_4  not between ", value1,value2, "new_roducts_title_4 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle5IsNull()
         {
              addCriterion("new_roducts_title_5 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5IsNotNull()
         {
              addCriterion("new_roducts_title_5  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5EqualTo(String value)
         {
              addCriterion("new_roducts_title_5  = ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_5  <> ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5GreaterThan(String value)
         {
              addCriterion("new_roducts_title_5  > ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_5  >= ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5LessThan(String value)
         {
              addCriterion("new_roducts_title_5  < ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_5  <= ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5Like(String value)
         {
              addCriterion("new_roducts_title_5  like ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5NotLike(String value)
         {
              addCriterion("new_roducts_title_5  not like ", value, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5In(List<String> values)
         {
              addCriterion("new_roducts_title_5  in ", values, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_5  not in ", values, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_5  between ", value1,value2, "new_roducts_title_5 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle5NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_5  not between ", value1,value2, "new_roducts_title_5 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle6IsNull()
         {
              addCriterion("new_roducts_title_6 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6IsNotNull()
         {
              addCriterion("new_roducts_title_6  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6EqualTo(String value)
         {
              addCriterion("new_roducts_title_6  = ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_6  <> ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6GreaterThan(String value)
         {
              addCriterion("new_roducts_title_6  > ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_6  >= ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6LessThan(String value)
         {
              addCriterion("new_roducts_title_6  < ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_6  <= ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6Like(String value)
         {
              addCriterion("new_roducts_title_6  like ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6NotLike(String value)
         {
              addCriterion("new_roducts_title_6  not like ", value, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6In(List<String> values)
         {
              addCriterion("new_roducts_title_6  in ", values, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_6  not in ", values, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_6  between ", value1,value2, "new_roducts_title_6 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle6NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_6  not between ", value1,value2, "new_roducts_title_6 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle7IsNull()
         {
              addCriterion("new_roducts_title_7 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7IsNotNull()
         {
              addCriterion("new_roducts_title_7  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7EqualTo(String value)
         {
              addCriterion("new_roducts_title_7  = ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_7  <> ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7GreaterThan(String value)
         {
              addCriterion("new_roducts_title_7  > ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_7  >= ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7LessThan(String value)
         {
              addCriterion("new_roducts_title_7  < ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_7  <= ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7Like(String value)
         {
              addCriterion("new_roducts_title_7  like ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7NotLike(String value)
         {
              addCriterion("new_roducts_title_7  not like ", value, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7In(List<String> values)
         {
              addCriterion("new_roducts_title_7  in ", values, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_7  not in ", values, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_7  between ", value1,value2, "new_roducts_title_7 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle7NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_7  not between ", value1,value2, "new_roducts_title_7 ");
              return (Criteria) this;
         }
         public Criteria andNewRoductsTitle8IsNull()
         {
              addCriterion("new_roducts_title_8 is null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8IsNotNull()
         {
              addCriterion("new_roducts_title_8  is not null");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8EqualTo(String value)
         {
              addCriterion("new_roducts_title_8  = ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8NotEqualTo(String value)
         {
              addCriterion("new_roducts_title_8  <> ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8GreaterThan(String value)
         {
              addCriterion("new_roducts_title_8  > ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_8  >= ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8LessThan(String value)
         {
              addCriterion("new_roducts_title_8  < ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8LessThanOrEqualTo(String value)
         {
              addCriterion("new_roducts_title_8  <= ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8Like(String value)
         {
              addCriterion("new_roducts_title_8  like ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8NotLike(String value)
         {
              addCriterion("new_roducts_title_8  not like ", value, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8In(List<String> values)
         {
              addCriterion("new_roducts_title_8  in ", values, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8NotIn(List<String> values)
         {
              addCriterion("new_roducts_title_8  not in ", values, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8Between(String value1, String value2)
         {
              addCriterion("new_roducts_title_8  between ", value1,value2, "new_roducts_title_8 ");
              return (Criteria) this;
         }

         public Criteria andNewRoductsTitle8NotBetween(String value1, String value2)
         {
              addCriterion("new_roducts_title_8  not between ", value1,value2, "new_roducts_title_8 ");
              return (Criteria) this;
         }
         public Criteria andProductListImgUrlIsNull()
         {
              addCriterion("product_list_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlIsNotNull()
         {
              addCriterion("product_list_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlEqualTo(String value)
         {
              addCriterion("product_list_img_url  = ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlNotEqualTo(String value)
         {
              addCriterion("product_list_img_url  <> ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlGreaterThan(String value)
         {
              addCriterion("product_list_img_url  > ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("product_list_img_url  >= ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlLessThan(String value)
         {
              addCriterion("product_list_img_url  < ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("product_list_img_url  <= ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlLike(String value)
         {
              addCriterion("product_list_img_url  like ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlNotLike(String value)
         {
              addCriterion("product_list_img_url  not like ", value, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlIn(List<String> values)
         {
              addCriterion("product_list_img_url  in ", values, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlNotIn(List<String> values)
         {
              addCriterion("product_list_img_url  not in ", values, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlBetween(String value1, String value2)
         {
              addCriterion("product_list_img_url  between ", value1,value2, "product_list_img_url ");
              return (Criteria) this;
         }

         public Criteria andProductListImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("product_list_img_url  not between ", value1,value2, "product_list_img_url ");
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

		public ColumnName addNewRoductsImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_1";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_2";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_3";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_4";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl5Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_5";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_5";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl6Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_6";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_6";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl7Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_7";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_7";
            }
            return this;
        }

		public ColumnName addNewRoductsImgUrl8Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_img_url_8";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_img_url_8";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_1";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_2";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_3";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_4";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl5Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_5";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_5";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgUrl6Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_url_6";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_url_6";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_1";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_2";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_3";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_4";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle5Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_5";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_5";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle6Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_6";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_6";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle7Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_7";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_7";
            }
            return this;
        }

		public ColumnName addNewRoductsTitle8Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_roducts_title_8";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_roducts_title_8";
            }
            return this;
        }

		public ColumnName addProductListImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="product_list_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",product_list_img_url";
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
