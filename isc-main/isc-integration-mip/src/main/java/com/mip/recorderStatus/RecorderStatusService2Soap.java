package com.mip.recorderStatus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:06.257-07:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", name = "RecorderStatusService2Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface RecorderStatusService2Soap {

    @WebMethod(operationName = "SubscribeDeviceStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/SubscribeDeviceStatus")
    @RequestWrapper(localName = "SubscribeDeviceStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeDeviceStatus")
    @ResponseWrapper(localName = "SubscribeDeviceStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeDeviceStatusResponse")
    public void subscribeDeviceStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "deviceIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "StopStatusSession", action = "http://video.net/2/XProtectCSRecorderStatus2/StopStatusSession")
    @RequestWrapper(localName = "StopStatusSession", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.StopStatusSession")
    @ResponseWrapper(localName = "StopStatusSessionResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.StopStatusSessionResponse")
    public void stopStatusSession(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId
    );

    @WebMethod(operationName = "GetArchiveStorageStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetArchiveStorageStatus")
    @RequestWrapper(localName = "GetArchiveStorageStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetArchiveStorageStatus")
    @ResponseWrapper(localName = "GetArchiveStorageStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetArchiveStorageStatusResponse")
    @WebResult(name = "GetArchiveStorageStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.ArrayOfStorageStatus getArchiveStorageStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "SubscribeEventStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/SubscribeEventStatus")
    @RequestWrapper(localName = "SubscribeEventStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeEventStatus")
    @ResponseWrapper(localName = "SubscribeEventStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeEventStatusResponse")
    public void subscribeEventStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "eventIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid eventIds
    );

    @WebMethod(operationName = "GetVersion", action = "http://video.net/2/XProtectCSRecorderStatus2/GetVersion")
    @RequestWrapper(localName = "GetVersion", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetVersion")
    @ResponseWrapper(localName = "GetVersionResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetVersionResponse")
    @WebResult(name = "GetVersionResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public int getVersion()
;

    @WebMethod(operationName = "GetCurrentDeviceStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetCurrentDeviceStatus")
    @RequestWrapper(localName = "GetCurrentDeviceStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetCurrentDeviceStatus")
    @ResponseWrapper(localName = "GetCurrentDeviceStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetCurrentDeviceStatusResponse")
    @WebResult(name = "GetCurrentDeviceStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.Status getCurrentDeviceStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "GetVideoDeviceStatistics", action = "http://video.net/2/XProtectCSRecorderStatus2/GetVideoDeviceStatistics")
    @RequestWrapper(localName = "GetVideoDeviceStatistics", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetVideoDeviceStatistics")
    @ResponseWrapper(localName = "GetVideoDeviceStatisticsResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetVideoDeviceStatisticsResponse")
    @WebResult(name = "GetVideoDeviceStatisticsResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.ArrayOfVideoDeviceStatistics getVideoDeviceStatistics(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "StartStatusSession", action = "http://video.net/2/XProtectCSRecorderStatus2/StartStatusSession")
    @RequestWrapper(localName = "StartStatusSession", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.StartStatusSession")
    @ResponseWrapper(localName = "StartStatusSessionResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.StartStatusSessionResponse")
    @WebResult(name = "StartStatusSessionResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public java.lang.String startStatusSession(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "SubscribeHardwareStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/SubscribeHardwareStatus")
    @RequestWrapper(localName = "SubscribeHardwareStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeHardwareStatus")
    @ResponseWrapper(localName = "SubscribeHardwareStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeHardwareStatusResponse")
    public void subscribeHardwareStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "hardwareIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid hardwareIds
    );

    @WebMethod(operationName = "GetCurrentHardwareStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetCurrentHardwareStatus")
    @RequestWrapper(localName = "GetCurrentHardwareStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetCurrentHardwareStatus")
    @ResponseWrapper(localName = "GetCurrentHardwareStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetCurrentHardwareStatusResponse")
    @WebResult(name = "GetCurrentHardwareStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.Status getCurrentHardwareStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "hardwareIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid hardwareIds
    );

    @WebMethod(operationName = "GetStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetStatus")
    @RequestWrapper(localName = "GetStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetStatus")
    @ResponseWrapper(localName = "GetStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetStatusResponse")
    @WebResult(name = "GetStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.Status getStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "millisecondsTimeout", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        int millisecondsTimeout
    );

    @WebMethod(operationName = "GetRecordingStorageStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetRecordingStorageStatus")
    @RequestWrapper(localName = "GetRecordingStorageStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetRecordingStorageStatus")
    @ResponseWrapper(localName = "GetRecordingStorageStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetRecordingStorageStatusResponse")
    @WebResult(name = "GetRecordingStorageStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.ArrayOfStorageStatus getRecordingStorageStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "GetMetadataDeviceStatistics", action = "http://video.net/2/XProtectCSRecorderStatus2/GetMetadataDeviceStatistics")
    @RequestWrapper(localName = "GetMetadataDeviceStatistics", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetMetadataDeviceStatistics")
    @ResponseWrapper(localName = "GetMetadataDeviceStatisticsResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetMetadataDeviceStatisticsResponse")
    @WebResult(name = "GetMetadataDeviceStatisticsResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.ArrayOfMetadataDeviceStatistics getMetadataDeviceStatistics(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "SubscribeConfigurationStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/SubscribeConfigurationStatus")
    @RequestWrapper(localName = "SubscribeConfigurationStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeConfigurationStatus")
    @ResponseWrapper(localName = "SubscribeConfigurationStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.SubscribeConfigurationStatusResponse")
    public void subscribeConfigurationStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "subscribe", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        boolean subscribe
    );

    @WebMethod(operationName = "GetRecorderStatus", action = "http://video.net/2/XProtectCSRecorderStatus2/GetRecorderStatus")
    @RequestWrapper(localName = "GetRecorderStatus", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetRecorderStatus")
    @ResponseWrapper(localName = "GetRecorderStatusResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetRecorderStatusResponse")
    @WebResult(name = "GetRecorderStatusResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.AttachAndConnectionState getRecorderStatus(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "GetAudioDeviceStatistics", action = "http://video.net/2/XProtectCSRecorderStatus2/GetAudioDeviceStatistics")
    @RequestWrapper(localName = "GetAudioDeviceStatistics", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetAudioDeviceStatistics")
    @ResponseWrapper(localName = "GetAudioDeviceStatisticsResponse", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2", className = "com.mip.recorderStatus.GetAudioDeviceStatisticsResponse")
    @WebResult(name = "GetAudioDeviceStatisticsResult", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
    public com.mip.recorderStatus.ArrayOfAudioDeviceStatistics getAudioDeviceStatistics(

        @WebParam(name = "token", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://video.net/2/XProtectCSRecorderStatus2")
        com.mip.recorderStatus.ArrayOfGuid deviceIds
    );
}
