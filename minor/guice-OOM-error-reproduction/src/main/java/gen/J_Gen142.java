
  package gen;
  public class J_Gen142 {
  		@com.google.inject.Inject
  		public J_Gen142(J_Gen143 j_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  