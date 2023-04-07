
package com.mip.alarmService;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:08.397-07:00
 * Generated source version: 3.3.6
 *
 */
public final class IAlarmCommandToken_BasicHttpBindingIAlarmCommandToken_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "AlarmCommandToken");

    private IAlarmCommandToken_BasicHttpBindingIAlarmCommandToken_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AlarmCommandToken.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AlarmCommandToken ss = new AlarmCommandToken(wsdlURL, SERVICE_NAME);
        IAlarmCommandToken port = ss.getBasicHttpBindingIAlarmCommandToken();

        {
        System.out.println("Invoking getHeader...");
        java.lang.String _getHeader_token = "";
        java.lang.String _getHeader_id = "";
        try {
            com.mip.alarmService.EventHeader _getHeader__return = port.getHeader(_getHeader_token, _getHeader_id);
            System.out.println("getHeader.result=" + _getHeader__return);

        } catch (IAlarmCommandTokenGetHeaderAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetHeader_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking startEventLineSession...");
        java.lang.String _startEventLineSession_token = "";
        com.mip.alarmService.EventFilter _startEventLineSession_filter = null;
        try {
            java.lang.String _startEventLineSession__return = port.startEventLineSession(_startEventLineSession_token, _startEventLineSession_filter);
            System.out.println("startEventLineSession.result=" + _startEventLineSession__return);

        } catch (IAlarmCommandTokenStartEventLineSessionAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_StartEventLineSession_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getAlarmUpdateHistory...");
        java.lang.String _getAlarmUpdateHistory_token = "";
        java.lang.String _getAlarmUpdateHistory_id = "";
        try {
            com.mip.alarmService.ArrayOfAlarmUpdate _getAlarmUpdateHistory__return = port.getAlarmUpdateHistory(_getAlarmUpdateHistory_token, _getAlarmUpdateHistory_id);
            System.out.println("getAlarmUpdateHistory.result=" + _getAlarmUpdateHistory__return);

        } catch (IAlarmCommandTokenGetAlarmUpdateHistoryAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetAlarmUpdateHistory_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addEvent...");
        java.lang.String _addEvent_token = "";
        com.mip.alarmService.BaseEvent _addEvent_baseEvent = null;
        try {
            port.addEvent(_addEvent_token, _addEvent_baseEvent);

        } catch (IAlarmCommandTokenAddEventAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_AddEvent_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking stopAlarmLineSession...");
        java.lang.String _stopAlarmLineSession_token = "";
        java.lang.String _stopAlarmLineSession_sessionId = "";
        try {
            port.stopAlarmLineSession(_stopAlarmLineSession_token, _stopAlarmLineSession_sessionId);

        } catch (IAlarmCommandTokenStopAlarmLineSessionAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_StopAlarmLineSession_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking updateMultipleAlarms...");
        java.lang.String _updateMultipleAlarms_token = "";
        java.lang.String _updateMultipleAlarms_objectId = "";
        java.lang.Integer _updateMultipleAlarms_oldState = null;
        java.lang.Integer _updateMultipleAlarms_newState = null;
        javax.xml.datatype.XMLGregorianCalendar _updateMultipleAlarms_time = null;
        java.lang.String _updateMultipleAlarms_assignedTo = "";
        try {
            port.updateMultipleAlarms(_updateMultipleAlarms_token, _updateMultipleAlarms_objectId, _updateMultipleAlarms_oldState, _updateMultipleAlarms_newState, _updateMultipleAlarms_time, _updateMultipleAlarms_assignedTo);

        } catch (IAlarmCommandTokenUpdateMultipleAlarmsAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_UpdateMultipleAlarms_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getSessionEventLines...");
        java.lang.String _getSessionEventLines_token = "";
        java.lang.Integer _getSessionEventLines_maxCount = null;
        java.lang.String _getSessionEventLines_sessionId = "";
        try {
            com.mip.alarmService.EventUpdateData _getSessionEventLines__return = port.getSessionEventLines(_getSessionEventLines_token, _getSessionEventLines_maxCount, _getSessionEventLines_sessionId);
            System.out.println("getSessionEventLines.result=" + _getSessionEventLines__return);

        } catch (IAlarmCommandTokenGetSessionEventLinesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetSessionEventLines_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking attachSnapshot...");
        java.lang.String _attachSnapshot_token = "";
        java.lang.String _attachSnapshot_id = "";
        com.mip.alarmService.Snapshot _attachSnapshot_snapshot = null;
        try {
            port.attachSnapshot(_attachSnapshot_token, _attachSnapshot_id, _attachSnapshot_snapshot);

        } catch (IAlarmCommandTokenAttachSnapshotAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_AttachSnapshot_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking updateAlarmValues...");
        java.lang.String _updateAlarmValues_token = "";
        java.lang.String _updateAlarmValues_id = "";
        com.mip.alarmService.ArrayOfKeyValuePairOfstringstring _updateAlarmValues_updates = null;
        try {
            port.updateAlarmValues(_updateAlarmValues_token, _updateAlarmValues_id, _updateAlarmValues_updates);

        } catch (IAlarmCommandTokenUpdateAlarmValuesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_UpdateAlarmValues_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEventCount...");
        java.lang.String _getEventCount_token = "";
        com.mip.alarmService.GetEventCountParams _getEventCount_parameters = null;
        try {
            com.mip.alarmService.GetEventCountResp _getEventCount__return = port.getEventCount(_getEventCount_token, _getEventCount_parameters);
            System.out.println("getEventCount.result=" + _getEventCount__return);

        } catch (IAlarmCommandTokenGetEventCountAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetEventCount_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getAlarmsWithRelatedHardware...");
        java.lang.String _getAlarmsWithRelatedHardware_token = "";
        java.lang.Integer _getAlarmsWithRelatedHardware_maxCount = null;
        com.mip.alarmService.ArrayOfAlarmSearchCriteria _getAlarmsWithRelatedHardware_filter = null;
        try {
            com.mip.alarmService.ArrayOfAlarmLine _getAlarmsWithRelatedHardware__return = port.getAlarmsWithRelatedHardware(_getAlarmsWithRelatedHardware_token, _getAlarmsWithRelatedHardware_maxCount, _getAlarmsWithRelatedHardware_filter);
            System.out.println("getAlarmsWithRelatedHardware.result=" + _getAlarmsWithRelatedHardware__return);

        } catch (IAlarmCommandTokenGetAlarmsWithRelatedHardwareAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetAlarmsWithRelatedHardware_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getAlarmLines...");
        java.lang.String _getAlarmLines_token = "";
        java.lang.Integer _getAlarmLines_from = null;
        java.lang.Integer _getAlarmLines_maxCount = null;
        com.mip.alarmService.AlarmFilter _getAlarmLines_filter = null;
        try {
            com.mip.alarmService.ArrayOfAlarmLine _getAlarmLines__return = port.getAlarmLines(_getAlarmLines_token, _getAlarmLines_from, _getAlarmLines_maxCount, _getAlarmLines_filter);
            System.out.println("getAlarmLines.result=" + _getAlarmLines__return);

        } catch (IAlarmCommandTokenGetAlarmLinesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetAlarmLines_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking acknowledgeMultipleAlarms...");
        java.lang.String _acknowledgeMultipleAlarms_token = "";
        java.lang.String _acknowledgeMultipleAlarms_objectId = "";
        try {
            port.acknowledgeMultipleAlarms(_acknowledgeMultipleAlarms_token, _acknowledgeMultipleAlarms_objectId);

        } catch (IAlarmCommandTokenAcknowledgeMultipleAlarmsAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_AcknowledgeMultipleAlarms_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking addAsEvent...");
        java.lang.String _addAsEvent_token = "";
        com.mip.alarmService.Alarm _addAsEvent_alarm = null;
        try {
            port.addAsEvent(_addAsEvent_token, _addAsEvent_alarm);

        } catch (IAlarmCommandTokenAddAsEventAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_AddAsEvent_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEventLines2...");
        java.lang.String _getEventLines2_token = "";
        com.mip.alarmService.GetEventLines2Params _getEventLines2_parameters = null;
        try {
            com.mip.alarmService.GetEventLines2Resp _getEventLines2__return = port.getEventLines2(_getEventLines2_token, _getEventLines2_parameters);
            System.out.println("getEventLines2.result=" + _getEventLines2__return);

        } catch (IAlarmCommandTokenGetEventLines2AlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetEventLines2_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking startAlarmLineSession...");
        java.lang.String _startAlarmLineSession_token = "";
        com.mip.alarmService.AlarmFilter _startAlarmLineSession_filter = null;
        try {
            java.lang.String _startAlarmLineSession__return = port.startAlarmLineSession(_startAlarmLineSession_token, _startAlarmLineSession_filter);
            System.out.println("startAlarmLineSession.result=" + _startAlarmLineSession__return);

        } catch (IAlarmCommandTokenStartAlarmLineSessionAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_StartAlarmLineSession_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getStatistics...");
        java.lang.String _getStatistics_token = "";
        try {
            com.mip.alarmService.ArrayOfStatistic _getStatistics__return = port.getStatistics(_getStatistics_token);
            System.out.println("getStatistics.result=" + _getStatistics__return);

        } catch (IAlarmCommandTokenGetStatisticsAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetStatistics_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getSnapshots...");
        java.lang.String _getSnapshots_token = "";
        java.lang.String _getSnapshots_id = "";
        try {
            com.mip.alarmService.SnapshotList _getSnapshots__return = port.getSnapshots(_getSnapshots_token, _getSnapshots_id);
            System.out.println("getSnapshots.result=" + _getSnapshots__return);

        } catch (IAlarmCommandTokenGetSnapshotsAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetSnapshots_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking stopEventLineSession...");
        java.lang.String _stopEventLineSession_token = "";
        java.lang.String _stopEventLineSession_sessionId = "";
        try {
            port.stopEventLineSession(_stopEventLineSession_token, _stopEventLineSession_sessionId);

        } catch (IAlarmCommandTokenStopEventLineSessionAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_StopEventLineSession_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getSessionAlarmLines...");
        java.lang.String _getSessionAlarmLines_token = "";
        java.lang.Integer _getSessionAlarmLines_maxCount = null;
        java.lang.String _getSessionAlarmLines_sessionId = "";
        try {
            com.mip.alarmService.AlarmUpdateData _getSessionAlarmLines__return = port.getSessionAlarmLines(_getSessionAlarmLines_token, _getSessionAlarmLines_maxCount, _getSessionAlarmLines_sessionId);
            System.out.println("getSessionAlarmLines.result=" + _getSessionAlarmLines__return);

        } catch (IAlarmCommandTokenGetSessionAlarmLinesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetSessionAlarmLines_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking add...");
        java.lang.String _add_token = "";
        com.mip.alarmService.Alarm _add_alarm = null;
        try {
            port.add(_add_token, _add_alarm);

        } catch (IAlarmCommandTokenAddAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_Add_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEvents...");
        java.lang.String _getEvents_token = "";
        com.mip.alarmService.GetEventsParams _getEvents_parameters = null;
        try {
            com.mip.alarmService.GetEventsResp _getEvents__return = port.getEvents(_getEvents_token, _getEvents_parameters);
            System.out.println("getEvents.result=" + _getEvents__return);

        } catch (IAlarmCommandTokenGetEventsAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetEvents_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEvent...");
        java.lang.String _getEvent_token = "";
        java.lang.String _getEvent_id = "";
        try {
            com.mip.alarmService.BaseEvent _getEvent__return = port.getEvent(_getEvent_token, _getEvent_id);
            System.out.println("getEvent.result=" + _getEvent__return);

        } catch (IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetEvent_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking updateAlarm...");
        java.lang.String _updateAlarm_token = "";
        java.lang.String _updateAlarm_id = "";
        java.lang.String _updateAlarm_text = "";
        java.lang.Integer _updateAlarm_state = null;
        java.lang.Integer _updateAlarm_priority = null;
        javax.xml.datatype.XMLGregorianCalendar _updateAlarm_time = null;
        java.lang.String _updateAlarm_assignedTo = "";
        try {
            port.updateAlarm(_updateAlarm_token, _updateAlarm_id, _updateAlarm_text, _updateAlarm_state, _updateAlarm_priority, _updateAlarm_time, _updateAlarm_assignedTo);

        } catch (IAlarmCommandTokenUpdateAlarmAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_UpdateAlarm_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking get...");
        java.lang.String _get_token = "";
        java.lang.String _get_id = "";
        try {
            com.mip.alarmService.Alarm _get__return = port.get(_get_token, _get_id);
            System.out.println("get.result=" + _get__return);

        } catch (IAlarmCommandTokenGetAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_Get_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getAlarmHistory...");
        java.lang.String _getAlarmHistory_token = "";
        java.lang.String _getAlarmHistory_id = "";
        try {
            com.mip.alarmService.ArrayOfAlarmHistory _getAlarmHistory__return = port.getAlarmHistory(_getAlarmHistory_token, _getAlarmHistory_id);
            System.out.println("getAlarmHistory.result=" + _getAlarmHistory__return);

        } catch (IAlarmCommandTokenGetAlarmHistoryAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetAlarmHistory_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getAlarmMessages...");
        java.lang.String _getAlarmMessages_token = "";
        try {
            com.mip.alarmService.ArrayOfstring _getAlarmMessages__return = port.getAlarmMessages(_getAlarmMessages_token);
            System.out.println("getAlarmMessages.result=" + _getAlarmMessages__return);

        } catch (IAlarmCommandTokenGetAlarmMessagesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetAlarmMessages_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking acknowledge...");
        java.lang.String _acknowledge_token = "";
        java.lang.String _acknowledge_id = "";
        try {
            port.acknowledge(_acknowledge_token, _acknowledge_id);

        } catch (IAlarmCommandTokenAcknowledgeAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_Acknowledge_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getEventLines...");
        java.lang.String _getEventLines_token = "";
        java.lang.Integer _getEventLines_from = null;
        java.lang.Integer _getEventLines_maxCount = null;
        com.mip.alarmService.EventFilter _getEventLines_filter = null;
        try {
            com.mip.alarmService.ArrayOfEventLine _getEventLines__return = port.getEventLines(_getEventLines_token, _getEventLines_from, _getEventLines_maxCount, _getEventLines_filter);
            System.out.println("getEventLines.result=" + _getEventLines__return);

        } catch (IAlarmCommandTokenGetEventLinesAlarmServiceFaultFaultFaultMessage e) {
            System.out.println("Expected exception: IAlarmCommandToken_GetEventLines_AlarmServiceFaultFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
