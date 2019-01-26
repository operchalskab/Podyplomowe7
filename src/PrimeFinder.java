public class PrimeFinder implements Runnable {
        public long target;
        public long prime;
        public boolean finished = false;
        private Thread runner;

        PrimeFinder(long inTarget) {
            target = inTarget;
            if (target < 0);
            try {
                throw new Exception("Ujemna liczba");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (runner == null) {
                runner = new Thread(this);
                runner.start();
            }

        }

        public void run() {
            long numPrimes = 0;
            long candidate = 2;
            while (numPrimes < target) {
                if (isPrime(candidate)) {
                    numPrimes++;
                    prime = candidate;
                }
                candidate++;
            }
            finished = true;
        }

        boolean isPrime(long checkNumber) {
            double root = Math.sqrt(checkNumber);
            for (int i = 2; i <= root; i++) {
                if (checkNumber % i == 0)
                    return false;
            }
            return true;
            }

    }


