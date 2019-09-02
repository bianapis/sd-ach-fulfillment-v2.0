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
public class AchFulfillmentApiServiceImpl implements AchFulfillmentApiService {

	public SDACHFulfillmentActivateOutputModel activate(SDACHFulfillmentActivateInputModel request){
		return JsonReader.read("activate-SDACHFulfillmentActivateOutputModel.json",new TypeReference<SDACHFulfillmentActivateOutputModel>(){});
	}
	
	public SDACHFulfillmentConfigureOutputModel configure(String sdReferenceId, SDACHFulfillmentConfigureInputModel request){
		return JsonReader.read("configure-SDACHFulfillmentConfigureOutputModel.json",new TypeReference<SDACHFulfillmentConfigureOutputModel>(){});
	}
	
	public CRACHFulfillmentOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRACHFulfillmentOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRACHFulfillmentOperatingSessionControlOutputModel.json",new TypeReference<CRACHFulfillmentOperatingSessionControlOutputModel>(){});
	}
	
	public SDACHFulfillmentFeedbackOutputModel feedback(String sdReferenceId, SDACHFulfillmentFeedbackInputModel request){
		return JsonReader.read("feedback-SDACHFulfillmentFeedbackOutputModel.json",new TypeReference<SDACHFulfillmentFeedbackOutputModel>(){});
	}
	
	public CRACHFulfillmentOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRACHFulfillmentOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRACHFulfillmentOperatingSessionInitiateOutputModel.json",new TypeReference<CRACHFulfillmentOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQClearingandSettlementInitiateOutputModel initiateClearingandsettlement(String sdReferenceId, String crReferenceId, BQClearingandSettlementInitiateInputModel request){
		return JsonReader.read("initiate-BQClearingandSettlementInitiateOutputModel.json",new TypeReference<BQClearingandSettlementInitiateOutputModel>(){});
	}
	
	public BQInboundACHInitiateOutputModel initiateInboundach(String sdReferenceId, String crReferenceId, BQInboundACHInitiateInputModel request){
		return JsonReader.read("initiate-BQInboundACHInitiateOutputModel.json",new TypeReference<BQInboundACHInitiateOutputModel>(){});
	}
	
	public BQOutboundACHInitiateOutputModel initiateOutboundach(String sdReferenceId, String crReferenceId, BQOutboundACHInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundACHInitiateOutputModel.json",new TypeReference<BQOutboundACHInitiateOutputModel>(){});
	}
	
	public BQReconciliationInitiateOutputModel initiateReconciliation(String sdReferenceId, String crReferenceId, BQReconciliationInitiateInputModel request){
		return JsonReader.read("initiate-BQReconciliationInitiateOutputModel.json",new TypeReference<BQReconciliationInitiateOutputModel>(){});
	}
	
	public BQWarehousingInitiateOutputModel initiateWarehousing(String sdReferenceId, String crReferenceId, BQWarehousingInitiateInputModel request){
		return JsonReader.read("initiate-BQWarehousingInitiateOutputModel.json",new TypeReference<BQWarehousingInitiateOutputModel>(){});
	}
	
	public CRACHFulfillmentOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRACHFulfillmentOperatingSessionRetrieveOutputModel.json",new TypeReference<CRACHFulfillmentOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQClearingandSettlementRetrieveOutputModel retrieveClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQClearingandSettlementRetrieveOutputModel.json",new TypeReference<BQClearingandSettlementRetrieveOutputModel>(){});
	}
	
	public BQInboundACHRetrieveOutputModel retrieveInboundach(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundACHRetrieveOutputModel.json",new TypeReference<BQInboundACHRetrieveOutputModel>(){});
	}
	
	public BQOutboundACHRetrieveOutputModel retrieveOutboundach(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundACHRetrieveOutputModel.json",new TypeReference<BQOutboundACHRetrieveOutputModel>(){});
	}
	
	public BQReconciliationRetrieveOutputModel retrieveReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReconciliationRetrieveOutputModel.json",new TypeReference<BQReconciliationRetrieveOutputModel>(){});
	}
	
	public BQWarehousingRetrieveOutputModel retrieveWarehousing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWarehousingRetrieveOutputModel.json",new TypeReference<BQWarehousingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDACHFulfillmentRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDACHFulfillmentRetrieveOutputModel.json",new TypeReference<SDACHFulfillmentRetrieveOutputModel>(){});
	}
	
	public CRACHFulfillmentOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRACHFulfillmentOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRACHFulfillmentOperatingSessionUpdateOutputModel.json",new TypeReference<CRACHFulfillmentOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQClearingandSettlementUpdateOutputModel updateClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementUpdateInputModel request){
		return JsonReader.read("update-BQClearingandSettlementUpdateOutputModel.json",new TypeReference<BQClearingandSettlementUpdateOutputModel>(){});
	}
	
	public BQInboundACHUpdateOutputModel updateInboundach(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundACHUpdateInputModel request){
		return JsonReader.read("update-BQInboundACHUpdateOutputModel.json",new TypeReference<BQInboundACHUpdateOutputModel>(){});
	}
	
	public BQOutboundACHUpdateOutputModel updateOutboundach(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundACHUpdateInputModel request){
		return JsonReader.read("update-BQOutboundACHUpdateOutputModel.json",new TypeReference<BQOutboundACHUpdateOutputModel>(){});
	}
	
	public BQReconciliationUpdateOutputModel updateReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationUpdateInputModel request){
		return JsonReader.read("update-BQReconciliationUpdateOutputModel.json",new TypeReference<BQReconciliationUpdateOutputModel>(){});
	}
	
	public BQWarehousingUpdateOutputModel updateWarehousing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWarehousingUpdateInputModel request){
		return JsonReader.read("update-BQWarehousingUpdateOutputModel.json",new TypeReference<BQWarehousingUpdateOutputModel>(){});
	}
	
}
