package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsFeedbackInputModelBranchLocationOperationsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsFeedbackInputModel
 */
public class SDBranchLocationOperationsFeedbackInputModel   {
  private Object branchLocationOperationsFeedbackActionTaskRecord = null;

  private SDBranchLocationOperationsFeedbackInputModelBranchLocationOperationsFeedbackActionRecord branchLocationOperationsFeedbackActionRecord = null;


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

  public SDBranchLocationOperationsFeedbackInputModelBranchLocationOperationsFeedbackActionRecord getBranchLocationOperationsFeedbackActionRecord() {
    return branchLocationOperationsFeedbackActionRecord;
  }

  public void setBranchLocationOperationsFeedbackActionRecord(SDBranchLocationOperationsFeedbackInputModelBranchLocationOperationsFeedbackActionRecord branchLocationOperationsFeedbackActionRecord) {
    this.branchLocationOperationsFeedbackActionRecord = branchLocationOperationsFeedbackActionRecord;
  }


}

