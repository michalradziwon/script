
  package gen;
  public class S_Gen135 {
  		@com.google.inject.Inject
  		public S_Gen135(S_Gen136 s_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  