package br.com.kiev.temperature.processing;

import org.junit.jupiter.api.Test;

import static br.com.kiev.temperature.processing.IdGenerator.generateTimeBasedUUID;

class UUIDv7Test {
    @Test
    void shouldGenerateUUIDv7(){
        var uuid1 = generateTimeBasedUUID();
        var uuid2 = generateTimeBasedUUID();
        var uuid3 = generateTimeBasedUUID();
        var uuid4 = generateTimeBasedUUID();

        System.out.println(UUIDv7Utils.extractOffSetDateTime(uuid1));
        System.out.println(UUIDv7Utils.extractOffSetDateTime(uuid2));
        System.out.println(UUIDv7Utils.extractOffSetDateTime(uuid3));
        System.out.println(UUIDv7Utils.extractOffSetDateTime(uuid4));
    }
}
