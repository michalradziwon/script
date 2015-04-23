
  package gen;
  public class C_Gen119 {
  		@com.google.inject.Inject
  		public C_Gen119(C_Gen120 c_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  