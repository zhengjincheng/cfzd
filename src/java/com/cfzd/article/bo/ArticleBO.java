package com.cfzd.article.bo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Article")
public class ArticleBO implements Serializable{
	 /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
	@XmlElement
   private Integer id;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.title
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   private String title;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.image
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   private String image;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.content_uri
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   private String contentUri;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.icon
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   private String icon;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column article.aticle_cate_id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   private Integer aticleCateId;

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.id
    *
    * @return the value of article.id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public Integer getId() {
       return id;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.id
    *
    * @param id the value for article.id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setId(Integer id) {
       this.id = id;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.title
    *
    * @return the value of article.title
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public String getTitle() {
       return title;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.title
    *
    * @param title the value for article.title
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setTitle(String title) {
       this.title = title == null ? null : title.trim();
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.image
    *
    * @return the value of article.image
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public String getImage() {
       return image;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.image
    *
    * @param image the value for article.image
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setImage(String image) {
       this.image = image == null ? null : image.trim();
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.content_uri
    *
    * @return the value of article.content_uri
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public String getContentUri() {
       return contentUri;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.content_uri
    *
    * @param contentUri the value for article.content_uri
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setContentUri(String contentUri) {
       this.contentUri = contentUri == null ? null : contentUri.trim();
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.icon
    *
    * @return the value of article.icon
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public String getIcon() {
       return icon;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.icon
    *
    * @param icon the value for article.icon
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setIcon(String icon) {
       this.icon = icon == null ? null : icon.trim();
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method returns the value of the database column article.aticle_cate_id
    *
    * @return the value of article.aticle_cate_id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   public Integer getAticleCateId() {
       return aticleCateId;
   }

   /**
    * This method was generated by MyBatis Generator.
    * This method sets the value of the database column article.aticle_cate_id
    *
    * @param aticleCateId the value for article.aticle_cate_id
    *
    * @mbggenerated Tue Jul 19 07:10:25 CST 2016
    */
   @XmlElement
   public void setAticleCateId(Integer aticleCateId) {
       this.aticleCateId = aticleCateId;
   }

@Override
public String toString() {
	return "ArticleBO [id=" + id + ", title=" + title + ", image=" + image + ", contentUri=" + contentUri + ", icon="
			+ icon + ", aticleCateId=" + aticleCateId + "]";
}
   
}
