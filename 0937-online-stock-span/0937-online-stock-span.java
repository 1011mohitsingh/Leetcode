class StockSpanner {
    class DayPrice{
        int currentDay;
        int currentPrice;

        public DayPrice(int currentDay, int currentPrice){
            this.currentDay = currentDay;
            this.currentPrice = currentPrice;
        }
    }

    Stack<DayPrice> st = new Stack<>();
    int currentDay = 0;
    public StockSpanner() {
        st.push(new DayPrice(-1,-1));
    }
    
    public int next(int price) {
        while(st.peek().currentDay != -1 && st.peek().currentPrice <= price){
            st.pop();
        }

        int daysBefore = currentDay - st.peek().currentDay;

        st.push(new DayPrice(currentDay,price));
        currentDay++;

        return daysBefore;
    }
}

