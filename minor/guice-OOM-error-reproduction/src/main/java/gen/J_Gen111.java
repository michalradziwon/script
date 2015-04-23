
  package gen;
  public class J_Gen111 {
  		@com.google.inject.Inject
  		public J_Gen111(J_Gen112 j_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  