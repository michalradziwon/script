
  package gen;
  public class J_Gen144 {
  		@com.google.inject.Inject
  		public J_Gen144(J_Gen145 j_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  