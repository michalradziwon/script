
  package gen;
  public class C_Gen196 {
  		@com.google.inject.Inject
  		public C_Gen196(C_Gen197 c_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  