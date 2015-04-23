
  package gen;
  public class O_Gen36 {
  		@com.google.inject.Inject
  		public O_Gen36(O_Gen37 o_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  