
  package gen;
  public class J_Gen26 {
  		@com.google.inject.Inject
  		public J_Gen26(J_Gen27 j_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  