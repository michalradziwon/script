
  package gen;
  public class J_Gen57 {
  		@com.google.inject.Inject
  		public J_Gen57(J_Gen58 j_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  