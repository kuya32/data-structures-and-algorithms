package challenges.hashtable;

import java.util.ArrayList;

public class Hashtable {
    ArrayList<HashNode<String>>[] bucket;

    public Hashtable(ArrayList<HashNode<String>>[] bucket) {
        this.bucket = bucket;
    }

    public void add(String key, String value) throws Exception {
        int hash = hash(key);
        HashNode<String> newNode = new HashNode<>(key, value);
        ArrayList<HashNode<String>> list = bucket[hash];

        if (list == null) {
            list = new ArrayList<HashNode<String>>();
            list.add(newNode);
            bucket[hash] = list;
        } else {
            list.add(newNode);
        }
    }

    public String get(String key) {
        if (this.contains(key)) {
            int hash = hash(key);
            ArrayList<HashNode<String>> list = bucket[hash];

            for (HashNode<String> stringHashNode : list) {
                if (stringHashNode.getKey().equals(key)) {
                    return stringHashNode.getValue();
                }
            }
        }
        return null;
    }

    public boolean contains(String key) {
        int hash = hash(key);
        ArrayList<HashNode<String>> list = bucket[hash];

        if (list != null) {
            for (HashNode<String> stringHashNode : list) {
                if (stringHashNode.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hash(String key) {
        int buck = 0;
        for (int i = 0; i < key.length(); i++) {
            buck = buck * 100 + key.charAt(i);
        }
        buck = buck % bucket.length;
        buck = Math.abs(buck);
        return buck;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("[\n");
        for (int i = 0; i < bucket.length; i++) {
            string.append(i).append(": [");
            if (bucket[i] == null) {
                string.append("null");
            } else {
                ArrayList<HashNode<String>> list = bucket[i];
                for (int j = 0; j < list.size(); j++) {
                    if (j > 0) {
                        string.append(", ");
                    }
                    string.append(list.get(j).getKey()).append(" : ").append(list.get(j).getValue());
                }
            }
            string.append("]\n");
        }
        string.append("]");
        return string.toString();
    }
}
