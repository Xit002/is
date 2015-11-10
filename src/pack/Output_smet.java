package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import java.awt.event.*;/*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import javax.swing.*;// библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Output_smet extends JDialog {/*Класс Output_smet, который доступен для любого файла из пакета 
pack наследует 	функции элемента JDialog */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {/*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		try {/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			Output_smet Smeta = new Output_smet(); 
			Smeta.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //при закрытии формы происходит выход из приложения
			Smeta.setVisible(true); //устанавливаем что окно видимое
			Sost_smet.smeta(); //рассчитваем необходимые данные. Функция расположена в файле Sost_smet
		} catch (Exception e) {
			/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			e.printStackTrace();
		}
	}

	public static JLabel res_izd, res_mat_zatr, res_zarpl, res_otc, res_amort, res_pr_rash, res_itogo;
	//текстовые поля,доступные из любого файла пакета pack
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	
	public Output_smet() {//метод, описывающий какие поля и кнопки располагаются на JDialog

		setTitle("Смета расходов на изготовление мебели"); //устанавливаем заголовок окна
		setSize(540, 540); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		setResizable(false); //запрет на расширение окна 
		
		getContentPane().setLayout(new BorderLayout());// для данной панели устанавливается менеджер компоновки BorderLayout
		 /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		
		JPanel Panel_1_text = new JPanel();//Панель на которой располагается текстовое поле
		JPanel Panel_2_text = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
		JPanel Panel_3_button = new JPanel();//Панель на которой располагается кнопки

		add(Panel_1_text, BorderLayout.NORTH);//Добавление панели Panel_Text наверх
		add(Panel_2_text, BorderLayout.CENTER);//Добавление панели Panel_Text по центру
		add(Panel_3_button, BorderLayout.SOUTH);//Добавление панели Panel_Button снизу

		Panel_1_text.setBorder(new EmptyBorder(5,10,5,10));//установка внутренних отступов(5 справа и слева,10сверху и снизу)
		Panel_2_text.setBorder(new EmptyBorder(5,10,250,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		Panel_1_text.setLayout(new GridLayout(1,1,0,15));//на панели 1 строка,1столбец ("смета затрат...")
		Panel_2_text.setLayout(new GridLayout(7,2,0,5));/* на панеле будет 15 строк, 2 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		Panel_3_button.setLayout(new GridLayout(1,2));//на панели 1 строка,1столбец, будет расположена кнопка
		
		
		JLabel jlabel_1 = new JLabel("Смета расходов на изготовление мебели", JLabel.CENTER);
		JLabel jlabel_2 = new JLabel("Изделие", JLabel.LEFT);
		JLabel jlabel_3 = new JLabel("1. Материальные затраты", JLabel.LEFT);
		JLabel jlabel_4 = new JLabel("2. Затраты на оплату труда", JLabel.LEFT);
		JLabel jlabel_5 = new JLabel("3. Отчисления", JLabel.LEFT);
		JLabel jlabel_6 = new JLabel("4. Амортизация", JLabel.LEFT);
		JLabel jlabel_7 = new JLabel("5. Прочие расходы:", JLabel.LEFT);
		JLabel jlabel_8 = new JLabel("Итого", JLabel.LEFT);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет 
		  выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру, RIGHT - по правому краю
		*/

		//создаем текстовые поля для того чтобы в них записывать рассчитанные результаты
		res_izd = new JLabel("", JLabel.RIGHT);
		res_mat_zatr = new JLabel("", JLabel.RIGHT);
		res_zarpl = new JLabel("", JLabel.RIGHT);
		res_otc = new JLabel("", JLabel.RIGHT);
		res_amort = new JLabel("", JLabel.RIGHT);
		res_pr_rash = new JLabel("", JLabel.RIGHT);
		res_itogo = new JLabel("", JLabel.RIGHT);
		//создаем текстовые поля для того чтобы в них записывать рассчитанные результаты

		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
		Panel_1_text.add(jlabel_1);
		Panel_2_text.add(jlabel_2);
		Panel_2_text.add(res_izd);
		Panel_2_text.add(jlabel_3);
		Panel_2_text.add(res_mat_zatr);
		Panel_2_text.add(jlabel_4);
		Panel_2_text.add(res_zarpl);
		Panel_2_text.add(jlabel_5);
		Panel_2_text.add(res_otc);
		Panel_2_text.add(jlabel_6);
		Panel_2_text.add(res_amort);	
		Panel_2_text.add(jlabel_7);
		Panel_2_text.add(res_pr_rash);	
		Panel_2_text.add(jlabel_8);
		Panel_2_text.add(res_itogo);	


		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
	
		JButton new_sm = new JButton("Составить смету по другому изделию"); /*В скобках надпись на кнопке*/
		Panel_3_button.add(new_sm);/*  Добавление кнопки в панель */
			
		JButton exit = new JButton("Выйти из программы");
		Panel_3_button.add(exit);
		
		exit.addActionListener(new ActionListener() //добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */              
		   {                                                         
		    public void actionPerformed(ActionEvent e)      
		    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/  
		    {    // описываем что будет происходить при нажатии на кнопку Закрыть - программа завершит свою работу
	            System.exit(0);		    	
		    }                                                        
		   }); 
		

		
		new_sm.addActionListener(new ActionListener()     
				//добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */   
		   {		
		    public void actionPerformed(ActionEvent e)  
		    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/  
		    {
		    	setVisible(false);//данное окно станет невидимым
		    	Index.frame.setVisible(true); /*устанавливаем что окно в котором пользователь вводит данные видимое */
		    	Index.JTP1.setSelectedIndex(0);
		    	
		    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
		    	Vkl_1.mat_zatr.setText("");
		    	Vkl_1.t_izgot.setText("");    			
		    	Vkl_1.kol_s.setText("");    			
		    	Vkl_1.zarpl.setText("");
		    	Vkl_1.rab_dn.setText("");
		    	Vkl_1.st_st.setText("");
		    	Vkl_1.sr_st.setText("");
		    	Vkl_1.pr_rash.setText("");
		    	Vkl_1.calc.setSelected(false);
		    	Vkl_1.calc_int=0;

		    	Vkl_2.name_1.setText("");
		    	Vkl_2.name_2.setText("");
		    	Vkl_2.name_3.setText("");
		    	Vkl_2.name_4.setText("");
		    	Vkl_2.name_5.setText("");
		    	Vkl_2.name_6.setText("");
		    	Vkl_2.name_7.setText("");
		    	Vkl_2.name_8.setText("");
		    	Vkl_2.name_9.setText("");
		    	Vkl_2.name_10.setText("");
		    	Vkl_2.st_1.setText("");
		    	Vkl_2.st_2.setText("");
		    	Vkl_2.st_3.setText("");
		    	Vkl_2.st_4.setText("");
		    	Vkl_2.st_5.setText("");
		    	Vkl_2.st_6.setText("");
		    	Vkl_2.st_7.setText("");
		    	Vkl_2.st_8.setText("");
		    	Vkl_2.st_9.setText("");
		    	Vkl_2.st_10.setText("");
		    	Vkl_2.kol_1.setText("");
		    	Vkl_2.kol_2.setText("");
		    	Vkl_2.kol_3.setText("");
		    	Vkl_2.kol_4.setText("");
		    	Vkl_2.kol_5.setText("");
		    	Vkl_2.kol_6.setText("");
		    	Vkl_2.kol_7.setText("");
		    	Vkl_2.kol_8.setText("");
		    	Vkl_2.kol_9.setText("");
		    	Vkl_2.kol_10.setText("");
				Index.JTP1.setEnabledAt(1, false);/*устанавливаем что вторая вкладка недоступна */

		    }                                                        
		   }); 
	
		
		
		
		
	}}
		
