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
package org.jupnp.transport.spi;

/**
 * Thrown by the transport layer implementation when service setup fails.
 * <p>
 * This exception typically indicates a configuration problem and it is not
 * recoverable unless you can continue without the service that threw this
 * exception.
 * </p>
 *
 * @author Christian Bauer
 */
public class InitializationException extends RuntimeException {

    public InitializationException(String s) {
        super(s);
    }

    public InitializationException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
