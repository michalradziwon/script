
  package gen;
  public class J_Gen141 {
  		@com.google.inject.Inject
  		public J_Gen141(J_Gen142 j_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  