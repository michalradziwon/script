
  package gen;
  public class J_Gen165 {
  		@com.google.inject.Inject
  		public J_Gen165(J_Gen166 j_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  