package hackathon.totalvoice.schedulemanager.totalvoice;

import br.com.totalvoice.TotalVoiceClient;
import br.com.totalvoice.api.Sms;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConnectorTotalVoice {

    public static final String ACCESS_TOKEN = "access-token";

    public void sendSms(String numero, String mensagem){
        try {
            TotalVoiceClient client =  clientTotalVoice();
            Sms sms = new Sms(client);
            JSONObject result = sms.enviar(numero,mensagem);
            System.out.println(result);

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public TotalVoiceClient clientTotalVoice(){
        return new TotalVoiceClient(ACCESS_TOKEN);
    }
}
