package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentRetrieveOutputModelStaffAssignmentInstanceReport
 */
public class BQStaffAssignmentRetrieveOutputModelStaffAssignmentInstanceReport   {
  private Object staffAssignmentInstanceReportRecord = null;

  private String staffAssignmentInstanceReportType = null;

  private String staffAssignmentInstanceReportParameters = null;

  private Object staffAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return staffAssignmentInstanceReportRecord
  **/

  public Object getStaffAssignmentInstanceReportRecord() {
    return staffAssignmentInstanceReportRecord;
  }

  public void setStaffAssignmentInstanceReportRecord(Object staffAssignmentInstanceReportRecord) {
    this.staffAssignmentInstanceReportRecord = staffAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return staffAssignmentInstanceReportType
  **/

  public String getStaffAssignmentInstanceReportType() {
    return staffAssignmentInstanceReportType;
  }

  public void setStaffAssignmentInstanceReportType(String staffAssignmentInstanceReportType) {
    this.staffAssignmentInstanceReportType = staffAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return staffAssignmentInstanceReportParameters
  **/

  public String getStaffAssignmentInstanceReportParameters() {
    return staffAssignmentInstanceReportParameters;
  }

  public void setStaffAssignmentInstanceReportParameters(String staffAssignmentInstanceReportParameters) {
    this.staffAssignmentInstanceReportParameters = staffAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return staffAssignmentInstanceReport
  **/

  public Object getStaffAssignmentInstanceReport() {
    return staffAssignmentInstanceReport;
  }

  public void setStaffAssignmentInstanceReport(Object staffAssignmentInstanceReport) {
    this.staffAssignmentInstanceReport = staffAssignmentInstanceReport;
  }


}

