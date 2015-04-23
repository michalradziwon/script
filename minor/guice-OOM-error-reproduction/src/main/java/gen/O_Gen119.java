
  package gen;
  public class O_Gen119 {
  		@com.google.inject.Inject
  		public O_Gen119(O_Gen120 o_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  