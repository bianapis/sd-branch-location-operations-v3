package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines
 */
public class SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines   {
  private String branchLocationOperationsServiceEligibility = null;

  private String branchLocationOperationsServiceIntendedUses = null;

  private String branchLocationOperationsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return branchLocationOperationsServiceEligibility
  **/

  public String getBranchLocationOperationsServiceEligibility() {
    return branchLocationOperationsServiceEligibility;
  }

  public void setBranchLocationOperationsServiceEligibility(String branchLocationOperationsServiceEligibility) {
    this.branchLocationOperationsServiceEligibility = branchLocationOperationsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return branchLocationOperationsServiceIntendedUses
  **/

  public String getBranchLocationOperationsServiceIntendedUses() {
    return branchLocationOperationsServiceIntendedUses;
  }

  public void setBranchLocationOperationsServiceIntendedUses(String branchLocationOperationsServiceIntendedUses) {
    this.branchLocationOperationsServiceIntendedUses = branchLocationOperationsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return branchLocationOperationsServicePricingandTerms
  **/

  public String getBranchLocationOperationsServicePricingandTerms() {
    return branchLocationOperationsServicePricingandTerms;
  }

  public void setBranchLocationOperationsServicePricingandTerms(String branchLocationOperationsServicePricingandTerms) {
    this.branchLocationOperationsServicePricingandTerms = branchLocationOperationsServicePricingandTerms;
  }


}

