
  package gen;
  public class C_Gen32 {
  		@com.google.inject.Inject
  		public C_Gen32(C_Gen33 c_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  