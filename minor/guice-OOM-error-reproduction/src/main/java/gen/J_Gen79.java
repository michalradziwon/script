
  package gen;
  public class J_Gen79 {
  		@com.google.inject.Inject
  		public J_Gen79(J_Gen80 j_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  