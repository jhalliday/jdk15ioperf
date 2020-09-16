
package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class MyBenchmark {

    @Benchmark
    public void testMethod(Blackhole bh) throws IOException {

        ByteArrayOutputStream ba = new ByteArrayOutputStream(30);
        DataOutputStream ds = new DataOutputStream(ba);

        ds.writeLong(1L);
        ds.writeLong(1L);
        ds.writeInt(1);
        ds.writeInt(1);
        ds.writeInt(1);

        byte[] _byteForm = ba.toByteArray();

        bh.consume(_byteForm);
    }

}
