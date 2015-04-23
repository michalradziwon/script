
  package gen;
  public class D_Gen32 {
  		@com.google.inject.Inject
  		public D_Gen32(D_Gen33 d_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  