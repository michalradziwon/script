
  package gen;
  public class J_Gen3 {
  		@com.google.inject.Inject
  		public J_Gen3(J_Gen4 j_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  