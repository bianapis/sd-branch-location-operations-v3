package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription
 */
public class SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription   {
  private String branchLocationOperationsServiceSubscriberReference = null;

  private String branchLocationOperationsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return branchLocationOperationsServiceSubscriberReference
  **/

  public String getBranchLocationOperationsServiceSubscriberReference() {
    return branchLocationOperationsServiceSubscriberReference;
  }

  public void setBranchLocationOperationsServiceSubscriberReference(String branchLocationOperationsServiceSubscriberReference) {
    this.branchLocationOperationsServiceSubscriberReference = branchLocationOperationsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return branchLocationOperationsServiceSubscriberAccessProfile
  **/

  public String getBranchLocationOperationsServiceSubscriberAccessProfile() {
    return branchLocationOperationsServiceSubscriberAccessProfile;
  }

  public void setBranchLocationOperationsServiceSubscriberAccessProfile(String branchLocationOperationsServiceSubscriberAccessProfile) {
    this.branchLocationOperationsServiceSubscriberAccessProfile = branchLocationOperationsServiceSubscriberAccessProfile;
  }


}

