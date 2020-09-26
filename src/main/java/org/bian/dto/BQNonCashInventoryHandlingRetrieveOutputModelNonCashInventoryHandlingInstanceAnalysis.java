package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis
 */
public class BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis   {
  private Object nonCashInventoryHandlingInstanceAnalysisRecord = null;

  private String nonCashInventoryHandlingInstanceAnalysisReportType = null;

  private String nonCashInventoryHandlingInstanceAnalysisParameters = null;

  private Object nonCashInventoryHandlingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return nonCashInventoryHandlingInstanceAnalysisRecord
  **/

  public Object getNonCashInventoryHandlingInstanceAnalysisRecord() {
    return nonCashInventoryHandlingInstanceAnalysisRecord;
  }

  public void setNonCashInventoryHandlingInstanceAnalysisRecord(Object nonCashInventoryHandlingInstanceAnalysisRecord) {
    this.nonCashInventoryHandlingInstanceAnalysisRecord = nonCashInventoryHandlingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return nonCashInventoryHandlingInstanceAnalysisReportType
  **/

  public String getNonCashInventoryHandlingInstanceAnalysisReportType() {
    return nonCashInventoryHandlingInstanceAnalysisReportType;
  }

  public void setNonCashInventoryHandlingInstanceAnalysisReportType(String nonCashInventoryHandlingInstanceAnalysisReportType) {
    this.nonCashInventoryHandlingInstanceAnalysisReportType = nonCashInventoryHandlingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return nonCashInventoryHandlingInstanceAnalysisParameters
  **/

  public String getNonCashInventoryHandlingInstanceAnalysisParameters() {
    return nonCashInventoryHandlingInstanceAnalysisParameters;
  }

  public void setNonCashInventoryHandlingInstanceAnalysisParameters(String nonCashInventoryHandlingInstanceAnalysisParameters) {
    this.nonCashInventoryHandlingInstanceAnalysisParameters = nonCashInventoryHandlingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return nonCashInventoryHandlingInstanceAnalysisReport
  **/

  public Object getNonCashInventoryHandlingInstanceAnalysisReport() {
    return nonCashInventoryHandlingInstanceAnalysisReport;
  }

  public void setNonCashInventoryHandlingInstanceAnalysisReport(Object nonCashInventoryHandlingInstanceAnalysisReport) {
    this.nonCashInventoryHandlingInstanceAnalysisReport = nonCashInventoryHandlingInstanceAnalysisReport;
  }


}

