
  package gen;
  public class S_Gen32 {
  		@com.google.inject.Inject
  		public S_Gen32(S_Gen33 s_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  