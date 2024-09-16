package io.flowsquad.blog.devops.github.packages.main;

import io.flowsquad.blog.devops.github.packages.library.LibraryClass;
import io.flowsquad.blog.devops.github.packages.library2.LibraryClass;
import io.flowsquad.blog.devops.github.packages.library3.LibraryClass;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(new LibraryClass().utilityMethod());
    }
    public static void main(String[] args) { System.out.println(new LibraryClass().utilityMethod()); }
}
