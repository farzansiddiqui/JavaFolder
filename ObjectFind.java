public class ObjectFind {
    public static void main(String[] args) {
        String jsonString = "{ \"squadName\": \"Super hero squad\", \"homeTown\": \"Metro City\", \"formed\": 2016, \"secretBase\": \"Super tower\", \"active\": true, \"members\": [ { \"name\": \"Molecule Man\", \"age\": 29, \"secretIdentity\": \"Dan Jukes\", \"powers\": [\"Radiation resistance\", \"Turning tiny\", \"Radiation blast\"] } ] }";

try {
    JSONObject jsonObject = new JSONObject(jsonString);


} catch (JSONException e) {
    e.printStackTrace();
}

    }
}
