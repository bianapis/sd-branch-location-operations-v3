package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord
 */
public class SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord   {
  private String branchLocationOperationsServiceType = null;

  private String branchLocationOperationsServiceVersion = null;

  private String branchLocationOperationsServiceDescription = null;

  private SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines branchLocationOperationsServicePoliciesandGuidelines = null;

  private String branchLocationOperationsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return branchLocationOperationsServiceType
  **/

  public String getBranchLocationOperationsServiceType() {
    return branchLocationOperationsServiceType;
  }

  public void setBranchLocationOperationsServiceType(String branchLocationOperationsServiceType) {
    this.branchLocationOperationsServiceType = branchLocationOperationsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return branchLocationOperationsServiceVersion
  **/

  public String getBranchLocationOperationsServiceVersion() {
    return branchLocationOperationsServiceVersion;
  }

  public void setBranchLocationOperationsServiceVersion(String branchLocationOperationsServiceVersion) {
    this.branchLocationOperationsServiceVersion = branchLocationOperationsServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return branchLocationOperationsServiceDescription
  **/

  public String getBranchLocationOperationsServiceDescription() {
    return branchLocationOperationsServiceDescription;
  }

  public void setBranchLocationOperationsServiceDescription(String branchLocationOperationsServiceDescription) {
    this.branchLocationOperationsServiceDescription = branchLocationOperationsServiceDescription;
  }


  /**
   * Get branchLocationOperationsServicePoliciesandGuidelines
   * @return branchLocationOperationsServicePoliciesandGuidelines
  **/

  public SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines getBranchLocationOperationsServicePoliciesandGuidelines() {
    return branchLocationOperationsServicePoliciesandGuidelines;
  }

  public void setBranchLocationOperationsServicePoliciesandGuidelines(SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecordBranchLocationOperationsServicePoliciesandGuidelines branchLocationOperationsServicePoliciesandGuidelines) {
    this.branchLocationOperationsServicePoliciesandGuidelines = branchLocationOperationsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return branchLocationOperationsServiceSchedule
  **/

  public String getBranchLocationOperationsServiceSchedule() {
    return branchLocationOperationsServiceSchedule;
  }

  public void setBranchLocationOperationsServiceSchedule(String branchLocationOperationsServiceSchedule) {
    this.branchLocationOperationsServiceSchedule = branchLocationOperationsServiceSchedule;
  }


}

