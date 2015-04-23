
  package gen;
  public class J_Gen41 {
  		@com.google.inject.Inject
  		public J_Gen41(J_Gen42 j_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  