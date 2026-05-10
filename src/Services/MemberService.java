package Services;

import Entites.Member;
import Utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {

    static List<Member> memberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void RegisterMember(Member member) {
        for (Member m: memberList) {
            if (m.getId().equals(member.getId())){
                System.out.println(Constants.FAILED_ADD_MEMEBER);
                return;
            }
        }
        memberList.add(member);
        System.out.println(Constants.SUCCESS_ADD_MEMEBER);
    }
}
