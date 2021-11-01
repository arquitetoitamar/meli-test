package com.mercadolivre.dna.api;

import com.mercadolivre.dna.dto.DnaCreateRequestDto;
import com.mercadolivre.dna.dto.DnaCreateResponseDto;
import com.mercadolivre.dna.service.impl.DnaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
public class DnaControllerTest {
    public static final List<String> SIMIAN_SEQUENCE = List.of("CTGAGA","CTATGC","TATTGT","AGAGGG","CCCCTA","TCACTG");
    @Mock
    private DnaServiceImpl dnaService;
    @InjectMocks
    private DnaApiController controller;

    @Test
    public void testAnalizeDna() {
        DnaCreateRequestDto requestDto = DnaCreateRequestDto.builder().build();
        requestDto.setBases(SIMIAN_SEQUENCE);
        Mockito.when(dnaService.createAnalysis(requestDto)).thenReturn(DnaCreateResponseDto.builder()
                .isSimian(true)
                .build());

        ResponseEntity<DnaCreateResponseDto> dnaCreateResponseDtoResponseEntity
                = controller.analizeDna(DnaCreateRequestDto.builder().build());
        assertNotNull(dnaCreateResponseDtoResponseEntity, "Response must be created");
    }
}