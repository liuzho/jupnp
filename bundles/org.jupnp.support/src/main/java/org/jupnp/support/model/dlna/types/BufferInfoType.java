/*
 * Copyright (C) 2011-2025 4th Line GmbH, Switzerland and others
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License Version 1 or later
 * ("CDDL") (collectively, the "License"). You may not use this file
 * except in compliance with the License. See LICENSE.txt for more
 * information.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * SPDX-License-Identifier: CDDL-1.0
 */
package org.jupnp.support.model.dlna.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jupnp.model.types.InvalidValueException;
import org.jupnp.support.model.dlna.types.CodedDataBuffer.TransferMechanism;

/**
 *
 * @author Mario Franco
 * @author Amit Kumar Mondal - Code Refactoring
 */
public class BufferInfoType {

    private static final Pattern pattern = Pattern.compile(
            "^dejitter=(\\d{1,10})(;CDB=(\\d{1,10});BTM=(0|1|2))?(;TD=(\\d{1,10}))?(;BFR=(0|1))?$",
            Pattern.CASE_INSENSITIVE);
    private Long dejitterSize;
    private CodedDataBuffer cdb;
    private Long targetDuration;
    private Boolean fullnessReports;

    public BufferInfoType(Long dejitterSize) {
        this.dejitterSize = dejitterSize;
    }

    public BufferInfoType(Long dejitterSize, CodedDataBuffer cdb, Long targetDuration, Boolean fullnessReports) {
        this.dejitterSize = dejitterSize;
        this.cdb = cdb;
        this.targetDuration = targetDuration;
        this.fullnessReports = fullnessReports;
    }

    public static BufferInfoType valueOf(String s) {
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            try {
                Long dejitterSize = Long.parseLong(matcher.group(1));
                CodedDataBuffer cdb = null;
                Long targetDuration = null;
                Boolean fullnessReports = null;

                if (matcher.group(2) != null) {
                    cdb = new CodedDataBuffer(Long.parseLong(matcher.group(3)),
                            TransferMechanism.values()[Integer.parseInt(matcher.group(4))]);
                }
                if (matcher.group(5) != null) {
                    targetDuration = Long.parseLong(matcher.group(6));
                }
                if (matcher.group(7) != null) {
                    fullnessReports = matcher.group(8).equals("1");
                }
                return new BufferInfoType(dejitterSize, cdb, targetDuration, fullnessReports);
            } catch (NumberFormatException ex1) {
                // no need to take any precaution measure
            }
        }
        throw new InvalidValueException("Can't parse BufferInfoType: " + s);
    }

    public String getString() {
        String s = "dejitter=" + dejitterSize.toString();
        if (cdb != null) {
            s += ";CDB=" + cdb.getSize().toString() + ";BTM=" + cdb.getTranfer().ordinal();
        }
        if (targetDuration != null) {
            s += ";TD=" + targetDuration;
        }
        if (fullnessReports != null) {
            s += ";BFR=" + (fullnessReports ? "1" : "0");
        }
        return s;
    }

    /**
     * @return the dejitter size
     */
    public Long getDejitterSize() {
        return dejitterSize;
    }

    /**
     * @return the cdb
     */
    public CodedDataBuffer getCdb() {
        return cdb;
    }

    /**
     * @return the targetDuration
     */
    public Long getTargetDuration() {
        return targetDuration;
    }

    /**
     * @return the fullnessReports
     */
    public Boolean isFullnessReports() {
        return fullnessReports;
    }
}
