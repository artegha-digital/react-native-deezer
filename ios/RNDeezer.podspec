
Pod::Spec.new do |s|
  s.name         = "RNDeezer"
  s.version      = "1.0.0"
  s.summary      = "RNDeezer"
  s.description  = <<-DESC
                  RNDeezer
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNDeezer.git", :tag => "master" }
  s.source_files  = "RNDeezer/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  