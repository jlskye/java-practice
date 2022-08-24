/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.thoughtworks.com.demo;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public String handleStringWithSb() {
        StringBuilder builder = new StringBuilder(1024);
        builder.append("handle ")
                .append("string ")
                .append("with ")
                .append("string ")
                .append("builder")
                .insert(0, "hi, ");

        return builder.toString();
    }

    public String handleList() {
        List<String> list = List.of("handle", "my", "list");
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        System.out.println(new App().handleList());
        System.out.println(new App().handleStringWithSb());
    }

    public int handleRemoveListItem() {
        ArrayList<Integer> list = new ArrayList<>(List.of(20,30,40,50));
        list.remove(1);
        return list.size();
    }

    public String getFirstListItem() {
        LinkedList<String> linkedList = new LinkedList<>(List.of("apple", "orange", "grape"));
        return linkedList.getFirst();
    }

    public ArrayList<String> getUnionCollection(ArrayList<String> first, ArrayList<String> last) {
        return new ArrayList<>(CollectionUtils.union(first, last));
    }

    public ArrayList<String> getIntersectionCollection(ArrayList<String> first, ArrayList<String> last) {
        return new ArrayList<>(CollectionUtils.intersection(first, last));
    }

    public int getDuplicateSubstringCount(String message, String substring) {
        return StringUtils.countMatches(message, substring);
    }
}
