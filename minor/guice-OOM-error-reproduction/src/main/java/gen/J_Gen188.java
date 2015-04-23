
  package gen;
  public class J_Gen188 {
  		@com.google.inject.Inject
  		public J_Gen188(J_Gen189 j_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  