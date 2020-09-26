package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord
 */
public class SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecord   {
  private String branchLocationOperationsServiceConfigurationSettingReference = null;

  private String branchLocationOperationsServiceConfigurationSettingType = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return branchLocationOperationsServiceConfigurationSettingReference
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingReference() {
    return branchLocationOperationsServiceConfigurationSettingReference;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingReference(String branchLocationOperationsServiceConfigurationSettingReference) {
    this.branchLocationOperationsServiceConfigurationSettingReference = branchLocationOperationsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return branchLocationOperationsServiceConfigurationSettingType
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingType() {
    return branchLocationOperationsServiceConfigurationSettingType;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingType(String branchLocationOperationsServiceConfigurationSettingType) {
    this.branchLocationOperationsServiceConfigurationSettingType = branchLocationOperationsServiceConfigurationSettingType;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationSetup
   * @return branchLocationOperationsServiceConfigurationSetup
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup getBranchLocationOperationsServiceConfigurationSetup() {
    return branchLocationOperationsServiceConfigurationSetup;
  }

  public void setBranchLocationOperationsServiceConfigurationSetup(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup) {
    this.branchLocationOperationsServiceConfigurationSetup = branchLocationOperationsServiceConfigurationSetup;
  }


  /**
   * Get branchLocationOperationsServiceSubscription
   * @return branchLocationOperationsServiceSubscription
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription getBranchLocationOperationsServiceSubscription() {
    return branchLocationOperationsServiceSubscription;
  }

  public void setBranchLocationOperationsServiceSubscription(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription) {
    this.branchLocationOperationsServiceSubscription = branchLocationOperationsServiceSubscription;
  }


  /**
   * Get branchLocationOperationsServiceAgreement
   * @return branchLocationOperationsServiceAgreement
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement getBranchLocationOperationsServiceAgreement() {
    return branchLocationOperationsServiceAgreement;
  }

  public void setBranchLocationOperationsServiceAgreement(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement) {
    this.branchLocationOperationsServiceAgreement = branchLocationOperationsServiceAgreement;
  }


}

