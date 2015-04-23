
  package gen;
  public class J_Gen168 {
  		@com.google.inject.Inject
  		public J_Gen168(J_Gen169 j_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  