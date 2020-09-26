package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRetrieveOutputModelSafeCustodyOperationsInstanceReport
 */
public class BQSafeCustodyOperationsRetrieveOutputModelSafeCustodyOperationsInstanceReport   {
  private Object safeCustodyOperationsInstanceReportRecord = null;

  private String safeCustodyOperationsInstanceReportType = null;

  private String safeCustodyOperationsInstanceReportParameters = null;

  private Object safeCustodyOperationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return safeCustodyOperationsInstanceReportRecord
  **/

  public Object getSafeCustodyOperationsInstanceReportRecord() {
    return safeCustodyOperationsInstanceReportRecord;
  }

  public void setSafeCustodyOperationsInstanceReportRecord(Object safeCustodyOperationsInstanceReportRecord) {
    this.safeCustodyOperationsInstanceReportRecord = safeCustodyOperationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return safeCustodyOperationsInstanceReportType
  **/

  public String getSafeCustodyOperationsInstanceReportType() {
    return safeCustodyOperationsInstanceReportType;
  }

  public void setSafeCustodyOperationsInstanceReportType(String safeCustodyOperationsInstanceReportType) {
    this.safeCustodyOperationsInstanceReportType = safeCustodyOperationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return safeCustodyOperationsInstanceReportParameters
  **/

  public String getSafeCustodyOperationsInstanceReportParameters() {
    return safeCustodyOperationsInstanceReportParameters;
  }

  public void setSafeCustodyOperationsInstanceReportParameters(String safeCustodyOperationsInstanceReportParameters) {
    this.safeCustodyOperationsInstanceReportParameters = safeCustodyOperationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return safeCustodyOperationsInstanceReport
  **/

  public Object getSafeCustodyOperationsInstanceReport() {
    return safeCustodyOperationsInstanceReport;
  }

  public void setSafeCustodyOperationsInstanceReport(Object safeCustodyOperationsInstanceReport) {
    this.safeCustodyOperationsInstanceReport = safeCustodyOperationsInstanceReport;
  }


}

