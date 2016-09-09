package com.cfzd.bo.auction;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AuctionsBO implements Serializable {
	private List<AuctionBO> autions;
	private ImageBO image;

	
	public List<AuctionBO> getAutions() {
		return autions;
	}

	public void setAutions(List<AuctionBO> autions) {
		this.autions = autions;
	}

	public ImageBO getImage() {
		return image;
	}

	public void setImage(ImageBO image) {
		this.image = image;
	}

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auctions.id
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auctions.name
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auctions.endTime
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    private Date endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auctions.id
     *
     * @return the value of auctions.id
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auctions.id
     *
     * @param id the value for auctions.id
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auctions.name
     *
     * @return the value of auctions.name
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auctions.name
     *
     * @param name the value for auctions.name
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auctions.endTime
     *
     * @return the value of auctions.endTime
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auctions.endTime
     *
     * @param endtime the value for auctions.endTime
     *
     * @mbggenerated Sun Sep 04 20:37:00 CST 2016
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}