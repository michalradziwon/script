
  package gen;
  public class O_Gen1 {
  		@com.google.inject.Inject
  		public O_Gen1(O_Gen2 o_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  