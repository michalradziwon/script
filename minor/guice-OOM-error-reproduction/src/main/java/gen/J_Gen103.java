
  package gen;
  public class J_Gen103 {
  		@com.google.inject.Inject
  		public J_Gen103(J_Gen104 j_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  