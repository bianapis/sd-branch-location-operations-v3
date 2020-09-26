package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord
 */
public class SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord   {
  private String branchLocationOperationsServiceConfigurationSettingReference = null;

  private String branchLocationOperationsServiceConfigurationSettingType = null;

  private SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return branchLocationOperationsServiceConfigurationSettingReference
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingReference() {
    return branchLocationOperationsServiceConfigurationSettingReference;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingReference(String branchLocationOperationsServiceConfigurationSettingReference) {
    this.branchLocationOperationsServiceConfigurationSettingReference = branchLocationOperationsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return branchLocationOperationsServiceConfigurationSettingType
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingType() {
    return branchLocationOperationsServiceConfigurationSettingType;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingType(String branchLocationOperationsServiceConfigurationSettingType) {
    this.branchLocationOperationsServiceConfigurationSettingType = branchLocationOperationsServiceConfigurationSettingType;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationSetup
   * @return branchLocationOperationsServiceConfigurationSetup
  **/

  public SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup getBranchLocationOperationsServiceConfigurationSetup() {
    return branchLocationOperationsServiceConfigurationSetup;
  }

  public void setBranchLocationOperationsServiceConfigurationSetup(SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup) {
    this.branchLocationOperationsServiceConfigurationSetup = branchLocationOperationsServiceConfigurationSetup;
  }


}

