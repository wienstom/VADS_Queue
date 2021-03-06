/**
 * Created by rtf on 9/22/16.
 */
public class NodeMessage extends AbstractMessage {

    public enum MessageType {
        INTRODUCE,
        FORCE,
        FORCE_DELETE,
        LEAVE
    }

    protected Node node;
    protected MessageType type;


    public NodeMessage(Node sender, Node receiver, Node node, MessageType type) {
        super(sender, receiver);
        this.node = node;
        this.type = type;
    }

}
