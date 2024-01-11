class Sample extends Thread
{


        public void run ()
        {
            try {
                System.out.println("thread is running");
                Thread.sleep(5000);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }



    public static void main(String[] args)
    {
                Sample st = new Sample();
                st.start();
                System.out.println("waited for 5 seconds");
    }
}