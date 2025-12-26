package example;

public class DatabasrConnection {
	private boolean connected = false;

    public void connectToDatabase() {
        connected = true;
    }

    public void closeConnection() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }


}
