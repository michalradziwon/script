
  package gen;
  public class J_Gen55 {
  		@com.google.inject.Inject
  		public J_Gen55(J_Gen56 j_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  