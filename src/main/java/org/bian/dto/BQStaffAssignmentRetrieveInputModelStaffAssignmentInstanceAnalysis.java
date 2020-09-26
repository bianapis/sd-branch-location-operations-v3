package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis
 */
public class BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis   {
  private String staffAssignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return staffAssignmentInstanceAnalysisReference
  **/

  public String getStaffAssignmentInstanceAnalysisReference() {
    return staffAssignmentInstanceAnalysisReference;
  }

  public void setStaffAssignmentInstanceAnalysisReference(String staffAssignmentInstanceAnalysisReference) {
    this.staffAssignmentInstanceAnalysisReference = staffAssignmentInstanceAnalysisReference;
  }


}

