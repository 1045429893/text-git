package com.hd.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.math.BigInteger;


/**
@author Robot
*/
public class MlsdMobileProductPresentationExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public MlsdMobileProductPresentationExample()
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
         public Criteria andNewProductsImgUrl1IsNull()
         {
              addCriterion("new_products_img_url_1 is null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1IsNotNull()
         {
              addCriterion("new_products_img_url_1  is not null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1EqualTo(String value)
         {
              addCriterion("new_products_img_url_1  = ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1NotEqualTo(String value)
         {
              addCriterion("new_products_img_url_1  <> ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1GreaterThan(String value)
         {
              addCriterion("new_products_img_url_1  > ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_1  >= ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1LessThan(String value)
         {
              addCriterion("new_products_img_url_1  < ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1LessThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_1  <= ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1Like(String value)
         {
              addCriterion("new_products_img_url_1  like ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1NotLike(String value)
         {
              addCriterion("new_products_img_url_1  not like ", value, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1In(List<String> values)
         {
              addCriterion("new_products_img_url_1  in ", values, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1NotIn(List<String> values)
         {
              addCriterion("new_products_img_url_1  not in ", values, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1Between(String value1, String value2)
         {
              addCriterion("new_products_img_url_1  between ", value1,value2, "new_products_img_url_1 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl1NotBetween(String value1, String value2)
         {
              addCriterion("new_products_img_url_1  not between ", value1,value2, "new_products_img_url_1 ");
              return (Criteria) this;
         }
         public Criteria andNewProductsImgUrl2IsNull()
         {
              addCriterion("new_products_img_url_2 is null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2IsNotNull()
         {
              addCriterion("new_products_img_url_2  is not null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2EqualTo(String value)
         {
              addCriterion("new_products_img_url_2  = ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2NotEqualTo(String value)
         {
              addCriterion("new_products_img_url_2  <> ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2GreaterThan(String value)
         {
              addCriterion("new_products_img_url_2  > ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_2  >= ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2LessThan(String value)
         {
              addCriterion("new_products_img_url_2  < ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2LessThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_2  <= ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2Like(String value)
         {
              addCriterion("new_products_img_url_2  like ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2NotLike(String value)
         {
              addCriterion("new_products_img_url_2  not like ", value, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2In(List<String> values)
         {
              addCriterion("new_products_img_url_2  in ", values, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2NotIn(List<String> values)
         {
              addCriterion("new_products_img_url_2  not in ", values, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2Between(String value1, String value2)
         {
              addCriterion("new_products_img_url_2  between ", value1,value2, "new_products_img_url_2 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl2NotBetween(String value1, String value2)
         {
              addCriterion("new_products_img_url_2  not between ", value1,value2, "new_products_img_url_2 ");
              return (Criteria) this;
         }
         public Criteria andNewProductsImgUrl3IsNull()
         {
              addCriterion("new_products_img_url_3 is null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3IsNotNull()
         {
              addCriterion("new_products_img_url_3  is not null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3EqualTo(String value)
         {
              addCriterion("new_products_img_url_3  = ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3NotEqualTo(String value)
         {
              addCriterion("new_products_img_url_3  <> ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3GreaterThan(String value)
         {
              addCriterion("new_products_img_url_3  > ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_3  >= ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3LessThan(String value)
         {
              addCriterion("new_products_img_url_3  < ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3LessThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_3  <= ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3Like(String value)
         {
              addCriterion("new_products_img_url_3  like ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3NotLike(String value)
         {
              addCriterion("new_products_img_url_3  not like ", value, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3In(List<String> values)
         {
              addCriterion("new_products_img_url_3  in ", values, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3NotIn(List<String> values)
         {
              addCriterion("new_products_img_url_3  not in ", values, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3Between(String value1, String value2)
         {
              addCriterion("new_products_img_url_3  between ", value1,value2, "new_products_img_url_3 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl3NotBetween(String value1, String value2)
         {
              addCriterion("new_products_img_url_3  not between ", value1,value2, "new_products_img_url_3 ");
              return (Criteria) this;
         }
         public Criteria andNewProductsImgUrl4IsNull()
         {
              addCriterion("new_products_img_url_4 is null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4IsNotNull()
         {
              addCriterion("new_products_img_url_4  is not null");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4EqualTo(String value)
         {
              addCriterion("new_products_img_url_4  = ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4NotEqualTo(String value)
         {
              addCriterion("new_products_img_url_4  <> ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4GreaterThan(String value)
         {
              addCriterion("new_products_img_url_4  > ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4GreaterThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_4  >= ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4LessThan(String value)
         {
              addCriterion("new_products_img_url_4  < ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4LessThanOrEqualTo(String value)
         {
              addCriterion("new_products_img_url_4  <= ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4Like(String value)
         {
              addCriterion("new_products_img_url_4  like ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4NotLike(String value)
         {
              addCriterion("new_products_img_url_4  not like ", value, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4In(List<String> values)
         {
              addCriterion("new_products_img_url_4  in ", values, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4NotIn(List<String> values)
         {
              addCriterion("new_products_img_url_4  not in ", values, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4Between(String value1, String value2)
         {
              addCriterion("new_products_img_url_4  between ", value1,value2, "new_products_img_url_4 ");
              return (Criteria) this;
         }

         public Criteria andNewProductsImgUrl4NotBetween(String value1, String value2)
         {
              addCriterion("new_products_img_url_4  not between ", value1,value2, "new_products_img_url_4 ");
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
         public Criteria andNewProductsTitleImgUrlIsNull()
         {
              addCriterion("new_products_title_img_url is null");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlIsNotNull()
         {
              addCriterion("new_products_title_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlEqualTo(String value)
         {
              addCriterion("new_products_title_img_url  = ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlNotEqualTo(String value)
         {
              addCriterion("new_products_title_img_url  <> ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlGreaterThan(String value)
         {
              addCriterion("new_products_title_img_url  > ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("new_products_title_img_url  >= ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlLessThan(String value)
         {
              addCriterion("new_products_title_img_url  < ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("new_products_title_img_url  <= ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlLike(String value)
         {
              addCriterion("new_products_title_img_url  like ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlNotLike(String value)
         {
              addCriterion("new_products_title_img_url  not like ", value, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlIn(List<String> values)
         {
              addCriterion("new_products_title_img_url  in ", values, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlNotIn(List<String> values)
         {
              addCriterion("new_products_title_img_url  not in ", values, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlBetween(String value1, String value2)
         {
              addCriterion("new_products_title_img_url  between ", value1,value2, "new_products_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andNewProductsTitleImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("new_products_title_img_url  not between ", value1,value2, "new_products_title_img_url ");
              return (Criteria) this;
         }
         public Criteria andSignatureCuisineimgTitleImgUrlIsNull()
         {
              addCriterion("signature_cuisineimg_title_img_url is null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlIsNotNull()
         {
              addCriterion("signature_cuisineimg_title_img_url  is not null");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  = ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlNotEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  <> ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlGreaterThan(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  > ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlGreaterThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  >= ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlLessThan(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  < ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlLessThanOrEqualTo(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  <= ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlLike(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  like ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlNotLike(String value)
         {
              addCriterion("signature_cuisineimg_title_img_url  not like ", value, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_title_img_url  in ", values, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlNotIn(List<String> values)
         {
              addCriterion("signature_cuisineimg_title_img_url  not in ", values, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_title_img_url  between ", value1,value2, "signature_cuisineimg_title_img_url ");
              return (Criteria) this;
         }

         public Criteria andSignatureCuisineimgTitleImgUrlNotBetween(String value1, String value2)
         {
              addCriterion("signature_cuisineimg_title_img_url  not between ", value1,value2, "signature_cuisineimg_title_img_url ");
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

		public ColumnName addNewProductsImgUrl1Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_products_img_url_1";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_products_img_url_1";
            }
            return this;
        }

		public ColumnName addNewProductsImgUrl2Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_products_img_url_2";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_products_img_url_2";
            }
            return this;
        }

		public ColumnName addNewProductsImgUrl3Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_products_img_url_3";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_products_img_url_3";
            }
            return this;
        }

		public ColumnName addNewProductsImgUrl4Column()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_products_img_url_4";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_products_img_url_4";
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

		public ColumnName addNewProductsTitleImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="new_products_title_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",new_products_title_img_url";
            }
            return this;
        }

		public ColumnName addSignatureCuisineimgTitleImgUrlColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="signature_cuisineimg_title_img_url";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",signature_cuisineimg_title_img_url";
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
