package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentRetrieveOutputModelStaffAssignmentInstanceAnalysis
 */
public class BQStaffAssignmentRetrieveOutputModelStaffAssignmentInstanceAnalysis   {
  private Object staffAssignmentInstanceAnalysisRecord = null;

  private String staffAssignmentInstanceAnalysisReportType = null;

  private String staffAssignmentInstanceAnalysisParameters = null;

  private Object staffAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return staffAssignmentInstanceAnalysisRecord
  **/

  public Object getStaffAssignmentInstanceAnalysisRecord() {
    return staffAssignmentInstanceAnalysisRecord;
  }

  public void setStaffAssignmentInstanceAnalysisRecord(Object staffAssignmentInstanceAnalysisRecord) {
    this.staffAssignmentInstanceAnalysisRecord = staffAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return staffAssignmentInstanceAnalysisReportType
  **/

  public String getStaffAssignmentInstanceAnalysisReportType() {
    return staffAssignmentInstanceAnalysisReportType;
  }

  public void setStaffAssignmentInstanceAnalysisReportType(String staffAssignmentInstanceAnalysisReportType) {
    this.staffAssignmentInstanceAnalysisReportType = staffAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return staffAssignmentInstanceAnalysisParameters
  **/

  public String getStaffAssignmentInstanceAnalysisParameters() {
    return staffAssignmentInstanceAnalysisParameters;
  }

  public void setStaffAssignmentInstanceAnalysisParameters(String staffAssignmentInstanceAnalysisParameters) {
    this.staffAssignmentInstanceAnalysisParameters = staffAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return staffAssignmentInstanceAnalysisReport
  **/

  public Object getStaffAssignmentInstanceAnalysisReport() {
    return staffAssignmentInstanceAnalysisReport;
  }

  public void setStaffAssignmentInstanceAnalysisReport(Object staffAssignmentInstanceAnalysisReport) {
    this.staffAssignmentInstanceAnalysisReport = staffAssignmentInstanceAnalysisReport;
  }


}

