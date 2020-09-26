package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsConfigureInputModel
 */
public class SDBranchLocationOperationsConfigureInputModel   {
  private Object branchLocationOperationsConfigurationActionTaskRecord = null;

  private String branchLocationOperationsServicingSessionReference = null;

  private String branchLocationOperationsServiceReference = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchLocationOperationsServiceReference
  **/

  public String getBranchLocationOperationsServiceReference() {
    return branchLocationOperationsServiceReference;
  }

  public void setBranchLocationOperationsServiceReference(String branchLocationOperationsServiceReference) {
    this.branchLocationOperationsServiceReference = branchLocationOperationsServiceReference;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationRecord
   * @return branchLocationOperationsServiceConfigurationRecord
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord getBranchLocationOperationsServiceConfigurationRecord() {
    return branchLocationOperationsServiceConfigurationRecord;
  }

  public void setBranchLocationOperationsServiceConfigurationRecord(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord) {
    this.branchLocationOperationsServiceConfigurationRecord = branchLocationOperationsServiceConfigurationRecord;
  }


}

