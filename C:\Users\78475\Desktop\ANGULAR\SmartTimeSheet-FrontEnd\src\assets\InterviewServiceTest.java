package com.bfs.recruitmentApplication.service;

import com.bfs.recruitmentApplication.businessLogic;
import com.bfs.recruitmentApplication.dao.CandidateInterviewDAO;
import com.bfs.recruitmentApplication.dao.EmailTemplateDAO;
import com.bfs.recruitmentApplication.dao.PotentialCandidateDAO;
import com.bfs.recruitmentApplication.domain.CandidateInterview;
import com.bfs.recruitmentApplication.domain.EmailTemplate;
import com.bfs.recruitmentApplication.service.impl.InterviewServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InterviewServiceTest {

    @Mock
    private EmailTemplateDAO emailTemplateDAO;

    @Mock
    private CandidateInterviewDAO candidateInterviewDAO;

    @Mock
    private PotentialCandidateDAO potentialCandidateDAO;

    @InjectMocks
    private InterviewServiceImpl interviewService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetInterviewDetailsByIntervieweeId() {
        List<CandidateInterview> candidateInterviews = new ArrayList<>();
        candidateInterviews.add(
                new CandidateInterview(
                        1,
                        1,
                        1,
                        5,
                        "Good Job!",
                        "Pass",
                        businessLogic.getCurrentTimestamp(),
                        30,
                        businessLogic.getCurrentTimestamp(),
                        1,
                        businessLogic.getCurrentTimestamp(),
                        businessLogic.getCurrentTimestamp(),
                        1,
                        1));

        candidateInterviews.add(
                new CandidateInterview(
                        2,
                        2,
                        2,
                        6,
                        "Good Job!",
                        "Pass",
                        businessLogic.getCurrentTimestamp(),
                        20,
                        businessLogic.getCurrentTimestamp(),
                        2,
                        businessLogic.getCurrentTimestamp(),
                        businessLogic.getCurrentTimestamp(),
                        1,
                        1));

        Mockito.when(candidateInterviewDAO.getCandidateInterviewByPotentialCandidateID(2)).thenReturn(candidateInterviews);
        List<CandidateInterview> result =
                interviewService.getInterviewDetailsByIntervieweeId(2);
        Assertions.assertEquals(candidateInterviews, result);
    }

    @Test
    public void testUpdateInterviewDetailStatus() {
        CandidateInterview candidateInterview = new CandidateInterview(
                1,
                1,
                1,
                5,
                "Good Job!",
                "Pass",
                businessLogic.getCurrentTimestamp(),
                30,
                businessLogic.getCurrentTimestamp(),
                1,
                businessLogic.getCurrentTimestamp(),
                businessLogic.getCurrentTimestamp(),
                1,
                1);
        boolean expected = true;

        Mockito.when(candidateInterviewDAO.updateCandidateInterviewStatus(1,
                "Fail")).thenReturn(expected);

        Assertions.assertEquals(expected,
                candidateInterviewDAO.updateCandidateInterviewStatus(1, "Fail"));
    }

    @Test
    public void testInsertOneInterview() {
        CandidateInterview candidateInterview = new CandidateInterview(
                1,
                1,
                1,
                5,
                "Good Job!",
                "Pass",
                businessLogic.getCurrentTimestamp(),
                30,
                businessLogic.getCurrentTimestamp(),
                1,
                businessLogic.getCurrentTimestamp(),
                businessLogic.getCurrentTimestamp(),
                1,
                1);
        Mockito.when(candidateInterviewDAO.insertCandidateInterview(candidateInterview)).thenReturn(1);
        Assertions.assertEquals(200,
                interviewService.insertOneInterview(candidateInterview).getMessage().getStatusCode());
    }

    @Test
    public void testUpdateInterview() {
        CandidateInterview candidateInterview = new CandidateInterview(
                1,
                1,
                1,
                5,
                "Good Job!",
                "Pass",
                businessLogic.getCurrentTimestamp(),
                30,
                businessLogic.getCurrentTimestamp(),
                1,
                businessLogic.getCurrentTimestamp(),
                businessLogic.getCurrentTimestamp(),
                1,
                1);
        boolean expected = true;
        CandidateInterview updated = candidateInterview;

        interviewService.insertOneInterview(candidateInterview);

        updated.setComments("Not Good");

        interviewService.updateInterview(updated);

        Assertions.assertEquals(updated.getComments(), candidateInterview.getComments());
    }

    @Test
    public void testGetEmailTemplateIdByValue() {
        EmailTemplate emailTemplate = new EmailTemplate(1, "offer letter",
                "Welcome to BFS", "Welcome!", businessLogic.getCurrentTimestamp(),
                businessLogic.getCurrentTimestamp(), 1, 1);

        Mockito.when(emailTemplateDAO.getEmailTemplateIdByValue("offer " +
                "letter")).thenReturn(emailTemplate.getEmailTemplateId());

        Assertions.assertEquals(emailTemplate.getEmailTemplateId(),
                interviewService.getEmailTemplateIdByValue("offer letter"));
    }

}
