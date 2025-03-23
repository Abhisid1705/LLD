package consistenthashing.interfaces;

public interface Node {
  String getId();
  boolean isActive();
  void handleRequests();
}
