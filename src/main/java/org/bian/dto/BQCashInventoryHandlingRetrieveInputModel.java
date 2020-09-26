package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceAnalysis;
import org.bian.dto.BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashInventoryHandlingRetrieveInputModel
 */
public class BQCashInventoryHandlingRetrieveInputModel   {
  private Object cashInventoryHandlingRetrieveActionTaskRecord = null;

  private String cashInventoryHandlingRetrieveActionRequest = null;

  private BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceReport cashInventoryHandlingInstanceReport = null;

  private BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceAnalysis cashInventoryHandlingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashInventoryHandlingRetrieveActionTaskRecord
  **/

  public Object getCashInventoryHandlingRetrieveActionTaskRecord() {
    return cashInventoryHandlingRetrieveActionTaskRecord;
  }

  public void setCashInventoryHandlingRetrieveActionTaskRecord(Object cashInventoryHandlingRetrieveActionTaskRecord) {
    this.cashInventoryHandlingRetrieveActionTaskRecord = cashInventoryHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashInventoryHandlingRetrieveActionRequest
  **/

  public String getCashInventoryHandlingRetrieveActionRequest() {
    return cashInventoryHandlingRetrieveActionRequest;
  }

  public void setCashInventoryHandlingRetrieveActionRequest(String cashInventoryHandlingRetrieveActionRequest) {
    this.cashInventoryHandlingRetrieveActionRequest = cashInventoryHandlingRetrieveActionRequest;
  }


  /**
   * Get cashInventoryHandlingInstanceReport
   * @return cashInventoryHandlingInstanceReport
  **/

  public BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceReport getCashInventoryHandlingInstanceReport() {
    return cashInventoryHandlingInstanceReport;
  }

  public void setCashInventoryHandlingInstanceReport(BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceReport cashInventoryHandlingInstanceReport) {
    this.cashInventoryHandlingInstanceReport = cashInventoryHandlingInstanceReport;
  }


  /**
   * Get cashInventoryHandlingInstanceAnalysis
   * @return cashInventoryHandlingInstanceAnalysis
  **/

  public BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceAnalysis getCashInventoryHandlingInstanceAnalysis() {
    return cashInventoryHandlingInstanceAnalysis;
  }

  public void setCashInventoryHandlingInstanceAnalysis(BQCashInventoryHandlingRetrieveInputModelCashInventoryHandlingInstanceAnalysis cashInventoryHandlingInstanceAnalysis) {
    this.cashInventoryHandlingInstanceAnalysis = cashInventoryHandlingInstanceAnalysis;
  }


}

