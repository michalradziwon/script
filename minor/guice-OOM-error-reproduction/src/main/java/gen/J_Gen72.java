
  package gen;
  public class J_Gen72 {
  		@com.google.inject.Inject
  		public J_Gen72(J_Gen73 j_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  