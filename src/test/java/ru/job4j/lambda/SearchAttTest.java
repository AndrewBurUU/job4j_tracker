package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.lambda.SearchAtt.filter;

public class SearchAttTest{

    @Test
    public void testFilterNumber() {
        List<Attachment> listAttachment = Arrays.asList(
                new Attachment("aaa", 1),
                new Attachment("bug", 10),
                new Attachment("bug", 111)
        );
        List<Attachment> expectedList = Arrays.asList(
                new Attachment("bug", 111)
        );
        assertThat(expectedList, is(filter(listAttachment,100)));
    }

    @Test
    public void testFilterName() {
        List<Attachment> listAttachment = Arrays.asList(
                new Attachment("aaa", 1),
                new Attachment("bug", 10),
                new Attachment("bug", 111)
        );
        List<Attachment> expectedList = Arrays.asList(
                new Attachment("bug", 10),
                new Attachment("bug", 111)
        );
        assertThat(expectedList, is(filter(listAttachment,"bug")));
    }

}