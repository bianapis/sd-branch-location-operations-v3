package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement
 */
public class SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement   {
  private String branchLocationOperationsServiceAgreementReference = null;

  private String branchLocationOperationsServiceUserReference = null;

  private String branchLocationOperationsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return branchLocationOperationsServiceAgreementReference
  **/

  public String getBranchLocationOperationsServiceAgreementReference() {
    return branchLocationOperationsServiceAgreementReference;
  }

  public void setBranchLocationOperationsServiceAgreementReference(String branchLocationOperationsServiceAgreementReference) {
    this.branchLocationOperationsServiceAgreementReference = branchLocationOperationsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return branchLocationOperationsServiceUserReference
  **/

  public String getBranchLocationOperationsServiceUserReference() {
    return branchLocationOperationsServiceUserReference;
  }

  public void setBranchLocationOperationsServiceUserReference(String branchLocationOperationsServiceUserReference) {
    this.branchLocationOperationsServiceUserReference = branchLocationOperationsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return branchLocationOperationsServiceAgreementTermsandConditions
  **/

  public String getBranchLocationOperationsServiceAgreementTermsandConditions() {
    return branchLocationOperationsServiceAgreementTermsandConditions;
  }

  public void setBranchLocationOperationsServiceAgreementTermsandConditions(String branchLocationOperationsServiceAgreementTermsandConditions) {
    this.branchLocationOperationsServiceAgreementTermsandConditions = branchLocationOperationsServiceAgreementTermsandConditions;
  }


}

