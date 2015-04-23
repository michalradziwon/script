
  package gen;
  public class J_Gen147 {
  		@com.google.inject.Inject
  		public J_Gen147(J_Gen148 j_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  