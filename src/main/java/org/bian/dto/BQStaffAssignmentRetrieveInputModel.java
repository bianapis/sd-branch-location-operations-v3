package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis;
import org.bian.dto.BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentRetrieveInputModel
 */
public class BQStaffAssignmentRetrieveInputModel   {
  private Object staffAssignmentRetrieveActionTaskRecord = null;

  private String staffAssignmentRetrieveActionRequest = null;

  private BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport staffAssignmentInstanceReport = null;

  private BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis staffAssignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return staffAssignmentRetrieveActionTaskRecord
  **/

  public Object getStaffAssignmentRetrieveActionTaskRecord() {
    return staffAssignmentRetrieveActionTaskRecord;
  }

  public void setStaffAssignmentRetrieveActionTaskRecord(Object staffAssignmentRetrieveActionTaskRecord) {
    this.staffAssignmentRetrieveActionTaskRecord = staffAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return staffAssignmentRetrieveActionRequest
  **/

  public String getStaffAssignmentRetrieveActionRequest() {
    return staffAssignmentRetrieveActionRequest;
  }

  public void setStaffAssignmentRetrieveActionRequest(String staffAssignmentRetrieveActionRequest) {
    this.staffAssignmentRetrieveActionRequest = staffAssignmentRetrieveActionRequest;
  }


  /**
   * Get staffAssignmentInstanceReport
   * @return staffAssignmentInstanceReport
  **/

  public BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport getStaffAssignmentInstanceReport() {
    return staffAssignmentInstanceReport;
  }

  public void setStaffAssignmentInstanceReport(BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceReport staffAssignmentInstanceReport) {
    this.staffAssignmentInstanceReport = staffAssignmentInstanceReport;
  }


  /**
   * Get staffAssignmentInstanceAnalysis
   * @return staffAssignmentInstanceAnalysis
  **/

  public BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis getStaffAssignmentInstanceAnalysis() {
    return staffAssignmentInstanceAnalysis;
  }

  public void setStaffAssignmentInstanceAnalysis(BQStaffAssignmentRetrieveInputModelStaffAssignmentInstanceAnalysis staffAssignmentInstanceAnalysis) {
    this.staffAssignmentInstanceAnalysis = staffAssignmentInstanceAnalysis;
  }


}

