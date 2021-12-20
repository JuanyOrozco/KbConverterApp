package com.convert.questions;

import com.convert.ui.ListView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

@Subject("the displayed menu items")
public class SeeListOption implements Question<List<String>> {

        @Override
        public List<String> answeredBy(Actor actor) {
            List<String> list = TextContent.of(ListView.MENU_LIST)
                    .viewedBy(actor)
                    .asList();
            list.forEach(System.out::println);
            return list;
        }
}

