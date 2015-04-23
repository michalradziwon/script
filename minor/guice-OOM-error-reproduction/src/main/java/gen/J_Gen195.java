
  package gen;
  public class J_Gen195 {
  		@com.google.inject.Inject
  		public J_Gen195(J_Gen196 j_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  