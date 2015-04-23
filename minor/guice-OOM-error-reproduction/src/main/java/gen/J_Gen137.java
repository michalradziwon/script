
  package gen;
  public class J_Gen137 {
  		@com.google.inject.Inject
  		public J_Gen137(J_Gen138 j_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  