package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHRetrieveInputModelOutboundACHInstanceAnalysis;
import org.bian.dto.BQOutboundACHRetrieveInputModelOutboundACHInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundACHRetrieveInputModel
 */
public class BQOutboundACHRetrieveInputModel   {
  private Object outboundACHRetrieveActionTaskRecord = null;

  private String outboundACHRetrieveActionRequest = null;

  private BQOutboundACHRetrieveInputModelOutboundACHInstanceReport outboundACHInstanceReport = null;

  private BQOutboundACHRetrieveInputModelOutboundACHInstanceAnalysis outboundACHInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return outboundACHRetrieveActionRequest
  **/

  public String getOutboundACHRetrieveActionRequest() {
    return outboundACHRetrieveActionRequest;
  }

  public void setOutboundACHRetrieveActionRequest(String outboundACHRetrieveActionRequest) {
    this.outboundACHRetrieveActionRequest = outboundACHRetrieveActionRequest;
  }


  /**
   * Get outboundACHInstanceReport
   * @return outboundACHInstanceReport
  **/

  public BQOutboundACHRetrieveInputModelOutboundACHInstanceReport getOutboundACHInstanceReport() {
    return outboundACHInstanceReport;
  }

  public void setOutboundACHInstanceReport(BQOutboundACHRetrieveInputModelOutboundACHInstanceReport outboundACHInstanceReport) {
    this.outboundACHInstanceReport = outboundACHInstanceReport;
  }


  /**
   * Get outboundACHInstanceAnalysis
   * @return outboundACHInstanceAnalysis
  **/

  public BQOutboundACHRetrieveInputModelOutboundACHInstanceAnalysis getOutboundACHInstanceAnalysis() {
    return outboundACHInstanceAnalysis;
  }

  public void setOutboundACHInstanceAnalysis(BQOutboundACHRetrieveInputModelOutboundACHInstanceAnalysis outboundACHInstanceAnalysis) {
    this.outboundACHInstanceAnalysis = outboundACHInstanceAnalysis;
  }


}

