package network;

import model.ResponseModel;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddres = koneksisaya.buildURL
                ("https://harber.mimoapps.xyz/api/getaccess.php");
        String response = koneksisaya.getResponseFromHttpUrl(myAddres);
        System.out.println(response);

        JSONArray responseJSON = new JSONArray();
        ArrayList<ResponseModel> responseModel = new ArrayList<>();
        for (int i=0; i<responseJSON.length(); i++){
            ResponseModel resModel = new ResponseModel();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
            resModel.setMsg(myJSONObject.getString("message"));
            resModel.setStatus(myJSONObject.getString("status"));
            resModel.setComments(myJSONObject.getString("comments"));
            responseModel.add(resModel);
        }
        System.out.println("Response are:");
        for (int index=0; index<responseModel.size(); index++){
            System.out.println("MASSAGE : " + responseModel.get(index).getMsg());
            System.out.println("STATUS : " + responseModel.get(index).getStatus());
            System.out.println("COMMENTS : " + responseModel.get(index).getComments());
        }
    }
}