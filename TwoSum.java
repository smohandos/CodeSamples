bplist00—_WebMainResource’	
_WebResourceFrameName_WebResourceData_WebResourceMIMEType_WebResourceTextEncodingName^WebResourceURLPO/<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="1671.6">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 14.0px Menlo; color: #1b1f22; -webkit-text-stroke: #1b1f22}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 14.0px Menlo; color: #1b1f22; -webkit-text-stroke: #1b1f22; min-height: 16.0px}
    span.s1 {font-kerning: none}
  </style>
</head>
<body>
<p class="p1"><span class="s1">class Solution {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† </span>public int[] twoSum(int[] nums, int target) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>int n=nums.length;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>Map&lt;Integer,Integer&gt; map=new HashMap&lt;&gt;();</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">¬†¬† ¬† ¬† ¬†</span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>int[] indexes=new int[2];</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>for(int i=0;i&lt;n;i++)</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>{</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† </span>int complement=target-nums[i];</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† </span>if(map.containsKey(complement))</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† </span>{</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">¬†¬† ¬† ¬† ¬† ¬† ¬† ¬† ¬†</span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† ¬† ¬† </span>indexes=new int[]{i,map.get(complement)};</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† ¬† ¬† </span>map.remove(complement);</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† ¬† ¬† </span>continue;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† </span>}</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† ¬† ¬† </span>map.put(nums[i],i);</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">¬†¬† ¬† ¬† ¬† ¬† ¬†</span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>}</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>Arrays.sort(indexes);</span></p>
<p class="p2"><span class="s1"></span><br></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† ¬† ¬† </span>return indexes;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">¬† ¬† </span>}</span></p>
<p class="p1"><span class="s1">}</span></p>
</body>
</html>
Ytext/htmlUutf-8_file:///index.html    ( ? Q g Ö Ē ē»“ō                           Ū