
  package gen;
  public class H_Gen9 {
  		@com.google.inject.Inject
  		public H_Gen9(H_Gen10 h_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  