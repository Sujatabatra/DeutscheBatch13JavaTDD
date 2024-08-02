package com.sujata.share.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.share.entity.Share;
import com.sujata.share.persistence.ShareDao;
import com.sujata.share.service.ShareServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ShareServiceApplicationTests {

	@Mock
	ShareDao shareDao; // Mimicing the behaviour of Dao layer

	@InjectMocks // injecting mimicing behaviour of dao layer to service layer
	private ShareServiceImpl shareService;

	@Test
	@DisplayName("Testing getAllShares() method")
	void testGetAllShares() {

		List<Share> shares = new ArrayList<>();
		shares.add(new Share(1, "ABC", 5600));
		shares.add(new Share(2, "MNO", 6600));
		/*
		 * As we mocked DAO so we need to tell the behavior of all the required methods
		 * of dao as well
		 */
		when(shareDao.findAll()).thenReturn(shares);

		List<Share> shareList = shareService.getAllShares();

		assertThat(shareList.size()).isEqualTo(2);

	}
	
	@Test
	@DisplayName("Testing getShareById() method")
	void testgetShareById() {
		
		when(shareDao.findById(67)).thenReturn(Optional.of(new Share(67,"AAA",7800)));
		
		Optional<Share> Opshare=shareService.getShareById(67);
		
		assertTrue(Opshare.isPresent());
		
	}

	@Test
	@DisplayName("Testing deleteShareById() method")
	void testDeleteShareById() {
		
		when(shareDao.findById(67)).thenReturn(Optional.of(new Share(67,"AAA",7800)));
		
		doNothing().when(shareDao).deleteById(67);
		
		Share share=shareService.deleteShareById(67);
		
		assertEquals(67, share.getShareId());
		
	}
}
