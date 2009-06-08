/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.gen.desc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a model meta description.
 * 
 * @author taedium
 * @since 3.0
 * 
 */
public class ModelMetaDesc {

    /** the package name */
    protected String packageName;

    /** the simple name */
    protected String simpleName;

    /** the modelClassName */
    protected String modelClassName;

    /** {@code true} if the model class is top level element */
    protected boolean topLevel;

    /** the list of attribute descriptions */
    protected List<AttributeMetaDesc> attributeDescList =
        new ArrayList<AttributeMetaDesc>();

    /**
     * Returns the packageName.
     * 
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the packageName.
     * 
     * @param packageName
     *            the packageName to set
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Returns the simpleName.
     * 
     * @return the simpleName
     */
    public String getSimpleName() {
        return simpleName;
    }

    /**
     * Sets the simpleName.
     * 
     * @param simpleName
     *            the simpleName to set
     */
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    /**
     * Returns the modelClassName.
     * 
     * @return the modelClassName
     */
    public String getModelClassName() {
        return modelClassName;
    }

    /**
     * Sets the modelClassName.
     * 
     * @param modelClassName
     *            the modelClassName to set
     */
    public void setModelClassName(String modelClassName) {
        this.modelClassName = modelClassName;
    }

    /**
     * Returns {@code true} if the model class is top level element, otherwise
     * {@code false}.
     * 
     * @return {@code true} if the model class is top level element, otherwise
     *         {@code false}.
     */
    public boolean isTopLevel() {
        return topLevel;
    }

    /**
     * Sets {@code true} if the model class is top level element, otherwise
     * {@code false}.
     * 
     * @param topLevel
     *            {@code true} if the model class is top level element,
     *            otherwise {@code false}.
     */
    public void setTopLevel(boolean topLevel) {
        this.topLevel = topLevel;
    }

    /**
     * Adds the attribute description.
     * 
     * @param attributeMetaDesc
     *            the attribute description.
     */
    public void addAttributeDesc(AttributeMetaDesc attributeMetaDesc) {
        this.attributeDescList.add(attributeMetaDesc);
    }

    /**
     * Returns the list of attribute descriptions.
     * 
     * @return the list of attribute descriptions
     */
    public List<AttributeMetaDesc> getAttributeDescList() {
        return Collections.unmodifiableList(attributeDescList);
    }

}