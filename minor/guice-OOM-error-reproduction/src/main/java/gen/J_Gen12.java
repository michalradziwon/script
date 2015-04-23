
  package gen;
  public class J_Gen12 {
  		@com.google.inject.Inject
  		public J_Gen12(J_Gen13 j_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  