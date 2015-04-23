
  package gen;
  public class O_Gen115 {
  		@com.google.inject.Inject
  		public O_Gen115(O_Gen116 o_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  