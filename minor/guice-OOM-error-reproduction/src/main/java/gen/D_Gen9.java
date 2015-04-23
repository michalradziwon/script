
  package gen;
  public class D_Gen9 {
  		@com.google.inject.Inject
  		public D_Gen9(D_Gen10 d_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  