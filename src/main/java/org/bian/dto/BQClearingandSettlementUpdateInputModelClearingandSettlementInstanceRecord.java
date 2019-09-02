package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord
 */
public class BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord   {
  private String correspondentBankReference = null;

  private String correspondentBankClearingAgreementReference = null;

  private String correspondentBankClearingAgreementClearingInstructions = null;

  private String correspondentBankClearingAgreementSettlementInstructions = null;

  private String mirrorNostroAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondent bank referenced in the ACH transaction 
   * @return correspondentBankReference
  **/

  public String getCorrespondentBankReference() {
    return correspondentBankReference;
  }

  public void setCorrespondentBankReference(String correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the clearing agreement between bank and clearing house - includes schedule, limits 
   * @return correspondentBankClearingAgreementReference
  **/

  public String getCorrespondentBankClearingAgreementReference() {
    return correspondentBankClearingAgreementReference;
  }

  public void setCorrespondentBankClearingAgreementReference(String correspondentBankClearingAgreementReference) {
    this.correspondentBankClearingAgreementReference = correspondentBankClearingAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer specific default clearing instructions 
   * @return correspondentBankClearingAgreementClearingInstructions
  **/

  public String getCorrespondentBankClearingAgreementClearingInstructions() {
    return correspondentBankClearingAgreementClearingInstructions;
  }

  public void setCorrespondentBankClearingAgreementClearingInstructions(String correspondentBankClearingAgreementClearingInstructions) {
    this.correspondentBankClearingAgreementClearingInstructions = correspondentBankClearingAgreementClearingInstructions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer specific default settlement instruction e.g. to handle netting arrangements 
   * @return correspondentBankClearingAgreementSettlementInstructions
  **/

  public String getCorrespondentBankClearingAgreementSettlementInstructions() {
    return correspondentBankClearingAgreementSettlementInstructions;
  }

  public void setCorrespondentBankClearingAgreementSettlementInstructions(String correspondentBankClearingAgreementSettlementInstructions) {
    this.correspondentBankClearingAgreementSettlementInstructions = correspondentBankClearingAgreementSettlementInstructions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Account used central bank clearing reconciliations 
   * @return mirrorNostroAccountReference
  **/

  public String getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(String mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }


}

