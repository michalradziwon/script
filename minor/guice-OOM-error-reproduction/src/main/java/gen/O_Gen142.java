
  package gen;
  public class O_Gen142 {
  		@com.google.inject.Inject
  		public O_Gen142(O_Gen143 o_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  