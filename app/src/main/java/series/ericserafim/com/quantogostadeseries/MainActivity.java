package series.ericserafim.com.quantogostadeseries;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imagem;
    private Vibrator vibrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imagem = (ImageView) findViewById(R.id.imgId);
        vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress){
                    case 1:
                        imagem.setImageResource(R.drawable.pouco);
                        break;
                    case 2:
                        imagem.setImageResource(R.drawable.medio);
                        break;
                    case 3:
                        imagem.setImageResource(R.drawable.muito);
                        break;
                    case 4:
                        imagem.setImageResource(R.drawable.susto);
                        vibrador.vibrate(1000);
                        break;
                    default:
                        imagem.setImageDrawable(null);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
