
  package gen;
  public class J_Gen19 {
  		@com.google.inject.Inject
  		public J_Gen19(J_Gen20 j_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  