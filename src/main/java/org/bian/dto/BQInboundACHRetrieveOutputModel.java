package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis;
import org.bian.dto.BQInboundACHRetrieveOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQInboundACHRetrieveOutputModelInboundACHInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundACHRetrieveOutputModel
 */
public class BQInboundACHRetrieveOutputModel   {
  private BQInboundACHRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private String inboundACHRetrieveActionTaskReference = null;

  private Object inboundACHRetrieveActionTaskRecord = null;

  private String inboundACHRetrieveActionResponse = null;

  private BQInboundACHRetrieveOutputModelInboundACHInstanceReport inboundACHInstanceReport = null;

  private BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis inboundACHInstanceAnalysis = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQInboundACHRetrieveOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQInboundACHRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inbound ACH instance retrieve service call 
   * @return inboundACHRetrieveActionTaskReference
  **/

  public String getInboundACHRetrieveActionTaskReference() {
    return inboundACHRetrieveActionTaskReference;
  }

  public void setInboundACHRetrieveActionTaskReference(String inboundACHRetrieveActionTaskReference) {
    this.inboundACHRetrieveActionTaskReference = inboundACHRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inboundACHRetrieveActionTaskRecord
  **/

  public Object getInboundACHRetrieveActionTaskRecord() {
    return inboundACHRetrieveActionTaskRecord;
  }

  public void setInboundACHRetrieveActionTaskRecord(Object inboundACHRetrieveActionTaskRecord) {
    this.inboundACHRetrieveActionTaskRecord = inboundACHRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inboundACHRetrieveActionResponse
  **/

  public String getInboundACHRetrieveActionResponse() {
    return inboundACHRetrieveActionResponse;
  }

  public void setInboundACHRetrieveActionResponse(String inboundACHRetrieveActionResponse) {
    this.inboundACHRetrieveActionResponse = inboundACHRetrieveActionResponse;
  }


  /**
   * Get inboundACHInstanceReport
   * @return inboundACHInstanceReport
  **/

  public BQInboundACHRetrieveOutputModelInboundACHInstanceReport getInboundACHInstanceReport() {
    return inboundACHInstanceReport;
  }

  public void setInboundACHInstanceReport(BQInboundACHRetrieveOutputModelInboundACHInstanceReport inboundACHInstanceReport) {
    this.inboundACHInstanceReport = inboundACHInstanceReport;
  }


  /**
   * Get inboundACHInstanceAnalysis
   * @return inboundACHInstanceAnalysis
  **/

  public BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis getInboundACHInstanceAnalysis() {
    return inboundACHInstanceAnalysis;
  }

  public void setInboundACHInstanceAnalysis(BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis inboundACHInstanceAnalysis) {
    this.inboundACHInstanceAnalysis = inboundACHInstanceAnalysis;
  }


}

