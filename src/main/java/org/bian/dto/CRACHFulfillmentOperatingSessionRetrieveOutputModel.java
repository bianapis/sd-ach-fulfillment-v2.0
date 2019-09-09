package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis;
import org.bian.dto.CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceRecord;
import org.bian.dto.CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveOutputModel
 */
public class CRACHFulfillmentOperatingSessionRetrieveOutputModel   {
  private CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionRetrieveActionTaskReference = null;

  private Object aCHFulfillmentOperatingSessionRetrieveActionTaskRecord = null;

  private String aCHFulfillmentOperatingSessionRetrieveActionResponse = null;

  private CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord aCHFulfillmentOperatingSessionInstanceReportRecord = null;

  private CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis aCHFulfillmentOperatingSessionInstanceAnalysis = null;


  /**
   * Get aCHFulfillmentOperatingSessionInstanceRecord
   * @return aCHFulfillmentOperatingSessionInstanceRecord
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionInstanceRecord")
  public CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceRecord getACHFulfillmentOperatingSessionInstanceRecord() {
    return aCHFulfillmentOperatingSessionInstanceRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceRecord(CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord) {
    this.aCHFulfillmentOperatingSessionInstanceRecord = aCHFulfillmentOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ACH Fulfillment Operating Session instance retrieve service call 
   * @return aCHFulfillmentOperatingSessionRetrieveActionTaskReference
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionRetrieveActionTaskReference")
  public String getACHFulfillmentOperatingSessionRetrieveActionTaskReference() {
    return aCHFulfillmentOperatingSessionRetrieveActionTaskReference;
  }

  public void setACHFulfillmentOperatingSessionRetrieveActionTaskReference(String aCHFulfillmentOperatingSessionRetrieveActionTaskReference) {
    this.aCHFulfillmentOperatingSessionRetrieveActionTaskReference = aCHFulfillmentOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return aCHFulfillmentOperatingSessionRetrieveActionTaskRecord
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionRetrieveActionTaskRecord")
  public Object getACHFulfillmentOperatingSessionRetrieveActionTaskRecord() {
    return aCHFulfillmentOperatingSessionRetrieveActionTaskRecord;
  }

  public void setACHFulfillmentOperatingSessionRetrieveActionTaskRecord(Object aCHFulfillmentOperatingSessionRetrieveActionTaskRecord) {
    this.aCHFulfillmentOperatingSessionRetrieveActionTaskRecord = aCHFulfillmentOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return aCHFulfillmentOperatingSessionRetrieveActionResponse
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionRetrieveActionResponse")
  public String getACHFulfillmentOperatingSessionRetrieveActionResponse() {
    return aCHFulfillmentOperatingSessionRetrieveActionResponse;
  }

  public void setACHFulfillmentOperatingSessionRetrieveActionResponse(String aCHFulfillmentOperatingSessionRetrieveActionResponse) {
    this.aCHFulfillmentOperatingSessionRetrieveActionResponse = aCHFulfillmentOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get aCHFulfillmentOperatingSessionInstanceReportRecord
   * @return aCHFulfillmentOperatingSessionInstanceReportRecord
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionInstanceReportRecord")
  public CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord getACHFulfillmentOperatingSessionInstanceReportRecord() {
    return aCHFulfillmentOperatingSessionInstanceReportRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportRecord(CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord aCHFulfillmentOperatingSessionInstanceReportRecord) {
    this.aCHFulfillmentOperatingSessionInstanceReportRecord = aCHFulfillmentOperatingSessionInstanceReportRecord;
  }


  /**
   * Get aCHFulfillmentOperatingSessionInstanceAnalysis
   * @return aCHFulfillmentOperatingSessionInstanceAnalysis
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionInstanceAnalysis")
  public CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis getACHFulfillmentOperatingSessionInstanceAnalysis() {
    return aCHFulfillmentOperatingSessionInstanceAnalysis;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysis(CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis aCHFulfillmentOperatingSessionInstanceAnalysis) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysis = aCHFulfillmentOperatingSessionInstanceAnalysis;
  }


}

