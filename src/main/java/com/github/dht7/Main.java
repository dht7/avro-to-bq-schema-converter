package com.github.dht7;

import org.apache.avro.Schema;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Schema schema = new Schema.Parser().parse(new File("src/main/resources/sample-avro-schema.avsc"));
        System.out.println(schema.toString(true));
        System.out.println(AvroToBQSchemaConverter.convert(schema, Arrays.asList("pdate")));

    }
}