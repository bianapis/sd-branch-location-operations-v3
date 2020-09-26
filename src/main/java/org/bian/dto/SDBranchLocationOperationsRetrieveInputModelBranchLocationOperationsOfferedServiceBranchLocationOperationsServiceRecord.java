package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord
 */
public class SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord   {
  private String branchLocationOperationsServiceVersion = null;


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


}

