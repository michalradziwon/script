
  package gen;
  public class C_Gen177 {
  		@com.google.inject.Inject
  		public C_Gen177(C_Gen178 c_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  