
  package gen;
  public class J_Gen34 {
  		@com.google.inject.Inject
  		public J_Gen34(J_Gen35 j_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  