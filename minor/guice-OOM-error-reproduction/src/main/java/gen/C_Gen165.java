
  package gen;
  public class C_Gen165 {
  		@com.google.inject.Inject
  		public C_Gen165(C_Gen166 c_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  