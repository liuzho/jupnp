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
package org.jupnp.support.lastchange;

import java.util.Map;

import org.jupnp.model.ModelUtil;
import org.jupnp.model.types.Datatype;

/**
 * @author Christian Bauer - Initial Contribution
 * @author Amit Kumar Mondal - Code Refactoring
 */
public abstract class EventedValueEnumArray<E extends Enum<E>> extends EventedValue<E[]> {

    public EventedValueEnumArray(E[] e) {
        super(e);
    }

    public EventedValueEnumArray(Map.Entry<String, String>[] attributes) {
        super(attributes);
    }

    @Override
    protected E[] valueOf(String s) {
        return enumValueOf(ModelUtil.fromCommaSeparatedList(s));
    }

    protected abstract E[] enumValueOf(String[] names);

    @Override
    public String toString() {
        return ModelUtil.toCommaSeparatedList(getValue());
    }

    @Override
    protected Datatype<?> getDatatype() {
        return null;
    }
}
