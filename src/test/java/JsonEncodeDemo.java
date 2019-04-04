import org.json.JSONObject;

class JsonEncodeDemo {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("carBrand", "AUDI");
        obj.put("carMake", "AUDI A4 2019");
        obj.put("carColour", "Black");
        obj.put("carRegNumber", "DB12FYW");

        System.out.print(obj);
    }
}