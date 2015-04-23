
  package gen;
  public class C_Gen106 {
  		@com.google.inject.Inject
  		public C_Gen106(C_Gen107 c_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  