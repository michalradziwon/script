
  package gen;
  public class J_Gen11 {
  		@com.google.inject.Inject
  		public J_Gen11(J_Gen12 j_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  