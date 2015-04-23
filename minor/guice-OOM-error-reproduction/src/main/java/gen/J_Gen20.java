
  package gen;
  public class J_Gen20 {
  		@com.google.inject.Inject
  		public J_Gen20(J_Gen21 j_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  