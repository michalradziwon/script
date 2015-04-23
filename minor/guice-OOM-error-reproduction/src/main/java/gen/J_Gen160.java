
  package gen;
  public class J_Gen160 {
  		@com.google.inject.Inject
  		public J_Gen160(J_Gen161 j_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  