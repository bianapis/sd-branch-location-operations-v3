package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsFeedbackOutputModelBranchLocationOperationsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsFeedbackOutputModel
 */
public class SDBranchLocationOperationsFeedbackOutputModel   {
  private String branchLocationOperationsFeedbackActionTaskReference = null;

  private Object branchLocationOperationsFeedbackActionTaskRecord = null;

  private SDBranchLocationOperationsFeedbackOutputModelBranchLocationOperationsFeedbackActionRecord branchLocationOperationsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return branchLocationOperationsFeedbackActionTaskReference
  **/

  public String getBranchLocationOperationsFeedbackActionTaskReference() {
    return branchLocationOperationsFeedbackActionTaskReference;
  }

  public void setBranchLocationOperationsFeedbackActionTaskReference(String branchLocationOperationsFeedbackActionTaskReference) {
    this.branchLocationOperationsFeedbackActionTaskReference = branchLocationOperationsFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return branchLocationOperationsFeedbackActionTaskRecord
  **/

  public Object getBranchLocationOperationsFeedbackActionTaskRecord() {
    return branchLocationOperationsFeedbackActionTaskRecord;
  }

  public void setBranchLocationOperationsFeedbackActionTaskRecord(Object branchLocationOperationsFeedbackActionTaskRecord) {
    this.branchLocationOperationsFeedbackActionTaskRecord = branchLocationOperationsFeedbackActionTaskRecord;
  }


  /**
   * Get branchLocationOperationsFeedbackActionRecord
   * @return branchLocationOperationsFeedbackActionRecord
  **/

  public SDBranchLocationOperationsFeedbackOutputModelBranchLocationOperationsFeedbackActionRecord getBranchLocationOperationsFeedbackActionRecord() {
    return branchLocationOperationsFeedbackActionRecord;
  }

  public void setBranchLocationOperationsFeedbackActionRecord(SDBranchLocationOperationsFeedbackOutputModelBranchLocationOperationsFeedbackActionRecord branchLocationOperationsFeedbackActionRecord) {
    this.branchLocationOperationsFeedbackActionRecord = branchLocationOperationsFeedbackActionRecord;
  }


}

