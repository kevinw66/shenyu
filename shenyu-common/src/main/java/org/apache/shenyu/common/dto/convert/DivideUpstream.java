/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.common.dto.convert;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * this is divide upstream.
 */
@Data
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DivideUpstream implements Serializable {

    private static final long serialVersionUID = 6252280511262542360L;

    /**
     * host.
     */
    @EqualsAndHashCode.Include
    private String upstreamHost;

    /**
     * this is http protocol.
     */
    @EqualsAndHashCode.Include
    private String protocol;

    /**
     * url.
     */
    @EqualsAndHashCode.Include
    private String upstreamUrl;

    /**
     * weight.
     */
    private int weight;

    /**
     * false close/ true open.
     */
    @Builder.Default
    private boolean status = true;

    /**
     * startup time.
     */
    private long timestamp;

    /**
     * warmup.
     */
    private int warmup;

    // health parameters

    @Builder.Default
    private boolean healthy = true;

    @Builder.Default
    private long lastHealthTimestamp = System.currentTimeMillis();

    @Builder.Default
    private long lastUnhealthyTimestamp = System.currentTimeMillis();

}
