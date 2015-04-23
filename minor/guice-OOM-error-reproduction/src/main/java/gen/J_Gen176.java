
  package gen;
  public class J_Gen176 {
  		@com.google.inject.Inject
  		public J_Gen176(J_Gen177 j_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  