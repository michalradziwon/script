
  package gen;
  public class J_Gen174 {
  		@com.google.inject.Inject
  		public J_Gen174(J_Gen175 j_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  