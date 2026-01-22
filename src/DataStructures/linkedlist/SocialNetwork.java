package DataStructures.linkedlist;


/*
 Social Media Friend System using Singly Linked List
*/

class UserNode {
    int id;
    String name;
    int[] friends = new int[10];
    int count = 0;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SocialNetwork {

    UserNode head;

    void addUser(int id, String name) {
        UserNode newNode = new UserNode(id, name);
        newNode.next = head;
        head = newNode;
    }

    UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 != null && u2 != null) {
            u1.friends[u1.count++] = id2;
            u2.friends[u2.count++] = id1;
        }
    }

    void showFriends(int id) {
        UserNode user = findUser(id);

        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        for (int i = 0; i < user.count; i++) {
            System.out.print(user.friends[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Alice");
        sn.addUser(2, "Bob");
        sn.addUser(3, "Charlie");

        sn.addFriend(1, 2);
        sn.addFriend(1, 3);

        sn.showFriends(1);
    }
}
