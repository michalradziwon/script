
  package gen;
  public class H_Gen32 {
  		@com.google.inject.Inject
  		public H_Gen32(H_Gen33 h_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  