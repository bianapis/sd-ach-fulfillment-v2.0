package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHRetrieveOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis;
import org.bian.dto.BQOutboundACHRetrieveOutputModelOutboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHRetrieveOutputModelOutboundACHInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundACHRetrieveOutputModel
 */
public class BQOutboundACHRetrieveOutputModel   {
  private BQOutboundACHRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQOutboundACHRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String outboundACHRetrieveActionTaskReference = null;

  private Object outboundACHRetrieveActionTaskRecord = null;

  private String outboundACHRetrieveActionResponse = null;

  private BQOutboundACHRetrieveOutputModelOutboundACHInstanceReport outboundACHInstanceReport = null;

  private BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis outboundACHInstanceAnalysis = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQOutboundACHRetrieveOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQOutboundACHRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQOutboundACHRetrieveOutputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQOutboundACHRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Outbound ACH instance retrieve service call 
   * @return outboundACHRetrieveActionTaskReference
  **/

  public String getOutboundACHRetrieveActionTaskReference() {
    return outboundACHRetrieveActionTaskReference;
  }

  public void setOutboundACHRetrieveActionTaskReference(String outboundACHRetrieveActionTaskReference) {
    this.outboundACHRetrieveActionTaskReference = outboundACHRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return outboundACHRetrieveActionTaskRecord
  **/

  public Object getOutboundACHRetrieveActionTaskRecord() {
    return outboundACHRetrieveActionTaskRecord;
  }

  public void setOutboundACHRetrieveActionTaskRecord(Object outboundACHRetrieveActionTaskRecord) {
    this.outboundACHRetrieveActionTaskRecord = outboundACHRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return outboundACHRetrieveActionResponse
  **/

  public String getOutboundACHRetrieveActionResponse() {
    return outboundACHRetrieveActionResponse;
  }

  public void setOutboundACHRetrieveActionResponse(String outboundACHRetrieveActionResponse) {
    this.outboundACHRetrieveActionResponse = outboundACHRetrieveActionResponse;
  }


  /**
   * Get outboundACHInstanceReport
   * @return outboundACHInstanceReport
  **/

  public BQOutboundACHRetrieveOutputModelOutboundACHInstanceReport getOutboundACHInstanceReport() {
    return outboundACHInstanceReport;
  }

  public void setOutboundACHInstanceReport(BQOutboundACHRetrieveOutputModelOutboundACHInstanceReport outboundACHInstanceReport) {
    this.outboundACHInstanceReport = outboundACHInstanceReport;
  }


  /**
   * Get outboundACHInstanceAnalysis
   * @return outboundACHInstanceAnalysis
  **/

  public BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis getOutboundACHInstanceAnalysis() {
    return outboundACHInstanceAnalysis;
  }

  public void setOutboundACHInstanceAnalysis(BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis outboundACHInstanceAnalysis) {
    this.outboundACHInstanceAnalysis = outboundACHInstanceAnalysis;
  }


}

