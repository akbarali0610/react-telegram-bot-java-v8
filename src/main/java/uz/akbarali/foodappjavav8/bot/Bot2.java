//package uz.akbarali.foodappjavav8.bot;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//import uz.akbarali.foodappjavav8.bot.service.ButtonService;
//import uz.akbarali.foodappjavav8.bot.service.UserManageService;
//
//@Component
//public class Bot2 extends TelegramLongPollingBot {
//
//
//    final
//    ButtonService buttonService;
//    final UserManageService userManageService;
//
//    public Bot2(ButtonService buttonService, UserManageService userManageService) {
//        this.buttonService = buttonService;
//        this.userManageService = userManageService;
//    }
//
//
//    @Override
//    public String getBotUsername() {
//        return "translate_univrsal_new_bot";
//    }
//
//    @Override
//    public String getBotToken() {
//        return "5485405388:AAGOmbp5YMGa9wDu-7JnsTCF8p2lzyTx7q4";
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
////        SendMessage sendMessage = new SendMessage();
////        userManageService.manage(update, sendMessage, null,
////                null, null,
////                null, null);
////        try {
////            if (sendMessage.getChatId() != null && !sendMessage.getChatId().equals("0")) {
////                execute(sendMessage);
////            }
////        } catch (TelegramApiException e) {
////            throw new RuntimeException(e);
////        }
//
//        final String chatId = String.valueOf(update.getMessage().getChatId());
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setText("select menu");
////        sendMessage.setReplyMarkup(buttonService.buttons(n));
//        sendMessage.setChatId(chatId);
//        System.out.println(chatId);
//        try {
//            execute(sendMessage);
//        } catch (TelegramApiException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
