
  package gen;
  public class J_Gen171 {
  		@com.google.inject.Inject
  		public J_Gen171(J_Gen172 j_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  