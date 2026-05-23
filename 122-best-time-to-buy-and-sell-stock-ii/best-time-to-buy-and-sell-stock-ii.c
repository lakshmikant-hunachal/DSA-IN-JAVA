#include <stdio.h>

int maxProfit(int* prices, int pricesSize) {
    
    int profit = 0;

    for(int i = 1; i < pricesSize; i++) {

        // If current price is greater than previous
        if(prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }

    return profit;
}