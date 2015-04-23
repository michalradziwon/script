
  package gen;
  public class J_Gen123 {
  		@com.google.inject.Inject
  		public J_Gen123(J_Gen124 j_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  