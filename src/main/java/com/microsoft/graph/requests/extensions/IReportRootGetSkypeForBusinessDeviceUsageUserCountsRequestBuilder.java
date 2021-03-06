// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Skype For Business Device Usage User Counts Request Builder.
 */
public interface IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
