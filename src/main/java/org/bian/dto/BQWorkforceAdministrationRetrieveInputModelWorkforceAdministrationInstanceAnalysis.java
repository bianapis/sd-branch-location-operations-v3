package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis
 */
public class BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis   {
  private String workforceAdministrationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return workforceAdministrationInstanceAnalysisReference
  **/

  public String getWorkforceAdministrationInstanceAnalysisReference() {
    return workforceAdministrationInstanceAnalysisReference;
  }

  public void setWorkforceAdministrationInstanceAnalysisReference(String workforceAdministrationInstanceAnalysisReference) {
    this.workforceAdministrationInstanceAnalysisReference = workforceAdministrationInstanceAnalysisReference;
  }


}

