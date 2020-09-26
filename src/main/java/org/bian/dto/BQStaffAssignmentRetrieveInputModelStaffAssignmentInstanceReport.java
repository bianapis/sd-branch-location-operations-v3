package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport
 */
public class BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport   {
  private String staffAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return staffAssignmentInstanceReportReference
  **/

  public String getStaffAssignmentInstanceReportReference() {
    return staffAssignmentInstanceReportReference;
  }

  public void setStaffAssignmentInstanceReportReference(String staffAssignmentInstanceReportReference) {
    this.staffAssignmentInstanceReportReference = staffAssignmentInstanceReportReference;
  }


}

