package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateInputModel
 */
public class SDBranchLocationOperationsActivateInputModel   {
  private Object branchLocationOperationsActivationActionTaskRecord = null;

  private String branchLocationOperationsCenterReference = null;

  private String branchLocationOperationsServiceReference = null;

  private SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return branchLocationOperationsCenterReference
  **/

  public String getBranchLocationOperationsCenterReference() {
    return branchLocationOperationsCenterReference;
  }

  public void setBranchLocationOperationsCenterReference(String branchLocationOperationsCenterReference) {
    this.branchLocationOperationsCenterReference = branchLocationOperationsCenterReference;
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

  public SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord getBranchLocationOperationsServiceConfigurationRecord() {
    return branchLocationOperationsServiceConfigurationRecord;
  }

  public void setBranchLocationOperationsServiceConfigurationRecord(SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecord branchLocationOperationsServiceConfigurationRecord) {
    this.branchLocationOperationsServiceConfigurationRecord = branchLocationOperationsServiceConfigurationRecord;
  }


}

