package com.github.rmtmckenzie.qrmobilevision;

public interface QrReaderCallbacks {
    void qrRead(String data);
    void qrReadBytes(byte[] data);
}
