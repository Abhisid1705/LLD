package consistenthashing;

public class Request {
   private String requestKey;
  private String ip;
  private String userId;

    public Request(String requestKey, String ip, String userId) {
        this.requestKey = requestKey;
        this.ip = ip;
        this.userId = userId;
    }

    public String getRequestKey() {
        return requestKey;
    }

    public Request setRequestKey(String requestKey) {
        this.requestKey = requestKey;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public Request setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
