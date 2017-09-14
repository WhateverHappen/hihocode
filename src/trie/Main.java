package trie;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/4/25.
 */
///建树
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();        ///n为字典单词个数
        String dictionary[] = new String[n];      ///字典
        int index = 0;
        while (index < n) {
            dictionary[index] = scanner.next();
            index++;
        }
        int m = scanner.nextInt();
        int index2 = 0;
        String search[] = new String[m];    ///查询结果
        long[] searchResult = new long[m];
        while (index2 < m) {
            search[index2] = scanner.next();
            index2++;
        }
        ///建立根节点
        Node rootNode = new Node('A');

        ///建立词典
        for (int i = 0; i < n; i++) {
            String word = dictionary[i];
            char[] wordChars = word.toCharArray();
            int wordLength = word.length();
            Node tempNode = rootNode;
            for (int j = 0; j < wordLength; j++) {
                tempNode = tempNode.getNextNode(wordChars[j]);
            }
        }

        ///从词典中查询
        for (int i = 0; i < m; i++) {
            String searchWord = search[i];
            long appearCount = 0;
            int wordLength = searchWord.length();
            char[] searchChars = searchWord.toCharArray();
            Node tempNode = rootNode;
            for (int j = 0; j < wordLength; j++) {
                tempNode = tempNode.findNextNode(searchChars[j]);
                if (tempNode != null) {
                    appearCount = tempNode.T;
                }
                if (tempNode == null) {
                    appearCount = 0;
                    break;
                }
            }
            searchResult[i] = appearCount;
            System.out.println(searchResult[i]);
        }
    }
}

class Node {
    Node[] nextNodeList;
    long T;
    char data;

    public Node(char data) {
        this.data = data;
        T = 0;
        nextNodeList = new Node[26];
    }

    ///获得下一个节点
    public Node getNextNode(char c) {
        Node newNode;
        int index = c - 'a';
        if (this.nextNodeList[index] == null) {         ///若该节点为空，则新建一个节点放入并返回，层数加一
            newNode = new Node(c);
            this.nextNodeList[index] = newNode;
            newNode.T++;
        } else {                  ///若该节点不为空，则返回该节点，层数加一
            newNode = this.nextNodeList[index];
            newNode.T++;
        }
        return newNode;
    }

    ///查找节点
    public Node findNextNode(char c) {
        Node newNode;
        int index = c - 'a';
        if (this.nextNodeList[index] == null) {     ///没找到
            return null;
        } else {          ///有该节点，返回该节点
            newNode = this.nextNodeList[index];
        }
        return newNode;
    }

}
