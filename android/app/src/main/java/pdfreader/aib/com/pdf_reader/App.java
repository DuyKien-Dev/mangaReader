package pdfreader.aib.com.pdf_reader;

import com.bjvpbsdiwc.adx.service.AdsExchange;
import com.flurry.android.FlurryAgent;

public class App extends io.flutter.app.FlutterApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "75JB2JM7SK4V9JMF2568");
        AdsExchange.init(this, "5e967dff35810c06f487c01e");
    }
}
