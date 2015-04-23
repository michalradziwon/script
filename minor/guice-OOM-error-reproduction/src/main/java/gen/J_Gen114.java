
  package gen;
  public class J_Gen114 {
  		@com.google.inject.Inject
  		public J_Gen114(J_Gen115 j_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  