
  package gen;
  public class J_Gen125 {
  		@com.google.inject.Inject
  		public J_Gen125(J_Gen126 j_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  