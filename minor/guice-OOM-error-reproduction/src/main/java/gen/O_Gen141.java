
  package gen;
  public class O_Gen141 {
  		@com.google.inject.Inject
  		public O_Gen141(O_Gen142 o_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  