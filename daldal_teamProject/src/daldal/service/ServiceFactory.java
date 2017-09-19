package daldal.service;


import daldal.service.logic.StoryServiceLogic;

public class ServiceFactory {
	private static ServiceFactory instance = new ServiceFactory();
	
	private StoryService boardService;
	
	private ServiceFactory() {
		boardService = new StoryServiceLogic();
	}
	
	public static StoryService getBoardService() {
		return instance.boardService;
	}
}
