
  package gen;
  public class J_Gen88 {
  		@com.google.inject.Inject
  		public J_Gen88(J_Gen89 j_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  