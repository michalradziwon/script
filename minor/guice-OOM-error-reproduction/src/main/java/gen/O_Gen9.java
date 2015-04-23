
  package gen;
  public class O_Gen9 {
  		@com.google.inject.Inject
  		public O_Gen9(O_Gen10 o_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  