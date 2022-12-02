package io.quarkiverse.cxf.it.ws.mtom.awt.server;

import java.io.IOException;

import org.junit.jupiter.api.Assumptions;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
class MtomAwtIT extends MtomAwtTest {

    @Override
    public void uploadDownloadMtom() throws IOException {
        // Native test fails on Mac OS with:
        // java.lang.UnsatisfiedLinkError: no awt in java.library.path
        // https://github.com/oracle/graal/issues/4124
        Assumptions.assumeFalse(System.getProperty("os.name").contains("mac"));
        super.uploadDownloadMtom();
    }
}
