
  package gen;
  public class J_Gen80 {
  		@com.google.inject.Inject
  		public J_Gen80(J_Gen81 j_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  