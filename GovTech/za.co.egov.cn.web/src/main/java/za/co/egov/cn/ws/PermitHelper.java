package za.co.egov.cn.ws;

import java.util.Date;

import za.co.egov.cn.Permit;

public class PermitHelper {
	private String permitNo;
	private String comment;
	private String referenceNo;
	private Date dateIssued;
	private Date dteValidFrom;
	private Date dteValidTo;
	private double amountPaid;
	private String permittype;
	private String permitstatus;

	public PermitHelper(){
		
	}
	public PermitHelper(Permit c) {
			this.permitNo = c.getPermitNo();
			this.comment = c.getComment();
			this.referenceNo = c.getReferenceNo();
			this.permitstatus = c.getPermitstatus().getStatus();
			this.referenceNo = c.getReferenceNo();
			this.dateIssued = c.getDateIssued();
			this.dteValidFrom = c.getDteValidFrom();
			this.dteValidTo = c.getDteValidTo();
			this.amountPaid = c.getAmountPaid();
			this.permittype = c.getPermittype().getName();
	}
	public String getWData(Permit c){
		String val = "";
		val+="permitNo:"+ c.getPermitNo();
		val+="\n";
		val+="comment:"+ c.getComment();
		val+="\n";
		val+="referenceNo:"+ c.getReferenceNo();
		val+="\n";
		val+="permitstatus:"+ c.getPermitstatus().getStatus();
		val+="\n";
		val+="referenceNo:"+ c.getReferenceNo();
		val+="\n";
		val+="dateIssued:"+ c.getDateIssued();
		val+="\n";
		val+="dteValidFrom:"+ c.getDteValidFrom();
		val+="\n";
		val+="dteValidTo:"+ c.getDteValidTo();
		val+="\n";
		val+="amountPaid:"+ c.getAmountPaid();
		val+="\n";
		val+="permittype:"+ c.getPermittype().getName();
		val+="\n";
		return val;
	}
}
