package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRetrieveOutputModelSafeCustodyOperationsInstanceAnalysis
 */
public class BQSafeCustodyOperationsRetrieveOutputModelSafeCustodyOperationsInstanceAnalysis   {
  private Object safeCustodyOperationsInstanceAnalysisRecord = null;

  private String safeCustodyOperationsInstanceAnalysisReportType = null;

  private String safeCustodyOperationsInstanceAnalysisParameters = null;

  private Object safeCustodyOperationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return safeCustodyOperationsInstanceAnalysisRecord
  **/

  public Object getSafeCustodyOperationsInstanceAnalysisRecord() {
    return safeCustodyOperationsInstanceAnalysisRecord;
  }

  public void setSafeCustodyOperationsInstanceAnalysisRecord(Object safeCustodyOperationsInstanceAnalysisRecord) {
    this.safeCustodyOperationsInstanceAnalysisRecord = safeCustodyOperationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return safeCustodyOperationsInstanceAnalysisReportType
  **/

  public String getSafeCustodyOperationsInstanceAnalysisReportType() {
    return safeCustodyOperationsInstanceAnalysisReportType;
  }

  public void setSafeCustodyOperationsInstanceAnalysisReportType(String safeCustodyOperationsInstanceAnalysisReportType) {
    this.safeCustodyOperationsInstanceAnalysisReportType = safeCustodyOperationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return safeCustodyOperationsInstanceAnalysisParameters
  **/

  public String getSafeCustodyOperationsInstanceAnalysisParameters() {
    return safeCustodyOperationsInstanceAnalysisParameters;
  }

  public void setSafeCustodyOperationsInstanceAnalysisParameters(String safeCustodyOperationsInstanceAnalysisParameters) {
    this.safeCustodyOperationsInstanceAnalysisParameters = safeCustodyOperationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return safeCustodyOperationsInstanceAnalysisReport
  **/

  public Object getSafeCustodyOperationsInstanceAnalysisReport() {
    return safeCustodyOperationsInstanceAnalysisReport;
  }

  public void setSafeCustodyOperationsInstanceAnalysisReport(Object safeCustodyOperationsInstanceAnalysisReport) {
    this.safeCustodyOperationsInstanceAnalysisReport = safeCustodyOperationsInstanceAnalysisReport;
  }


}

