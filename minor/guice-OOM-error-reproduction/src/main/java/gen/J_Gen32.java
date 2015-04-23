
  package gen;
  public class J_Gen32 {
  		@com.google.inject.Inject
  		public J_Gen32(J_Gen33 j_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  