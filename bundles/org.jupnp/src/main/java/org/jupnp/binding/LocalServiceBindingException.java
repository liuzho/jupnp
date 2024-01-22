/*
 * Copyright (C) 2011-2024 4th Line GmbH, Switzerland and others
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
package org.jupnp.binding;

/**
 * Thrown when reading/writing {@link org.jupnp.model.meta.LocalService} metadata failed.
 *
 * @author Christian Bauer
 */
public class LocalServiceBindingException extends RuntimeException {

    public LocalServiceBindingException(String s) {
        super(s);
    }

    public LocalServiceBindingException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
