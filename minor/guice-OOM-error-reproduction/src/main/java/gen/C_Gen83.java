
  package gen;
  public class C_Gen83 {
  		@com.google.inject.Inject
  		public C_Gen83(C_Gen84 c_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  