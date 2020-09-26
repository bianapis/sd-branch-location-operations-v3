package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis
 */
public class BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis   {
  private Object cashInventoryHandlingInstanceAnalysisRecord = null;

  private String cashInventoryHandlingInstanceAnalysisReportType = null;

  private String cashInventoryHandlingInstanceAnalysisParameters = null;

  private Object cashInventoryHandlingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashInventoryHandlingInstanceAnalysisRecord
  **/

  public Object getCashInventoryHandlingInstanceAnalysisRecord() {
    return cashInventoryHandlingInstanceAnalysisRecord;
  }

  public void setCashInventoryHandlingInstanceAnalysisRecord(Object cashInventoryHandlingInstanceAnalysisRecord) {
    this.cashInventoryHandlingInstanceAnalysisRecord = cashInventoryHandlingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashInventoryHandlingInstanceAnalysisReportType
  **/

  public String getCashInventoryHandlingInstanceAnalysisReportType() {
    return cashInventoryHandlingInstanceAnalysisReportType;
  }

  public void setCashInventoryHandlingInstanceAnalysisReportType(String cashInventoryHandlingInstanceAnalysisReportType) {
    this.cashInventoryHandlingInstanceAnalysisReportType = cashInventoryHandlingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashInventoryHandlingInstanceAnalysisParameters
  **/

  public String getCashInventoryHandlingInstanceAnalysisParameters() {
    return cashInventoryHandlingInstanceAnalysisParameters;
  }

  public void setCashInventoryHandlingInstanceAnalysisParameters(String cashInventoryHandlingInstanceAnalysisParameters) {
    this.cashInventoryHandlingInstanceAnalysisParameters = cashInventoryHandlingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cashInventoryHandlingInstanceAnalysisReport
  **/

  public Object getCashInventoryHandlingInstanceAnalysisReport() {
    return cashInventoryHandlingInstanceAnalysisReport;
  }

  public void setCashInventoryHandlingInstanceAnalysisReport(Object cashInventoryHandlingInstanceAnalysisReport) {
    this.cashInventoryHandlingInstanceAnalysisReport = cashInventoryHandlingInstanceAnalysisReport;
  }


}

