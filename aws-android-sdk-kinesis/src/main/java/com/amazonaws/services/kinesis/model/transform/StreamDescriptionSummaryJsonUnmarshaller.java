/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StreamDescriptionSummary
 */
class StreamDescriptionSummaryJsonUnmarshaller implements
        Unmarshaller<StreamDescriptionSummary, JsonUnmarshallerContext> {

    public StreamDescriptionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamDescriptionSummary streamDescriptionSummary = new StreamDescriptionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StreamName")) {
                streamDescriptionSummary.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamARN")) {
                streamDescriptionSummary.setStreamARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamStatus")) {
                streamDescriptionSummary.setStreamStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RetentionPeriodHours")) {
                streamDescriptionSummary.setRetentionPeriodHours(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamCreationTimestamp")) {
                streamDescriptionSummary.setStreamCreationTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnhancedMonitoring")) {
                streamDescriptionSummary
                        .setEnhancedMonitoring(new ListUnmarshaller<EnhancedMetrics>(
                                EnhancedMetricsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncryptionType")) {
                streamDescriptionSummary.setEncryptionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyId")) {
                streamDescriptionSummary.setKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OpenShardCount")) {
                streamDescriptionSummary.setOpenShardCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamDescriptionSummary;
    }

    private static StreamDescriptionSummaryJsonUnmarshaller instance;

    public static StreamDescriptionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionSummaryJsonUnmarshaller();
        return instance;
    }
}
