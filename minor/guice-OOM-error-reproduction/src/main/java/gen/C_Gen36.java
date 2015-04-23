
  package gen;
  public class C_Gen36 {
  		@com.google.inject.Inject
  		public C_Gen36(C_Gen37 c_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  