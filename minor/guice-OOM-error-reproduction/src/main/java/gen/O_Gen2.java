
  package gen;
  public class O_Gen2 {
  		@com.google.inject.Inject
  		public O_Gen2(O_Gen3 o_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  