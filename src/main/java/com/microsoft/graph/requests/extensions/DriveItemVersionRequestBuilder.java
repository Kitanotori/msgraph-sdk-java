// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequest;
import com.microsoft.graph.requests.extensions.DriveItemVersionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemVersionStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRestoreVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionRestoreVersionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Version Request Builder.
 */
public class DriveItemVersionRequestBuilder extends BaseRequestBuilder implements IDriveItemVersionRequestBuilder {

    /**
     * The request builder for the DriveItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemVersionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDriveItemVersionRequest instance
     */
    public IDriveItemVersionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemVersionRequest instance
     */
    public IDriveItemVersionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DriveItemVersionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IDriveItemVersionStreamRequestBuilder content() {
        return new DriveItemVersionStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public IDriveItemVersionRestoreVersionRequestBuilder restoreVersion() {
        return new DriveItemVersionRestoreVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restoreVersion"), getClient(), null);
    }
}

