package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport
 */
public class BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport   {
  private Object nonCashInventoryHandlingInstanceReportRecord = null;

  private String nonCashInventoryHandlingInstanceReportType = null;

  private String nonCashInventoryHandlingInstanceReportParameters = null;

  private Object nonCashInventoryHandlingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return nonCashInventoryHandlingInstanceReportRecord
  **/

  public Object getNonCashInventoryHandlingInstanceReportRecord() {
    return nonCashInventoryHandlingInstanceReportRecord;
  }

  public void setNonCashInventoryHandlingInstanceReportRecord(Object nonCashInventoryHandlingInstanceReportRecord) {
    this.nonCashInventoryHandlingInstanceReportRecord = nonCashInventoryHandlingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return nonCashInventoryHandlingInstanceReportType
  **/

  public String getNonCashInventoryHandlingInstanceReportType() {
    return nonCashInventoryHandlingInstanceReportType;
  }

  public void setNonCashInventoryHandlingInstanceReportType(String nonCashInventoryHandlingInstanceReportType) {
    this.nonCashInventoryHandlingInstanceReportType = nonCashInventoryHandlingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return nonCashInventoryHandlingInstanceReportParameters
  **/

  public String getNonCashInventoryHandlingInstanceReportParameters() {
    return nonCashInventoryHandlingInstanceReportParameters;
  }

  public void setNonCashInventoryHandlingInstanceReportParameters(String nonCashInventoryHandlingInstanceReportParameters) {
    this.nonCashInventoryHandlingInstanceReportParameters = nonCashInventoryHandlingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return nonCashInventoryHandlingInstanceReport
  **/

  public Object getNonCashInventoryHandlingInstanceReport() {
    return nonCashInventoryHandlingInstanceReport;
  }

  public void setNonCashInventoryHandlingInstanceReport(Object nonCashInventoryHandlingInstanceReport) {
    this.nonCashInventoryHandlingInstanceReport = nonCashInventoryHandlingInstanceReport;
  }


}

