import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Video extends JFXPanel {

    public Video (String rota, int l, int a) {

        Platform.runLater(() -> {

        	String uri = getClass()
	    	        .getResource(rota)
	    	        .toExternalForm();

            MediaPlayer player = new MediaPlayer(new Media(uri));
            MediaView view = new MediaView(player);

            view.setFitWidth(l);
            view.setFitHeight(a);

            StackPane root = new StackPane(view);
            Scene scene = new Scene(root, l, a);

            setScene(scene);

            player.play();
        });
    }
}