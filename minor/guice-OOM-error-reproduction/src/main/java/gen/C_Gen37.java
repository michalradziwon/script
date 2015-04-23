
  package gen;
  public class C_Gen37 {
  		@com.google.inject.Inject
  		public C_Gen37(C_Gen38 c_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  