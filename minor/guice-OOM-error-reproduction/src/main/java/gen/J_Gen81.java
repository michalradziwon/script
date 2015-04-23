
  package gen;
  public class J_Gen81 {
  		@com.google.inject.Inject
  		public J_Gen81(J_Gen82 j_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  