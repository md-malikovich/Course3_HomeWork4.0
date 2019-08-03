package com.example.lesson4;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainViewHolder> {

    private ArrayList <String> data; // объявили список
    public int holderCount = 0;

    public MainAdapter() { // заполнение списка ArrayList
        data = new ArrayList<>(); // создали список
        for(int i = 0; i <= 1000; i++) {// заполнили
            data.add("Element " + i);
        }
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // создаем VH, которые просит RecyclerView
        holderCount++;
        Log.d("ololo", "Count" + holderCount);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()); //создаем inflater проходит по схеме и создает въюшку
        View view = inflater.inflate(R.layout.viewholder_main, parent, false); // парамтры View - какая View, parent, 3ий параметр - чтобы не привязывался к родителю
        return new MainViewHolder(view); // возвращаем
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) { // заполняем VH данными (сам VH и порядковый №)
        if (position % 2 == 0) { // в первичны код добавил этот код
            holder.onBind(data.get(position));
        } // в первичны код добавил этот код
    }

    @Override
    public int getItemCount() { // возвращаем общее кол-во данных
        return data.size(); // возвращаем размер списка
    }
}

/*

            int i = sc.nextInt();

        if (i % 10 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");



public class Test{
	static boolean dividesByTwo(int a){
		return (a%2==0);
	}

	public static void main(String[] args){
		System.out.println( dividesByTwo(6) );
	}
}
 */