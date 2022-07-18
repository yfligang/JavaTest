//package com.liepin.rim.org.day08;
//
//public class LoadClass(){
//
//    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
//        synchronized (getClassLoadingLock(name)){
//            Class<?> c = findLoadedClass(name);
//            if (c == null) {
//                long t0 = System.nanoTime();
//                try {
//                    if (parent != null){
//                        c = parent.loadClass(name,false);
//                    }
//                }
//            }else {
//                c = findBootstrapClassOrNull(name);
//            }
//
//        }
//    }
//}