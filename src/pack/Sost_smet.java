package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

public class Sost_smet {
	static double mat_zatr_d, t_izgot_d, zarpl_d, rab_dn_d, kol_s_d, st_st_d, sr_st_d, pr_rash_d, name_1_d,
	name_2_d, name_3_d, name_4_d, name_5_d, name_6_d,name_7_d, name_8_d, name_9_d, name_10_d, st_1_d, st_2_d,
	st_3_d, st_4_d, st_5_d, st_6_d, st_7_d, st_8_d, st_9_d, st_10_d, kol_1_d, kol_2_d, kol_3_d, kol_4_d, 
	kol_5_d, kol_6_d,kol_7_d, kol_8_d,kol_9_d,kol_10_d, mat_zatr_1, zarpl_1, otc_1, amort_1, pr_rash_1, itogo_1;
	static String izd_str;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обра щаться через имя класса.*/
	
	public static void vkl_1() {/*Класс Vkl_1, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		if (Vkl_1.calc_int==0){ //если флажок Рассчитать был выключен
			mat_zatr_d = Double.parseDouble(Vkl_1.mat_zatr.getText());/* В переменную записываются данные введеные 
			пользователем в текстовое поле которое расположено в файле Index. Преобразование данных в тип Double. */
		}
		t_izgot_d = Double.parseDouble(Vkl_1.t_izgot.getText());
		kol_s_d = Double.parseDouble(Vkl_1.kol_s.getText());	
		zarpl_d = Double.parseDouble(Vkl_1.zarpl.getText());	
		rab_dn_d = Double.parseDouble(Vkl_1.rab_dn.getText());	
		st_st_d = Double.parseDouble(Vkl_1.st_st.getText());	
		sr_st_d = Double.parseDouble(Vkl_1.sr_st.getText());	
		pr_rash_d = Double.parseDouble(Vkl_1.pr_rash.getText());	
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Vkl_1.
		Преобразование данных в тип Double. */
		
		if (Vkl_1.izd_int==0) {izd_str="cтол";} //izd_int-переменная которая отвечает за выпадающий список.
		else if (Vkl_1.izd_int==1) {izd_str="стул";} 
		else if (Vkl_1.izd_int==2) {izd_str="тумба";}
		else if (Vkl_1.izd_int==3) {izd_str="шкаф";}
		else if (Vkl_1.izd_int==4) {izd_str="кровать";}
		else if (Vkl_1.izd_int==5) {izd_str="диван";}
		else if (Vkl_1.izd_int==6) {izd_str="комод";}
		else {izd_str="кресло";}
		
	}
	
	public static void vkl_2() {/*Класс, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */

		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено 
		 * в файле Vkl_2.	Преобразование данных в тип Double. */	
        if (Vkl_2.name_1.getText().trim().length() > 0) { //если переменная не пуста
        	st_1_d = Double.parseDouble(Vkl_2.st_1.getText());	
        	kol_1_d = Double.parseDouble(Vkl_2.kol_1.getText());	
		}
        if (Vkl_2.name_2.getText().trim().length() > 0) { //если переменная не пуста
        	st_2_d = Double.parseDouble(Vkl_2.st_2.getText());	
        	kol_2_d = Double.parseDouble(Vkl_2.kol_2.getText());	
		}
        if (Vkl_2.name_3.getText().trim().length() > 0) { //если переменная не пуста
        	st_3_d = Double.parseDouble(Vkl_2.st_3.getText());	
        	kol_3_d = Double.parseDouble(Vkl_2.kol_3.getText());	
		}
        if (Vkl_2.name_4.getText().trim().length() > 0) { //если переменная не пуста
        	st_4_d = Double.parseDouble(Vkl_2.st_4.getText());	
        	kol_4_d = Double.parseDouble(Vkl_2.kol_4.getText());	
		}
        if (Vkl_2.name_5.getText().trim().length() > 0) { //если переменная не пуста
        	st_5_d = Double.parseDouble(Vkl_2.st_5.getText());	
        	kol_5_d = Double.parseDouble(Vkl_2.kol_5.getText());	
		}
        if (Vkl_2.name_6.getText().trim().length() > 0) { //если переменная не пуста
        	st_6_d = Double.parseDouble(Vkl_2.st_6.getText());	
        	kol_6_d = Double.parseDouble(Vkl_2.kol_6.getText());	
		}
        if (Vkl_2.name_7.getText().trim().length() > 0) { //если переменная не пуста
        	st_7_d = Double.parseDouble(Vkl_2.st_7.getText());	
        	kol_7_d = Double.parseDouble(Vkl_2.kol_7.getText());	
		}
        if (Vkl_2.name_8.getText().trim().length() > 0) { //если переменная не пуста
        	st_8_d = Double.parseDouble(Vkl_2.st_8.getText());	
        	kol_8_d = Double.parseDouble(Vkl_2.kol_8.getText());	
		}
        if (Vkl_2.name_9.getText().trim().length() > 0) { //если переменная не пуста
        	st_9_d = Double.parseDouble(Vkl_2.st_9.getText());	
        	kol_9_d = Double.parseDouble(Vkl_2.kol_9.getText());	
		}
        if (Vkl_2.name_10.getText().trim().length() > 0) { //если переменная не пуста
        	st_10_d = Double.parseDouble(Vkl_2.st_10.getText());	
        	kol_10_d = Double.parseDouble(Vkl_2.kol_10.getText());	
		}
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в 
		 * файле Vkl_2.	Преобразование данных в тип Double. */
	}
	

		public static void smeta() {/*Класс, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */	
		
		/* Расчет материальных затрат. Если не стоит флажок Рассчитать, то материальные затраты равны 
		 * числу которое ввел пользователь. Если флажок Рассчитать мат.затраты был включен, то мат.
		 * затраты рассчитываются как сумма (стоимости товара умноженное на количество товара)  */
		if (Vkl_1.calc_int==0){ //если флажок Рассчитать был выключен
			mat_zatr_1=mat_zatr_d;
			/* В переменную записываются данные введеные пользователем в текстовое поле которое 
			 * расположено в файле Index. Преобразование данных в тип Double. */
		} else {
	        if (Vkl_2.name_1.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=st_1_d*kol_1_d;}
	        if (Vkl_2.name_2.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_2_d*kol_2_d;}
	        if (Vkl_2.name_3.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_3_d*kol_3_d;}
	        if (Vkl_2.name_4.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_4_d*kol_4_d;}
	        if (Vkl_2.name_5.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_5_d*kol_5_d;}
	        if (Vkl_2.name_6.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_6_d*kol_6_d;}
	        if (Vkl_2.name_7.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_7_d*kol_7_d;}
	        if (Vkl_2.name_8.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_8_d*kol_8_d;}
	        if (Vkl_2.name_9.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_9_d*kol_9_d;}
	        if (Vkl_2.name_10.getText().trim().length() > 0) { //если переменная не пуста
	        	mat_zatr_1=mat_zatr_1+st_10_d*kol_10_d;}
		}
		
		/* Зарплата рассчитывается как Зарплата рабочего за 1 день умноженное на время изготовления изделия
		 * и умноженное на количество рабочих котроые производят это изделие. Зарплата рабочего за день 
		 * считается как Зарплата за месяц деленное на число рабочих дней в месяце*/
		zarpl_1=(zarpl_d/rab_dn_d)*t_izgot_d*kol_s_d;
		
		/* Отчисления на социальные нужды составляют 30% от заработной платы */
		otc_1=zarpl_1*0.3;
		
		/* Амортизация за месяц рассчитывается как стоимость станка деленная на срок службы станка.
		 * Амортизация для изделия рассчитывается как амортизация за месяц деленная на 29,4(среднее число 
		 * дней в месяце) и умноженная на количество дней изготовления изделия */
	
		amort_1=(st_st_d/sr_st_d)/29.4*t_izgot_d;
				
		/* Итого считается как сумма мат.затрат, затрат на оплату труда, отчисления, амортизация, прочие расходы */
		
		itogo_1=mat_zatr_1+zarpl_1+otc_1+amort_1+pr_rash_d;		
		
		//форматированный вывод
	    String mat_zatr_str = String.format("%.2f", mat_zatr_1);
	    String zarpl_str = String.format("%.2f", zarpl_1);
	    String otc_str = String.format("%.2f", otc_1);
	    String amort_str = String.format("%.2f", amort_1);
	    String pr_rash_str = String.format("%.2f", pr_rash_d);
	    String itogo_str = String.format("%.2f", itogo_1);


	    /* String - указываем что переменная будет иметь строковый тип,
	     * mat_zatr_str - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	mat_zatr_1 - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		
	    Output_smet.res_izd.setText(izd_str);
	    Output_smet.res_mat_zatr.setText(mat_zatr_str);
	    Output_smet.res_zarpl.setText(zarpl_str);
	    Output_smet.res_otc.setText(otc_str);
	    Output_smet.res_amort.setText(amort_str);
	    Output_smet.res_pr_rash.setText(pr_rash_str);
	    Output_smet.res_itogo.setText(itogo_str);

	    /* Записываем строковые переменные в текстовые поля res_izd,res_mat_zatr .., которые расположены
	     *  в файле Output_smet */
		
	}
	
}
