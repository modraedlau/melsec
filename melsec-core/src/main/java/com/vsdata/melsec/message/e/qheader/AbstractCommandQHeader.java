package com.vsdata.melsec.message.e.qheader;

/**
 * @author liumin
 */
public abstract class AbstractCommandQHeader extends AbstractQHeader {

    private int requestDataLength = 0;

    private int cpuMonitoringTimer = 0x10;

    public AbstractCommandQHeader() {
    }

    public AbstractCommandQHeader(int networkNo, int pcNo, int requestDestinationModuleIoNo,
                                  int requestDestinationModuleStationNo, int cpuMonitoringTimer) {
        super(networkNo, pcNo, requestDestinationModuleIoNo, requestDestinationModuleStationNo);
        this.cpuMonitoringTimer = cpuMonitoringTimer;
    }

    public int getRequestDataLength() {
        return requestDataLength;
    }

    public void setRequestDataLength(int requestDataLength) {
        this.requestDataLength = requestDataLength;
    }

    public int getCpuMonitoringTimer() {
        return cpuMonitoringTimer;
    }

    public void setCpuMonitoringTimer(int cpuMonitoringTimer) {
        this.cpuMonitoringTimer = cpuMonitoringTimer;
    }
}
