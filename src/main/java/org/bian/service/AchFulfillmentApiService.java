/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AchFulfillmentApiService {

	SDACHFulfillmentActivateOutputModel activate(SDACHFulfillmentActivateInputModel request);
	
	SDACHFulfillmentConfigureOutputModel configure(String sdReferenceId, SDACHFulfillmentConfigureInputModel request);
	
	CRACHFulfillmentOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRACHFulfillmentOperatingSessionControlInputModel request);
	
	SDACHFulfillmentFeedbackOutputModel feedback(String sdReferenceId, SDACHFulfillmentFeedbackInputModel request);
	
	CRACHFulfillmentOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRACHFulfillmentOperatingSessionInitiateInputModel request);
	
	BQClearingandSettlementInitiateOutputModel initiateClearingandsettlement(String sdReferenceId, String crReferenceId, BQClearingandSettlementInitiateInputModel request);
	
	BQInboundACHInitiateOutputModel initiateInboundach(String sdReferenceId, String crReferenceId, BQInboundACHInitiateInputModel request);
	
	BQOutboundACHInitiateOutputModel initiateOutboundach(String sdReferenceId, String crReferenceId, BQOutboundACHInitiateInputModel request);
	
	BQReconciliationInitiateOutputModel initiateReconciliation(String sdReferenceId, String crReferenceId, BQReconciliationInitiateInputModel request);
	
	BQWarehousingInitiateOutputModel initiateWarehousing(String sdReferenceId, String crReferenceId, BQWarehousingInitiateInputModel request);
	
	CRACHFulfillmentOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQClearingandSettlementRetrieveOutputModel retrieveClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInboundACHRetrieveOutputModel retrieveInboundach(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundACHRetrieveOutputModel retrieveOutboundach(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReconciliationRetrieveOutputModel retrieveReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWarehousingRetrieveOutputModel retrieveWarehousing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDACHFulfillmentRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRACHFulfillmentOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRACHFulfillmentOperatingSessionUpdateInputModel request);
	
	BQClearingandSettlementUpdateOutputModel updateClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementUpdateInputModel request);
	
	BQInboundACHUpdateOutputModel updateInboundach(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundACHUpdateInputModel request);
	
	BQOutboundACHUpdateOutputModel updateOutboundach(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundACHUpdateInputModel request);
	
	BQReconciliationUpdateOutputModel updateReconciliation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationUpdateInputModel request);
	
	BQWarehousingUpdateOutputModel updateWarehousing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWarehousingUpdateInputModel request);
	
}
