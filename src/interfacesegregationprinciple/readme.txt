Interface segregation principle:
No client should be forced to depend on interfaces that they do not use

for example a Media player is a fat interface and when mp3player extends it
it has to implement all the video related method also even though we do not need it

To avoid this issue we can segregate fat Media player interface into 2 AudioPlayer and video player
and then according to player type we can extend if a type requires both both interface can be extended

By segregating the interfaces, each class only needs to implement the methods it actually requires. This not only makes the code more maintainable but also prevents clients from being forced to depend on methods they don't use.

If we need a class that supports both audio and video playback, we can create a new class that implements both interfaces: