package ds.array.game1d;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestCaseGsonParser {

    public static TestCases parseJSON(String filename) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(2.0);
        Gson gson = builder.create();
         //testCases = new TestCases();
        //String testSting = readUsingBufferedReader(filename);
        //InputStream is = TestCaseGsonParser.class.getResourceAsStream(filename);
        InputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        TestCases testCases = new TestCases();
        TestCase testCase = new TestCase();
        List<Integer> values = new ArrayList<>();
        Input input = new Input();
        input.setValues(values);
        testCase.setInput(input);
        List<TestCase> testCaseList = new ArrayList<>();

        String key=null;
        //create JsonReader object
        try(JsonReader reader = new JsonReader(isr);) {
            //TestCases testCases = gson.fromJson(reader, TestCases.class);
            key = parseJSON(reader, testCaseList, testCase, key);
            testCases.setTestCaseList(testCaseList);
            return testCases;
        }
    }

    private static String parseJSON(JsonReader reader, List<TestCase> testCaseList, TestCase testCase, String key) throws IOException{

        while(reader.hasNext()) {
            JsonToken token = reader.peek();
            switch (token){
                case BEGIN_OBJECT:
                    reader.beginObject();
                    if("input".equals(key)){
                        while(reader.hasNext()){
                            parseJSON(reader, testCaseList, testCase, key);
                        }
                        reader.endObject();
                    }else if("testcase".equals(key)) {
                        while(reader.hasNext()){
                            parseJSON(reader, testCaseList, testCase, key);
                        }
                        testCaseList.add(testCase.get());
                        testCase.getInput().getValues().clear();
                        reader.endObject();
                    }
                    break;
                case END_OBJECT:
                    reader.endObject();
                    break;
                case BEGIN_ARRAY:
                    reader.beginArray();
                    if("values".equals(key)){
                        while(reader.hasNext()){
                            parseJSON(reader, testCaseList, testCase, key);
                        }
                        reader.endArray();
                    }
                    break;
                case END_ARRAY:
                    reader.endArray();
                    break;
                case NAME:
                    key = reader.nextName();
                    break;
                case BOOLEAN:
                    if("output".equals(key)) testCase.setOutput(reader.nextBoolean());
                    else{
                        System.out.println("Unknown item found with key="+key);
                        //skip value to ignore it
                        reader.skipValue();
                    }
                    break;
                case NUMBER:
                    if("leap".equals(key)) testCase.getInput().setLeap(reader.nextInt());
                    else if("size".equals(key)) testCase.getInput().setSize(reader.nextInt());
                    else if("values".equals(key)) testCase.getInput().getValues().add(reader.nextInt());
                    else{
                        System.out.println("Unknown item found with key= "+key);
                        //skip value to ignore it
                        reader.skipValue();
                    }
                    break;
                case STRING:
                    reader.nextString();
                    break;
                case NULL:
                    reader.nextNull();
                    break;
                case END_DOCUMENT:
                    System.out.println("End of Document Reached");
                    break;
                default:
                    System.out.println("This part will never execute");
                    break;
            }

        }
        return key;
    }

    /*private String readFile(String fileName){
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }*/

    private static String readUsingBufferedReader(String fileName) {
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // delete the last ls
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        return stringBuilder.toString();
    }

    private static void setNumberValues(Input input, String keyName, int value, List<Integer> values){
        switch(keyName){
            case "size":
                input.setSize(value);
                break;
            case "leap":
                input.setLeap(value);
                break;
            case "values":
                values.add(value);
                break;
            default:
                break;
        }
    }
}
