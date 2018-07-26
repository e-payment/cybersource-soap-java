package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class BinLookup {

	public static String check(String bin) {
		try {
			HttpPost httpPost = new HttpPost("https://neutrinoapi.com/ip-info");

			List<NameValuePair> postData = new ArrayList<>();
			postData.add(new BasicNameValuePair("user-id", "YOUR_USER_ID"));
			postData.add(new BasicNameValuePair("api-key", "YOUR_API_KEY"));
			postData.add(new BasicNameValuePair("ip", "162.209.104.195"));
			httpPost.setEntity(new UrlEncodedFormEntity(postData));

			HttpResponse response = HttpClients.createDefault().execute(httpPost);
			String jsonStr = EntityUtils.toString(response.getEntity());

			JSONObject json = new JSONObject(jsonStr);
			System.out.println("Country: " + json.getString("country"));
			System.out.println("Country Code: " + json.getString("country-code"));
			System.out.println("Region: " + json.getString("region"));
			System.out.println("City: " + json.getString("city"));
		} catch (IOException | ParseException | JSONException ex) {
			ex.printStackTrace();
		}
	}
}
