
  package gen;
  public class J_Gen197 {
  		@com.google.inject.Inject
  		public J_Gen197(J_Gen198 j_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  