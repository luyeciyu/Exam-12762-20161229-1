package com.yws;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yws.pojo.Film;
import com.yws.pojo.Language;
import com.yws.service.FilmService;
import com.yws.service.LanguageService;

public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmService filmService = (FilmService)ctx.getBean("filmService");
		LanguageService languageService = (LanguageService)ctx.getBean("languageService");
		Film film = new Film();
		Language language = new Language();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入电影名称(title)：");
		String title;
		title = scanner.nextLine().trim();
		while(title == null || "".equals(title)){
			System.out.println("title不能为空 ,请重新输入电影名称(title)：");
			title = scanner.nextLine().trim();
		}
		
		
		System.out.println("请输入电影描述(description)：");
		String description;
		description = scanner.nextLine().trim();
		
		System.out.println("请输入语言ID(language_id)：");
		String languageId;
		int language_id;
		
		while(true){
			languageId = scanner.nextLine().trim();
			while(languageId == null || "".equals(languageId)){
				System.out.println("language_id不能为空, 请重新输入语言ID(language_id)：");
				languageId = scanner.nextLine().trim();
			}
			try {
				language_id = Integer.parseInt(languageId);
				language = languageService.getById(language_id);
				if(language == null){     //输入的language_id不存在
					System.out.println("该language_id不存在,请重新输入输入语言ID(language_id)：");
				}else{
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("language_id请输入数字：");
			}
		}
		
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage(language);
		
		filmService.insert(film);
		ctx.close();
		System.exit(0);
		
	}

}
