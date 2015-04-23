
  package gen;
  public class J_Gen99 {
  		@com.google.inject.Inject
  		public J_Gen99(J_Gen100 j_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  