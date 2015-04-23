
  package gen;
  public class J_Gen8 {
  		@com.google.inject.Inject
  		public J_Gen8(J_Gen9 j_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  