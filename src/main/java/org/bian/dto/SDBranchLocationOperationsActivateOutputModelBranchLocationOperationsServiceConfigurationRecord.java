package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup;
import org.bian.dto.SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement;
import org.bian.dto.SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord
 */
public class SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecord   {
  private String branchLocationOperationsServiceConfigurationSettingReference = null;

  private String branchLocationOperationsServiceConfigurationSettingDescription = null;

  private SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup = null;

  private SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription = null;

  private SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement = null;

  private String branchLocationOperationsServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return branchLocationOperationsServiceConfigurationSettingDescription
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingDescription() {
    return branchLocationOperationsServiceConfigurationSettingDescription;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingDescription(String branchLocationOperationsServiceConfigurationSettingDescription) {
    this.branchLocationOperationsServiceConfigurationSettingDescription = branchLocationOperationsServiceConfigurationSettingDescription;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationSetup
   * @return branchLocationOperationsServiceConfigurationSetup
  **/

  public SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup getBranchLocationOperationsServiceConfigurationSetup() {
    return branchLocationOperationsServiceConfigurationSetup;
  }

  public void setBranchLocationOperationsServiceConfigurationSetup(SDBranchLocationOperationsActivateInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup) {
    this.branchLocationOperationsServiceConfigurationSetup = branchLocationOperationsServiceConfigurationSetup;
  }


  /**
   * Get branchLocationOperationsServiceSubscription
   * @return branchLocationOperationsServiceSubscription
  **/

  public SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription getBranchLocationOperationsServiceSubscription() {
    return branchLocationOperationsServiceSubscription;
  }

  public void setBranchLocationOperationsServiceSubscription(SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription) {
    this.branchLocationOperationsServiceSubscription = branchLocationOperationsServiceSubscription;
  }


  /**
   * Get branchLocationOperationsServiceAgreement
   * @return branchLocationOperationsServiceAgreement
  **/

  public SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement getBranchLocationOperationsServiceAgreement() {
    return branchLocationOperationsServiceAgreement;
  }

  public void setBranchLocationOperationsServiceAgreement(SDBranchLocationOperationsActivateOutputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement) {
    this.branchLocationOperationsServiceAgreement = branchLocationOperationsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return branchLocationOperationsServiceStatus
  **/

  public String getBranchLocationOperationsServiceStatus() {
    return branchLocationOperationsServiceStatus;
  }

  public void setBranchLocationOperationsServiceStatus(String branchLocationOperationsServiceStatus) {
    this.branchLocationOperationsServiceStatus = branchLocationOperationsServiceStatus;
  }


}

