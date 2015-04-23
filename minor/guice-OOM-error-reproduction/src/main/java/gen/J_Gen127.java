
  package gen;
  public class J_Gen127 {
  		@com.google.inject.Inject
  		public J_Gen127(J_Gen128 j_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  