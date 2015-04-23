
  package gen;
  public class J_Gen17 {
  		@com.google.inject.Inject
  		public J_Gen17(J_Gen18 j_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  