import React, { useState, useEffect } from 'react'
import styled from 'styled-components'
import TabFrame from './TabFrame'
import Input from '../Common/Input'
import Button from '../Common/Button'
import Radio from '../Common/Radio'
import { genderList, activityScore, icons } from '../../utils/options'

interface editType {
  gender: string
  nickName: string
  birth: string
  height: number
  weight: number
  activity: string
  icon: string
}

const EditProfile = () => {
  const [profile, setProfile] = useState<editType>({
    nickName: '',
    gender: 'male',
    birth: '',
    height: 0,
    weight: 0,
    activity: '적음',
    icon: '',
  })

  const handleInput = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target

    setProfile({ ...profile, [name]: value })
    console.log(name, value)
  }
  useEffect(() => {
    console.log('get userinfo')
  }, [])

  return (
    <TabFrame title="프로필 수정">
      <IconContainer>
        <Radio
          legend="프로필 아이콘"
          radioArray={icons}
          checkedValue={profile.icon}
          onChange={handleInput}
        />
      </IconContainer>
      <GridContainer>
        <Input
          label="이메일"
          type="email"
          name="email"
          onChange={handleInput}
        />
        <div className="flex-div">
          <Input
            label="닉네임"
            type="text"
            name="nickName"
            onChange={handleInput}
          />
          <div>
            <Button onClick={() => console.log('중복확인')}>중복확인</Button>
          </div>
        </div>
        <Radio
          legend="성별"
          radioArray={genderList}
          checkedValue={profile.gender}
          onChange={handleInput}
        />
        <Input
          label="생년월일"
          type="date"
          name="birth"
          onChange={handleInput}
        />
        <Input
          label="신장(cm)"
          type="number"
          name="height"
          onChange={handleInput}
        />
        <Input
          label="체중(kg)"
          type="number"
          name="weight"
          onChange={handleInput}
        />
        <Radio
          legend="활동수준"
          radioArray={activityScore}
          checkedValue={profile.activity}
          onChange={handleInput}
        />
      </GridContainer>
      <ButtonWrapper>
        <Button outline="true" onClick={() => console.log('delete user')}>
          회원탈퇴
        </Button>
        <Button onClick={() => console.log('save profile')}>저장하기</Button>
      </ButtonWrapper>
    </TabFrame>
  )
}

const IconContainer = styled.div`
  display: flex;
  height: 10rem;

  @media screen and (max-width: 500px) {
    height: auto;
  }
`

const GridContainer = styled.div`
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  column-gap: 2.4rem;
  row-gap: 1.2rem;
  margin-top: 1.2rem;

  .flex-div {
    display: flex;
    gap: 0.6rem;

    button {
      position: relative;
      top: 2rem;
    }
  }

  @media screen and (max-width: 500px) {
    grid-template-columns: none;
  }
`

const ButtonWrapper = styled.div`
  width: 100%;
  display: flex;
  margin-top: 5rem;
  justify-content: space-between;
`

export default EditProfile
