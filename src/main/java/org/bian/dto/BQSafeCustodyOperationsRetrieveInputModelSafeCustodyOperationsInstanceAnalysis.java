package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis
 */
public class BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis   {
  private String safeCustodyOperationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return safeCustodyOperationsInstanceAnalysisReference
  **/

  public String getSafeCustodyOperationsInstanceAnalysisReference() {
    return safeCustodyOperationsInstanceAnalysisReference;
  }

  public void setSafeCustodyOperationsInstanceAnalysisReference(String safeCustodyOperationsInstanceAnalysisReference) {
    this.safeCustodyOperationsInstanceAnalysisReference = safeCustodyOperationsInstanceAnalysisReference;
  }


}

