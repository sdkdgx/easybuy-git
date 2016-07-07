package src.sdust.easybuy.model;

import sdust.easybuy.model.*;
import sdust.easybuy.model.EasyBuyOrder;

/**
 * EasybuyOrderDetail entity. @author MyEclipse Persistence Tools
 */

public class EasyBuyOrderDetail {

	// Fields

	private Integer eodId;
	private sdust.easybuy.model.EasyBuyProduct easybuyProduct;
	private sdust.easybuy.model.EasyBuyOrder easybuyOrder;
	private Integer eodQuantity;

	// Constructors

	/** default constructor */
	public EasyBuyOrderDetail() {
	}

	/** full constructor */
	public EasyBuyOrderDetail(sdust.easybuy.model.EasyBuyProduct easybuyProduct,
							  sdust.easybuy.model.EasyBuyOrder easybuyOrder, Integer eodQuantity) {
		this.easybuyProduct = easybuyProduct;
		this.easybuyOrder = easybuyOrder;
		this.eodQuantity = eodQuantity;
	}

	// Property accessors

	public Integer getEodId() {
		return this.eodId;
	}

	public void setEodId(Integer eodId) {
		this.eodId = eodId;
	}

	public sdust.easybuy.model.EasyBuyProduct getEasybuyProduct() {
		return this.easybuyProduct;
	}

	public void setEasybuyProduct(sdust.easybuy.model.EasyBuyProduct easybuyProduct) {
		this.easybuyProduct = easybuyProduct;
	}

	public sdust.easybuy.model.EasyBuyOrder getEasybuyOrder() {
		return this.easybuyOrder;
	}

	public void setEasybuyOrder(EasyBuyOrder easybuyOrder) {
		this.easybuyOrder = easybuyOrder;
	}

	public Integer getEodQuantity() {
		return this.eodQuantity;
	}

	public void setEodQuantity(Integer eodQuantity) {
		this.eodQuantity = eodQuantity;
	}

}