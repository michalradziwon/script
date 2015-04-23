
  package gen;
  public class C_Gen35 {
  		@com.google.inject.Inject
  		public C_Gen35(C_Gen36 c_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  