package com.fasterxml.jackson.module.jsonSchema.factories;

import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;

public class SchemaFactory implements JsonSchemaProducer
{
    protected SerializerProvider provider;
    protected JsonSchema schema;

    public SchemaFactory(SerializerProvider provider, JsonSchema schema) {
        this.provider = provider;
        this.schema = schema;
    }

    public SerializerProvider getProvider() {
        return provider;
    }
	
    public JsonSchema getSchema() {
        return schema;
    }

    public void setProvider(SerializerProvider provider) {
        this.provider = provider;
    }

    public void setSchema(JsonSchema schema) {
        this.schema = schema;
    }
}