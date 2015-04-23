
  package gen;
  public class O_Gen177 {
  		@com.google.inject.Inject
  		public O_Gen177(O_Gen178 o_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  