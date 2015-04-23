
  package gen;
  public class J_Gen196 {
  		@com.google.inject.Inject
  		public J_Gen196(J_Gen197 j_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  