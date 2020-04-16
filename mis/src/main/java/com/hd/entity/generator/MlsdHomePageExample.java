package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdHomePageExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdHomePageExample()
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
         public Criteria andBanner21IsNull()
         {
              addCriterion("banner_2_1 is null");
              return (Criteria) this;
         }

         public Criteria andBanner21IsNotNull()
         {
              addCriterion("banner_2_1  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner21EqualTo(String value)
         {
              addCriterion("banner_2_1  = ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21NotEqualTo(String value)
         {
              addCriterion("banner_2_1  <> ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21GreaterThan(String value)
         {
              addCriterion("banner_2_1  > ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_2_1  >= ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21LessThan(String value)
         {
              addCriterion("banner_2_1  < ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21LessThanOrEqualTo(String value)
         {
              addCriterion("banner_2_1  <= ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21Like(String value)
         {
              addCriterion("banner_2_1  like ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21NotLike(String value)
         {
              addCriterion("banner_2_1  not like ", value, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21In(List<String> values)
         {
              addCriterion("banner_2_1  in ", values, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21NotIn(List<String> values)
         {
              addCriterion("banner_2_1  not in ", values, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21Between(String value1, String value2)
         {
              addCriterion("banner_2_1  between ", value1,value2, "banner_2_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner21NotBetween(String value1, String value2)
         {
              addCriterion("banner_2_1  not between ", value1,value2, "banner_2_1 ");
              return (Criteria) this;
         }
         public Criteria andBanner22IsNull()
         {
              addCriterion("banner_2_2 is null");
              return (Criteria) this;
         }

         public Criteria andBanner22IsNotNull()
         {
              addCriterion("banner_2_2  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner22EqualTo(String value)
         {
              addCriterion("banner_2_2  = ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22NotEqualTo(String value)
         {
              addCriterion("banner_2_2  <> ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22GreaterThan(String value)
         {
              addCriterion("banner_2_2  > ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_2_2  >= ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22LessThan(String value)
         {
              addCriterion("banner_2_2  < ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22LessThanOrEqualTo(String value)
         {
              addCriterion("banner_2_2  <= ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22Like(String value)
         {
              addCriterion("banner_2_2  like ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22NotLike(String value)
         {
              addCriterion("banner_2_2  not like ", value, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22In(List<String> values)
         {
              addCriterion("banner_2_2  in ", values, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22NotIn(List<String> values)
         {
              addCriterion("banner_2_2  not in ", values, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22Between(String value1, String value2)
         {
              addCriterion("banner_2_2  between ", value1,value2, "banner_2_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner22NotBetween(String value1, String value2)
         {
              addCriterion("banner_2_2  not between ", value1,value2, "banner_2_2 ");
              return (Criteria) this;
         }
         public Criteria andBanner23IsNull()
         {
              addCriterion("banner_2_3 is null");
              return (Criteria) this;
         }

         public Criteria andBanner23IsNotNull()
         {
              addCriterion("banner_2_3  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner23EqualTo(String value)
         {
              addCriterion("banner_2_3  = ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23NotEqualTo(String value)
         {
              addCriterion("banner_2_3  <> ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23GreaterThan(String value)
         {
              addCriterion("banner_2_3  > ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_2_3  >= ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23LessThan(String value)
         {
              addCriterion("banner_2_3  < ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23LessThanOrEqualTo(String value)
         {
              addCriterion("banner_2_3  <= ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23Like(String value)
         {
              addCriterion("banner_2_3  like ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23NotLike(String value)
         {
              addCriterion("banner_2_3  not like ", value, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23In(List<String> values)
         {
              addCriterion("banner_2_3  in ", values, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23NotIn(List<String> values)
         {
              addCriterion("banner_2_3  not in ", values, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23Between(String value1, String value2)
         {
              addCriterion("banner_2_3  between ", value1,value2, "banner_2_3 ");
              return (Criteria) this;
         }

         public Criteria andBanner23NotBetween(String value1, String value2)
         {
              addCriterion("banner_2_3  not between ", value1,value2, "banner_2_3 ");
              return (Criteria) this;
         }
         public Criteria andBanner31IsNull()
         {
              addCriterion("banner_3_1 is null");
              return (Criteria) this;
         }

         public Criteria andBanner31IsNotNull()
         {
              addCriterion("banner_3_1  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner31EqualTo(String value)
         {
              addCriterion("banner_3_1  = ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31NotEqualTo(String value)
         {
              addCriterion("banner_3_1  <> ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31GreaterThan(String value)
         {
              addCriterion("banner_3_1  > ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_3_1  >= ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31LessThan(String value)
         {
              addCriterion("banner_3_1  < ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31LessThanOrEqualTo(String value)
         {
              addCriterion("banner_3_1  <= ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31Like(String value)
         {
              addCriterion("banner_3_1  like ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31NotLike(String value)
         {
              addCriterion("banner_3_1  not like ", value, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31In(List<String> values)
         {
              addCriterion("banner_3_1  in ", values, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31NotIn(List<String> values)
         {
              addCriterion("banner_3_1  not in ", values, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31Between(String value1, String value2)
         {
              addCriterion("banner_3_1  between ", value1,value2, "banner_3_1 ");
              return (Criteria) this;
         }

         public Criteria andBanner31NotBetween(String value1, String value2)
         {
              addCriterion("banner_3_1  not between ", value1,value2, "banner_3_1 ");
              return (Criteria) this;
         }
         public Criteria andBanner32IsNull()
         {
              addCriterion("banner_3_2 is null");
              return (Criteria) this;
         }

         public Criteria andBanner32IsNotNull()
         {
              addCriterion("banner_3_2  is not null");
              return (Criteria) this;
         }

         public Criteria andBanner32EqualTo(String value)
         {
              addCriterion("banner_3_2  = ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32NotEqualTo(String value)
         {
              addCriterion("banner_3_2  <> ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32GreaterThan(String value)
         {
              addCriterion("banner_3_2  > ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32GreaterThanOrEqualTo(String value)
         {
              addCriterion("banner_3_2  >= ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32LessThan(String value)
         {
              addCriterion("banner_3_2  < ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32LessThanOrEqualTo(String value)
         {
              addCriterion("banner_3_2  <= ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32Like(String value)
         {
              addCriterion("banner_3_2  like ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32NotLike(String value)
         {
              addCriterion("banner_3_2  not like ", value, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32In(List<String> values)
         {
              addCriterion("banner_3_2  in ", values, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32NotIn(List<String> values)
         {
              addCriterion("banner_3_2  not in ", values, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32Between(String value1, String value2)
         {
              addCriterion("banner_3_2  between ", value1,value2, "banner_3_2 ");
              return (Criteria) this;
         }

         public Criteria andBanner32NotBetween(String value1, String value2)
         {
              addCriterion("banner_3_2  not between ", value1,value2, "banner_3_2 ");
              return (Criteria) this;
         }
         public Criteria andIntroduceTextImgUrlIsNull()
         {
              addCriterion("introduce_text_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlIsNotNull()
         {
              addCriterion("introduce_text_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  = ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  <> ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_text_img_url  > ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  >= ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLessThan(String value)
         {
              addCriterion("introduce_text_img_url  < ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_text_img_url  <= ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlLike(String value)
         {
              addCriterion("introduce_text_img_url  like ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotLike(String value)
         {
              addCriterion("introduce_text_img_url  not like ", value, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlIn(List<String> values)
         {
              addCriterion("introduce_text_img_url  in ", values, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_text_img_url  not in ", values, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_text_img_url  between ", value1,value2, "introduce_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceTextImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_text_img_url  not between ", value1,value2, "introduce_text_img_url ");
              return (Criteria) this;
         }
         public Criteria andIntroduceProductImgUrlIsNull()
         {
              addCriterion("introduce_product_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlIsNotNull()
         {
              addCriterion("introduce_product_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  = ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  <> ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_product_img_url  > ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  >= ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLessThan(String value)
         {
              addCriterion("introduce_product_img_url  < ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_product_img_url  <= ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlLike(String value)
         {
              addCriterion("introduce_product_img_url  like ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotLike(String value)
         {
              addCriterion("introduce_product_img_url  not like ", value, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlIn(List<String> values)
         {
              addCriterion("introduce_product_img_url  in ", values, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_product_img_url  not in ", values, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_product_img_url  between ", value1,value2, "introduce_product_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceProductImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_product_img_url  not between ", value1,value2, "introduce_product_img_url ");
              return (Criteria) this;
         }
         public Criteria andIntroduceIntroImgUrlIsNull()
         {
              addCriterion("introduce_intro_img_url is null");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlIsNotNull()
         {
              addCriterion("introduce_intro_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  = ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  <> ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlGreaterThan(String value)
         {
              addCriterion("introduce_intro_img_url  > ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  >= ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLessThan(String value)
         {
              addCriterion("introduce_intro_img_url  < ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("introduce_intro_img_url  <= ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlLike(String value)
         {
              addCriterion("introduce_intro_img_url  like ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotLike(String value)
         {
              addCriterion("introduce_intro_img_url  not like ", value, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlIn(List<String> values)
         {
              addCriterion("introduce_intro_img_url  in ", values, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotIn(List<String> values)
         {
              addCriterion("introduce_intro_img_url  not in ", values, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlBetween(String value1, String value2)
         {
              addCriterion("introduce_intro_img_url  between ", value1,value2, "introduce_intro_img_url ");
              return (Criteria) this;
         }

         public Criteria andIntroduceIntroImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("introduce_intro_img_url  not between ", value1,value2, "introduce_intro_img_url ");
              return (Criteria) this;
         }
         public Criteria andProfitImgUrlIsNull()
         {
              addCriterion("profit_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlIsNotNull()
         {
              addCriterion("profit_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlEqualTo(String value)
         {
              addCriterion("profit_img_url  = ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlNotEqualTo(String value)
         {
              addCriterion("profit_img_url  <> ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlGreaterThan(String value)
         {
              addCriterion("profit_img_url  > ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("profit_img_url  >= ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlLessThan(String value)
         {
              addCriterion("profit_img_url  < ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("profit_img_url  <= ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlLike(String value)
         {
              addCriterion("profit_img_url  like ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlNotLike(String value)
         {
              addCriterion("profit_img_url  not like ", value, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlIn(List<String> values)
         {
              addCriterion("profit_img_url  in ", values, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlNotIn(List<String> values)
         {
              addCriterion("profit_img_url  not in ", values, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlBetween(String value1, String value2)
         {
              addCriterion("profit_img_url  between ", value1,value2, "profit_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("profit_img_url  not between ", value1,value2, "profit_img_url ");
              return (Criteria) this;
         }
         public Criteria andProfitTextImgUrlIsNull()
         {
              addCriterion("profit_text_img_url is null");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlIsNotNull()
         {
              addCriterion("profit_text_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlEqualTo(String value)
         {
              addCriterion("profit_text_img_url  = ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlNotEqualTo(String value)
         {
              addCriterion("profit_text_img_url  <> ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlGreaterThan(String value)
         {
              addCriterion("profit_text_img_url  > ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("profit_text_img_url  >= ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlLessThan(String value)
         {
              addCriterion("profit_text_img_url  < ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("profit_text_img_url  <= ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlLike(String value)
         {
              addCriterion("profit_text_img_url  like ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlNotLike(String value)
         {
              addCriterion("profit_text_img_url  not like ", value, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlIn(List<String> values)
         {
              addCriterion("profit_text_img_url  in ", values, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlNotIn(List<String> values)
         {
              addCriterion("profit_text_img_url  not in ", values, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlBetween(String value1, String value2)
         {
              addCriterion("profit_text_img_url  between ", value1,value2, "profit_text_img_url ");
              return (Criteria) this;
         }

         public Criteria andProfitTextImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("profit_text_img_url  not between ", value1,value2, "profit_text_img_url ");
              return (Criteria) this;
         }
         public Criteria andShopSign1IsNull()
         {
              addCriterion("shop_sign_1 is null");
              return (Criteria) this;
         }

         public Criteria andShopSign1IsNotNull()
         {
              addCriterion("shop_sign_1  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSign1EqualTo(String value)
         {
              addCriterion("shop_sign_1  = ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1NotEqualTo(String value)
         {
              addCriterion("shop_sign_1  <> ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1GreaterThan(String value)
         {
              addCriterion("shop_sign_1  > ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_1  >= ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1LessThan(String value)
         {
              addCriterion("shop_sign_1  < ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_1  <= ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1Like(String value)
         {
              addCriterion("shop_sign_1  like ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1NotLike(String value)
         {
              addCriterion("shop_sign_1  not like ", value, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1In(List<String> values)
         {
              addCriterion("shop_sign_1  in ", values, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1NotIn(List<String> values)
         {
              addCriterion("shop_sign_1  not in ", values, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1Between(String value1, String value2)
         {
              addCriterion("shop_sign_1  between ", value1,value2, "shop_sign_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSign1NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_1  not between ", value1,value2, "shop_sign_1 ");
              return (Criteria) this;
         }
         public Criteria andShopSign2IsNull()
         {
              addCriterion("shop_sign_2 is null");
              return (Criteria) this;
         }

         public Criteria andShopSign2IsNotNull()
         {
              addCriterion("shop_sign_2  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSign2EqualTo(String value)
         {
              addCriterion("shop_sign_2  = ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2NotEqualTo(String value)
         {
              addCriterion("shop_sign_2  <> ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2GreaterThan(String value)
         {
              addCriterion("shop_sign_2  > ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_2  >= ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2LessThan(String value)
         {
              addCriterion("shop_sign_2  < ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_2  <= ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2Like(String value)
         {
              addCriterion("shop_sign_2  like ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2NotLike(String value)
         {
              addCriterion("shop_sign_2  not like ", value, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2In(List<String> values)
         {
              addCriterion("shop_sign_2  in ", values, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2NotIn(List<String> values)
         {
              addCriterion("shop_sign_2  not in ", values, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2Between(String value1, String value2)
         {
              addCriterion("shop_sign_2  between ", value1,value2, "shop_sign_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSign2NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_2  not between ", value1,value2, "shop_sign_2 ");
              return (Criteria) this;
         }
         public Criteria andShopSign3IsNull()
         {
              addCriterion("shop_sign_3 is null");
              return (Criteria) this;
         }

         public Criteria andShopSign3IsNotNull()
         {
              addCriterion("shop_sign_3  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSign3EqualTo(String value)
         {
              addCriterion("shop_sign_3  = ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3NotEqualTo(String value)
         {
              addCriterion("shop_sign_3  <> ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3GreaterThan(String value)
         {
              addCriterion("shop_sign_3  > ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_3  >= ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3LessThan(String value)
         {
              addCriterion("shop_sign_3  < ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_3  <= ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3Like(String value)
         {
              addCriterion("shop_sign_3  like ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3NotLike(String value)
         {
              addCriterion("shop_sign_3  not like ", value, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3In(List<String> values)
         {
              addCriterion("shop_sign_3  in ", values, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3NotIn(List<String> values)
         {
              addCriterion("shop_sign_3  not in ", values, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3Between(String value1, String value2)
         {
              addCriterion("shop_sign_3  between ", value1,value2, "shop_sign_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSign3NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_3  not between ", value1,value2, "shop_sign_3 ");
              return (Criteria) this;
         }
         public Criteria andShopSign4IsNull()
         {
              addCriterion("shop_sign_4 is null");
              return (Criteria) this;
         }

         public Criteria andShopSign4IsNotNull()
         {
              addCriterion("shop_sign_4  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSign4EqualTo(String value)
         {
              addCriterion("shop_sign_4  = ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4NotEqualTo(String value)
         {
              addCriterion("shop_sign_4  <> ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4GreaterThan(String value)
         {
              addCriterion("shop_sign_4  > ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_4  >= ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4LessThan(String value)
         {
              addCriterion("shop_sign_4  < ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_4  <= ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4Like(String value)
         {
              addCriterion("shop_sign_4  like ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4NotLike(String value)
         {
              addCriterion("shop_sign_4  not like ", value, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4In(List<String> values)
         {
              addCriterion("shop_sign_4  in ", values, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4NotIn(List<String> values)
         {
              addCriterion("shop_sign_4  not in ", values, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4Between(String value1, String value2)
         {
              addCriterion("shop_sign_4  between ", value1,value2, "shop_sign_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSign4NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_4  not between ", value1,value2, "shop_sign_4 ");
              return (Criteria) this;
         }
         public Criteria andShopSignBackground1IsNull()
         {
              addCriterion("shop_sign_background_1 is null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1IsNotNull()
         {
              addCriterion("shop_sign_background_1  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1EqualTo(String value)
         {
              addCriterion("shop_sign_background_1  = ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1NotEqualTo(String value)
         {
              addCriterion("shop_sign_background_1  <> ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1GreaterThan(String value)
         {
              addCriterion("shop_sign_background_1  > ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_1  >= ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1LessThan(String value)
         {
              addCriterion("shop_sign_background_1  < ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_1  <= ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1Like(String value)
         {
              addCriterion("shop_sign_background_1  like ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1NotLike(String value)
         {
              addCriterion("shop_sign_background_1  not like ", value, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1In(List<String> values)
         {
              addCriterion("shop_sign_background_1  in ", values, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1NotIn(List<String> values)
         {
              addCriterion("shop_sign_background_1  not in ", values, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1Between(String value1, String value2)
         {
              addCriterion("shop_sign_background_1  between ", value1,value2, "shop_sign_background_1 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground1NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_background_1  not between ", value1,value2, "shop_sign_background_1 ");
              return (Criteria) this;
         }
         public Criteria andShopSignBackground2IsNull()
         {
              addCriterion("shop_sign_background_2 is null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2IsNotNull()
         {
              addCriterion("shop_sign_background_2  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2EqualTo(String value)
         {
              addCriterion("shop_sign_background_2  = ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2NotEqualTo(String value)
         {
              addCriterion("shop_sign_background_2  <> ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2GreaterThan(String value)
         {
              addCriterion("shop_sign_background_2  > ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_2  >= ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2LessThan(String value)
         {
              addCriterion("shop_sign_background_2  < ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_2  <= ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2Like(String value)
         {
              addCriterion("shop_sign_background_2  like ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2NotLike(String value)
         {
              addCriterion("shop_sign_background_2  not like ", value, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2In(List<String> values)
         {
              addCriterion("shop_sign_background_2  in ", values, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2NotIn(List<String> values)
         {
              addCriterion("shop_sign_background_2  not in ", values, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2Between(String value1, String value2)
         {
              addCriterion("shop_sign_background_2  between ", value1,value2, "shop_sign_background_2 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground2NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_background_2  not between ", value1,value2, "shop_sign_background_2 ");
              return (Criteria) this;
         }
         public Criteria andShopSignBackground3IsNull()
         {
              addCriterion("shop_sign_background_3 is null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3IsNotNull()
         {
              addCriterion("shop_sign_background_3  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3EqualTo(String value)
         {
              addCriterion("shop_sign_background_3  = ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3NotEqualTo(String value)
         {
              addCriterion("shop_sign_background_3  <> ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3GreaterThan(String value)
         {
              addCriterion("shop_sign_background_3  > ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_3  >= ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3LessThan(String value)
         {
              addCriterion("shop_sign_background_3  < ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_3  <= ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3Like(String value)
         {
              addCriterion("shop_sign_background_3  like ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3NotLike(String value)
         {
              addCriterion("shop_sign_background_3  not like ", value, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3In(List<String> values)
         {
              addCriterion("shop_sign_background_3  in ", values, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3NotIn(List<String> values)
         {
              addCriterion("shop_sign_background_3  not in ", values, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3Between(String value1, String value2)
         {
              addCriterion("shop_sign_background_3  between ", value1,value2, "shop_sign_background_3 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground3NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_background_3  not between ", value1,value2, "shop_sign_background_3 ");
              return (Criteria) this;
         }
         public Criteria andShopSignBackground4IsNull()
         {
              addCriterion("shop_sign_background_4 is null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4IsNotNull()
         {
              addCriterion("shop_sign_background_4  is not null");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4EqualTo(String value)
         {
              addCriterion("shop_sign_background_4  = ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4NotEqualTo(String value)
         {
              addCriterion("shop_sign_background_4  <> ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4GreaterThan(String value)
         {
              addCriterion("shop_sign_background_4  > ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4GreaterThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_4  >= ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4LessThan(String value)
         {
              addCriterion("shop_sign_background_4  < ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4LessThanOrEqualTo(String value)
         {
              addCriterion("shop_sign_background_4  <= ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4Like(String value)
         {
              addCriterion("shop_sign_background_4  like ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4NotLike(String value)
         {
              addCriterion("shop_sign_background_4  not like ", value, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4In(List<String> values)
         {
              addCriterion("shop_sign_background_4  in ", values, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4NotIn(List<String> values)
         {
              addCriterion("shop_sign_background_4  not in ", values, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4Between(String value1, String value2)
         {
              addCriterion("shop_sign_background_4  between ", value1,value2, "shop_sign_background_4 ");
              return (Criteria) this;
         }

         public Criteria andShopSignBackground4NotBetween(String value1, String value2)
         {
              addCriterion("shop_sign_background_4  not between ", value1,value2, "shop_sign_background_4 ");
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

		public ColumnName addBanner21Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_2_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_2_1";
            }
            return this;
        }

		public ColumnName addBanner22Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_2_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_2_2";
            }
            return this;
        }

		public ColumnName addBanner23Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_2_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_2_3";
            }
            return this;
        }

		public ColumnName addBanner31Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_3_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_3_1";
            }
            return this;
        }

		public ColumnName addBanner32Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="banner_3_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",banner_3_2";
            }
            return this;
        }

		public ColumnName addIntroduceTextImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_text_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_text_img_url";
            }
            return this;
        }

		public ColumnName addIntroduceProductImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_product_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_product_img_url";
            }
            return this;
        }

		public ColumnName addIntroduceIntroImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="introduce_intro_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",introduce_intro_img_url";
            }
            return this;
        }

		public ColumnName addProfitImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="profit_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",profit_img_url";
            }
            return this;
        }

		public ColumnName addProfitTextImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="profit_text_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",profit_text_img_url";
            }
            return this;
        }

		public ColumnName addShopSign1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_1";
            }
            return this;
        }

		public ColumnName addShopSign2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_2";
            }
            return this;
        }

		public ColumnName addShopSign3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_3";
            }
            return this;
        }

		public ColumnName addShopSign4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_4";
            }
            return this;
        }

		public ColumnName addShopSignBackground1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_background_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_background_1";
            }
            return this;
        }

		public ColumnName addShopSignBackground2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_background_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_background_2";
            }
            return this;
        }

		public ColumnName addShopSignBackground3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_background_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_background_3";
            }
            return this;
        }

		public ColumnName addShopSignBackground4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="shop_sign_background_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",shop_sign_background_4";
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
