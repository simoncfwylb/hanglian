package com.hangliantx.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hangliantx.common.pojo.DefaultPojo;

/**
 * 产品所属信息
 * @author changf 2016-3-19 下午12:44:58
 *
 */
public class ProductInfo extends DefaultPojo implements Serializable{

	private static final long serialVersionUID = -3354548690903504824L;

	/*产品类目*/
	//private ProductKind productKind;
	private int cid;
	/*产品名称*/
	private String title;

	private String sell_point;
	/*价格*/
	private BigDecimal price;
	/*数量*/
	private Integer num;
	/*条形码*/
	private String barcode;
	/*图片路劲*/
	private String image;
	/*状态*/	
	private String status;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSell_point() {
		return sell_point;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProductInfo [cid=" + cid + ", title=" + title + ", sell_point="
				+ sell_point + ", price=" + price + ", num=" + num
				+ ", barcode=" + barcode + ", image=" + image + ", status="
				+ status + "]";
	}

	
	
}
