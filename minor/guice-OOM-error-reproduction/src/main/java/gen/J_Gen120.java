
  package gen;
  public class J_Gen120 {
  		@com.google.inject.Inject
  		public J_Gen120(J_Gen121 j_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  