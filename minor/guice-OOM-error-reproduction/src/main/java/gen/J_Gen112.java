
  package gen;
  public class J_Gen112 {
  		@com.google.inject.Inject
  		public J_Gen112(J_Gen113 j_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  