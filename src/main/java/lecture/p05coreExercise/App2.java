package lecture.p05coreExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.log4j.Log4j;

@Log4j
public class App2 {
	public static void main(String[] args) {
		
		String configLocation = "lecture/p05coreExercise/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Computer c = context.getBean(Computer.class);
//		context.getBean(Memory.class);
		Memory m = (Memory) context.getBean("memory");
		
		log.warn(c);
		log.warn(m);
		log.warn(c.getMemory());
	}
}

//app 실행결과
//INFO : org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@368239c8: startup date [Thu Dec 02 17:53:36 KST 2021]; root of context hierarchy
//INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [lecture/p05coreExercise/context.xml]
//WARN : lecture.p05coreExercise.App - lecture.p05coreExercise.Computer@6c49835d
//WARN : lecture.p05coreExercise.App - lecture.p05coreExercise.Memory@5e853265
//WARN : lecture.p05coreExercise.App - lecture.p05coreExercise.Memory@5e853265
// app2 실행결과
//INFO : org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@368239c8: startup date [Thu Dec 02 17:53:12 KST 2021]; root of context hierarchy
//INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [lecture/p05coreExercise/context.xml]
//WARN : lecture.p05coreExercise.App2 - lecture.p05coreExercise.Computer@6c49835d
//WARN : lecture.p05coreExercise.App2 - lecture.p05coreExercise.Memory@5e853265
//WARN : lecture.p05coreExercise.App2 - lecture.p05coreExercise.Memory@5e853265
