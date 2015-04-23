
  package gen;
  public class J_Gen69 {
  		@com.google.inject.Inject
  		public J_Gen69(J_Gen70 j_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  