// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Vdb Body.
 */
public class WorkbookFunctionsVdbBody {

    /**
     * The cost.
     * 
     */
    @SerializedName("cost")
    @Expose
    public com.google.gson.JsonElement cost;

    /**
     * The salvage.
     * 
     */
    @SerializedName("salvage")
    @Expose
    public com.google.gson.JsonElement salvage;

    /**
     * The life.
     * 
     */
    @SerializedName("life")
    @Expose
    public com.google.gson.JsonElement life;

    /**
     * The start Period.
     * 
     */
    @SerializedName("startPeriod")
    @Expose
    public com.google.gson.JsonElement startPeriod;

    /**
     * The end Period.
     * 
     */
    @SerializedName("endPeriod")
    @Expose
    public com.google.gson.JsonElement endPeriod;

    /**
     * The factor.
     * 
     */
    @SerializedName("factor")
    @Expose
    public com.google.gson.JsonElement factor;

    /**
     * The no Switch.
     * 
     */
    @SerializedName("noSwitch")
    @Expose
    public com.google.gson.JsonElement noSwitch;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
