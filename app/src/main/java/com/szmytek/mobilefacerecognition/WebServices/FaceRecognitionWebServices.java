package com.szmytek.mobilefacerecognition.WebServices;
import org.kobjects.base64.Base64;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
/**
 * Created by Szmytek on 09.09.2016.
 */
public class FaceRecognitionWebServices {
    public  final String WSDL_TARGET_NAMESPACE = "http://szmytekfacerecognition.somee.com/";

    public  final String SOAP_ADDRESS = "http://szmytekfacerecognition.somee.com/FaceRecognitionWebService.asmx";

    public FaceRecognitionWebServices()
    {
    }

    public String HelloWorld()
    {
        final String OPERATION_NAME = "HelloWorld";
        final String SOAP_ACTION = "http://szmytekfacerecognition.somee.com/HelloWorld";

        SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        envelope.dotNet = true;

        envelope.setOutputSoapObject(request);

        HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
        Object response=null;
        try
        {
            httpTransport.call(SOAP_ACTION, envelope);
            response = envelope.getResponse();
        }
        catch (Exception exception)
        {
            response=exception.toString();
        }
        return response.toString();
    }
    public String SaveFace(String userName, byte[] a_image)
    {
        final String OPERATION_NAME = "SaveNewFace";
        final String SOAP_ACTION = "http://szmytekfacerecognition.somee.com/SaveNewFace";

        SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME);

        PropertyInfo pi=new PropertyInfo();
        pi.setName("userName");
        pi.setValue(userName);
        pi.setType(String.class);
        request.addProperty(pi);
        pi=new PropertyInfo();
        pi.setName("image");
        pi.setValue(Base64.encode(a_image));
        pi.setType(Base64.class);
        request.addProperty(pi);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        envelope.dotNet = true;

        envelope.setOutputSoapObject(request);

        HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
        Object response=null;
        try
        {
            httpTransport.call(SOAP_ACTION, envelope);
            response = envelope.getResponse();
        }
        catch (Exception exception)
        {
            response=exception.toString();
        }
        return response.toString();
    }
}
