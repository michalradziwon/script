
  package gen;
  public class C_Gen122 {
  		@com.google.inject.Inject
  		public C_Gen122(C_Gen123 c_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  