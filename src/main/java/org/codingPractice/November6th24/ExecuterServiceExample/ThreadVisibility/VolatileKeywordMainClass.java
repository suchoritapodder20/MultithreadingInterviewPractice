package org.codingPractice.November6th24.ExecuterServiceExample.ThreadVisibility;

public class VolatileKeywordMainClass {
    public class VolatileKeywordExample {
        public static void main(String[] args) throws InterruptedException {
            SharedResource resource = new SharedResource();

            Thread writer = new Thread(() -> {
                resource.setFlag();
                System.out.println("Flag set to true.");
            });

            Thread reader = new Thread(() -> {
                while (!resource.getFlag()) {
                    // Busy-wait until the flag is true
                }
                System.out.println("Flag is true, reader thread ends.");
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        }
    }
}
