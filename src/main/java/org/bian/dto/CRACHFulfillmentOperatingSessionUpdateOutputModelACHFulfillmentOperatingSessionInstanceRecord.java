package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord
 */
public class CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord   {
  private String aCHAccessSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the ACH service availability 
   * @return aCHAccessSchedule
  **/

  public String getACHAccessSchedule() {
    return aCHAccessSchedule;
  }

  public void setACHAccessSchedule(String aCHAccessSchedule) {
    this.aCHAccessSchedule = aCHAccessSchedule;
  }


}

