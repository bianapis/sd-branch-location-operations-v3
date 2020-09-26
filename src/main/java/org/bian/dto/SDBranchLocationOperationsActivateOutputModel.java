package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateOutputModel
 */
public class SDBranchLocationOperationsActivateOutputModel   {
  private String branchLocationOperationsActivationActionTaskReference = null;

  private Object branchLocationOperationsActivationActionTaskRecord = null;

  private String branchLocationOperationsServicingSessionReference = null;

  private Object branchLocationOperationsServicingSessionRecord = null;

  private SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord = null;

  private String branchLocationOperationsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return branchLocationOperationsActivationActionTaskReference
  **/

  public String getBranchLocationOperationsActivationActionTaskReference() {
    return branchLocationOperationsActivationActionTaskReference;
  }

  public void setBranchLocationOperationsActivationActionTaskReference(String branchLocationOperationsActivationActionTaskReference) {
    this.branchLocationOperationsActivationActionTaskReference = branchLocationOperationsActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return branchLocationOperationsActivationActionTaskRecord
  **/

  public Object getBranchLocationOperationsActivationActionTaskRecord() {
    return branchLocationOperationsActivationActionTaskRecord;
  }

  public void setBranchLocationOperationsActivationActionTaskRecord(Object branchLocationOperationsActivationActionTaskRecord) {
    this.branchLocationOperationsActivationActionTaskRecord = branchLocationOperationsActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchLocationOperationsServicingSessionReference
  **/

  public String getBranchLocationOperationsServicingSessionReference() {
    return branchLocationOperationsServicingSessionReference;
  }

  public void setBranchLocationOperationsServicingSessionReference(String branchLocationOperationsServicingSessionReference) {
    this.branchLocationOperationsServicingSessionReference = branchLocationOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return branchLocationOperationsServicingSessionRecord
  **/

  public Object getBranchLocationOperationsServicingSessionRecord() {
    return branchLocationOperationsServicingSessionRecord;
  }

  public void setBranchLocationOperationsServicingSessionRecord(Object branchLocationOperationsServicingSessionRecord) {
    this.branchLocationOperationsServicingSessionRecord = branchLocationOperationsServicingSessionRecord;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationRecord
   * @return branchLocationOperationsServiceConfigurationRecord
  **/

  public SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord getBranchLocationOperationsServiceConfigurationRecord() {
    return branchLocationOperationsServiceConfigurationRecord;
  }

  public void setBranchLocationOperationsServiceConfigurationRecord(SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord) {
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

