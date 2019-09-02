package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingInitiateInputModelWarehousingInstanceRecord;
import org.bian.dto.BQWarehousingRetrieveOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord;
import org.bian.dto.BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis;
import org.bian.dto.BQWarehousingRetrieveOutputModelWarehousingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveOutputModel
 */
public class BQWarehousingRetrieveOutputModel   {
  private BQWarehousingRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord = null;

  private String warehousingRetrieveActionTaskReference = null;

  private Object warehousingRetrieveActionTaskRecord = null;

  private String warehousingRetrieveActionResponse = null;

  private BQWarehousingRetrieveOutputModelWarehousingInstanceReport warehousingInstanceReport = null;

  private BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis warehousingInstanceAnalysis = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQWarehousingRetrieveOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQWarehousingRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get warehousingInstanceRecord
   * @return warehousingInstanceRecord
  **/

  public BQWarehousingInitiateInputModelWarehousingInstanceRecord getWarehousingInstanceRecord() {
    return warehousingInstanceRecord;
  }

  public void setWarehousingInstanceRecord(BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord) {
    this.warehousingInstanceRecord = warehousingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Warehousing instance retrieve service call 
   * @return warehousingRetrieveActionTaskReference
  **/

  public String getWarehousingRetrieveActionTaskReference() {
    return warehousingRetrieveActionTaskReference;
  }

  public void setWarehousingRetrieveActionTaskReference(String warehousingRetrieveActionTaskReference) {
    this.warehousingRetrieveActionTaskReference = warehousingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return warehousingRetrieveActionTaskRecord
  **/

  public Object getWarehousingRetrieveActionTaskRecord() {
    return warehousingRetrieveActionTaskRecord;
  }

  public void setWarehousingRetrieveActionTaskRecord(Object warehousingRetrieveActionTaskRecord) {
    this.warehousingRetrieveActionTaskRecord = warehousingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return warehousingRetrieveActionResponse
  **/

  public String getWarehousingRetrieveActionResponse() {
    return warehousingRetrieveActionResponse;
  }

  public void setWarehousingRetrieveActionResponse(String warehousingRetrieveActionResponse) {
    this.warehousingRetrieveActionResponse = warehousingRetrieveActionResponse;
  }


  /**
   * Get warehousingInstanceReport
   * @return warehousingInstanceReport
  **/

  public BQWarehousingRetrieveOutputModelWarehousingInstanceReport getWarehousingInstanceReport() {
    return warehousingInstanceReport;
  }

  public void setWarehousingInstanceReport(BQWarehousingRetrieveOutputModelWarehousingInstanceReport warehousingInstanceReport) {
    this.warehousingInstanceReport = warehousingInstanceReport;
  }


  /**
   * Get warehousingInstanceAnalysis
   * @return warehousingInstanceAnalysis
  **/

  public BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis getWarehousingInstanceAnalysis() {
    return warehousingInstanceAnalysis;
  }

  public void setWarehousingInstanceAnalysis(BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis warehousingInstanceAnalysis) {
    this.warehousingInstanceAnalysis = warehousingInstanceAnalysis;
  }


}

