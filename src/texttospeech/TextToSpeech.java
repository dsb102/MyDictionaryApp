package texttospeech;

import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;


/*
    1.Engine: Giao diện Engine có sẵn bên trong gói giọng nói. "Công cụ giọng nói" là thuật ngữ chung 
    cho một hệ thống được thiết kế để xử lý đầu vào bằng giọng nói hoặc đầu ra bằng giọng nói.
    2.Central: Trung tâm cung cấp khả năng định vị, chọn 
    và tạo trình nhận dạng giọng nói và trình tổng hợp giọng nói.
    3.SynthesizerModeDesc: SynthesizerModeDesc mở rộng EngineModeDesc với các thuộc tính dành 
    riêng cho bộ tổng hợp giọng nói.
    4.Synthesizer: Synthesizer interface  cung cấp quyền truy cập chính vào khả năng tổng hợp giọng nói. 
    SynthesizerModeDesc bổ sung thêm hai thuộc tính: Danh sách giọng nói được cung cấp bởi bộ tổng hợp Giọng nói 
    sẽ được tải khi bộ tổng hợp được khởi động.
*/


public class TextToSpeech {

    
    public static void getAudio(String textToSpeech) {
        try {
            // Đặt thuộc tính giọng đọc Kevin
            System.setProperty(
                "freetts.voices",
                "com.sun.speech.freetts.en.us"
                    + ".cmu_us_kal.KevinVoiceDirectory");
            
            // Đăng kí Engine
            Central.registerEngineCentral(
                "com.sun.speech.freetts"
                + ".jsapi.FreeTTSEngineCentral");
  
            // Tạo 1 Synthesizer
            Synthesizer synthesizer
                = Central.createSynthesizer(
                    new SynthesizerModeDesc(Locale.US));
            // Cấp phát synthesizer
            synthesizer.allocate();
  
            // Resume Synthesizer
            synthesizer.resume();
            
            // Nói hết String textToSpeech thi dừng
            synthesizer.speakPlainText(
                textToSpeech, null);
            synthesizer.waitEngineState(
                Synthesizer.QUEUE_EMPTY);
  
            // Ngừng cấp phát Synthesizer.
//            synthesizer.deallocate();
        }
  
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
