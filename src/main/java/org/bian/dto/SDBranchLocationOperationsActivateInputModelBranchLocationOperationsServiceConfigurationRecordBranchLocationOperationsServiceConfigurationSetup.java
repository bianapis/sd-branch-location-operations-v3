package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup
 */
public class SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup   {
  private String branchLocationOperationsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return branchLocationOperationsServiceConfigurationParameter
  **/

  public String getBranchLocationOperationsServiceConfigurationParameter() {
    return branchLocationOperationsServiceConfigurationParameter;
  }

  public void setBranchLocationOperationsServiceConfigurationParameter(String branchLocationOperationsServiceConfigurationParameter) {
    this.branchLocationOperationsServiceConfigurationParameter = branchLocationOperationsServiceConfigurationParameter;
  }


}

