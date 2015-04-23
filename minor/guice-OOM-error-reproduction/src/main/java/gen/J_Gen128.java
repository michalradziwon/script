
  package gen;
  public class J_Gen128 {
  		@com.google.inject.Inject
  		public J_Gen128(J_Gen129 j_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  