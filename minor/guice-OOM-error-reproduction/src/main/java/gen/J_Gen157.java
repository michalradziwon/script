
  package gen;
  public class J_Gen157 {
  		@com.google.inject.Inject
  		public J_Gen157(J_Gen158 j_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  