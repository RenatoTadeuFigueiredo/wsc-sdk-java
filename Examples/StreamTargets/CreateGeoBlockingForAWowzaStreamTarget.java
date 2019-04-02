 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;
import java.util.ArrayList;

public class CreateGeoBlockingForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";

	Geoblock newGeoblock = new Geoblock();
	newGeoblock.setType(Geoblock.TypeEnum.DENY);
	List<String> whiteList = new ArrayList<String>();
	whiteList.add("10.1.1.0");
	whiteList.add("192.168.1.0");
	newGeoblock.setWhitelist(whiteList);
	List<String> countryList = new ArrayList<String>();
	countryList.add("FR");
	newGeoblock.setCountries(countryList);

	try {
	    Geoblock result = apiInstance.createStreamTargetGeoblock(streamTargetId,newGeoblock);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createStreamTargetGeoblock");
	    e.printStackTrace();
		}
	}
}
