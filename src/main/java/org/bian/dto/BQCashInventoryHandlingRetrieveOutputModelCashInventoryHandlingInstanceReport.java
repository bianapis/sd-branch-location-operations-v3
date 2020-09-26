package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport
 */
public class BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport   {
  private Object cashInventoryHandlingInstanceReportRecord = null;

  private String cashInventoryHandlingInstanceReportType = null;

  private String cashInventoryHandlingInstanceReportParameters = null;

  private Object cashInventoryHandlingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashInventoryHandlingInstanceReportRecord
  **/

  public Object getCashInventoryHandlingInstanceReportRecord() {
    return cashInventoryHandlingInstanceReportRecord;
  }

  public void setCashInventoryHandlingInstanceReportRecord(Object cashInventoryHandlingInstanceReportRecord) {
    this.cashInventoryHandlingInstanceReportRecord = cashInventoryHandlingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashInventoryHandlingInstanceReportType
  **/

  public String getCashInventoryHandlingInstanceReportType() {
    return cashInventoryHandlingInstanceReportType;
  }

  public void setCashInventoryHandlingInstanceReportType(String cashInventoryHandlingInstanceReportType) {
    this.cashInventoryHandlingInstanceReportType = cashInventoryHandlingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashInventoryHandlingInstanceReportParameters
  **/

  public String getCashInventoryHandlingInstanceReportParameters() {
    return cashInventoryHandlingInstanceReportParameters;
  }

  public void setCashInventoryHandlingInstanceReportParameters(String cashInventoryHandlingInstanceReportParameters) {
    this.cashInventoryHandlingInstanceReportParameters = cashInventoryHandlingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashInventoryHandlingInstanceReport
  **/

  public Object getCashInventoryHandlingInstanceReport() {
    return cashInventoryHandlingInstanceReport;
  }

  public void setCashInventoryHandlingInstanceReport(Object cashInventoryHandlingInstanceReport) {
    this.cashInventoryHandlingInstanceReport = cashInventoryHandlingInstanceReport;
  }


}

