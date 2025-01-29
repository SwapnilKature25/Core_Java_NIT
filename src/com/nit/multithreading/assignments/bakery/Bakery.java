package com.nit.multithreading.assignments.bakery;

public class Bakery {
	private int goodsAvailable=0;
	private final int MAX_GOODS_PER_DAY=100;
	private int goodsProducedToday=0;
	
	public int getGoodsAvailable()
	{
		return this.goodsAvailable;
	}
	
	public synchronized void bakeGoods()
	{
		while(goodsAvailable > 0)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		if(goodsProducedToday < MAX_GOODS_PER_DAY)
		{
			int goodsToBake = Math.min(10, MAX_GOODS_PER_DAY - goodsProducedToday);
			goodsAvailable += goodsToBake;		// 0+10 => 10   10+10 => 20 ...
            goodsProducedToday += goodsToBake;	// 0+10 => 10	10+10 => 20 .....
            System.out.println("Baker baked " + goodsToBake + " goods. Total goods available: " + goodsAvailable);
            notifyAll();
		}
	}
	
	public synchronized void buyGoods(String customerName)
	{
		 while (goodsAvailable == 0 && !isProductionFinished()) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        if (goodsAvailable > 0) {
	            goodsAvailable--;
	            System.out.println(customerName + " bought a good. Goods left: " + goodsAvailable);

	            if (goodsAvailable == 0) {
	                notifyAll();
	            }
	        }
	}
	
	public boolean isProductionFinished()
	{
		return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable == 0;
	}
}
