
  package gen;
  public class O_Gen27 {
  		@com.google.inject.Inject
  		public O_Gen27(O_Gen28 o_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  