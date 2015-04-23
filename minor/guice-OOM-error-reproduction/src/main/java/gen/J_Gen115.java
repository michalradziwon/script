
  package gen;
  public class J_Gen115 {
  		@com.google.inject.Inject
  		public J_Gen115(J_Gen116 j_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  