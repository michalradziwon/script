
  package gen;
  public class J_Gen198 {
  		@com.google.inject.Inject
  		public J_Gen198(J_Gen199 j_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  