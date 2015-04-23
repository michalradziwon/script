
  package gen;
  public class C_Gen77 {
  		@com.google.inject.Inject
  		public C_Gen77(C_Gen78 c_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  