/* DO NOT EDIT */
/* This file was generated from team_policies.babel */

package com.dropbox.core.v2.teampolicies;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonUtil;
import com.dropbox.core.json.UnionJsonDeserializer;
import com.dropbox.core.json.UnionJsonSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@JsonSerialize(using=EmmState.Serializer.class)
@JsonDeserialize(using=EmmState.Deserializer.class)
public enum EmmState {
    // union EmmState
    /**
     * Emm token is disabled
     */
    DISABLED,
    /**
     * Emm token is optional
     */
    OPTIONAL,
    /**
     * Emm token is required
     */
    REQUIRED,
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    OTHER; // *catch_all

    // ProGuard work-around since we declare serializers in annotation
    static final Serializer SERIALIZER = new Serializer();
    static final Deserializer DESERIALIZER = new Deserializer();

    static final class Serializer extends UnionJsonSerializer<EmmState> {
        private static final long serialVersionUID = 0L;

        public Serializer() {
            super(EmmState.class);
        }

        @Override
        public void serialize(EmmState value, JsonGenerator g, SerializerProvider provider) throws IOException, JsonProcessingException {
            switch (value) {
                case DISABLED:
                    g.writeString("disabled");
                    break;
                case OPTIONAL:
                    g.writeString("optional");
                    break;
                case REQUIRED:
                    g.writeString("required");
                    break;
                case OTHER:
                    g.writeString("other");
                    break;
            }
        }
    }

    static final class Deserializer extends UnionJsonDeserializer<EmmState, EmmState> {
        private static final long serialVersionUID = 0L;

        public Deserializer() {
            super(EmmState.class, getTagMapping(), EmmState.OTHER);
        }

        @Override
        public EmmState deserialize(EmmState _tag, JsonParser _p, DeserializationContext _ctx) throws IOException, JsonParseException {
            return _tag;
        }

        private static Map<String, EmmState> getTagMapping() {
            Map<String, EmmState> values = new HashMap<String, EmmState>();
            values.put("disabled", EmmState.DISABLED);
            values.put("optional", EmmState.OPTIONAL);
            values.put("required", EmmState.REQUIRED);
            values.put("other", EmmState.OTHER);
            return Collections.unmodifiableMap(values);
        }
    }
}
