/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.itunes_api.search;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author ono
 */
public class SearchBuilder extends Builder {

	@Override
	public URI getUri(String term) {
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("term", term));
		params.add(new BasicNameValuePair("media", "music"));
		params.add(new BasicNameValuePair("entity", "musicTrack"));
		params.add(new BasicNameValuePair("country", "JP"));
		return (getUri(params));
	}

}
