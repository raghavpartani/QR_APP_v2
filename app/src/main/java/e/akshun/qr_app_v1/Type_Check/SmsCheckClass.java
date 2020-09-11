package e.akshun.qr_app_v1.Type_Check;

import com.google.zxing.client.result.SMSParsedResult;

public class SmsCheckClass {
    private static final String TAG ="SmsCheckClass";

    private SMSParsedResult mSMSParsedResult ;

    public SmsCheckClass(Object object){
        this.mSMSParsedResult = (SMSParsedResult)object;
    }

    public String SetSMSNumber(){
        return mSMSParsedResult.getNumbers()[0] ;
    }
    public String SetSMSBody(){
        return mSMSParsedResult.getBody() ;
    }
}
