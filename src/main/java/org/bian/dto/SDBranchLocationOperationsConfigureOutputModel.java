package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsConfigureOutputModel
 */
public class SDBranchLocationOperationsConfigureOutputModel   {
  private String branchLocationOperationsConfigurationActionTaskReference = null;

  private Object branchLocationOperationsConfigurationActionTaskRecord = null;

  private SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord = null;

  private String branchLocationOperationsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return branchLocationOperationsConfigurationActionTaskReference
  **/

  public String getBranchLocationOperationsConfigurationActionTaskReference() {
    return branchLocationOperationsConfigurationActionTaskReference;
  }

  public void setBranchLocationOperationsConfigurationActionTaskReference(String branchLocationOperationsConfigurationActionTaskReference) {
    this.branchLocationOperationsConfigurationActionTaskReference = branchLocationOperationsConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return branchLocationOperationsConfigurationActionTaskRecord
  **/

  public Object getBranchLocationOperationsConfigurationActionTaskRecord() {
    return branchLocationOperationsConfigurationActionTaskRecord;
  }

  public void setBranchLocationOperationsConfigurationActionTaskRecord(Object branchLocationOperationsConfigurationActionTaskRecord) {
    this.branchLocationOperationsConfigurationActionTaskRecord = branchLocationOperationsConfigurationActionTaskRecord;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationRecord
   * @return branchLocationOperationsServiceConfigurationRecord
  **/

  public SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord getBranchLocationOperationsServiceConfigurationRecord() {
    return branchLocationOperationsServiceConfigurationRecord;
  }

  public void setBranchLocationOperationsServiceConfigurationRecord(SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord) {
    this.branchLocationOperationsServiceConfigurationRecord = branchLocationOperationsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return branchLocationOperationsServicingSessionStatus
  **/

  public String getBranchLocationOperationsServicingSessionStatus() {
    return branchLocationOperationsServicingSessionStatus;
  }

  public void setBranchLocationOperationsServicingSessionStatus(String branchLocationOperationsServicingSessionStatus) {
    this.branchLocationOperationsServicingSessionStatus = branchLocationOperationsServicingSessionStatus;
  }


}

