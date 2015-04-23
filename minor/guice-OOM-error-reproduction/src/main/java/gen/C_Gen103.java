
  package gen;
  public class C_Gen103 {
  		@com.google.inject.Inject
  		public C_Gen103(C_Gen104 c_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  