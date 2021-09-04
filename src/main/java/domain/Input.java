package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

	private static final Integer UNIT = 1000;

	private Integer account;
	private Scanner scanner;

	public Input() {
		this.scanner = new Scanner(System.in);
	}

	public Integer setAccount() {
		System.out.println("구입 금액을 입력해주세요.");
		this.account = scanner.nextInt();
		System.out.println(getLottoCount() + "개를 구매했습니다.");
		return getLottoCount();
	}

	public List<Integer> lottoWinningNumber() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		List<String> numbers = new ArrayList<>(Arrays.asList(scanner.next().split(",")));
		return numbers.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	private Integer getLottoCount() {
		return this.account / UNIT;
	}
}
