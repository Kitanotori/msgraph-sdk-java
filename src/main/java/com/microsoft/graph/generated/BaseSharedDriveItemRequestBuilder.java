// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Shared Drive Item Request Builder.
 */
public class BaseSharedDriveItemRequestBuilder extends BaseRequestBuilder implements IBaseSharedDriveItemRequestBuilder {

    /**
     * The request builder for the SharedDriveItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSharedDriveItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public ISharedDriveItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public ISharedDriveItemRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new SharedDriveItemRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for DriveItem.
     */
    public IDriveItemRequestBuilder getDriveItem() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }
    public IDriveItemCollectionRequestBuilder getItems() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IDriveItemRequestBuilder getItems(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for List.
     */
    public IListRequestBuilder getList() {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("list"), getClient(), null);
    }

    /**
     * Gets the request builder for ListItem.
     */
    public IListItemRequestBuilder getListItem() {
        return new ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("listItem"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem.
     */
    public IDriveItemRequestBuilder getRoot() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("root"), getClient(), null);
    }

    /**
     * Gets the request builder for Site.
     */
    public ISiteRequestBuilder getSite() {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("site"), getClient(), null);
    }
}
