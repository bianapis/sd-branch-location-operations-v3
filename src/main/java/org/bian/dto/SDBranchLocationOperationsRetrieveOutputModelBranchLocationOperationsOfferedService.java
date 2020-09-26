package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService
 */
public class SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService   {
  private String branchLocationOperationsServiceReference = null;

  private SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord branchLocationOperationsServiceRecord = null;


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
   * Get branchLocationOperationsServiceRecord
   * @return branchLocationOperationsServiceRecord
  **/

  public SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord getBranchLocationOperationsServiceRecord() {
    return branchLocationOperationsServiceRecord;
  }

  public void setBranchLocationOperationsServiceRecord(SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedServiceBranchLocationOperationsServiceRecord branchLocationOperationsServiceRecord) {
    this.branchLocationOperationsServiceRecord = branchLocationOperationsServiceRecord;
  }


}

