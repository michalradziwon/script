
  package gen;
  public class J_Gen40 {
  		@com.google.inject.Inject
  		public J_Gen40(J_Gen41 j_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  