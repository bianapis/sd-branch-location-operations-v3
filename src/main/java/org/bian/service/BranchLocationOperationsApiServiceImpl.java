/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BranchLocationOperationsApiServiceImpl implements BranchLocationOperationsApiService {

	public SDBranchLocationOperationsActivateOutputModel activate(SDBranchLocationOperationsActivateInputModel request){
		return JsonReader.read("activate-SDBranchLocationOperationsActivateOutputModel.json",new TypeReference<SDBranchLocationOperationsActivateOutputModel>(){});
	}
	
	public BQCashInventoryHandlingCaptureOutputModel captureCashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashInventoryHandlingCaptureInputModel request){
		return JsonReader.read("capture-BQCashInventoryHandlingCaptureOutputModel.json",new TypeReference<BQCashInventoryHandlingCaptureOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationCaptureOutputModel captureLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationSecurityAdministrationCaptureInputModel request){
		return JsonReader.read("capture-BQLocationSecurityAdministrationCaptureOutputModel.json",new TypeReference<BQLocationSecurityAdministrationCaptureOutputModel>(){});
	}
	
	public BQNonCashInventoryHandlingCaptureOutputModel captureNoncashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNonCashInventoryHandlingCaptureInputModel request){
		return JsonReader.read("capture-BQNonCashInventoryHandlingCaptureOutputModel.json",new TypeReference<BQNonCashInventoryHandlingCaptureOutputModel>(){});
	}
	
	public BQSafeCustodyOperationsCaptureOutputModel captureSafecustodyoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeCustodyOperationsCaptureInputModel request){
		return JsonReader.read("capture-BQSafeCustodyOperationsCaptureOutputModel.json",new TypeReference<BQSafeCustodyOperationsCaptureOutputModel>(){});
	}
	
	public BQStaffAssignmentCaptureOutputModel captureStaffassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQStaffAssignmentCaptureOutputModel.json",new TypeReference<BQStaffAssignmentCaptureOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanCaptureInputModel request){
		return JsonReader.read("capture-CRBranchLocationAdministrativePlanCaptureOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanCaptureOutputModel>(){});
	}
	
	public BQWorkforceAdministrationCaptureOutputModel captureWorkforceadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWorkforceAdministrationCaptureInputModel request){
		return JsonReader.read("capture-BQWorkforceAdministrationCaptureOutputModel.json",new TypeReference<BQWorkforceAdministrationCaptureOutputModel>(){});
	}
	
	public SDBranchLocationOperationsConfigureOutputModel configure(String sdReferenceId, SDBranchLocationOperationsConfigureInputModel request){
		return JsonReader.read("configure-SDBranchLocationOperationsConfigureOutputModel.json",new TypeReference<SDBranchLocationOperationsConfigureOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRBranchLocationAdministrativePlanControlOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanControlOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationExchangeOutputModel exchangeLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationSecurityAdministrationExchangeInputModel request){
		return JsonReader.read("exchange-BQLocationSecurityAdministrationExchangeOutputModel.json",new TypeReference<BQLocationSecurityAdministrationExchangeOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanExchangeInputModel request){
		return JsonReader.read("exchange-CRBranchLocationAdministrativePlanExchangeOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanExchangeOutputModel>(){});
	}
	
	public SDBranchLocationOperationsFeedbackOutputModel feedback(String sdReferenceId, SDBranchLocationOperationsFeedbackInputModel request){
		return JsonReader.read("feedback-SDBranchLocationOperationsFeedbackOutputModel.json",new TypeReference<SDBranchLocationOperationsFeedbackOutputModel>(){});
	}
	
	public BQCashInventoryHandlingGrantOutputModel grantCashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashInventoryHandlingGrantInputModel request){
		return JsonReader.read("grant-BQCashInventoryHandlingGrantOutputModel.json",new TypeReference<BQCashInventoryHandlingGrantOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationGrantOutputModel grantLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationSecurityAdministrationGrantInputModel request){
		return JsonReader.read("grant-BQLocationSecurityAdministrationGrantOutputModel.json",new TypeReference<BQLocationSecurityAdministrationGrantOutputModel>(){});
	}
	
	public BQNonCashInventoryHandlingGrantOutputModel grantNoncashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNonCashInventoryHandlingGrantInputModel request){
		return JsonReader.read("grant-BQNonCashInventoryHandlingGrantOutputModel.json",new TypeReference<BQNonCashInventoryHandlingGrantOutputModel>(){});
	}
	
	public BQStaffAssignmentGrantOutputModel grantStaffassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffAssignmentGrantInputModel request){
		return JsonReader.read("grant-BQStaffAssignmentGrantOutputModel.json",new TypeReference<BQStaffAssignmentGrantOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanGrantInputModel request){
		return JsonReader.read("grant-CRBranchLocationAdministrativePlanGrantOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanGrantOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRBranchLocationAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRBranchLocationAdministrativePlanInitiateOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQCashInventoryHandlingRequestOutputModel requestCashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashInventoryHandlingRequestInputModel request){
		return JsonReader.read("request-BQCashInventoryHandlingRequestOutputModel.json",new TypeReference<BQCashInventoryHandlingRequestOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationRequestOutputModel requestLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationSecurityAdministrationRequestInputModel request){
		return JsonReader.read("request-BQLocationSecurityAdministrationRequestOutputModel.json",new TypeReference<BQLocationSecurityAdministrationRequestOutputModel>(){});
	}
	
	public BQNonCashInventoryHandlingRequestOutputModel requestNoncashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNonCashInventoryHandlingRequestInputModel request){
		return JsonReader.read("request-BQNonCashInventoryHandlingRequestOutputModel.json",new TypeReference<BQNonCashInventoryHandlingRequestOutputModel>(){});
	}
	
	public BQSafeCustodyOperationsRequestOutputModel requestSafecustodyoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeCustodyOperationsRequestInputModel request){
		return JsonReader.read("request-BQSafeCustodyOperationsRequestOutputModel.json",new TypeReference<BQSafeCustodyOperationsRequestOutputModel>(){});
	}
	
	public BQStaffAssignmentRequestOutputModel requestStaffassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffAssignmentRequestInputModel request){
		return JsonReader.read("request-BQStaffAssignmentRequestOutputModel.json",new TypeReference<BQStaffAssignmentRequestOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRBranchLocationAdministrativePlanRequestOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanRequestOutputModel>(){});
	}
	
	public BQWorkforceAdministrationRequestOutputModel requestWorkforceadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWorkforceAdministrationRequestInputModel request){
		return JsonReader.read("request-BQWorkforceAdministrationRequestOutputModel.json",new TypeReference<BQWorkforceAdministrationRequestOutputModel>(){});
	}
	
	public BQCashInventoryHandlingRetrieveOutputModel retrieveCashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCashInventoryHandlingRetrieveOutputModel.json",new TypeReference<BQCashInventoryHandlingRetrieveOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationRetrieveOutputModel retrieveLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLocationSecurityAdministrationRetrieveOutputModel.json",new TypeReference<BQLocationSecurityAdministrationRetrieveOutputModel>(){});
	}
	
	public BQNonCashInventoryHandlingRetrieveOutputModel retrieveNoncashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQNonCashInventoryHandlingRetrieveOutputModel.json",new TypeReference<BQNonCashInventoryHandlingRetrieveOutputModel>(){});
	}
	
	public BQSafeCustodyOperationsRetrieveOutputModel retrieveSafecustodyoperations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSafeCustodyOperationsRetrieveOutputModel.json",new TypeReference<BQSafeCustodyOperationsRetrieveOutputModel>(){});
	}
	
	public BQStaffAssignmentRetrieveOutputModel retrieveStaffassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStaffAssignmentRetrieveOutputModel.json",new TypeReference<BQStaffAssignmentRetrieveOutputModel>(){});
	}
	
	public BQWorkforceAdministrationRetrieveOutputModel retrieveWorkforceadministration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWorkforceAdministrationRetrieveOutputModel.json",new TypeReference<BQWorkforceAdministrationRetrieveOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBranchLocationAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDBranchLocationOperationsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBranchLocationOperationsRetrieveOutputModel.json",new TypeReference<SDBranchLocationOperationsRetrieveOutputModel>(){});
	}
	
	public CRBranchLocationAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBranchLocationAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRBranchLocationAdministrativePlanUpdateOutputModel.json",new TypeReference<CRBranchLocationAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQCashInventoryHandlingUpdateOutputModel updateCashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashInventoryHandlingUpdateInputModel request){
		return JsonReader.read("update-BQCashInventoryHandlingUpdateOutputModel.json",new TypeReference<BQCashInventoryHandlingUpdateOutputModel>(){});
	}
	
	public BQLocationSecurityAdministrationUpdateOutputModel updateLocationsecurityadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationSecurityAdministrationUpdateInputModel request){
		return JsonReader.read("update-BQLocationSecurityAdministrationUpdateOutputModel.json",new TypeReference<BQLocationSecurityAdministrationUpdateOutputModel>(){});
	}
	
	public BQNonCashInventoryHandlingUpdateOutputModel updateNoncashinventoryhandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNonCashInventoryHandlingUpdateInputModel request){
		return JsonReader.read("update-BQNonCashInventoryHandlingUpdateOutputModel.json",new TypeReference<BQNonCashInventoryHandlingUpdateOutputModel>(){});
	}
	
	public BQSafeCustodyOperationsUpdateOutputModel updateSafecustodyoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSafeCustodyOperationsUpdateInputModel request){
		return JsonReader.read("update-BQSafeCustodyOperationsUpdateOutputModel.json",new TypeReference<BQSafeCustodyOperationsUpdateOutputModel>(){});
	}
	
	public BQStaffAssignmentUpdateOutputModel updateStaffassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQStaffAssignmentUpdateOutputModel.json",new TypeReference<BQStaffAssignmentUpdateOutputModel>(){});
	}
	
	public BQWorkforceAdministrationUpdateOutputModel updateWorkforceadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWorkforceAdministrationUpdateInputModel request){
		return JsonReader.read("update-BQWorkforceAdministrationUpdateOutputModel.json",new TypeReference<BQWorkforceAdministrationUpdateOutputModel>(){});
	}
	
}
